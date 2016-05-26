package shineloading.hansheng.com.movie.network;



import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;
import shineloading.hansheng.com.movie.model.MovieFeed;

/**
 * @author hansheng
 */
public interface OpenApiService {

    @GET("movie/{list}")
    Observable<MovieFeed> getMovieList(@Path("list") String list, @Query("start") int start, @Query("count") int count);


}
