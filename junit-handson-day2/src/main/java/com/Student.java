/**
 * 
 */
package com;

import java.io.Serializable;

/**
 * @author Vijayalakshmi
 *
 */
public class Student implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 4989628906023888047L;
	
	int id;
	String name;	
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
