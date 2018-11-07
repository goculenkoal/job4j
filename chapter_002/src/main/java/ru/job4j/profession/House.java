package ru.job4j.profession;

public class House {
	public String address;
	public int floors;
	
	public House() {
	}
	
	public House(String address, int floors) {
		this.address = address;
		this.floors = floors;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getfloors() {
		return this.floors;
	}
	
	public void setfloors() {
		this.floors = floors;
	}
}