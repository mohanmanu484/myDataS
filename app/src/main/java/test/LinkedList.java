package test;

/**
 * Created by mohan on 29/05/17.
 */

public class LinkedList<T> {

    Node head;


    public static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.printAll();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.printAll();
        linkedList.addFirst(34);
        linkedList.addLast(23);
        linkedList.printAll();
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        linkedList.removeNode(new Node(3));
       linkedList.printAll();

    }


    public static class Node<T>{

        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next=null;
        }
    }

    public  void addLast(T data){

        if (head==null){
            head=new Node(data);
            return;
        }

        Node curr=head;
        Node prev=null;
        while (curr!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=new Node(data);
    }

    public void addFirst(T data){

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void removeLast(){

        Node cur=head;

        if(cur==null){
            return;
        }

        Node prev=null;

        while (cur.next!=null){
            prev=cur;
            cur=cur.next;
        }
        if(prev!=null) {
            prev.next = null;
        }
    }

    public void removeFirst(){

       if (head==null){
           return;
       }else {
           head=head.next;
       }
    }

    public void printAll(){

        Node curr=head;
        while (curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();


    }

    public T get(int pos){

        Node<T> curr=head;
        int count=-1;
        while (curr!=null){
            count++;
            if(pos==count){
                return curr.data;
            }

            curr=curr.next;

        }

        return null;
    }


    public void removeNode(Node node){

        Node<Integer> curr=head;

        if(curr.data==node.data){
            head=null;
            return;
        }


        Node prev=null;
        while (curr!=null){

            if(curr.data==node.data){
                prev.next=curr.next;
                return;
            }

            prev=curr;
            curr=curr.next;
        }


    }



}
