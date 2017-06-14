package recursion;

/**
 * Created by mohan on 12/05/17.
 */

public class CheckSortedArray {


    public static void main(String[] args) {


        CheckSortedArray checkSortedArray=new CheckSortedArray();
        checkSortedArray.binary(new int[]{0,0,0,0},4);
       // System.out.println(checkSortedArray.sorted(new int[]{1,3,3,4,5,3},0));

    }

    public boolean sorted(int[] arr,int i){

        if(i==arr.length-1){
            return true;
        }

        return arr[i]<=(arr[i+1])?sorted(arr,i+1):false;
    }

    void binary(int[] A,int n)
    {
        if(n < 1)
            System.out.println(A);    // Assume A is a global variable
        else
        {
            A[n-1] = '0';
            binary(A,n-1);
            A[n-1] = '1';
            binary(A,n-1);
        }
    }








    public boolean isSorted(int[] arr,int i){

        if(arr.length==0){
           return true;
        }

        if(i<=arr.length-2 && arr[i]==arr[i+1]){
            isSorted(arr,i+1);
            return true;
        }
        if(i==arr.length-2){
            return true;
        }
        return false;

    }


}
