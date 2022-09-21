package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class emp {
	@Value(value="100")
	private int id;
	@Value(value="str")
	private String name;
	@Value(value="200")
	private float salary;
	@Autowired
	private address add;
	
	public emp() {
		super();
System.out.print("emp created\n");
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}

}
