package sptech.rxjavabysp.rxJava2Examples.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;


public class BufferActivity extends AppCompatActivity {

    private static final String TAG = "BufferActivity";

    /**
     * http://reactivex.io/documentation/operators/buffer.html
     * <p>
     * Buffer : periodically gather items emitted by an Observable into bundles and emit these
     * bundles rather than emitting the items one at a time
     */


    private Observable<Integer> myObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);

        myObservable = Observable.range(1, 20);

        myObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .buffer(4)
                .subscribe(new Observer<List<Integer>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Integer> list) {
                        Log.i(TAG, "onNext: ");

                        for (Integer i : list) {
                            Log.i(TAG, "onNext value is: " + i);
                        }

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        Log.i(TAG, "onComplete()");
                    }
                });
    }

}
