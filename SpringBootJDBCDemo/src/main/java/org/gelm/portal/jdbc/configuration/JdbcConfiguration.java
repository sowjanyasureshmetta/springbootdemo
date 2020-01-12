package org.gelm.portal.jdbc.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import oracle.jdbc.pool.OracleDataSource;

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
	@Bean(name="springdatasource")
	public DataSource configureDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	@Bean(name = "oracledatasource")
	public DataSource configureOracleDataSource() {
		OracleDataSource ds=null;
		try {
			ds = new OracleDataSource();
		
		ds.setDriverType(driverClassName);
		ds.setURL(url);
		ds.setUser(username);
		ds.setPassword(password);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
