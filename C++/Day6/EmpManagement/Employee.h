#ifndef EMP_
#define EMP_

class Employee{
  private:
    int empno;
    char* name;
    char* dept;
    char* desg;
    static int totalleaves;
  public:
    Employee();
    Employee(int eno,const char* nm, const char*dt, const char* ds);
    virtual ~Employee(); 
    //setter methods
    void setEmpno(int id);
    void setName(const char *nm);
    void setDept(const char *dt);
    void setDesg(const char *ds);
    //getter methods
    int getEmpno();
    const char* getName();
    const char* getDept();
    const char* getDesg();
    virtual void display();
      
};

#endif
