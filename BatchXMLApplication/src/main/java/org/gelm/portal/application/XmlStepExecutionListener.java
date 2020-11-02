package org.gelm.portal.application;

import java.nio.file.CopyOption;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.apache.catalina.startup.CopyParentClassLoaderRule;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"application.properties"})
public class XmlStepExecutionListener implements StepExecutionListener
{

	@Value(value = "${XmlFileStagingPathSourceLocation}")
	private String xmlFileStagingPathSourceLocation;

	@Value("${XmlFileLocalSourceLocation}")
    private String xmlFileLocalSourceLocation;
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		
		Path path = FileSystems.getDefault().getPath("xmlFileStagingPathSourceLocation");
		
		//Files.copy(xmlFileStagingPathSourceLocation, xmlFileLocalSourceLocation,StandardCopyOption.REPLACE_EXISTING);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("After Step");
		return ExitStatus.COMPLETED;
	}

}
