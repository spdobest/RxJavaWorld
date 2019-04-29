package sptech.rxjavabysp.rxJava2Examples.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;

public class DistinctActivity extends AppCompatActivity {

    private static final String TAG = "DistinctActivity";

    /**
     * http://reactivex.io/documentation/operators/distinct.html
     * <p>
     * distinct : It will print the unique elements
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);

        Observable<Integer> myObservable = Observable.just(12, 12, 12, 4, 5, 63, 5, 4, 63);

        myObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .distinct()
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer list) {
                        Log.i(TAG, "onNext: " + list);
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
