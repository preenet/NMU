package BinaryTreeRefDemo;

public class Main {

    public static void main(String args[]) {
        BinaryTreeRef tree = new BinaryTreeRef();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.inOrderTraversal();
    }
}
