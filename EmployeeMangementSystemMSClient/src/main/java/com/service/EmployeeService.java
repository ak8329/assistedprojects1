package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Employeedao;
import com.bean.Employee;

@Service
public class EmployeeService {
	@Autowired
	Employeedao ed;
	//http://localhost:8383/
	public  List<Employee> getallEmployee(){
		return ed.findAll();

}
	public String storeemp(Employee emp)
	{
	Optional<Employee> op=ed.findById(emp.getEid());
	if(op.isPresent())
	  return "emp found";
	else
		ed.save(emp);
	    return "record stored";
		
	}
	public String updateemp(Employee emp)
	{
	Optional<Employee> op=ed.findById(emp.getEid());
	if(op.isPresent())
	{
		Employee e=op.get();
		e.setSalary(emp.getSalary());
	    ed.saveAndFlush(e);
	  
	     return "emp found";
	}
	else
	    return "record not update";
		
	}
	public String deleteEmployee(int id) {
		Optional<Employee> op = ed.findById(id);
		if(op.isPresent()) {
						Employee e = op.get();
						ed.delete(e);
			return "Employee deleted successfully";
		}else {
				return "Record not present";
		}
	}

public String Findallemp(int id)
{
Optional<Employee> op=ed.findById(id);
if(op.isPresent())
{
	Employee e=op.get();
	return e.toString();  
}
else
    return "record is not there";
	
}
}