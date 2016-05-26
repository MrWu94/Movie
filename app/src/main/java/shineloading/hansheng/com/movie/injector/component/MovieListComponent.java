package shineloading.hansheng.com.movie.injector.component;

import android.content.Context;

import dagger.Component;
import shineloading.hansheng.com.movie.domain.GetMovieListUsecase;
import shineloading.hansheng.com.movie.injector.ActivityScope;
import shineloading.hansheng.com.movie.injector.module.MovieListModule;
import shineloading.hansheng.com.movie.ui.fragment.MovieListFragment;

/**
 * Created by hansheng on 2016/5/26.
 */
@ActivityScope
@Component(dependencies = MovieComponent.class, modules = {MovieListModule.class})
public interface MovieListComponent extends ActivityComponent {
    void inject(MovieListFragment fragment);

//    GetMovieListUsecase getMovieListUsercase();
//
//    Context activityContext();
}
