package shineloading.hansheng.com.movie.injector.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import shineloading.hansheng.com.movie.domain.GetMovieListUsecase;
import shineloading.hansheng.com.movie.injector.ActivityScope;
import shineloading.hansheng.com.movie.network.Repository;

/**
 * Created by hansheng on 2016/5/26.
 */
@Module
public class MovieListModule {
    private Context context;
    private String list;

    public MovieListModule(Context context, String list) {
        this.context = context;
        this.list = list;
    }

    @Provides
    @ActivityScope
    GetMovieListUsecase provideGetMovieListUsecase(Repository repository) {
        return new GetMovieListUsecase(repository, list);
    }

    @Provides
    @ActivityScope
    Context provideContext() {
        return context;
    }
}
