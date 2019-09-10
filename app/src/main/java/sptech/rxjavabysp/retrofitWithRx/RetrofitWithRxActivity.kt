package sptech.rxjavabysp.retrofitWithRx

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import sptech.rxjavabysp.retrofitWithRx.models.GithubRepo


class RetrofitWithRxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(sptech.rxjavabysp.R.layout.activity_retrofit_with_rx)

        val testObservable: Single<List<GithubRepo>> = ApiClient.create(ApiClient.GITHUB_BASE_URL).getStarredRepositories("spdobest")

        testObservable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : SingleObserver<List<GithubRepo>> {
                    override fun onSuccess(t: List<GithubRepo>) {
                        Log.i(TAG, t.toString())
                    }

                    override fun onSubscribe(d: Disposable) {
                        Log.i(TAG, "onSubscribe")
                    }

                    override fun onError(e: Throwable) {
                        Log.i(TAG, "onError")
                    }
                })
    }

    companion object {
        val TAG = RetrofitWithRxActivity::class.java.simpleName
    }
}
