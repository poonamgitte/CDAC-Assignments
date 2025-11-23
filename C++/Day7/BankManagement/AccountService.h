
#include "CurrentAccount.h"
#include"SavingAccount.h"

class AccountService{
    static Account* arr[100];
    static int count;

    public:
       //Service methods
       static void addAccount(int n);
       static void displayAll();
       static Account* searchByAccountNo(int ano);
       static int searchByName(const char* fname, const char* lname, Account* result[100]);
       static void sortByBalance();
       static void displaySavingAccount();
       static void displayCurrentAccount();



        //std::cout << "1. Add new account";
//         std::cout << "3. Display All Accounts\n";
//         std::cout << "4. Search by account number\n";
//         std::cout << "5. Search by Name\n";
//         std::cout << "6. Sort Accounts by balance\n";
//         std::cout << "7. Display All Saving Account\n";
//         std::cout << "8. Display All Current Account\n";
//         std::cout << "9. Exit\n";
};