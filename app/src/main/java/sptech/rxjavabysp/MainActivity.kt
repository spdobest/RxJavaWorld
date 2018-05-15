package sptech.rxjavabysp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import sptech.rxjavabysp.fragments.FilterFragment
import sptech.rxjavabysp.fragments.JustFragment
import sptech.rxjavabysp.fragments.MapFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAll.setOnClickListener(clickListener)
    }

    private val clickListener: View.OnClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.buttonAll -> {
                println("sibaprasad")
                supportFragmentManager.beginTransaction()
                        .add(R.id.constraintLayoutContainer,
                                JustFragment.newInstance("", ""),
                                "JustFragmet").commit()
            }
            R.id.buttonJust -> {
                supportFragmentManager.beginTransaction()
                        .add(R.id.constraintLayoutContainer,
                                JustFragment.newInstance("", ""),
                                "JustFragmet").commit()
            }
            R.id.buttonFilter -> {
                supportFragmentManager.beginTransaction()
                        .add(R.id.constraintLayoutContainer,
                                FilterFragment.newInstance("", ""),
                                "FilterFragment").commit()
            }
            R.id.buttonMap -> {
                supportFragmentManager.beginTransaction()
                        .add(R.id.constraintLayoutContainer,
                                MapFragment.newInstance("", ""),
                                "MapFragment").commit()
            }
        }
    }

}
