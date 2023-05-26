package BinaryTreeArrayDemo;

public class BinaryTreeArray {

    // attributes
    private int[] treeArray;
    private int capacity;
    private int size;
    
    public BinaryTreeArray (int capacity) {
        this.treeArray = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }// end class

    // methods

    public void insert(int value) {
        // check wheter the binary is full or not.
        if(size >= capacity) {
            System.out.println("Binary Tree is full. can't insert.");
            return;
        }
        treeArray[size] = value;
        size++;
    }// end method insert

    public void traverseInOrder(int index) {

        // remember this is recursive function

        // first thing that we need to check whether the given index is valid
        if (index >= size || index < 0) {
            return;
        }

        traverseInOrder(2*index+1);
        System.out.println(treeArray[index] + " ");
        traverseInOrder(2*index+2);

    }// end method traverseInorder

    public void traversePostOrder(int index) {
        // first thing that we need to check whether the given index is valid
        if (index >= size || index < 0) {
            return;
        }
        System.out.println(treeArray[index] + " ");
        traverseInOrder(2*index+1);
        traverseInOrder(2*index+2);
    }

    public void traversePreOrder() {

    }

    // override


    public void display() {
        for (int i =0; i<treeArray.length; i++) {
            System.out.print(treeArray[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        BinaryTreeArray btree = new BinaryTreeArray(10);
        btree.insert(5);
        btree.insert(3);
        btree.insert(8);
        btree.insert(2);
        btree.insert(4);
        btree.insert(7);
        btree.insert(9);

        btree.traverseInOrder(0);
        btree.traversePostOrder(0);
        btree.display();

       // output should be for inOrderTraversal 2 3 4 5 7 8 9
    }// end main
    
    
}// end of the class BinaryTreeArray
