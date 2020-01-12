package org.gelm.portal.batch.client;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.gelm.portal.*"})
@EnableBatchProcessing
public class BatchClient implements ApplicationRunner {

	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job; 
	
	public static void main(String[] args) {
		SpringApplication.run(BatchClient.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
		//With your below step you will only be able to launch the job only once.	
		   jobLauncher.run(job, new JobParameters());
		
			/*
			 * The job is unique identified by its id together with the parameters.
			 * Currently there is no way to make a distinction based on the parameters.
			 * Instead of adding new JobParameters() use the JobParamtersBuilderBuilder and
			 * add the current date and time.
			 */
			
			/*
			 * JobParametersBuilder builder = new JobParametersBuilder();
			 * builder.addDate("date", new Date()); jobLauncher.run(job,
			 * builder.toJobParameters());
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
