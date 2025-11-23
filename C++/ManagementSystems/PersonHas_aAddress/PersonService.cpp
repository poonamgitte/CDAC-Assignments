#include <iostream>
#include "Person.h"
using namespace std;

int main() {
    int choice;
    Person persons[100];
    int count = 0;

    do {
        cout << "\n--- Person Menu ---\n";
        cout << "1. Add Person\n";
        cout << "2. Display All Persons\n";
        cout << "0. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                int id, pin;
                string name, street, city;

                cout << "Enter Person ID: ";
                cin >> id;

                cin.ignore();
                cout << "Enter Name: ";
                getline(cin, name);

                cout << "Enter Street: ";
                getline(cin, street);

                cout << "Enter City: ";
                getline(cin, city);

                cout << "Enter Pin: ";
                cin >> pin;

                Address addr(street, city, pin);
                persons[count++] = Person(id, name, addr);

                cout << "Person added successfully!\n";
                break;
            }

            case 2: {
                if (count == 0)
                    cout << "No persons available!\n";
                else {
                    cout << "\n--- All Persons ---\n";
                    for (int i = 0; i < count; i++) {
                        persons[i].display();
                        cout << "-----------------\n";
                    }
                }
                break;
            }
        }
    } while (choice != 0);

    return 0;
}
