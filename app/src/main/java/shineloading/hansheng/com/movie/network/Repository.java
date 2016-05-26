package shineloading.hansheng.com.movie.network;



import rx.Observable;
import shineloading.hansheng.com.movie.model.MovieFeed;

/**
 * @author huxian99
 */
public interface Repository {

    Observable<MovieFeed> getMovieList(String list, int start, int count);



}
