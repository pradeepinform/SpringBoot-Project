package software.puna.maxit.res;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="mst_district" )
public class DistDTO {
	@Id
	@Column(name = "district_code")
String distCode;
	@Column(name = "district_name")
String distName;
	@Column(name = "state_code")
String stCode;
public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getDistName() {
	return distName;
}
public void setDistName(String distName) {
	this.distName = distName;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}

}
