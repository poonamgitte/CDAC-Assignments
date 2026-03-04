package org.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class CreateTable {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		Statement stUpdateUser = null;
		ResultSet result = null;
		

		Scanner scanner = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java", "root", "cdac");

		stUpdateUser = connection.createStatement();


//		CREATE TABLE Employees (
//			    EmployeeID INT PRIMARY KEY,
//			    FirstName VARCHAR(50) NOT NULL,
//			    LastName VARCHAR(50) NOT NULL,
//			    Email VARCHAR(100) UNIQUE,
//			    HireDate DATE,
//			    Salary DECIMAL(10, 2)
//			);

			
			StringBuilder tableValues = new StringBuilder("CREATE TABLE ");
			System.out.println("Enter Table Name");
			
			String tableName =scanner.next();
			tableValues.append(tableName +"(");
			
			int continueChoice;
			do {
				System.out.println("Enter columnName");
				String columnName=scanner.next();
				tableValues.append(columnName);
				tableValues.append(" ");
				System.out.println("select data type (VARCHAR(size), INT,FLOAT)");
				String dataType=scanner.next();
				tableValues.append(dataType);
				tableValues.append(" ");
				
				System.out.println("Select 1.PRIMARY KAY 2.NOT NULL 3.UNIQUE");
				int keyChoice=scanner.nextInt();
				if(keyChoice==1) {
					tableValues.append(" PRIMARY KEY,");
				}else if(keyChoice==2) {
					tableValues.append(" NOT NULL,");
				}else if(keyChoice==3) {
					tableValues.append(" UNIQUE,");
				}else{
					tableValues.append(",");
				}
				
				System.out.println("Do you want to save: 1.save 2.continue");
				continueChoice = scanner.nextInt();
			}while(continueChoice!=1);
			
			tableValues.deleteCharAt(tableValues.length()-1);
			tableValues.append(");");
			
			System.out.println(tableValues.toString());
		
			stUpdateUser.execute(tableValues.toString());
			
	}
}
