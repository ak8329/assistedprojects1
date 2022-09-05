

	import java.util.Iterator;
	import java.util.List;

	import com.bean.employee;
	import com.service.employeeservice;

	public class main{

		public static void main(String[] args) {
			// Store Employee
			employee emp1 = new employee();
			emp1.setId(7);
			emp1.setName("Seeta");
			emp1.setSalary(12000);
			
			employeeservice es = new employeeservice();
			String result = es.storeemployee(emp1);
			System.out.println(result);
			
		employeeservice es1 = new employeeservice();			
		//List<employee> listOfEmp = es1.getAllemployee();
		
	//for(employee emp:listOfEmp) {

		
				//System.out.println(emp);			}
			
		}

	}


