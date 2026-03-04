package emp.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import emp.core.Department;
import emp.core.Employee;
import emp.core.PermanentEmployee;
import emp.exception.EmployeeHandlingException;
import emp.utils.EmployeeUtils;
import emp.utils.IOUtils;

public class Entry {
	
	//Add Employee
	@SuppressWarnings("resource")
	public static void addEmployee(int choice, List<Employee>empList) throws EmployeeHandlingException {
		int empId;
		String name;
		double salary;
		Department department;
		LocalDate joiningDate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id:");
		empId = sc.nextInt();
		
		for(Employee emp:empList) {
			
			if(emp.getEmpId() == empId) {
				throw new EmployeeHandlingException("Id should be unique");
			}
		}
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Enter department(HR,RESEARCH,SALES,DESIGN): ");
		department = Department.valueOf(sc.next().toUpperCase());
		
		System.out.println("joinDate");
		joiningDate = LocalDate.parse(sc.next());
		
		if(choice == 1) {
			System.out.println("Enter Overtime:");
			double overTime = sc.nextDouble();
			
			empList.add(new PermanentEmployee( empId,name,salary,department,joiningDate,overTime));
		}
		
		else if(choice == 2) {
			System.out.println("Enter commission:");
			double commission = sc.nextDouble();
			
			empList.add( new PermanentEmployee( empId,name,salary,department,joiningDate,commission));
		}
				
	}

	public static void main(String[] args) throws EmployeeHandlingException{
		try (// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in)) {
			List<Employee>empList=EmployeeUtils.populateEmployee();
		
			int choice;
			
			do {
			
				System.out.println("1.Display All");
				System.out.println("2.Add Employee");
				System.out.println("3.Search By Id");
				System.out.println("4.Calculate Payroll");
				System.out.println("5.save");
				System.out.println("6.Load");
				System.out.println("7.Sort names of Employee in Ascending Order");
				System.out.println("8.Update Salary by Id");
				System.out.println("9.Display Employee of specific department");
				System.out.println("10.Count of Employee departmentwise");
				System.out.println("11.Sort by joining date:");
				System.out.println("12.exit");
				System.out.println("Enter Choice");
				
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:{
					//Display all employee
					empList.forEach(System.out::println);
				}break;
				
				//Add employee
				case 2:{

					System.out.println("1.Permanent Employee\n2.Contracted Employee");
					int subChoice = sc.nextInt();
					
					if(choice==1 || choice ==2) {
						addEmployee(subChoice,empList);
						System.out.println("Employee added successfully");
					}
					else {
						throw new EmployeeHandlingException("Invalid choice");
					}
				}
				break;
				
				//Search by id
				case 3:{
					System.out.println("Enter Id to search");
					int id=sc.nextInt();
					boolean found=false;
					
					for(Employee e:empList) {
						if(e.getEmpId()==id) {
							found=true;
							System.out.println(e);;
						}
					}
					if(found==false) {
						throw new EmployeeHandlingException("Id not Found");
					}
				
				}break;
				
				
				//Calculate Payroll
				case 4:{
					
					double TotalPayRoll = 0;
					
					for(Employee emp:empList) {
						TotalPayRoll += emp.calculateNetSalary();
					}
					System.out.println("Total Payroll of Company:"+TotalPayRoll);
				}
				break;
				
				// Save data to file (Serialization)
				case 5:{
					IOUtils.save(empList);
					System.out.println("Data saved");
				}break;
				
				//Load data from file(DeSerialization
				case 6:{
					
					IOUtils.load(empList);
					System.out.println("Data Loaded successfully");
				}break;
				
				//Sort by name
				case 7:{
					//empList.sort(Comparator.comparing(Employee::getName));
					
					// or using lambda functions
					Collections.sort(empList, (e1,e2) ->e1.getName().compareTo(e2.getName()));
					
					System.out.println("Sorted List");
					
					empList.forEach(System.out::println);
				}break;
				
				
				//Update salary by id
				case 8:{
					System.out.println("Enter id to update salary:");
					int id = sc.nextInt();
					
					boolean found=false;
					
					System.out.println("Enter new Salary");
					double salary = sc.nextDouble();
					
					for(Employee emp: empList) {
						
						if(emp.getEmpId() == id) {
							found=true;
							emp.setSalary(salary);
							System.out.println("Salary Updated");
						}
						
					}
					
					if(!found) {
						throw new EmployeeHandlingException("Id not Found");
					}
				}break;
				
				case 9:{
					System.out.println("Enter department (HR,RESEARCH,SALES,DESIGN):");
//					String dept = sc.next().toUpperCase();
//					
//					boolean found = false;
//					
//					for(Employee emp : empList) {
//						
//						if(String.valueOf(emp.getDepartment()).equals(dept)) {
//							found = true;
//							System.out.println(emp);
//						}
//					}
					
					//or
					Department dept = Department.valueOf(sc.next().toUpperCase());
					
					empList.stream()
					.filter(e ->e.getDepartment() == dept)
					.forEach(System.out::println);
					
					// display all employee of type
				
					
//					if(!found) {
//						throw new EmployeeHandlingException("Employee not found");
//					}
				}
				break;
				
				//Count employee department wise
				case 10:{
					System.out.println("Count of employees department wise:");
					
					Map<Department,Integer>deptCount = new HashMap<>();
					
					for(Employee emp: empList) {
						Department dept = emp.getDepartment();
						
						deptCount.put(dept, deptCount.getOrDefault(dept, 0)+1);
					}
					
					for(Map.Entry<Department,Integer>entry : deptCount.entrySet()) {
						
						System.out.println(entry.getKey()+"->"+entry.getValue());
					}
				}
				break;
				
				case 11:{
					System.out.println("Employees sorted by joining date:");
					
					empList.sort(Comparator.comparing(Employee :: getJoiningDate));
					
					empList.forEach(System.out::println);
				}
				break;
				
				}
			}while(choice!=12);
		}
	}

	
	
}
