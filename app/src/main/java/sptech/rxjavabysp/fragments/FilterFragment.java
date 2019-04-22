package sptech.rxjavabysp.fragments;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Predicate;
import sptech.rxjavabysp.R;

public class FilterFragment extends Fragment implements View.OnClickListener {


    private static final String TAG = "FilterFragment";
    private Button buttonFilter;
    private TextView tvResponse;


    public FilterFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FilterFragment newInstance(String param1, String param2) {
        FilterFragment fragment = new FilterFragment();
        Bundle args = new Bundle();
       /* args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);*/
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootVIew = inflater.inflate(R.layout.fragment_filter, container, false);

        buttonFilter = rootVIew.findViewById(R.id.buttonFilter);
        tvResponse = rootVIew.findViewById(R.id.tvResponse);

        return rootVIew;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    private void doFIlterWOrk() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) throws Exception {
                        return integer % 2 == 0;
                    }
                })
                .subscribe(getFilterableObserver());
    }


    private Observer<Integer> getFilterableObserver() {
        return new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, " onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onNext(Integer value) {
                tvResponse.append(" onNext : ");
                tvResponse.append("\n");
                tvResponse.append(" value : " + value);
                tvResponse.append("\n");
                Log.d(TAG, " onNext ");
                Log.d(TAG, " value : " + value);
            }

            @Override
            public void onError(Throwable e) {
                tvResponse.append(" onError : " + e.getMessage());
                tvResponse.append("\n");
                Log.d(TAG, " onError : " + e.getMessage());
            }

            @Override
            public void onComplete() {
                tvResponse.append(" onComplete");
                tvResponse.append("\n");
                Log.d(TAG, " onComplete");
            }
        };
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonFilter:
                doFIlterWOrk();
                break;
        }
    }
}
