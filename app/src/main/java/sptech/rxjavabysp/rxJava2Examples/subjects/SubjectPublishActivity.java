package sptech.rxjavabysp.rxJava2Examples.subjects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.PublishSubject;
import sptech.rxjavabysp.R;

public class SubjectPublishActivity  extends AppCompatActivity {


    private static final String TAG = "SubjectPublishActivity";

    /**
     * SKIP : You can ignore the first n items emitted by an Observable and attend only to
     * those items that come after, by modifying the Observable with the Skip operator.
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);


        /**
         * ASYNC SUBJECT EXAMPLE
         *
         */
        publishSubjectOperator();
        // another example
        asyncOperator2();



    }

    /**
     * ASYNC SUBJECT implementation
     */

    void publishSubjectOperator(){
        Observable<String> observable = Observable.just("Java","Kotlin","Swift","Angular","Java script");
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        PublishSubject<String> asyncSubject = PublishSubject.create();
        observable.subscribe(asyncSubject);

        asyncSubject.subscribe(getFirstObserver());
        asyncSubject.subscribe(getSecondObserver());
        asyncSubject.subscribe(getThirdObserver());

    }

    /**
     * ANother example of ASYNC SUBJECT implementation
     */

    void asyncOperator2(){
        Observable<String> observable = Observable.just("Java","Kotlin","Swift","Angular","Java script");
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        PublishSubject<String> asyncSubject = PublishSubject.create();
        asyncSubject.subscribe(getFirstObserver());

        asyncSubject.onNext("Java");
        asyncSubject.onNext("Kotlin");
        asyncSubject.onNext("Swift");
        asyncSubject.onNext("Angular");

        asyncSubject.subscribe(getSecondObserver());

        asyncSubject.onNext("JSON");
        asyncSubject.onComplete();


        asyncSubject.subscribe(getThirdObserver());

    }


    private Observer<String> getFirstObserver(){
        Observer<String> firstObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "First onSubscribe: ");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG, "First onNext: "+s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "first onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "First onComplete: ");
            }
        };

        return firstObserver;




    }
    private Observer<String> getSecondObserver(){
        Observer<String> firstObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "Second onSubscribe: ");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG, "Second onNext: "+s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "Second onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "Second onComplete: ");
            }
        };

        return firstObserver;


    }
    private Observer<String> getThirdObserver(){
        Observer<String> firstObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "Third onSubscribe: ");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG, "Third onNext: "+s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "Third onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "Third onComplete: ");
            }
        };

        return firstObserver;




    }

}
