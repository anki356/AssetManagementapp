package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
	 * 
	 */
	
	private @Id int id;
	  private String employeename;
	  private String role;
	private String assetname;
	public String getAssetname() {
		return assetname;
	}



	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}



	public void setId(int id) {
		this.id = id;
	}

  

  Employee() {}

  Employee(int id,String name, String role,String assetname) {
    this.id=id;
    this.employeename = name;
    this.role = role;
    this.assetname=assetname;
  }
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="assetname",referencedColumnName = "name",insertable = false,updatable = false)
  private Assets assets;
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.employeename;
  }

  public String getRole() {
    return this.role;
  }

  

  public void setName(String name) {
    this.employeename = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.employeename, employee.employeename)
        && Objects.equals(this.role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.employeename, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.employeename + '\'' + ", role='" + this.role + '\'' + '}';
  }
}