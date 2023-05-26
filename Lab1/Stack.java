package Lab1;

public class Stack {
    int top;
    int maxsize;
    Food[] f;
    

    public Stack(int size) {
        maxsize = size;
        f = new Food[size];
        top = -1;
    }

    public void push(Food value) {
        if (top == maxsize - 1)
            System.out.println("The stack is full");
        else {
            top++;
            f[top] = value;
        }
    }

    public void pop() {
        if (top == -1)
            System.out.println("The stack is already empty");
        else {
            f[top] = null;
            top--;
        }
    }

    public void peek() {
        if (top == -1)
            System.out.println("The stack is empty");
        else
            System.out.println("Top value: " + f[top]);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }


    public void display() {
        System.out.println("Item in the stack are: ");
        for (int i = top; i >= 0; i--)
            System.out.println("    " + f[i].toString());
    }
    
}
