package arrays;

import java.util.Arrays;

/**
 * Created by mohan on 12/05/17.
 */

public class Reverse {


    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }


    public static void reverse(int[] arr){





        for (int i = 0,j=arr.length-1; i < arr.length/2; i++,j--) {
/*
            int k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;*/

            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];



        }



    }


}
