package org.gelm.portal.application;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchXmlApplication.class, args);
    }

}
