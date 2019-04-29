package sptech.rxjavabysp.rxJava2Examples.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;

public class FromOperatorActivity extends AppCompatActivity {


    /**
     * FROM : convert various other objects and data types into Observables
     *
     * When you work with Observables, it can be more convenient if all of the data you mean to work with can be represented as Observables, rather than as a mixture of Observables and other types. This allows you to use a single set of operators to govern the entire lifespan of the data stream.
     *
     * Iterables, for example, can be thought of as a sort of synchronous Observable; Futures, as a sort of Observable that always emits only a single item. By explicitly converting such objects to Observables, you allow them to interact as peers with other Observables.
     *
     * For this reason, most ReactiveX implementations have methods that allow you to convert certain language-specific objects and data structures into Observables.
     *
     */

    private static final String TAG = "FromOperatorActivity";

    private Observable<String> myObservable;
    private DisposableObserver<String> myObserver;
    // private Disposable disposable;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private String[] greetings = {"Hello1", "Hello2", "Hello3", "Hello4"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_operator);


        myObservable = Observable.fromArray(greetings);

        compositeDisposable.add(myObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));
    }

    private DisposableObserver<String> getObserver() {
        myObserver = new DisposableObserver<String>() {
            @Override
            public void onNext(String s) {
                Log.i(TAG, "onNext: ");
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

        return myObserver;
    }
}
