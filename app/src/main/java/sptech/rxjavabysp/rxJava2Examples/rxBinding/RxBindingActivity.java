package sptech.rxjavabysp.rxJava2Examples.rxBinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import sptech.rxjavabysp.R;

public class RxBindingActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_binding);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        buttonClear = findViewById(R.id.buttonClear);


        /**
         * TO achieve text change in the edittext and reflect the input data in the Textview
         * we need to write edittext.addTextChangeListener
         *
         * we can achieve it using Rx Binding,
         *
         * Here is the example
         *
         */


        Disposable disposable = RxTextView.textChanges(editText)
                .subscribe(new Consumer<CharSequence>() {
                    @Override
                    public void accept(CharSequence charSequence) throws Exception {
                        textView.setText(charSequence);
                    }
                });

        Disposable disposableButton = RxView.clicks(buttonClear)
                .subscribe(new Consumer<Unit>() {
                    @Override
                    public void accept(Unit unit) throws Exception {
                        textView.setText("");
                        editText.setText("");
                    }
                });


    }
}
