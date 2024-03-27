package software.puna.maxit.res;

import org.springframework.stereotype.Component;

@Component
public class RegBean {
String stCode;
String name;
String phone;
String distCode;

public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
