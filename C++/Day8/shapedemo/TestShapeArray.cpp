#include <iostream>
using namespace std;
//addedd......
#include "ShapeService.h"

int main() {
	int choice;
	
	do{
		cout<<endl;
		cout << "1. Add Shape" << endl;
		cout << "2. Display All" << endl;
		cout << "3. Display only Triangles" << endl;
		cout << "4. Display only Circles" << endl;
		cout << "5. Display only Squares" << endl;
		cout << "6. Display only Rectangles" << endl;
		cout << "7. Search on Color" << endl;
		cout << "8. Sort on Color" << endl;
		cout << "9. Calculate Area" << endl;
		cout << "10. Calculate Perimeter" << endl;
		cout << "11. Exit" << endl;
	
		cout << "Enter choice: ";
		cin >> choice;
		
		switch(choice) {
			case 1: {
				int ch;
				cout << "1. Triangle" << endl;
				cout << "2. Circle" << endl;
				cout << "3. Square" << endl;
				cout << "4. Rectangle" << endl;
				
				cin >> ch;
				ShapeService::addShape(ch);
				
				break;
			}
			
			case 2: {
				ShapeService::displayAll();
				break;
			}
			
			case 3: {
				ShapeService::displayTriangles();
				break;
			}
			
			case 4: {
				ShapeService::displayCircles();
				break;
			}

			case 5:{
				ShapeService::displaySquares();
				break;
			}

			case 6:{
				ShapeService::displayRectangles();
				break;
			}
			
			case 7: {
				char color[10];
				cout << "Enter color to search: ";
				cin >> color;
				
				Shape* result[100];
				int cnt = ShapeService::searchByColor(color, result);
				
				if (cnt < 0) {
					cout << "NO Shapes found with color " << color << endl;
				}
				else {
					for (int i=0; i<=cnt; i++) {
						result[i]->display();
						cout << endl;
					}
				}
				break;
			}
			case 8:{
				ShapeService::sortByColor();
			}
			
			case 9: {
				ShapeService::calculateAllAreas();
				break;
			}
			
			case 10: {
				ShapeService::calculateAllPerimeters();
				break;
			}
			
			case 11: {
				cout << "~ Thank You for visiting ~" << endl;
				break;
			}
		}
	} while(choice!=11);

	return 0;
}
