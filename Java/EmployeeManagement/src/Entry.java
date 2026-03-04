
public class Entry {
	
	//function to accept employee data
	public static Employee getEmployeeDetails(int type) {
		System.out.println("Enter name:");
		String name = ConsoleInput.getString();

		System.out.println("Enter Address:");
		String address = ConsoleInput.getString();

		System.out.println("Enter Age:");
		int age = ConsoleInput.getInteger();

		System.out.println("Enter Gender (M/F):");
		String genderChoice = ConsoleInput.getString();
		boolean gender = genderChoice.equals("M");

		System.out.println("Enter BasicSalary:");
		double basicSal = ConsoleInput.getFloat();

		switch (type) {
		case 1: {
			System.out.println("Enter HRA:");
			double hra = ConsoleInput.getFloat();
			return new Manager(name, address, age, gender, basicSal, hra);
		}
		case 2:{ 
			System.out.println("Enter OverTime:");
			double overTime = ConsoleInput.getFloat();
			return new Engineer(name, address, age, gender, basicSal, overTime);
		}
		case 3:{
			System.out.println("Enter Commission:");
			double commission = ConsoleInput.getFloat();
			return new SalesPerson(name, address, age, gender, basicSal, commission);
		}
		}

		return null;
	}
	
	//function to sort name by ascending order
	public static void ascendingSort(Employee[] arrEmployee, int count) {
		for (int i = 0; i < count - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < count; j++) {

				int result = (arrEmployee[minIndex].getName()).compareTo(arrEmployee[j].getName());
				if (result > 0) {
					minIndex = j;
				}
			}

			Employee temp = arrEmployee[i];
			arrEmployee[i] = arrEmployee[minIndex];
			arrEmployee[minIndex] = temp;
		}
	}
	
	// function to sort name by descending order
	public static void descendingSort(Employee[] arrEmployee, int count) {
		for (int i = 0; i < count - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < count; j++) {

				int result = (arrEmployee[minIndex].getName()).compareTo(arrEmployee[j].getName());
				if (result < 0) {
					minIndex = j;
				}
			}

			Employee temp = arrEmployee[i];
			arrEmployee[i] = arrEmployee[minIndex];
			arrEmployee[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Employee[] arrEmployee = new Employee[100];
		

		int choice;

		do {
			System.out.println("-----------Menu-----------");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All");
			System.out.println("3.Save");
			System.out.println("4.Load");
			System.out.println("5.Sort");
			System.out.println("6. Exit");
			System.out.println("Enter Choice:");
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				int ch;
				do {
					System.out.println("Enter Choice\n1.Manager\n2.Engineer\n3.Sales Person\n4.Exit");
					ch = ConsoleInput.getInteger();

					if (ch >= 1 && ch <= 3) {
						arrEmployee[count++] = getEmployeeDetails(ch);
					}

				} while (ch != 4);
			}
			break;

			case 2: {
				System.out.println("--------------------------");
				System.out.println("All Employee list");
				System.out.println("--------------------------");
				
				for (int emp = 0; emp < count; emp++) {
					arrEmployee[emp].display();
					System.out.println("Total Salary:" + arrEmployee[emp].computeSalary());
					System.out.println("--------------------------");
				}

			}
			break;
			
			case 5: {
				int ch;

				do {

					System.out.println("\nEnter Choice\n1.Sort by name\n2.Sort by designation\n3.Exit");
					ch = ConsoleInput.getInteger();

					switch (ch) {

					case 1: {

						System.out.println("\nEnter Choice\n1.Sort by Ascending\n2.Sort by Descending");
						int sortChoice = ConsoleInput.getInteger();

						if (sortChoice == 1) {
							ascendingSort(arrEmployee,count);
						} else {
							descendingSort(arrEmployee,count);
						}

						System.out.println("---------------------------------------");
						System.out.println("All employee in Sorted order");
						System.out.println("---------------------------------------");

						for (int emp = 0; emp < count; emp++) {

							System.out.println(arrEmployee[emp].getName());
						}
					}
						break;

					case 2: {

						System.out.println("\nEnter Designation \n1.Manager\n2.Engineer\n3.SalesPerson");
						int sortDesgChoice = ConsoleInput.getInteger();

						if (sortDesgChoice == 1) {

							System.out.println("----------------------");
							System.out.println("All Managers Names");
							System.out.println("----------------------");

							for (int emp = 0; emp < count; emp++) {

								if (arrEmployee[emp] instanceof Manager) {
									System.out.println(arrEmployee[emp].getName());
								}
							}
						} else if (sortDesgChoice == 2) {

							System.out.println("----------------------");
							System.out.println("All Engineers Names");
							System.out.println("----------------------");

							for (int emp = 0; emp < count; emp++) {

								if (arrEmployee[emp] instanceof Engineer) {
									System.out.println(arrEmployee[emp].getName());
								}
							}
						} else if (sortDesgChoice == 3) {

							System.out.println("----------------------");
							System.out.println("All Sales Person Names");
							System.out.println("----------------------");

							for (int emp = 0; emp < count; emp++) {

								if (arrEmployee[emp] instanceof SalesPerson) {
									System.out.println(arrEmployee[emp].getName());
								}
							}
						}
					}
						break;

					}

				} while (ch != 3);
			}
				break;

			}
		} while (choice != 6);
	}

}

