package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public interface Employeedao extends JpaRepository<Employee,Integer> {

}