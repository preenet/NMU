package Lab1Demo;

public class Stack {
    private int top;
    private int maxsize;
    private Food[] f;

    public Stack(int size) {
        this.maxsize = size;
        f = new Food[size];
        top = -1;
    }// end of constructor

    public void push(Food value) {
        if (top == maxsize - 1)
            System.out.println("The stack is full");
        else {
            top++;
            f[top] = value;
        }
    }// end method push

    public void pop() {
        if (top == -1)
            System.out.println("The stack is already empty");
        else {
            f[top] = null;
            top--;
        }
    }// end method pop

    public void peek() {
        if (top == -1)
            System.out.println("The stack is empty");
        else
            System.out.println("Top value: " + f[top]);
    }// end method peek

    public boolean isEmpty() {
        return (top < 0);
    }// end method isEmpty

    public boolean isFull() {
        return (top == maxsize - 1);
    }// end method isFull

    public void display() {
        for (int i = top; i >= 0; i--)
            System.out.println("    " + f[i].toString());
    }// end method display
}// end class Stack