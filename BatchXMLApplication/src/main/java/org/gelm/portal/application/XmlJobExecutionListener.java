package org.gelm.portal.application;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class XmlJobExecutionListener implements JobExecutionListener
{

	@Override
	public void beforeJob(JobExecution jobExecution) {
		
		System.out.println("Before Job");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("After Job");
	}

}
