#ifndef SHAPE_H
#define SHAPE_H

class Shape{
 private: 
  char *color;
 //protected:
    //int num;
 public:
    void setColor(const char *c);
    const char* getColor();
    Shape();
    Shape(const char* c);
    virtual ~Shape();
    virtual double calcArea()=0;
    virtual double calcPerimeter()=0;
    virtual void display() const;
};

#endif
