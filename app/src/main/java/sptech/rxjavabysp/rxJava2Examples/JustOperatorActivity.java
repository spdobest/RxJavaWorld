package sptech.rxjavabysp.rxJava2Examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;

public class JustOperatorActivity extends AppCompatActivity {

    /**
     * JUST - operator converts an item into an observable that emits that item
     * <p>
     * Just is similar to from, but note that from wil dove into an array or an iterable, or something
     * of that sort to pull items to emit.
     * While Just will simply emit the array or iterable or what have you as it is, unchanged as a single item.
     * <p>
     * <p>
     * NOTE that if u pass null to just , it will retutn an observable that emits null as an item,
     * Do not make the mistake of assuming that will return an empty observable (One that emits no items
     * at all) for that you will need the empty operator
     */

    private static final String TAG = "JustOperatorActivity";

    private Observable<String> myObservable1;
    private Observable<String[]> myObservable2;

    private String message = "Hello Sibaprasad, welcome to ";
    private String[] messageArray = {"Hello1", "Hello2", "Hello3", "Hello4"};

    private DisposableObserver<String> myObserver1;
    private DisposableObserver<String[]> myObserver2;


    // private Disposable disposable;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_operator);


        myObservable1 = Observable.just(message);
        myObservable2 = Observable.just(messageArray);

        compositeDisposable.add(myObservable1
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));

        compositeDisposable.add(myObservable2
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(myObserver2));


    }

    private DisposableObserver getObserver() {
        myObserver1 = new DisposableObserver<String>() {
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

        return myObserver1;
    }

    private DisposableObserver getObserverArray() {
        myObserver2 = new DisposableObserver<String[]>() {
            @Override
            public void onNext(String[] s) {
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

        return myObserver2;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}
