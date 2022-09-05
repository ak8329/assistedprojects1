package hpp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
@Id
private int tid;
	
public String tname;
@OneToOne
private Course crs;
@OneToMany
@JoinColumn(name="tsid")
private List<Student> los;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Course getCrs() {
	return crs;
}
public void setCrs(Course crs) {
	this.crs = crs;
}
public List<Student> getLos() {
	return los;
}
public void setLos(List<Student> los) {
	this.los = los;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", crs=" + crs + ", los=" + los + "]";
}

}