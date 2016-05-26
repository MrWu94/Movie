package shineloading.hansheng.com.movie.network;



import javax.inject.Inject;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import shineloading.hansheng.com.movie.model.MovieFeed;
import shineloading.hansheng.com.movie.util.Constant;


public class RestDataSource implements Repository {

    private OpenApiService apiService;

    @Inject
    public RestDataSource() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        apiService = retrofit.create(OpenApiService.class);
    }

    @Override
    public Observable<MovieFeed> getMovieList(String list, int start, int count) {
        return apiService.getMovieList(list, start, count);
    }


}
