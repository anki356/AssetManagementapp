package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface Employeerepository extends JpaRepository<Employee, Integer> {

}