package recursion;

/**
 * Created by mohan on 12/05/17.
 */

public class NextBigNumber {

    static int mod;


    public static void main(String[] args) {


      //  System.out.println(reverse(12345,0));
      //  movePointer(1234,3);

        nextBig(123);


    }

    public static int  reverse(int num,int reverse){

        if(num==0){
            return reverse;
        }
         reverse=(reverse*10)+(num%10);
        return reverse(num/10,reverse);

    }


    public static int revrese(int num){

        int reverse=0;

        while (num!=0){

            reverse=(reverse*10)+(num%10);
            num=num/10;

        }
        return reverse;
    }






    public int nextBigNumber(int num){

        int bigNum=num;
        int temp=num;

        int res=temp%10;
        temp=temp/10;

        int ser=temp%10;
        temp=temp/10;

        if(res>ser){

        }
        return bigNum;
    }


    // 123

    public static void nextBig(int num){

        int prev=movePointer(num,1,0);
        int curr=movePointer(num,2,0);
        if(curr<prev){
            System.out.println(change(num,1,2));
        }

    }


    public static int change(int num,int i,int j){

        int x=movePointer(num,i,0);
        return x*10+movePointer(num,j,0);
    }







    public static int movePointer(int num,int pointer,int movedNumber){

        if(num==0  || pointer==0) {
            return movedNumber;
        }
        System.out.println(num % 10);

       return movePointer(num/10,pointer-1,num % 10);
    }





}
