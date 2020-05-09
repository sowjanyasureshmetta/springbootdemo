package org.gelm.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "LIFERAY_USER")
@Table(name = "GE_USER")
public class LiferayUser {

	@Id
	@Column(name = "GE_USER_ID")
	private String id;
	@Column(name = "GE_USER_NAME")
	private String userName;
	@Column(name = "GE_USER_PASSWORD")
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
