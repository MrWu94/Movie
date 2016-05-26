package shineloading.hansheng.com.movie.domain;


import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import shineloading.hansheng.com.movie.model.MovieFeed;
import shineloading.hansheng.com.movie.network.Repository;

/**
 * @author huxian99
 */
public class GetMovieListUsecase implements Usecase<MovieFeed> {

    public static final int COUNT = 20;

    private Repository repository;
    private String list;

    public GetMovieListUsecase(Repository repository, String list) {
        this.repository = repository;
        this.list = list;
    }

    @Override
    public Observable<MovieFeed> execute() {
        return repository.getMovieList(list, 0, COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
