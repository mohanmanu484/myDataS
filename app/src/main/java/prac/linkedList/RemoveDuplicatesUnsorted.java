package prac.linkedList;

/**
 * Created by mohan on 10/05/17.
 */

public class RemoveDuplicatesUnsorted {


    Node head;

    public static class Node {

        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void printAll() {


        Node currnt = head;
        while (currnt != null) {

            System.out.println(currnt.data);
            currnt = currnt.next;


        }


    }


    public static void main(String[] args) {


        RemoveDuplicatesUnsorted removeDuplicates = new RemoveDuplicatesUnsorted();
        removeDuplicates.push(1);
        removeDuplicates.push(1);
        removeDuplicates.push(3);
        removeDuplicates.push(5);
        removeDuplicates.push(1);
        removeDuplicates.push(4);
        removeDuplicates.push(8);
        removeDuplicates.push(1);
        removeDuplicates.push(1);
        removeDuplicates.printAll();
        System.out.println();


        System.out.println();
        removeDuplicates.removeDuplicate();


        removeDuplicates.printAll();


    }

    private void removeDuplicate() {

        Node i=head;
        Node j;
        Node prev=null;

        while (i!=null){

            j=i.next;
            prev=i;

            while (j!=null){




                if(i.data==j.data){

                    prev.next=j.next;


                }else {

                    prev = j;
                }
                j=j.next;


            }

            i=i.next;



        }



    }
}


