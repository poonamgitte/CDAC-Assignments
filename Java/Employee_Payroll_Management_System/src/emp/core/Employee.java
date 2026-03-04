package emp.core;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Employee implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		protected int empId;
		protected String name;
		protected double salary;
		protected Department department;
		protected LocalDate joiningDate;
		
		public Employee(int empId, String name, double salary, Department department, LocalDate joiningDate) {
			
			this.empId = empId;
			this.name = name;
			this.salary = salary;
			this.department = department;
			this.joiningDate = joiningDate;
		}
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public LocalDate getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(LocalDate joiningDate) {
			this.joiningDate = joiningDate;
		}
		
		public abstract double calculateNetSalary();

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
					+ ", joiningDate=" + joiningDate + "]";
		}

		
		
}
