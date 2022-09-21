package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class address {
    @Value(value="kkk")
	private String city;
    @Value(value="kll")
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "address [city=" + city + ", state=" + state + "]";
	}
	
}
