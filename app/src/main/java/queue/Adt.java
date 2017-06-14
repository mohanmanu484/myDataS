package queue;

/**
 * Created by mohan on 13/05/17.
 */

public class Adt {


    int front=-1;
    int rear=-1;
    int size=0;
    int capacity=5;
    int[] arr;

    public Adt() {
       arr=new int[capacity];
    }

    public Adt(int capacity) {
        this.capacity = capacity;
        arr=new int[capacity];
    }

    public void offer(int num){
        if(size==capacity){
            throw new IllegalStateException("is full");
        }
       // if(rear==front)

        arr[++rear]=num;
        size++;
    }

    public boolean isEmpty(){

        return size==0;
    }

    public int poll(){

        if (isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
        size--;
        return arr[++front];
    }









    public static void main(String[] args) {

        Adt adt=new Adt();
        adt.offer(1);
        adt.offer(2);
        adt.offer(3);
        System.out.println(adt.poll());
       adt.offer(3);
        adt.offer(4);
        adt.offer(5);
        adt.offer(6);

        //adt.offer(5);


    }

}
