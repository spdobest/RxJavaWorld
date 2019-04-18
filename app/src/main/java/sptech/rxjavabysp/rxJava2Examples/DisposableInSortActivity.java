package sptech.rxjavabysp.rxJava2Examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;

public class DisposableInSortActivity extends AppCompatActivity {

    private static final String TAG = "CompositeDisposable";

    private Observable<String> myObservable1;
    private Observable<String> myObservable2;

    private String message = "Hello Sibaprasad, welcome to ";

    private DisposableObserver<String> myObserver1;
    private DisposableObserver<String> myObserver2;

    private TextView textView;

    // private Disposable disposable;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite_disposable);

        textView = findViewById(R.id.textViewComposite);

        myObservable1 = Observable.just(message);
        myObservable2 = Observable.just(message);


        /**
         * This means the data stream will move to main thread again
         */


        myObserver1 = new DisposableObserver<String>() {
            @Override
            public void onNext(String s) {
                Log.i(TAG, "onNext: ");
                textView.setText(s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "onComplete: ");
            }
        };

        myObserver2 = new DisposableObserver<String>() {
            @Override
            public void onNext(String s) {
                Log.i(TAG, "onNext: ");
                textView.setText(s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "onComplete: ");
            }
        };

        /**
         *  here we will suscribe to our observable
         *  If we will not suscribe to our observable, it will not emit data
         */


        /**
         *  myObservable1
         *                 .subscribeOn(Schedulers.io())
         *                 .observeOn(AndroidSchedulers.mainThread())
         *                 .subscribeWith(myObserver1)
         *
         *   The abobe code will return disposable object, so that we can add to composite disposable
         *
         */

        compositeDisposable.add(myObservable1
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(myObserver1));


        compositeDisposable.add(myObservable2
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(myObserver2));

    }

    /**
     * Now we will dispose the observable
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}
