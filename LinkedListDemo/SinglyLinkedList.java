package LinkedListDemo;

public class SinglyLinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void delete(int data) {
        if(head == null) {
            return;   
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    
}// end class SinglyLinkedList
