package sptech.rxjavabysp.testing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import sptech.rxjavabysp.R;

/**
 * Created by root on 5/7/18.
 */

public class MyClass extends AppCompatActivity implements Interface1,Interface2{

    private static final String TAG = "MyClass";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void call() {

    }
}
