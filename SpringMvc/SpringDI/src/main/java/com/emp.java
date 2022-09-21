package com;

public class emp{
private int id;
private String name;
private float salary;
private address g;
	
	public emp() {
		super();
		System.out.println("Object created - using empty constructor");
	}

	public emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public emp(int id, String name, float salary, address g) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.g = g;
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

	public address getG() {
		return g;
	}

	public void setG(address g) {
		this.g = g;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee class method");
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + ", g=" + g + "]";
	}
}
	
	
