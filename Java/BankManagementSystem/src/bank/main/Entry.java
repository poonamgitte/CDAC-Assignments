package bank.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import bank.core.AccountType;
import bank.core.BankAccount;
import bank.core.CurrentAccount;
import bank.core.SavingAccount;
import bank.exception.InsufficientFundsException;
import bank.util.CollectionUtils;
import bank.util.IOUtils;

public class Entry {
	
		private static int count = 100;
	//Function to take account details to create new account
	 public static BankAccount accountData(int choice) {
		 
		 int accoutNo;
		 String customerName;
		 double balance;
		 AccountType type;
		 LocalDate openDate = LocalDate.now();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 //auto generating account number 
		 accoutNo = count++;
		 
		 System.out.println("Enter name:");
		 customerName = sc.nextLine();
		 
		 System.out.println("Enter balance:");
		 balance = sc.nextDouble();
		 
		 sc.nextLine();
		 
		 System.out.println("Enter account Type:");
		 type = AccountType.valueOf(sc.nextLine().toUpperCase());
		 
		 if(choice == 1) {
			 
			 System.out.println("Enter interest rate:");
			 double interestRate = sc.nextDouble();
			 
			 return new SavingAccount(accoutNo, customerName, balance, type, openDate, interestRate);
			 
		 }
		 
		 else if(choice == 2) {
			 System.out.println("Enter overdraft limit:");
			 double overdraftLimit = sc.nextDouble();
			 
			 return new CurrentAccount(accoutNo, customerName, balance, type, openDate, overdraftLimit);
		 }

		 return null;

	 }
	
	 
	public static void main(String[] args) throws FileNotFoundException, IOException, InsufficientFundsException {
		
		List<BankAccount>accountList = CollectionUtils.populateAccounts();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		do {
			System.out.println("1.Display all accounts");
			System.out.println("2.Open new account");
			System.out.println("3.Deposit money");
			System.out.println("4.Withdraw money");
			System.out.println("5.Display account by AccountType");
			System.out.println("6.sort account by balance");
			System.out.println("7.Display total balance");
			System.out.println("8.Save accounts to file");
			System.out.println("9.Load accounts from file");
			System.out.println("10.Exit");
			
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:{
				System.out.println("-------All Accounts-------");
				accountList.forEach(System.out::println);
			}
			break;
			
			case 2:{
				System.out.println("Enter choice");
				System.out.println("1.Saving Account\n2.Current Account");
				int subChoice = sc.nextInt();
				
				//Adding account
				if(subChoice == 1 || subChoice == 2) {
					accountList.add(accountData(subChoice));
					System.out.println("Account Added...");
				}
				else {
					System.out.println("Enter valid choice:");
				}
			}
			break; 
			
			case 3:{
				// Deposit money
				
				System.out.println("Enter detail for depositing money:");

				System.out.println("Account number:");
				int accountNumber = sc.nextInt();

				System.out.println("Enter money to deposit:");
				double amount = sc.nextDouble();
				
				boolean found = false;
				
				for(BankAccount account : accountList)
				{
					if(account.getAccoutNo() == accountNumber) {
						found = true;
						account. deposit( amount);
						System.out.println("Ammount deposited successfully");
					}
				}
				
				if(!found) {
					System.out.println("Account not found");
				}
				
			}
			break;
			
			case 4:{
				// withdraw money
				
				System.out.println("Enter detail for Withdraw money:");

				System.out.println("Account number:");
				int accountNumber = sc.nextInt();

				System.out.println("Enter money to withdraw:");
				double amount = sc.nextDouble();
				
				boolean found = false;
				
				for(BankAccount account : accountList)
				{
					if(account.getAccoutNo() == accountNumber) {
						found = true;
						account. withdraw(amount);
						System.out.println("Amount withdrawed successfully");
					}
				}
				
				if(!found) {
					System.out.println("Account not found");
				}
			}
			break;
			
			case 5:{
				// Display account by type
				sc.nextLine();
				System.out.println("Enter account type current/ saving");
				AccountType accType = AccountType.valueOf(sc.nextLine().toUpperCase());
				boolean found = false;
				
//				for(BankAccount acc : accountList) {
//					
//					if(acc.getEnum() == accType) {
//						found = true;
//						System.out.println(acc);
//					}
//				}
				
				// Predicate
				Predicate<BankAccount> isSameType = acc->acc.getEnum() == accType;
				
				//Stream 
				accountList.stream().filter(isSameType).forEach(System.out::println);
				
				
				if(!found) {
					System.out.println("Account not found");
				}
				
			}
			break;
			
			case 6:{
				// Sorting accounts by balance
				accountList.sort(Comparator.comparing(BankAccount::getBalance));
				
				// Display sorted accounts
				System.out.println("Account sorted by balance!");
				accountList.forEach(System.out::println);
			}
			break; 
			
			case 7:{
				
				//Displaying total balance 
				System.out.println("Total balance of accounts");
				
				
				for(BankAccount account: accountList) {
					
					double totlBalance = account.getBalance() + account.computeInterest();
					
					System.out.println(account.getAccoutNo()+" "+account.getCustomerName());
					System.out.println("Total balance:"+totlBalance);
					
				}
			}
			break;
			
			case 8:{
				
				// Save data to file
				IOUtils.saveAccount(accountList,"BankAccounts.ser");
				System.out.println("Data saved to file succcessfully");
			}
			break;
			
			case 9:{
				// Load Account data from file
				accountList = IOUtils.loadAccount("BankAccounts.ser");
				System.out.println("Data loaded from file successfully");
			}
			break; 
			
			default:
				System.out.println("Enter valid choice!");
			}

		}while(choice != 10);
		
	}
}