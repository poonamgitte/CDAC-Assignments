#include"Account.h"

class SavingAccount : public Account{
    static int interestRate;
    static int minBalance;
    long int checkBookno;

    public:
        SavingAccount();
        SavingAccount(const char* fnm, const char* lnm, long long int mno, long long int ano, const char* e, double b, long int cno);
        ~SavingAccount();

        //Setter methods
        void setCheckBookNo(long int cno);

        //Getter methods
        long int getCheckBookNo();
        int getInterestRate();
        int getMinBalance();

        //display function
        void display();
};