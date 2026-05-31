package Intro_Lab_Tasks;

public class ArrayStack {

    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        if(top<stack.length-1){
            stack[++top]= element;
        }
        else{
            System.out.println("stack overflow");
        }
    }

    public Object pop() {
        if(top == -1) {
         System.out.println("stack underflow");
        return null;
        }
        else{
            Object temp = stack [top];
            stack[top]=null;
            top--;
            return temp;
        }
    }

    public Object peek() {
       if(top == -1) {
        System.out.println("stack underflow");
        return null;
        }
        else{
            Object temp = stack [top];
            return temp;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
       
    
}
