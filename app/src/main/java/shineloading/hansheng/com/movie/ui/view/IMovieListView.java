package shineloading.hansheng.com.movie.ui.view;

import java.util.List;

import shineloading.hansheng.com.movie.model.Movie;

/**
 * Created by hansheng on 2016/5/26.
 */
public interface IMovieListView extends IView {
    void showMovieList(List<Movie> movieList);

    void showLoading();

    void hideLoading();
}
