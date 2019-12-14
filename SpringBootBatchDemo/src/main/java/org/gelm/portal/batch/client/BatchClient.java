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
		jobLauncher.run(job, new JobParameters());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
