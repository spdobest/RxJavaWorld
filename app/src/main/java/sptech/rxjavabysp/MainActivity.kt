package sptech.rxjavabysp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAll.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(view?.id) {
            R.id.buttonAll -> {
                println("sibaprasad")
            }
            R.id.buttonJust -> {

            }

        }
    }

}
