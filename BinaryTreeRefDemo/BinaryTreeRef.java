package BinaryTreeRefDemo;

public class BinaryTreeRef {
    
    btNode root;

    public BinaryTreeRef () {
        this.root = null;
    }

    public void insert (int data) {
        this.root = insertNode(root, data);

    }

    private btNode insertNode(btNode root, int data) {
        // check for root is empty
        if (root == null) {
            this.root = new btNode(data);
            return root;
        }

        // check wheter we want to insert to the left or right
        if(data < root.data)
            root.left =insertNode(root.left, data);
        else if(data > root.data)
            root.right =insertNode(root.right, data);

        return root;
    }

    // this is for other people to call
    public void inOrderTraversal() {
        inOrder(root);
    }


    // this is recursive call
    private void inOrder(btNode root) {
        // check if root is not null

        if(root != null) {
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }
}// end of the class
