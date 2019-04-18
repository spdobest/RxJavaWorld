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

public class CompositeDisposableActivity extends AppCompatActivity {

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
         * Here we can define on which thread we get our result.
         */

        myObservable1.subscribeOn(Schedulers.io());
        myObservable2.subscribeOn(Schedulers.io());

        /**
         * This means the data stream will move to main thread again
         */

        myObservable1.observeOn(AndroidSchedulers.mainThread());
        myObservable2.observeOn(AndroidSchedulers.mainThread());

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


        compositeDisposable.add(myObserver1);
        compositeDisposable.add(myObserver2);

        myObservable1.subscribe(myObserver1);
        myObservable2.subscribe(myObserver2);

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
