package prac;

import java.util.Arrays;

/**
 * Created by mohan on 08/05/17.
 */

public class INsertionSort {


    public static void main(String[] args) {

        int[] arr={1,5,6,3,8,2};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){


        if(arr.length==0){
            return;
        }
        if(arr.length==1){
            return;
        }


        for (int i = 1; i < arr.length ; i++) {

            int temp=arr[i];
            int j=i-1;


            while (j>=0 && arr[j]>temp){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=temp;
        }




    }

}
