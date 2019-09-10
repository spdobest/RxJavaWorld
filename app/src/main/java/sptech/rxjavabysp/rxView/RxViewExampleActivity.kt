package sptech.rxjavabysp.rxView

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.jakewharton.rxbinding3.view.clicks
import com.jakewharton.rxbinding3.widget.textChanges
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.activity_rx_view_example.*
import java.util.concurrent.TimeUnit


class RxViewExampleActivity : AppCompatActivity() {

    private val compositeDisposableOnPause = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(sptech.rxjavabysp.R.layout.activity_rx_view_example)

        editText.textChanges()
                .subscribe(Consumer {
                    Log.i("TAG", it.toString())
                })
    }

    override fun onResume() {
        super.onResume()
        compositeDisposableOnPause.add(button.clicks()
                .throttleFirst(10, TimeUnit.SECONDS)
                .subscribe {
                    Toast.makeText(this@RxViewExampleActivity, "BOO", Toast.LENGTH_LONG).show()
                }
        )

        compositeDisposableOnPause.add(buttonFourClick.clicks()
                .count()
                .filter { count -> count >= 4 }
                .subscribe {

                })

    }

    override fun onPause() {
        compositeDisposableOnPause.clear()
        super.onPause()
    }

    companion object {
        val TAG = RxViewExampleActivity::class.java.simpleName
    }

}
