package sptech.rxjavabysp.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MyOkHttpInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        if (!"/posts".contains(originalRequest.url().toString())) {
            return chain.proceed(originalRequest);
        }

        String token = "";

        Request newRequest = originalRequest.newBuilder()
                .header("X-Authorization", token)
                .build();

        return chain.proceed(newRequest);
    }

}