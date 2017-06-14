package test;

import java.util.Arrays;

import static prac.QuickSort.quickSort;
import static prac.QuickSort.swap;


/**
 * Created by mohan on 28/05/17.
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,5,5,9,10,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr,int low,int high){

        int i=low-1;
        int j;
        int x=arr[high];

        for ( j = low; j <high-1; j++) {

            if(arr[j]<x){

                i=i+1;
                swap(arr,j,i);
            }

        }
        swap(arr,i,high);


        return i+1;
    }


    public void quick(int[] arr,int low,int high){


        if(low<high){

            int pivot=partition(arr,low,high);
            quick(arr,low,pivot-1);
            quick(arr,pivot+1,high);




        }

    }


}
