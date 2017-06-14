package prac;

import java.util.Arrays;

/**
 * Created by mohan on 30/05/17.
 */

public class HeapSort {



    public void sort(int[] arr){


        int n=arr.length;

        for (int i = n/2-1; i >=0; i--) {
            heapify(arr,n,i);
        }

        for (int i = n-1; i >=0; i--) {

            arr[i]=arr[i]+arr[0];
            arr[0]=arr[i]-arr[0];
            arr[i]=arr[i]-arr[0];
            heapify(arr,i,0);
        }



    }

    public static void main(String[] args) {

        HeapSort heapSort=new HeapSort();
        int[] arr={4,5,2,3,1};
        heapSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }



    private void heapify(int[] arr,int n, int i) {


        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }

        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            arr[i]=arr[largest]+arr[i];
            arr[largest]=arr[i]-arr[largest];
            arr[i]=arr[i]-arr[largest];
            heapify(arr,n,largest);
        }
    }


}
