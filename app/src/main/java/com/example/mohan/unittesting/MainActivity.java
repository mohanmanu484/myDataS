package com.example.mohan.unittesting;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.mohan.unittesting.databinding.TestBinding;

public class MainActivity extends AppCompatActivity {

    public ArrayAdapter<String> spinnerArrayAdapter;

    public String[] myData={"banglore","mysore","kr nagar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestBinding viewDataBinding=DataBindingUtil.setContentView(this,R.layout.test);
        viewDataBinding.setHandler(this);

       // setContentView(R.layout.test);


        //spinner.setAdapter(spinnerArrayAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);



    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @BindingAdapter("myAdapter")
    public static void setAdapter(Spinner spinner, String[] data){

         ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(spinner.getContext(), android.R.layout.simple_spinner_item, data); //selected item will look like a spinner set from XML
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
    }

    @BindingAdapter("selectedValue")
    public static void setData(Spinner spinner, String data){

        ArrayAdapter<String> adapter= (ArrayAdapter<String>) spinner.getAdapter();
       // spinner.setSelection();

    }

}
