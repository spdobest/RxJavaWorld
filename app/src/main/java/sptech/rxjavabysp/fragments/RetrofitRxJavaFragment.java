package sptech.rxjavabysp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import sptech.rxjavabysp.R;
import sptech.rxjavabysp.network.RetrofitApiService;
import sptech.rxjavabysp.network.RetrofitHelper;
import sptech.rxjavabysp.network.dto.CityResponse;
import sptech.rxjavabysp.network.dto.Geoname;

public class RetrofitRxJavaFragment extends Fragment {

    private static final String TAG = "RetrofitRxJavaFragment";

    private RetrofitApiService retrofitApiService;
    @NonNull
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    private TextView tvResponse;

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

        retrofitApiService = new RetrofitHelper().getCityService();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
// https://github.com/matthiasbruns/rxandroid2-retrofit2
        View rootView = inflater.inflate(R.layout.fragment_retrofit_rx_java, container, false);

        tvResponse = rootView.findViewById(R.id.tvResponse);
        requestGeonames();
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    private void displayGeonames(@NonNull final List<Geoname> geonames) {
        // Cheap way to display a list of Strings - I was too lazy to implement a RecyclerView
        final StringBuilder output = new StringBuilder();
        for (final Geoname geoname : geonames) {
            output.append(geoname.name).append("\n");
        }

        tvResponse.setText(output.toString());
    }

    private void requestGeonames() {
        mCompositeDisposable.add(retrofitApiService.queryGeonames(44.1, -9.9, -22.4, 55.2, "de")
                .subscribeOn(Schedulers.io()) // "work" on io thread
                .observeOn(AndroidSchedulers.mainThread()) // "listen" on UIThread
                .map(new Function<CityResponse, List<Geoname>>() {
                    @Override
                    public List<Geoname> apply(
                            @io.reactivex.annotations.NonNull final CityResponse cityResponse)
                            throws Exception {
                        // we want to have the geonames and not the wrapper object
                        return cityResponse.geonames;
                    }
                })
                .subscribe(new Consumer<List<Geoname>>() {
                    @Override
                    public void accept(
                            @io.reactivex.annotations.NonNull final List<Geoname> geonames)
                            throws Exception {
                        displayGeonames(geonames);
                    }
                })
        );
    }
}
