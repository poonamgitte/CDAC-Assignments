import java.time.LocalDate;

public class PrimeMembers extends Member {
	
	LocalDate joiningYear;
	double joiningFees;
	boolean isActive;
	
	public PrimeMembers(String name, int age, String phoneNo, String address, double salary, LocalDate joiningYear,
			double joiningFees, boolean isActive) {
		super(name, age, phoneNo, address, salary);
		this.joiningYear = joiningYear;
		this.joiningFees = joiningFees;
		this.isActive = isActive;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("phoneNo:"+phoneNo);
		System.out.println("Joining year:"+joiningYear);
		System.out.println("Joining Fees:"+joiningFees);
	}
	
	public LocalDate getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(LocalDate joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		
		PrimeMembers p = new PrimeMembers("poonam",23,"567432444","pune",50000,LocalDate.of(2025, 10, 25),4000, true);
		
		p.display();
		
	}
	
}
