package com;

public class address {
	private String state;
	private int pno;
	private String city;
	

	
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public address(String state, int pno, String city) {
		super();
		this.state = state;
		this.pno = pno;
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "address [state=" + state + ", pno=" + pno + ", city=" + city + "]";
	}
	

}
