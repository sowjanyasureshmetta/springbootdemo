package org.gelm.portal.application;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("student")
public class StudentDTO 
{
    private String emailAddress;
    private String name;
    private String purchasedPackage;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurchasedPackage() {
		return purchasedPackage;
	}
	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}
    
    
    
}