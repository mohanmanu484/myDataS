package tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by mohan on 13/05/17.
 */

public class Trees {

    Node root;

    public static class Node {

        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
            right=left=null;
        }
    }

    public static void main(String[] args) {

        Node root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(1);
        root.right.right=new Node(1);

        //root.right.right=new Node(5);

        Trees trees=new Trees();

        System.out.println(trees.heightOfTree(root));
        System.out.println(trees.sumOFTree(root));
        System.out.println(trees.isSumTree(root));
        System.out.println(trees.getLeafCount(root));


    }

    public int getLeafCount(Node node){

        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }

        return getLeafCount(node.left)+getLeafCount(node.right);
    }





     boolean isSumTree(Node node){

        if(node==null || (node.left==null && node.right==null)){
            return true;
        }



        return (sumOFTree(node.left)+sumOFTree(node.right)==node.data)&&isSumTree(node.left)&& isSumTree(node.right)?true:false;
    }



    public int sumOFTree(Node node){

        if(node==null){
            return 0;
        }

        return sumOFTree(node.left)+node.data+sumOFTree(node.right);
    }




    public int heightOfTree(Node node){

        if(node==null){
            return 0;
        }


        return heightOfTree(node.left)>heightOfTree(node.right)?heightOfTree(node.left)+1:heightOfTree(node.right)+1;
    }


    public void noRec(Node root){

        Stack<Node> s=new Stack<>();
        LinkedList<Node> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){

            Node data=q.poll();
            System.out.println(data.data);
            if(data.left!=null) {
                s.push(data);
                q.push(data.left);
                q.push(data.right);
            }
        }




    }


    public void inOrder(Node node){

        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);

    }




}
