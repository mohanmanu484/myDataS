package tree;

class BinaryTree {


    Node root;

    class Node {

        int data;
        Node left, right, parent;

        Node(int d) {
            data = d;
            left = right = parent = null;
        }
    }

    static Node head;

    /* Given a binary search tree and a number, 
     inserts a new node with the given number in 
     the correct place in the tree. Returns the new 
     root pointer which the caller should then use 
     (the standard trick to avoid using reference 
     parameters). */
    Node insert(Node node, int data) {
 
        /* 1. If the tree is empty, return a new,     
         single node */
        if (node == null) {
            return (new Node(data));
        } else {

            Node temp = null;
             
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;

            } else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    }

    Node inOrderSuccessor(Node root, Node n) {

        // step 1 of the above algorithm 
        if (n.right != null) {
            return minValue(n.right);
        }

        // step 2 of the above algorithm
        Node p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }

    /*
    *
    *
    *        1
    *     2      3
    *  4    5  6   8
    *
    *
    * */





    Node inOrderPredecessor(Node root,Node n){

        if(n.left!=null){
            return mxValue(n.left);
        }

        Node p=n.parent;
        while (p!=null && p.left==n){
            n=p;
            p=n.parent;
        }
        return p;

    }

    private Node mxValue(Node node) {

        if(node!=null){
            node=node.right;
        }

        return node;
    }


    /* Given a non-empty binary search tree, return the minimum data  
     value found in that tree. Note that the entire tree does not need
     to be searched. */
    Node minValue(Node node) {
        Node current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    /*
    *
    *           20
    *        8     22
    *      4  12
    *           10
    *             14
    *
    *
    *   4 8 12 1 0 14 20 22
    *
    *
    *
    * */

    public void inOrderTraversal(Node node) {

        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);


    }


    // Driver program to test above functions
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null, temp = null, suc = null, min = null;
       /* root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        temp = root.left.right.right;*/


        root = tree.insert(root, 25);
        root = tree.insert(root, 15);

        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 19);
        root = tree.insert(root, 18);
        root = tree.insert(root, 20);
        root = tree.insert(root, 35);
        root = tree.insert(root, 40);
        root = tree.insert(root, 45);
        root = tree.insert(root, 44);
        root = tree.insert(root, 49);










        if(false){
            tree.inOrderTraversal(root);
            return;
        }


        suc = tree.inOrderSuccessor(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data +
                    " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }


        Node pred=tree.inOrderPredecessor(root,temp);
        if(pred!=null){
            System.out.println("inorder pred of "+temp.data+" is "+pred.data);
        }else {
            System.out.println("inorder pred not found");
        }

    }
}