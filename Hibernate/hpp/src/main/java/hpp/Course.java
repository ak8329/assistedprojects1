package hpp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	public int cid;
	private String cname;
	public float fee;
	private Integer srid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public Integer getTcid() {
		return srid;
	}
	public void setTcid(Integer tcid) {
		this.srid = tcid;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fee=" + fee + ", srid=" + srid + "]";
	}
	
	}


