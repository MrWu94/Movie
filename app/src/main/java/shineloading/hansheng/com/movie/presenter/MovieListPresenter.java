package shineloading.hansheng.com.movie.presenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
import rx.Subscriber;
import shineloading.hansheng.com.movie.domain.GetMovieListUsecase;
import shineloading.hansheng.com.movie.model.Movie;
import shineloading.hansheng.com.movie.model.MovieFeed;
import shineloading.hansheng.com.movie.ui.view.IMovieListView;
import shineloading.hansheng.com.movie.ui.view.IView;

/**
 * Created by hansheng on 2016/5/26.
 */
public class MovieListPresenter implements BasePresenter {

    private GetMovieListUsecase movieListUsecase;
    private IMovieListView movieListView;
    private List<Movie> movieList;

    @Inject
    public MovieListPresenter(GetMovieListUsecase movieListUsecase) {
        this.movieListUsecase = movieListUsecase;
        this.movieList = new ArrayList<>();
    }

    @Override
    public void onCreate() {
        requestMovieList();
    }

    @Override
    public void attachView(IView view) {
        movieListView = (IMovieListView) view;
    }

    private void requestMovieList() {
        movieListView.showLoading();
        movieListUsecase.execute()
                .subscribe(new Subscriber<MovieFeed>() {
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(MovieFeed movieFeed) {
                        movieList.addAll(movieFeed.subjects);
                        movieListView.hideLoading();
                        movieListView.showMovieList(movieList);
                    }
                });
    }

}
