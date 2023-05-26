package Lab2Demo;



public class Queue {
    
    // queue attribues
    int front;
    int rear;
    Food items[];
    int size = 10;

    public Queue () {
        this.front = -1;
        this.rear = -1;
        items = new Food[this.size];
    }// end default constructor

    //Your queue class must have at least the following methods
    // first(), enqueue(), dequeue(), isEmpty()

    public void enqueue(Food element) {

        // if queue is full
        if(isFull()) {
            System.out.println("Queue is full, cna't enqueue.");
        }
        else {
            if(this.front == -1) {
                this.front =0;
            }
            this.rear++;
            items[this.rear] = element;
            System.out.println("Insert" + element);
        }
        
    }

    public Food dequeue() {

        Food element;

        if(isEmpty()) {
            System.out.println("Queue is empty, can't return");
        }
        else {
            element = items[this.front];

            // if the queue has only one element
            if(this.front >= this.rear) {
                this.front = -1;
                this.rear = -1;
            }
            else {
                this.front++;
            }
            System.out.print(element + " deleted");
            return element;
        }

        return null;

    }// end method dequeue
    // support methods
    public boolean isFull() {
        if (this.front == 0 && rear == this.size -1) 
            return true;
        else {
            return false;
        }
    }// end method isFull

    public boolean isEmpty() {
        if(this.front == -1){
            return true;
        }
        else {
            return false;
        }
    }// end method isEmpty
           
        


    public void display() {
        for (int i=this.front; i<=this.rear; i++) {
            System.out.println(items[i]);
        }

    }
    
    

}// end class Queue