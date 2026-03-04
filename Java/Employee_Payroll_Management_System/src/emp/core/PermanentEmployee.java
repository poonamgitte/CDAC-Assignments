package emp.core;

import java.time.LocalDate;

import emp.interfaces.Taxable;

public class PermanentEmployee extends Employee implements Taxable{

	
	
	private double overTime;
	
	
	public PermanentEmployee(int empId, String name, double salary, Department department, LocalDate joiningDate,
			double overTime) {
		super(empId, name, salary, department, joiningDate);
		this.overTime = overTime;
	}


	@Override
	public double calculateNetSalary() {
		
		return (salary+overTime)-calculateTax(salary);
	}


	@Override
	public double calculateTax(double salary) {
		// TODO Auto-generated method stub
		return salary*0.18;
	}


	@Override
	public String toString() {
		return super.toString()+"PermanentEmployee [overTime=" + overTime + "]";
	}


	

}
