package com.demo.model;
//@Entity
public class Employee {

	private Integer id;
	private String name;
	private String City;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Employee(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

}
