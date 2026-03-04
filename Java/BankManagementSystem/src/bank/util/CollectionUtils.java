package bank.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.core.AccountType;
import bank.core.BankAccount;
import bank.core.CurrentAccount;
import bank.core.SavingAccount;

public class CollectionUtils {

	// Pre-filled accounts 
	public static List<BankAccount> populateAccounts(){
		
		List<BankAccount>accountList = new ArrayList<>();
		
		
		//int accoutNo, String customerName, double balance, AccountType enum1, LocalDate openDate,
		//double overdraftLimit
		accountList.add(new CurrentAccount(1010, "Poonam", 50000, AccountType.CURRENT, LocalDate.of(2020, 10, 10), 3000));
		accountList.add(new CurrentAccount(1020, "Rohini", 80000, AccountType.CURRENT, LocalDate.of(2021, 11, 11), 4000));
		accountList.add(new SavingAccount(1030, "Neha", 60000, AccountType.SAVING, LocalDate.of(2023, 9, 10), 3.4));
		accountList.add(new CurrentAccount(1040, "Pooja", 20000, AccountType.CURRENT, LocalDate.of(2020, 12, 10), 3000));
		accountList.add(new SavingAccount(1050, "Divya", 60000, AccountType.SAVING, LocalDate.of(2020, 1, 1), 3));

		return accountList;
	}
}
