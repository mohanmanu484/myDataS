package prac.search;

/**
 * Created by mohan on 09/05/17.
 */

public class JumpSearch {

    public static void main(String[] args) {

        System.out.println(jump(new int[]{1,2,3,4,5,6,7,8,9},7));

    }

    public static int jump(int[] arr,int x){

        int n=arr.length;
        int step= (int) Math.floor(Math.sqrt(n));

        int prev=0;

        while (arr[Math.min(step,n)-1]<x){


            prev=step;
            step=step+(int) Math.floor(Math.sqrt(n));

            if(prev>=n){
                return -1;
            }

        }


        while (arr[prev]<x){
            prev++;
            if(prev==Math.min(step,n)){
                return -1;
            }
        }


        if(arr[prev]==x){
            return prev;
        }


        return -1;

    }


}
