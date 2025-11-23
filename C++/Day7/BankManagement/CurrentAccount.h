#include"Account.h"

class CurrentAccount: public Account{
    static int interestRate;
    static int minBalance;
    int nooftrans;

    public:
        CurrentAccount();
        CurrentAccount(const char* fnm, const char* lnm, long long int mno, long long int ano, const char* e, double b , int tno);
        ~CurrentAccount();

        //Setter methods
        void setNoofTrans(int tno);

        //Getter methods
        int getNoofTrans();
        int getInterestRate();
        int getMinBaqlance();

        //display
        void display();
};