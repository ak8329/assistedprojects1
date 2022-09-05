package hpp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Student {
	
	
	@Id
	public int rid;

	private String name;
	private int age;
	@OneToMany
	@JoinColumn(name="scid")
	private List<Course> los;
	private Integer tsid;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Course> getLos() {
		return los;
	}
	public void setLos(List<Course> los) {
		this.los = los;
	}
	public Integer getTsid() {
		return tsid;
	}
	public void setTsid(Integer tsid) {
		this.tsid = tsid;
	}
	@Override
	public String toString() {
		return "Student [rid=" + rid + ", name=" + name + ", age=" + age + ", los=" + los + ", tsid=" + tsid + "]";
	}

		// TODO Auto-generated method stub
		
	}


