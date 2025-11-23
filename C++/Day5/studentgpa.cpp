
#include<iostream>
#include<cstring>
using namespace std;

class Student{

    private:
        int stuid;
        char name[10];
        int marks[3];
        float gpa;
    public:
        Student(){
            stuid=0;
            name[10]='\0';
            marks[3]='\0';
            
        }
        Student(int stuid, const char* name, int marksArr[3]) {
        this->stuid = stuid;
        strcpy(this->name, name);
        //this->name[sizeof(this->name) - 1] = '\0';  
        for (int i = 0; i < 3; i++) {
            this->marks[i] = marksArr[i];
          }
        
        }
        void setId(int stuid){
			this->stuid=stuid;
			
		}
	void setName(const char* nm){
		strncpy(name, nm, sizeof(name)-1);
		name[sizeof(name)-1] = '\0';
	}
        void setMarks(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        }
		
        int getId(){
            return stuid;
        }
        char* getName(){
            return name;
        }
        const int* getMarks() {
        return marks;
        }
        int getM1(){
            return marks[0];
        }

        
        void display(){
            
            cout<<"Student Id:"<<stuid<<endl;
            cout<<"Name of the student:"<<name<<endl;
            for(int i=0;i<3;i++){
                cout<<"Marks["<<i<<"] : "<<marks[i]<<endl;
            }
        }
        float CalculateGpa() {
        	gpa = (float)((1.0 / 3) * marks[0] + (1.0 / 2) * marks[1] + (1.0 / 4) * marks[2]);
       		return gpa;
      }
        
        
};
