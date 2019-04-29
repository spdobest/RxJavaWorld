package sptech.rxjavabysp.rxJava2Examples.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;
import sptech.rxjavabysp.rxJava2Examples.operators.models.Student;

public class CreateActivity extends AppCompatActivity {

    /**
     * CREATE :  create an observable from scratch by means of function
     *
     * You pass this operator a function that accepts the observer as  parameter.
     * Write this function so that it will act as observer by calling the observer's method
     * onNext(), onCOmplete(),onError()
     */


    private static final String TAG = "RangeActivity";

    private Observable<Student> myObservable;
    private DisposableObserver<Student> myObserver;
    // private Disposable disposable;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);

        myObservable = Observable.create(new ObservableOnSubscribe<Student>() {
            @Override
            public void subscribe(ObservableEmitter<Student> emitter) throws Exception {
                 ArrayList<Student> list  = getStudents();

                 for(Student st:list) {
                     emitter.onNext(st);
                 }

                 emitter.onComplete();
            }
        });

        compositeDisposable.add(myObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));

    }

    private DisposableObserver<Student> getObserver() {
        myObserver = new DisposableObserver<Student>() {
            @Override
            public void onNext(Student st) {
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

    private ArrayList<Student> getStudents(){

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Student 1","student1@gmail.com","23","1000"));
        list.add(new Student("Student 2","student2@gmail.com","23","1001"));
        list.add(new Student("Student 3","student3@gmail.com","23","1002"));
        list.add(new Student("Student 4","student4@gmail.com","23","1003"));
        list.add(new Student("Student 5","student5@gmail.com","23","1004"));
        list.add(new Student("Student 6","student6@gmail.com","23","1005"));
        list.add(new Student("Student 7","student7@gmail.com","23","1006"));

        return list;
    }

}
