package net.persist.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "tb_service")
public class Service {
	
@Id
@Column(name = "service_id")
private Integer serviceId;
@Column(name = "service_name")
private String serviceName;
@Column(name = "service_desc")
private String serviceDesc;
@Column(name = "op_id")
private Integer opId;
@Column(name = "advertiser_id")
private Integer advertiserId;	

@Column(name = "otp_length")
private Integer otpLength;	


private Boolean status;

public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public String getServiceDesc() {
	return serviceDesc;
}
public void setServiceDesc(String serviceDesc) {
	this.serviceDesc = serviceDesc;
}
public Integer getOpId() {
	return opId;
}
public void setOpId(Integer opId) {
	this.opId = opId;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public Integer getServiceId() {
	return serviceId;
}
public void setServiceId(Integer serviceId) {
	this.serviceId = serviceId;
}
public Integer getAdvertiserId() {
	return advertiserId;
}
public void setAdvertiserId(Integer advertiserId) {
	this.advertiserId = advertiserId;
}
public Integer getOtpLength() {
	return otpLength;
}
public void setOtpLength(Integer otpLength) {
	this.otpLength = otpLength;
}

}
