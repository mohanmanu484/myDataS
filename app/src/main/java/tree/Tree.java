package tree;

/**
 * Created by mohan on 11/05/17.
 */

public class Tree {

    Node root;


    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /*
    *             1
    *          2    3
    *        4   5
    *
    *        inorder    4 2 5 1 3
    *        preorder   1 2 4 5 3
    *        postOrder  4 5 2 3 1
    *
    *
    * */


    public int isSumTree(Node root) {


        if (root == null || (root.left == null && root.right == null)) {
            return 1;
        }

        int lefetCount = sum(root.left);
        int right = sum(root.right);

        if ((lefetCount + right == root.data) && isSumTree(root.left) != 0 && isSumTree(root.right) != 0) {
            return 1;
        }
        return 0;
    }

    private int sum(Node root) {
        if(root==null){
            return 0;
        }

        return sum(root.left) + root.data + sum(root.right);
    }


    public void printPostOrder(Node node) {


        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }


    public void printPreOrder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }


    public void printInorder(Node node) {

        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {

/*        26
        /    \
      10      3
    /   \   /   \
   4     6  1    2*/
        Tree tree = new Tree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(2);
        //  tree.root.right.right.right=new Node(9);

        tree.printInorder(tree.root);
        System.out.println();
        tree.printPreOrder(tree.root);
        System.out.println();
        tree.printPostOrder(tree.root);
        System.out.println();

        System.out.println("height = " + tree.heightOfTree(tree.root));
        tree.levelOrderTraverse(tree.root);


        if (tree.isSumTree(tree.root) != 0) {
            System.out.println("tree is sum tree");
        } else {
            System.out.println("tre is not");
        }

        System.out.println("size of tree = "+tree.sizeOfTree(tree.root));


    }


    public int heightOfTree(Node root) {


        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);


        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        return rightHeight + 1;

    }


    public void levelOrderTraverse(Node root) {

        if (root == null) {
            return;
        }

        int height = heightOfTree(root);
        System.out.println("level order");
        for (int i = 1; i <= height; i++) {
            printLevelOrder(root, i);

        }


    }



    public int sizeOfTree(Node tree){


        if(tree==null ){
            return 0;
        }



        return sizeOfTree(tree.left)+1+sizeOfTree(tree.right);

    }


    /*     26
        /    \
      10      3
    /   \   /   \
   4     6  1    2*/





    int height(Node root) {
        if (root == null)
            return 0;

            /* compute  height of each subtree */

        int lheight = height(root.left);
        int rheight = height(root.right);

            /* use the larger one */
        if (lheight > rheight)
            return (lheight + 1);
        else
            return (rheight + 1);

    }

    /*     26
        /    \
      10      3
    /   \   /   \
   4     6  1    2*/


    public void printLevelOrder(Node root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }

        if (level > 1) {
            //level=level-1;

            printLevelOrder(root.left, level - 1);
            printLevelOrder(root.right, level - 1);
        }
        // System.out.println();


    }


}
