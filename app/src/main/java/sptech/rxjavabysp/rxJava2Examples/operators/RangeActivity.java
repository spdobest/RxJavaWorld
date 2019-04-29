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

public class RangeActivity extends AppCompatActivity {

    /**
     * RANGE : Creates an observable that emits a particular range of sequential integer
     */


    private static final String TAG = "RangeActivity";

    private Observable<Integer> myObservable;
    private DisposableObserver<Integer> myObserver;
    // private Disposable disposable;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private Integer[] myRanges = {3,6,45,24,23,41,100};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);

        myObservable = Observable.range(1,20);

        compositeDisposable.add(myObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));

    }

    private DisposableObserver<Integer> getObserver() {
        myObserver = new DisposableObserver<Integer>() {
            @Override
            public void onNext(Integer i) {
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
