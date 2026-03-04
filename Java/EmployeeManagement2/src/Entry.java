//
//public class Entry {
//
//	// Add Employee
//	public static Employee addEmployee(int empChoice) {
//
//		System.out.println("Enter name:");
//		String name = ConsoleInput.getString();
//
//		System.out.println("Enter address:");
//		String address = ConsoleInput.getString();
//
//		System.out.println("Enter age:");
//		int age = ConsoleInput.getInteger();
//
//		System.out.println("Enter gender true for male and false for female:");
//		boolean gender = ConsoleInput.getBoolean();
//
//		System.out.println("Enter basic salary:");
//		double basicSal = ConsoleInput.getDouble();
//
//		if (empChoice == 1) {
//			System.out.println("Enter HRA:");
//			double hra = ConsoleInput.getDouble();
//
//			return new Manager(name, address, age, gender, basicSal, hra);
//		} else if (empChoice == 2) {
//			System.out.println("Enter over time:");
//			double overTime = ConsoleInput.getDouble();
//
//			return new Engineer(name, address, age, gender, basicSal, overTime);
//		} else if (empChoice == 3) {
//			System.out.println("Enter Commission:");
//			double commission = ConsoleInput.getDouble();
//
//			return new Manager(name, address, age, gender, basicSal, commission);
//
//		}
//		return null;
//	}
//
//	// Ascending sort
//	public static void ascendingSort(Employee[] arrEmployee, int empCount) {
//
//		for (int i = 0; i < empCount - 1; i++) {
//			int minIndex = i;
//
//			for (int j = i + 1; j < empCount; j++) {
//
//				int result = (arrEmployee[minIndex].getName()).compareTo(arrEmployee[j].getName());
//				if (result > 0) {
//					minIndex = j;
//				}
//			}
//
//			Employee temp = arrEmployee[i];
//			arrEmployee[i] = arrEmployee[minIndex];
//			arrEmployee[minIndex] = temp;
//		}
//	}
//
//	// Descending sort
//	public static void descendingSort(Employee[] arrEmployee, int empCount) {
//
//		for (int i = 0; i < empCount - 1; i++) {
//			int maxIndex = i;
//
//			for (int j = i + 1; j < empCount; j++) {
//
//				int result = (arrEmployee[maxIndex].getName()).compareTo(arrEmployee[j].getName());
//				if (result < 0) {
//					maxIndex = j;
//				}
//			}
//
//			Employee temp = arrEmployee[i];
//			arrEmployee[i] = arrEmployee[maxIndex];
//			arrEmployee[maxIndex] = temp;
//		}
//	}
//
//	public static void main(String[] args) {
//
//		Employee[] arrEmployee = new Employee[5];
//
//		int empCount = 0;
//		int choice;
//
//		do {
//
//			System.out.println("-----Employee Menu-----");
//			System.out.println("1.Add Employee");
//			System.out.println("2.Display All");
//			System.out.println("3.Save");
//			System.out.println("4.Load");
//			System.out.println("5.Sort");
//			System.out.println("6. Exit");
//			System.out.println("Enter Choice:");
//			choice = ConsoleInput.getInteger();
//
//			switch (choice) {
//			case 1: {
//				System.out.println("Enter choice \n1.Manager\n2.Engineer\n3.Salesman");
//				int empChoice = ConsoleInput.getInteger();
//
//				if (empChoice >= 1 && empChoice <= 3) {
//					arrEmployee[empCount++] = addEmployee(empChoice);
//				} else {
//					System.out.println("Enter valid choice.");
//				}
//			}
//				break;
//
//			case 2: {
//				System.out.println("----------------------------");
//				System.out.println("All employees list");
//				System.out.println("----------------------------");
//				for (int emp = 0; emp < empCount; emp++) {
//					System.out.println(arrEmployee[emp].toString());
//					System.out.println("----------------------------");
//				}
//			}
//				break;
//
//			case 5: {
//
//				int sortChoice;
//
//				do {
//					System.out.println("Enter choice\n1.Sort by name\n2.Sort by Designation\n3.Exit");
//					sortChoice = ConsoleInput.getInteger();
//
//					switch (sortChoice) {
//					case 1: {
//						System.out.println("Enter sort choice\n1.Ascending Sort\n2.Descending sort");
//						int sortSubChoice = ConsoleInput.getInteger();
//
//						if (sortSubChoice == 1) {
//							ascendingSort(arrEmployee, empCount);
//
//						} else {
//							descendingSort(arrEmployee, empCount);
//						}
//
//						System.out.println("----------------------------");
//						System.out.println("All employees list");
//						System.out.println("----------------------------");
//						for (int emp = 0; emp < empCount; emp++) {
//							System.out.println(arrEmployee[emp].getName());
//						}
//					}
//						break;
//
//					case 2: {
//						System.out.println("1.Manager\n2.Engineer\n3.Salesman");
//						int descChoice = ConsoleInput.getInteger();
//
//						if (descChoice == 1) {
//							System.out.println("All Manager list");
//
//							for (int emp = 0; emp < empCount; emp++) {
//								if (arrEmployee[emp] instanceof Manager) {
//									System.out.println(arrEmployee[emp].getName());
//								}
//							}
//						} else if (descChoice == 2) {
//							System.out.println("All Manager list");
//							for (int emp = 0; emp < empCount; emp++) {
//
//								if (arrEmployee[emp] instanceof Engineer) {
//									System.out.println(arrEmployee[emp].getName());
//								}
//							}
//						} else if (descChoice == 3) {
//							System.out.println("All Manager list");
//							for (int emp = 0; emp < empCount; emp++) {
//
//								if (arrEmployee[emp] instanceof Salesman) {
//									System.out.println(arrEmployee[emp].getName());
//								}
//							}
//						} else {
//							System.out.println("Enter valid choice");
//						}
//					}
//						break;
//
//					}
//
//				} while (sortChoice != 3);
//
//			}
//				break;
//
//			}
//
//		} while (choice != 7);
//
//	}
//
//}




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
			return new Salesman(name, address, age, gender, basicSal, commission);
		}
		}

		return null;
	}

	public static void main(String[] args) {
		LinkedList<Employee> employeeList = new LinkedList<>();

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

								if (employeeData instanceof Salesman) {
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

			}
		} while (choice != 7);
	}

}