package sptech.rxjavabysp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/**
 * https://proandroiddev.com/exploring-rxjava-in-android-e52ed7ef32e2
 *
 * https://www.androidhive.info/RxJava/android-getting-started-with-reactive-programming/
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAll.setOnClickListener(this)
        buttonJust.setOnClickListener(this)
        buttonMap.setOnClickListener(this)
        buttonFilter.setOnClickListener(this)
        buttonSwitchMap.setOnClickListener(this)

    }


    override fun onClick(view: View?) {

        container.visibility = View.VISIBLE

        when (view!!.id) {


            R.id.buttonAll -> {

            }
            R.id.buttonJust -> {
                /* supportFragmentManager.beginTransaction()
                         .add(R.id.container,
                                 JustFragment.newInstance("", ""),
                                 "JustFragmet").commit()*/
            }

            R.id.buttonMap -> {
//                supportFragmentManager.beginTransaction()
//                        .add(R.id.constraintLayoutContainer,
//                                MapFragment.newInstance("", ""),
//                                "FilterFragment").commit()
            }

            R.id.buttonFilter -> {
//                supportFragmentManager.beginTransaction()
//                        .add(R.id.constraintLayoutContainer,
//                                FilterFragment.newInstance("", ""),
//                                "FilterFragment").commit()
            }


        }
    }
}
