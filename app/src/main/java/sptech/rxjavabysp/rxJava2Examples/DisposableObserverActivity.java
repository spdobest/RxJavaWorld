package sptech.rxjavabysp.rxJava2Examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;

public class DisposableObserverActivity extends AppCompatActivity {

    private static final String TAG = "SimpleObserverActivity";

    private Observable<String> myObservable;

    private String message = "Hello Sibaprasad, welcome to ";

    private DisposableObserver<String> myObserver;

    private TextView textView;

    // private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disposable_observer);

        textView = findViewById(R.id.textViewDisposableObserver);

        myObservable = Observable.just(message);


        /**
         * Here we can define on which thread we get our result.
         */

        myObservable.subscribeOn(Schedulers.io());

        /**
         * This means the data stream will move to main thread again
         */

        myObservable.observeOn(AndroidSchedulers.mainThread());

        myObserver = new DisposableObserver<String>() {
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

        myObservable.subscribe(myObserver);

    }

    /**
     * Now we will dispose the observable
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myObserver.dispose();
    }
}