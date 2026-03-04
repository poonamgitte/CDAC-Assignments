package emp.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import emp.core.ContractedEmployee;
import emp.core.Department;
import emp.core.Employee;
import emp.core.PermanentEmployee;

public class EmployeeUtils {

	public static List<Employee> populateEmployee(){
		// TODO Auto-generated method stub
		List<Employee>empList = new ArrayList<>();
		//int empId, String name, double salary, Department department, LocalDate joiningDate,
		//double overTime
		empList.add(new PermanentEmployee(1,"Rohini",5000,Department.HR,LocalDate.of(2025,10,15),3000));
		empList.add(new PermanentEmployee(2,"Poonam",6000,Department.DESIGN,LocalDate.of(2025,11,15),2000));
		empList.add(new PermanentEmployee(3,"Pooja",5000,Department.SALES,LocalDate.of(2025,10,30),1000));
		empList.add(new ContractedEmployee(4,"Shivam",3000,Department.HR,LocalDate.of(2024,9,11),300));
		empList.add(new ContractedEmployee(5,"Swarup",5000,Department.HR,LocalDate.of(2025,9,12),400));
		
		return empList;
		
	}

}
