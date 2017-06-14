package prac.search;

/**
 * Created by mohan on 10/05/17.
 */

public class SearchInRotatedArray {


    public static void main(String[] args) {

        int[] arr={5,6,1,2,3,4};
        System.out.println(findPivot(arr,0,5,2));

        int pivot=findPivot(arr,0,5,2);
        if(arr[0]<2){
           // binarySearchLeft();
        }else {
            binarySearchRight();
        }
    }

    private static void binarySearchRight() {

    }


    public static int findPivot(int[] arr,int low,int high,int x){

        //int pivot=-1;
        for (int i = 1; i <high ; i++) {

            if(arr[i-1]>arr[i] && arr[i+1]>arr[i]){
                return i;
            }

        }
        return -1;

    }
}
