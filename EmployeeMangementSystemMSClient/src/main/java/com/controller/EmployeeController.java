package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("Emp")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	//http://localhost:8383/Emp/emsall
	//@RequestMapping(value="/findall",method=RequestMethod.GET)
	@GetMapping(value="emsall",produces=MediaType.APPLICATION_JSON_VALUE)
   public List<Employee> gettallEmployee(){
		return es.getallEmployee();
		
	}

@RequestMapping(value="emsstore",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
public String storeemp(@RequestBody Employee emp)
{
		return es.storeemp(emp);
}
@RequestMapping(value="emupdate",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
public String updateemp(@RequestBody Employee emp)
{
		return es.updateemp(emp);
}
@RequestMapping(value="delete/{id}",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
public String deleteemp(@PathVariable("id") int eid)
{
		return es.deleteEmployee(eid);
}
@GetMapping(value = "findEmployeeById/{id}")
public String findEmployee(@PathVariable("id") int id) {
	return es.Findallemp(id);
}
}

