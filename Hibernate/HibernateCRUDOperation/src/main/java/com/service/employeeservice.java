
	package com.service;

	import java.util.Iterator;
	import java.util.List;

	import com.bean.employee;
	import com.dao.employeedao;

	public class employeeservice {		// pure business logic 

		employeedao ed = new employeedao();
		
		public String storeemployee(employee emp) {
			if(emp.getSalary()<10000) {
				return "Employee salary must be > 10000";
			}
			else if(ed.storeemployee(emp)>0) {
				return "Record inserted successfully";
			}else {
				return "Record didn't insert";
			}
		}

		public List<employee> getAllemployee() {
			// TODO Auto-generated method stub
			return null;
		}

		public List<employee> getAllemployee1() {
			// TODO Auto-generated method stub
			return null;
		}
		
//		public List<Employee> getAllEmployee() {
//			List<Employee> listOfEmp = ed.getAllEmployee();
//			Iterator<Employee> li = listOfEmp.iterator();
//			while(li.hasNext()) {
//				Employee emp = li.next();
//				emp.setSalary(emp.getSalary()+5000);
//			}
//			
//			return listOfEmp;
//		}
	}


