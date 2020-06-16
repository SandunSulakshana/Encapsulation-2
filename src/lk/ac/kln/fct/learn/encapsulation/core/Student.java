package lk.ac.kln.fct.learn.encapsulation.core;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
	private String id;
	private String name;
	private String degree;
	
	public Student(String id, String name, String degree) {
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	@Override
	public Student clone() {
		try {
			return (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
