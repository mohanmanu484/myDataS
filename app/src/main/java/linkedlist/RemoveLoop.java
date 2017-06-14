package linkedlist;

/**
 * Created by mohan on 18/05/17.
 */

public class RemoveLoop {

    Node root;

    public static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public void insert(int data){

        Node node=new Node(data);

        node.next=root;
        root=node;
    }

    public void printAll(){

        Node curr=root;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }



    public Node removeLoop(){

        Node slow=root;
        Node fast=root;

        while (fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return slow;
            }
        }

        return null;

    }

    public static void main(String[] args) {


        RemoveLoop removeLoop=new RemoveLoop();

        removeLoop.insert(1);
        removeLoop.insert(2);
        removeLoop.insert(3);
        removeLoop.insert(4);
        removeLoop.insert(5);

        removeLoop.printAll();

        removeLoop.root.next.next.next.next.next =removeLoop.root.next.next;
        removeLoop.removeLoop();
        removeLoop.printAll();

    }



}
