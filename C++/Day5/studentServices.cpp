#include <iostream>
#include "studentgpa.cpp"
using namespace std;

class StudentServices {
private:
    static Student sarr[100];  
    static int count;          

public:
    // Accept new student from user
    static Student acceptData() {
        int stuid;
        char name[20];
        int marks[3];

        cout << "Enter Id: ";
        cin >> stuid;
        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter marks of three subjects:\n";
        for (int i = 0; i < 3; i++) {
            cout << "Marks of subject " << i + 1 << " = ";
            cin >> marks[i];
        }

        return Student(stuid, name, marks);   
    }
    // Display all students
    static void DisplayAll() {
        if (count == 0) {
            cout << "No students to display.\n";
            return;
        }
        for (int i = 0; i < count; i++) {
            cout << "\n--- Student " << i + 1 << " ---\n";
            sarr[i].display();
        }
    }

    static void AddPerson(const Student& s) {
        if (count < 100) {
            sarr[count] = s;
            count++;
        } else {
            cout << "Student list is full!" << endl;
        }
    }
    // Search student by ID
    static Student* SearchById(int id) {
        for (int i = 0; i < count; i++) {
            if (sarr[i].getId() == id)
                return &sarr[i];
        }
        return nullptr;
    }

    // Search student by Name
    static Student* SearchByName(const char* nm) {
        for (int i = 0; i < count; i++) {
            if (strcmp(sarr[i].getName(), nm) == 0)
                return &sarr[i];
        }
        return nullptr;
    }

    // Sort by first subject marks
    static void SortByM1() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (sarr[i].getM1() > sarr[j].getM1()) {
                    Student temp = sarr[i];
                    sarr[i] = sarr[j];
                    sarr[j] = temp;
                }
            }
        }
    }
};


