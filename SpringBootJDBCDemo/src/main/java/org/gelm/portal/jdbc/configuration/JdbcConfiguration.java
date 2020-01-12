package org.gelm.portal.jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfiguration {
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	//testing purpose
	@Bean
	public DataSource configureDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean(name = {"jdbctemplatedemo"})
	public JdbcTemplate configureJdbcTempalte() {
		return new JdbcTemplate(configureDataSource());
	}
	@Bean(name = {"namedjdbctemplatedemo"})
	public NamedParameterJdbcTemplate configureNamedJdbcTempalte() {
		return new NamedParameterJdbcTemplate(configureDataSource());
	}
}
