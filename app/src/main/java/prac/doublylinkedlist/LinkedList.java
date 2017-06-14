package prac.doublylinkedlist;

/**
 * Created by mohan on 12/05/17.
 */

public class LinkedList {

    Node head;

    public static class Node{

        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            prev=next=null;
        }
    }

    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.printAll();
        linkedList.remove(2);
        linkedList.printAll();
    }



    public void remove(int i){


        if(head==null){
            return;
        }
        Node curr=head;

        if(i==head.data){

            head=curr.next;
            return;
        }

        while (curr!=null){


            if(curr.data==i){
                curr.prev.next=curr.next;
                curr.next.prev=curr.prev;
            }
            curr=curr.next;
        }



    }

    private void add(int i) {

        Node newNode=new Node(i);

        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }

        curr.next=newNode;
        newNode.prev=curr;


        /*newNode.next=head;
        head.prev=newNode;
        head=newNode;*/
    }


    public void printAll(){

        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }



}
