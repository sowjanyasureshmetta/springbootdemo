package org.gelm.portal.batch.ds.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BatchDataSourceConfiguration {

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String password;
	
	@Bean
	public JdbcTemplate configureBatchJdbcTemplate() {
		JdbcTemplate batchTemplate=new JdbcTemplate();
		batchTemplate.setDataSource(configureBatchDataSource());
		return batchTemplate;
	}
	
	@Bean
	public DriverManagerDataSource configureBatchDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(userName);
		ds.setPassword(password);
		return ds;
	}
	
}
