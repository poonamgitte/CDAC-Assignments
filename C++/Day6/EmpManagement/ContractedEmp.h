#include "Employee.h"


class ContractedEmp:public Employee{
   private:
      int hrs;
      double ratehr;
      
   public:
      ContractedEmp();
      ContractedEmp(int eno,const char* nm,const char *dt,const char* ds,int h,double rate);
      ~ContractedEmp();
      void setHrs(int h);
      void setRate(double rate);
      double getRate();
      int getHrs();
      void display();


};


