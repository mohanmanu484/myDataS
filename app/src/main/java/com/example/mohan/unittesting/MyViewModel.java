package com.example.mohan.unittesting;

/**
 * Created by mohan on 03/05/17.
 */

public class MyViewModel {



    public int makeApiCall(){

        if(isNetworkConnected()){
            try {
                return add();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return 1;

    }

    public void fetchData(){

    }


    public int add() {


        return 5;
    }





    public boolean isNetworkConnected(){
        return false;
    }


}
