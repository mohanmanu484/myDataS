package com.example.mohan.unittesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.spy;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {



    @Mock
    MyViewModel myViewModel;



    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void addition_isCorrect()  {

        MyViewModel mySpyViewModel= spy(new MyViewModel());

        Mockito.when(mySpyViewModel.isNetworkConnected()).thenReturn(false);
        mySpyViewModel.makeApiCall();
        Mockito.verify(mySpyViewModel,Mockito.never()).add();

       // Mockito.doReturn("").when(mySpyViewModel).add();   example for future

       /* Mockito.doThrow(new Exception("")).when(mySpyViewModel).add();

        boolean exceptionTrown=false;

        try {
            mySpyViewModel.makeApiCall();
        }catch (Exception e){
            exceptionTrown=true;

        }

        Assert.assertEquals("condition satisfied ",exceptionTrown,true);*/


       // Assert.assertTrue(mySpyViewModel.makeApiCall()==5);

    }

    @Test
    public void testingAssertFunction(){

        MyViewModel myViewModel=new MyViewModel();
        MyViewModel spyViewModel=Mockito.spy(myViewModel);
        Assert.assertThat(myViewModel.isNetworkConnected(), is(false));
        myViewModel.makeApiCall();
      //  Mockito.verify(spyViewModel).add();



    }



}