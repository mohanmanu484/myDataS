package prac.linkedList;

/**
 * Created by mohan on 11/05/17.
 */

public class NewImpl {

    Node head;
    Node tail;

    public static class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public void push(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        head.next=newNode;
        head=newNode;
    }

    public void printAll(){

        Node curr=tail;

        while (curr!=null){

            System.out.println(curr.data+" ");
            curr=curr.next;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        NewImpl newImpl=new NewImpl();
        newImpl.push(1);
        newImpl.push(2);
        newImpl.push(7);
        newImpl.push(9);
        newImpl.printAll();
    }

    public  void reverse(Node node){





    }




}
