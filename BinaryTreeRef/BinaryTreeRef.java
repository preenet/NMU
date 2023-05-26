package BinaryTreeRef;

public class BinaryTreeRef {
    btNode root;

    public BinaryTreeRef() {
        root = null;
    }

    // Method to insert a node in the binary tree
    public void insert(int data) {
        root = insertNode(root, data);
    }

    // Recursive method to insert a node
    private btNode insertNode(btNode root, int data) {
        if (root == null) {
            root = new btNode(data);
            return root;
        }

        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }

    // Method to traverse the binary tree in inorder
    public void inorderTraversal() {
        inorder(root);
    }

    // Recursive method for inorder traversal
    private void inorder(btNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public class Main {
        public static void main(String[] args) {
            BinaryTreeRef tree = new BinaryTreeRef();
    
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);
    
            System.out.println("Inorder traversal of the binary tree:");
            tree.inorderTraversal();
        }
    }
    
}






