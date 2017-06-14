package prac;

import java.util.Arrays;

/**
 * Created by mohan on 07/05/17.
 */

public class MergeSort {


    public static void main(String[] args) {

        int[] arr=new int[]{1,3,2,5,5,9,10,6};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));



    }


    public static void merge(int[] arr,int low,int high){

        if(low<high){

            int middle=(low+high)/2;

            merge(arr,low,middle);
            merge(arr,middle+1,high);
            sort(arr,low,middle,high);


        }




    }

    private static void sort(int[] arr, int low, int middle, int high) {

        int[] temp=new int[arr.length];
        for (int i = low; i <=high ; i++) {
            temp[i]=arr[i];
        }

        int i=low;
        int m=middle+1;
        int j=high;
        int k=low;

        while (i<=middle && m<=high){

            if(temp[i]<temp[m]){
                arr[k]=temp[i];
                i++;
                k++;
            }else {
                arr[k]=temp[m];
                m++;
                k++;
            }
        }

        while (i<=middle){

            arr[k]=temp[i];
            i++;
            k++;
        }

        while (m<=high){
            arr[k]=temp[m];
            m++;
            k++;
        }


    }


}
