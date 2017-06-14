package prac.linkedList;

/**
 * Created by mohan on 10/05/17.
 */

public class RemoveDuplicates {



    Node head;

    public static class Node{

        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }


    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }


    public void printAll(){


        Node currnt=head;
        while (currnt!=null){

            System.out.println(currnt.data);
            currnt=currnt.next;


        }


    }


    public static void main(String[] args) {



        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        removeDuplicates.push(1);
        removeDuplicates.push(2);
        removeDuplicates.push(3);
        removeDuplicates.push(4);
        removeDuplicates.push(4);
        removeDuplicates.push(4);
        removeDuplicates.printAll();
        System.out.println();




        System.out.println();
        removeDuplicates.removeDuplicate();

        removeDuplicates.printAll();



    }

    private void removeDuplicate() {


        Node curr=head;

        while (curr.next!=null){

            if(curr.data==curr.next.data){

                curr.next=curr.next.next;

            }else {
                curr=curr.next;
            }



        }

    }


}
