package com.example.demo;  
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
@Table
public class AssetsCategory   
{  
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
 
