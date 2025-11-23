#include "Shape.h"
#include "Circle.h"
#include "Triangle.h"
#include"Square.h"
#include"Rectangle.h"


class ShapeService {
        
	static Shape* sArr[100];
	static int count;
	
	public:
		static void addShape(int n);
		static void displayAll();
		static void displayTriangles();
		static void displayCircles();
		static void displaySquares() ;
		static void displayRectangles();
		static int searchByColor(const char* color, Shape* result[100]);
		static void sortByColor();
		static void calculateAllAreas();
		static void calculateAllPerimeters();
};
