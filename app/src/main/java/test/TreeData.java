package test;

/**
 * Created by mohan on 30/05/17.
 */

public class TreeData<T> {

    Node root;


    public static class Node<T>{


        Node left;
        Node right;
        T data;

        public Node(T data) {
            this.data = data;
            right=left=null;
        }
    }

    public static void main(String[] args) {

        TreeData treeData = new TreeData();
        treeData.root = new Node(1);
        treeData.root.left = new Node(2);
        treeData.root.right = new Node(3);
        treeData.root.left.left = new Node(4);
        treeData.root.left.right = new Node(5);
        treeData.root.right.left = new Node(6);
        treeData.root.right.right = new Node(7);
        treeData.root.right.left.left=new Node(8);
        treeData.inOrder(treeData.root);
        System.out.println();
        treeData.preOrder(treeData.root);
        System.out.println();
        treeData.postOrder(treeData.root);
        System.out.println();
        System.out.println("height is "+treeData.height(treeData.root));
        System.out.println(treeData.sumOfTree(treeData.root));
        System.out.println("print leve order");
        treeData.printLevelOrder(treeData.root);




    }





    /*
    *
    *       1
    *     2     3
    *   4   5 6  7
    *
    *
    * indrder -> 4 2 5 1 6 3 7
    * postOrder ->  4 5 2 6 7 3 1
    * preOrder  -> 1 2 4 5 3 6 7
    *
    *
    * */


    public void inOrder(Node root){

        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(" "+root.data);
        inOrder(root.right);

    }

    public void preOrder(Node root){

        if(root==null){
            return;
        }

        System.out.print(" "+root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postOrder(Node root){

        if(root==null){
            return;
        }


        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.data);

    }

    public int height(Node root){

        if(root==null){
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);
        return left>right?left+1:right+1;
    }


    public int sumOfTree(Node<Integer> root){

        if(root==null){
            return 0;
        }
        return root.data+sumOfTree(root.left)+sumOfTree(root.right);
    }

    public void printLevelOrder(Node root){

        int height=height(root);

        for (int i = 1; i <=height; i++) {
            printLevel(root,i);
        }


    }

    private void printLevel(Node root, int level) {


        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(" "+root.data);
            return;
        }

        if(level>1){
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }

    }




}
