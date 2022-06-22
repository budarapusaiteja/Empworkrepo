package com.sample.sampledata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class EmployeeTable {
	@Id
	@Column(name="id", unique=true)
	private Integer id;
	private String name;
	private double salary;
	EmployeeTable(){
		
	}
	@Override
	public String toString() {
		return "EmployeeTable [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public EmployeeTable(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
