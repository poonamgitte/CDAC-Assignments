#include <iostream>
#include "studentServices.cpp"
using namespace std;

// Define static members
Student StudentServices::sarr[100];
int StudentServices::count = 0;

int main() {
    int choice;
        cout << "\n--- MENU ---"<<endl;;
        cout << "1. Add new student"<<endl;
        cout << "2. Display All Students"<<endl;
        cout << "3. Search by ID"<<endl;
        cout << "4. Search by Name"<<endl;
        cout << "5. Sort by m1 marks"<<endl;
        cout << "6. Calculate GPA of a student"<<endl;
        cout << "7. Exit"<<endl;
    do {
        
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
        case 1: {
            Student s = StudentServices::acceptData();
            StudentServices::AddPerson(s);
            cout << "Student added:\n";
            s.display();
            break;
        }
        case 2: {
            cout << "\nAll Students:\n";
            StudentServices::DisplayAll();
            break;
        }
        case 3: {
            int id;
            cout << "Enter ID to search: ";
            cin >> id;
            Student* s1 = StudentServices::SearchById(id);
            if (s1)
                s1->display();
            else
                cout << "Student with ID " << id << " not found.\n";
            break;
        }
        case 4: {
            char name1[100];
            cout << "Enter Name to search: ";
            cin >> name1;
            Student* s2 = StudentServices::SearchByName(name1);
            if (s2)
                s2->display();
            else
                cout << "Student with name " << name1 << " not found.\n";
            break;
        }
        case 5: {
            StudentServices::SortByM1();
            cout << "Students sorted by marks[1].\n";
            StudentServices::DisplayAll();
            break;
        }
        case 6: {
            int id;
            float gpa;
            cout << "Enter ID to calculate GPA: ";
            cin >> id;
            Student* s3 = StudentServices::SearchById(id);
            if (s3){
                gpa = s3->CalculateGpa();
                cout<<"GPA of student : "<<gpa<<endl;
                }
            else
                cout << "Student not found!\n";
            break;
        }
        case 7:
            cout << "Exiting...\n";
            break;
        default:
            cout << "Invalid choice!\n";
            break;
        }
    } while (choice != 7);

    return 0;
}
