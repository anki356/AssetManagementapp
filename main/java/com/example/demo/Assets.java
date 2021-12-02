package com.example.demo;  
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;  
//mark class as an Entity 

@Entity  
@Table
public class Assets  implements Serializable 
{  
	//mark id as primary key  
//defining id as column name 


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//defining name as column name  
@Id
@Column  
private String name;
@Column
private String purchaseDate;
@Column
private String condition_notes;
@Column
private String Category;
@Column
private String assignmentStatus;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name="Category",referencedColumnName = "name",insertable = false,updatable = false)
private AssetsCategory assetscategory;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(String purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public String getCondition_notes() {
	return condition_notes;
}
public void setCondition_notes(String condition_notes) {
	this.condition_notes = condition_notes;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getAssignmentStatus() {
	return assignmentStatus;
}

public void setAssignmentStatus(int assignmentStatus) {
	switch (assignmentStatus) {
	case 0:
		this.assignmentStatus=Assignment_Status.Available.toString();
		break;
	case 1:
	this.assignmentStatus = Assignment_Status.Assigned.toString();
	break;	
	
   case 2:
	this.assignmentStatus = Assignment_Status.Recovered.toString();
	break;	
	}
	
}

}

 
