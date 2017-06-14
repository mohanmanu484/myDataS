package rx;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.AsyncSubject;

/**
 * Created by mohan on 30/05/17.
 */

public class AsyncSubjectText {

   // AsyncSubject<String> asyncSubject=AsyncSubject.

    AsyncSubject<String> asyncSubject=AsyncSubject.create();


    public static void main(String[] args) {


        AsyncSubjectText asyncSubjectText=new AsyncSubjectText();
        asyncSubjectText.asyncSubject.onNext("one");
        asyncSubjectText.asyncSubject.onNext("two");
        asyncSubjectText.asyncSubject.onNext("thre");


        asyncSubjectText.asyncSubject.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                //System.out.println();
            }

            @Override
            public void onNext(String s) {

                System.out.println(s);
            }

            @Override
            public void onError(Throwable e) {

                System.out.println(e.getMessage());
            }

            @Override
            public void onComplete() {

                System.out.println("complete");
            }
        });

        asyncSubjectText.asyncSubject.onNext("four");



    }





}
