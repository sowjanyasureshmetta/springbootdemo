package org.gelm.portal.application;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

@Configuration
public class XmlConfiguration 
{

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @StepScope
    @Bean(name="xmlReader")
    public StaxEventItemReader<Students> reader() 
    {
        StaxEventItemReader<Students> xmlFileReader = new StaxEventItemReader<>();
        xmlFileReader.setResource(new ClassPathResource("students.xml"));
        xmlFileReader.setFragmentRootElementName("students");

		/*
		 * Map<String, Class<?>> aliases = new HashMap<>(); aliases.put("students",
		 * Students.class);
		 */
		/*
		 * aliases.put("courses", Courses.class); aliases.put("course",
		 * ArrayList.class); aliases.put("studentdetails", StudentDetails.class);
		 * aliases.put("student", ArrayList.class);
		 */

        XStreamMarshaller xStreamMarshaller = new XStreamMarshaller();
        xStreamMarshaller.setAnnotatedClasses(Students.class,Courses.class,Course.class,StudentDetails.class,StudentDTO.class);
        xStreamMarshaller.setAutodetectAnnotations(true);

        xmlFileReader.setUnmarshaller(xStreamMarshaller);

        return xmlFileReader;
    }


    @Bean(name="xmlProcessor")
    public ItemProcessor<Students, Students> processor() 
    {
        return new Processor();
    }


    @Bean(name="xmlWriter")
    public ItemWriter<Students> writer() 
    {
        return new WriterofStudent();     
    }
    

	/*
	 * @Bean(name="xmljobListener") public JobExecutionListenerSupport jobListener()
	 * { return new JobListener(); }
	 */
	/*
	 * @JobScope
	 * 
	 * @Bean(name="xmltaskExecutor") public ThreadPoolTaskExecutor taskExecutor() {
	 * ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	 * executor.setCorePoolSize(50); executor.setMaxPoolSize(100); return executor;
	 * }
	 */

    @Bean(name="xmlStep")
    public Step xmlFileToDatabaseStep() 
    {
        return stepBuilderFactory.get("xmlStep")
                .<Students, Students>chunk(1)
                .reader(this.reader())
               // .processor(this.processor())
                .writer(this.writer())
                //.taskExecutor(this.taskExecutor())
                .build();
    }

    @Bean(name="xmlJob")
    public Job xmlFileToDatabaseJob(@Autowired @Qualifier("xmlStep") Step step) 
    {
        return jobBuilderFactory
                .get("xmlJob"+new Date())
                .incrementer(new RunIdIncrementer())
               // .listener(this.jobListener())
                .flow(step)
                .end()
                .build();
    }

}