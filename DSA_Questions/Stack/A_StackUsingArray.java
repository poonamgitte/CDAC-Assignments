// Implementation of stack using Array

import java.util.*;

class A_StackUsingArray{

    private final int size;
    private final int[] stack;
    private static int top;

    A_StackUsingArray(int s){
        size = s;
        stack = new int[size];
        top = -1;
    }

    public void push(int num){

        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = num;                       
            System.out.println("Element pushed");
        }
    
    }

    public void pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element:"+stack[top]);
            stack[top] = 0;
            top--;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            return stack[top];
        }

        return -1;
    }

    public void display(){

        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            for(int num: stack){
                System.out.println(num+" ");
            }
        }

    }

    public boolean isEmpty(){

        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top == size-1){
            return true;
        }else{

            return false;
        }
    }

    public static void main(String[] args) {

        A_StackUsingArray s = new A_StackUsingArray(10);
        

        Scanner sc = new Scanner(System.in);
       
       int ch;

        do { 
            System.out.println("Stack Operations:");
            System.out.println("1.push\t2.pop\t3.peek\t4.display\t5.IsFull\t6.IsEmpty\t7.exit");

            System.out.println("Enter choice:");
             ch = sc.nextInt();

            switch (ch) {
                case 1:{
                    System.out.println("Enter element to push");
                    int num = sc.nextInt();
                        
                    s.push(num);
                }
                break;
                case 2:{
                    s.pop();
                }
                break;

                case 3:{
                    System.out.println("Top element: "+s.peek());
                }
                break;
                case 4:{
                    s.display();
                }
                break;
                
                case 5:{
                    System.out.println("Is stack full: "+s.isFull());
                }
                break;

                case 6:{
                    System.out.println("Is stack empty: "+s.isEmpty());
                }
                break;

            }

        } while (ch != 7);
       
        sc.close();
    }
}