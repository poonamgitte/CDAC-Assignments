#include"Account.h"

class SavingAccount : public Account{
    private:
        static int interestRate;
        static int minBalance;
        int checkBookNo;

    public:
        SavingAccount();
        SavingAccount(const char* fnm, const char* lnm, long long int mno, const char* e , int CBno);
        ~SavingAccount();

        //Setter methods
        void setCheckBookNo(int CBno);

        //Getter methods
        //int getInterestRate();
        //int getMinBalance();
        int getCheckBookNo();

        void display() const;
};
