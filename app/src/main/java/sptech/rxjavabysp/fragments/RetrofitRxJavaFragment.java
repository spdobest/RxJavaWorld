package sptech.rxjavabysp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sptech.rxjavabysp.R;
import sptech.rxjavabysp.network.RetrofitApiService;
import sptech.rxjavabysp.network.RetrofitHelper;

public class RetrofitRxJavaFragment extends Fragment {

    private static final String TAG = "RetrofitRxJavaFragment";

    private RetrofitApiService retrofitApiService;

    public RetrofitRxJavaFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static RetrofitRxJavaFragment newInstance() {
        RetrofitRxJavaFragment fragment = new RetrofitRxJavaFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        retrofitApiService  = new RetrofitHelper().getCityService();



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
// https://github.com/matthiasbruns/rxandroid2-retrofit2
        View rootView = inflater.inflate(R.layout.fragment_retrofit_rx_java, container, false);

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

}
