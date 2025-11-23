#include"Account.h"

class CurrentAccount : public Account{
    private:
        static int interestRate;
        static int minBalance;
        int transPerDay;

    public:
        CurrentAccount();
        CurrentAccount(const char* fnm, const char* lnm, long long int mno, const char* e , int TPD);
        ~CurrentAccount();

        //Setter methods
        void setTransPerDay(int TPD);

        //Getter methods
        //int getInterestRate();
        //int getMinBalance();
        int getTrancPerDay();

        void display() const;
};
