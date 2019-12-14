package org.gelm.portal.batch.configuration;

import org.gelm.portal.batch.model.Agent;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	@Value("${sample.txt.file.path}")
	private Resource resource;
	@Autowired
	private ItemProcessor<Agent, Agent> agentProcessor;
	@Autowired
	private ItemWriter<Agent> agentWtiter;
	@Autowired
	private DriverManagerDataSource dataSource;
	
	@Bean
	public Step configureStep() {
	return stepBuilderFactory
			.get("sample")
			.<Agent,Agent>chunk(1)
			.reader(configureItemReader())
			.processor(agentProcessor)
			.writer(agentWtiter)
			.build();
	}
	
	@Bean
	public Job configureJob() {
	   return   jobBuilderFactory
				.get("sample")
				.incrementer(new RunIdIncrementer())
				.start(configureStep())
				.build();
	}
	
	@Bean
	public FlatFileItemReader<Agent> configureItemReader(){

		FlatFileItemReader<Agent> itemReader=new FlatFileItemReader<Agent>();
		itemReader.setResource(resource);
		itemReader.setName("samplereader");
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(configureLineMapper());
		return itemReader;
	}
	@Bean
	public DefaultLineMapper<Agent> configureLineMapper(){
		DefaultLineMapper<Agent> lineMapper=new DefaultLineMapper<Agent>();
		
		DelimitedLineTokenizer lineTokenizer=new DelimitedLineTokenizer(",");
		lineTokenizer.setNames(new String[] {"agentId","agentName","agentBranch"});
		lineMapper.setLineTokenizer(lineTokenizer);
		
		BeanWrapperFieldSetMapper<Agent> agentMapper=new BeanWrapperFieldSetMapper<Agent>();
		agentMapper.setTargetType(Agent.class);
		lineMapper.setFieldSetMapper(agentMapper);
		
		return lineMapper;
	}
	
	@Bean
	public JobRepository configureJobRepository() throws Exception {
		JobRepositoryFactoryBean jobRepo=new JobRepositoryFactoryBean();
		jobRepo.setDataSource(dataSource);
		jobRepo.setTransactionManager(confgiureTransactionManager());
		jobRepo.setTablePrefix("eapp_");
		return jobRepo.getObject();
	}
	
	@Bean
	public JobLauncher configureJobLauncher() throws Exception {
		SimpleJobLauncher jobLauncher=new SimpleJobLauncher();
		jobLauncher.setJobRepository(configureJobRepository());
		return jobLauncher;
	}
	
	@Bean
	public PlatformTransactionManager confgiureTransactionManager() {
		return new ResourcelessTransactionManager();
	}
	
}
