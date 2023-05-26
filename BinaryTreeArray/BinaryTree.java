package BinaryTreeArray;
public class BinaryTree {
    private int[] treeArray;
    private int capacity;
    private int size;

    public BinaryTree(int capacity) {
        this.capacity = capacity;
        treeArray = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size >= capacity) {
            System.out.println("Binary tree is full. Cannot insert value: " + value);
            return;
        }
        treeArray[size] = value;
        size++;
    }

    public void traverseInOrder(int index) {
        if (index >= size) {
            return;
        }

        // Traverse the left subtree
        traverseInOrder(2 * index + 1);

        // Process the current node
        System.out.print(treeArray[index] + " ");

        // Traverse the right subtree
        traverseInOrder(2 * index + 2);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(8);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(9);

        binaryTree.traverseInOrder(0);
        // Output: 2 3 4 5 7 8 9
    } // end main
}