package software.puna.maxit.res;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "mst_state")
public class StateDTO {
	@Id
	@Column(name="state_code")
  int stCode;
	@Column(name="state_name")
  String stName;
  @Column(name="state_short_name")
  String stShortName;
public int getStCode() {
	return stCode;
}
public void setStCode(int stCode) {
	this.stCode = stCode;
}
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;
}
public String getStShortName() {
	return stShortName;
}
public void setStShortName(String stShortName) {
	this.stShortName = stShortName;
}
  
	 
}
