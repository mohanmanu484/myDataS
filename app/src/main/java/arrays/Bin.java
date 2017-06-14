package arrays;

/**
 * Created by mohan on 12/05/17.
 */

public class Bin {


    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        System.out.println(binary(arr,6));
        System.out.println(bin(arr,0,arr.length-1,6));

    }


    public static int bin(int[] arr,int low,int high,int x){

        if(low<=high) {
            int middle = (low + high) / 2;
            if (arr[middle] == x) {
                return middle;
            }

            if (arr[middle] < x) {
               return bin(arr, middle + 1, high, x);
            } else {
               return bin(arr, low, middle - 1, x);
            }

        }
        return -1;
    }














    public static int binary(int[] arr,int x){

        int low=0;
        int high=arr.length-1;
        int found=-1;


        while (low<=high){

            int middle=(high+low)/2;

            if(arr[middle]==x){
                return middle;
            }
            if(arr[middle]<x){
                low=middle+1;
            }else {
                high=middle-1;
            }
        }

        return -1;
    }





}
