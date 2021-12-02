package com.example.demo;  
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;  
//mark class as an Entity 

@Entity  
@Table
public class AssetsCategory implements Serializable  
{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//mark id as primary key  
//defining id as column name 

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;  
//defining name as column name  
@Column  
private String name;
@Column
private String description;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getId() {
	return id;
}

}

 
