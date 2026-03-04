import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Entry {

	// function to accept employee data
	public static Employee getEmployeeDetails(int type) {
		System.out.println("Enter name:");
		String name = ConsoleInput.getString();

		System.out.println("Enter Address:");
		String address = ConsoleInput.getString();

		System.out.println("Enter Age:");
		int age = ConsoleInput.getInteger();

		System.out.println("Enter Gender (true for male, false for female):");
		boolean gender = ConsoleInput.getBoolean();

		System.out.println("Enter BasicSalary:");
		double basicSal = ConsoleInput.getFloat();

		switch (type) {
		case 1: {
			System.out.println("Enter HRA:");
			double hra = ConsoleInput.getFloat();
			return new Manager(name, address, age, gender, basicSal, hra);
		}
		case 2: {
			System.out.println("Enter OverTime:");
			double overTime = ConsoleInput.getFloat();
			return new Engineer(name, address, age, gender, basicSal, overTime);
		}
		case 3: {
			System.out.println("Enter Commission:");
			double commission = ConsoleInput.getFloat();
			return new SalesPerson(name, address, age, gender, basicSal, commission);
		}
		}

		return null;
	}
	
	// Serialization (Write Employee data onto file)
	
	public static void save(LinkedList<Employee> employeeList) {
		
		try {
			
			File file = new File("C:\\Users\\dahip\\OneDrive\\Desktop\\CDAC\\Java\\EmployeeManagement_Serialization\\EmployeeData.ser");
			
			FileOutputStream fileOut = new FileOutputStream(file);
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(employeeList);
			
			System.out.println("Employee data saved");

			
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Decerialization (Load serialized data of employees)
	
	@SuppressWarnings("unchecked")
	public static void load(LinkedList<Employee> employeeList) {
		
		try {
			File file = new File("C:\\Users\\dahip\\OneDrive\\Desktop\\CDAC\\Java\\EmployeeManagement_Serialization\\EmployeeData.ser");
			
			if(!file.exists() || file.length() == 0) {
				System.out.println("No saved data found");
				return;
			}
			
			FileInputStream fileIn = new FileInputStream(file);
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			LinkedList<Employee>loadedList = (LinkedList<Employee>)in.readObject();
			
			employeeList.clear();
			employeeList.addAll(loadedList);
			
			System.out.println("Employee data loaded");
			
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// Main Function
	
	public static void main(String[] args) {
		
		LinkedList<Employee> employeeList = new LinkedList<>();
		
		// Deserialized(Load employee data from file Automatically)
		Entry.load(employeeList);

		int choice;

		do {
			System.out.println("-----------Menu-----------");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All");
			System.out.println("3.Save");
			System.out.println("4.Load");
			System.out.println("5.Sort");
			System.out.println("6.Traverse");
			System.out.println("7. Exit");
			System.out.println("Enter Choice:");
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {

				int subChoice;
				do {
					System.out.println("Enter Choice\n1.Manager\n2.Engineer\n3.Sales Person\n4.Exit");
					subChoice = ConsoleInput.getInteger();

					if (subChoice >= 1 && subChoice <= 3) {

							employeeList.add(getEmployeeDetails(subChoice));
					}

				} while (subChoice != 4);
			}
				break;

			case 2: {
				System.out.println("--------------------------");
				System.out.println("All Employee list");
				System.out.println("--------------------------");

				// Traversing in list using Iterator
				for (Employee data : employeeList) {
					System.out.println(data);
					System.out.println("--------------------------");

				}

			}
				break;
				
			case 3:{
				// Save all employee data in the file (Serialization)
				
				save(employeeList);
			}
			break;
			
			case 4:{
				// Load employee data from file (Deserialization)
				load(employeeList);
			}
			break;
			
			case 5: {
				int ch;

				do {

					System.out.println("\nEnter Choice\n1.Sort by name\n2.Sort by designation\n3.Exit");
					ch = ConsoleInput.getInteger();

					switch (ch) {

					case 1: {
							//Sort by name
					}
						break;

					case 2: {

						System.out.println("\nEnter Designation \n1.Manager\n2.Engineer\n3.SalesPerson");
						int sortDesgChoice = ConsoleInput.getInteger();

						if (sortDesgChoice == 1) {

							System.out.println("----------------------");
							System.out.println("All Managers Names");
							System.out.println("----------------------");

							for (Employee employeeData : employeeList) {

								if (employeeData instanceof Manager) {
									System.out.println(employeeData.getName());
								}

							}

						} else if (sortDesgChoice == 2) {

							System.out.println("----------------------");
							System.out.println("All Engineers Names");
							System.out.println("----------------------");

							for (Employee employeeData : employeeList) {

								if (employeeData instanceof Engineer) {
									System.out.println(employeeData.getName());
								}

							}

						} else if (sortDesgChoice == 3) {

							System.out.println("----------------------");
							System.out.println("All Sales Person Names");
							System.out.println("----------------------");

							for (Employee employeeData : employeeList) {

								if (employeeData instanceof SalesPerson) {
									System.out.println(employeeData.getName());
								}
							}
						}
					}
						break;

					}

				} while (ch != 3);
			}
				break;

			case 6: {

				int travChoice;

				do {
					System.out.println("Enter choice\n1.Get first\n2.Get last\n3.Exit");
					travChoice = ConsoleInput.getInteger();

					switch (travChoice) {
					case 1: {
						System.out.println("First employee data");
					
							System.out.println(employeeList.getFirst());	

					}
						break;

					case 2: {
						System.out.println("Last employee data");
						
						System.out.println(employeeList.getLast());
						
					}
						break;
					}
				} while (travChoice != 3);

			}
				break;
				
			case 7:{
				// Save employee data on to file automatically
				Entry.save(employeeList);
			}

			}
		} while (choice != 7);
	}

}