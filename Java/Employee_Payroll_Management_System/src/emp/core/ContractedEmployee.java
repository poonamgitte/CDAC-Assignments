package emp.core;

import java.time.LocalDate;

import emp.interfaces.BonusEligible;

public class ContractedEmployee extends Employee implements BonusEligible{
	
	private double commission;
	public ContractedEmployee(int empId, String name, double salary, Department department, LocalDate joiningDate, double commission) {
		super(empId, name, salary, department, joiningDate);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}

	@Override
public double calculateNetSalary() {
		
		return (salary+commission)+calculateBonus(salary);
	}

	@Override
	public double calculateBonus(double salary) {
		// TODO Auto-generated method stub
		return salary*0.10;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractedEmployee [commission=" + commission + "]";
	}

}
