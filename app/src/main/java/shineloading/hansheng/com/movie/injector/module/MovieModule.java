package shineloading.hansheng.com.movie.injector.module;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import shineloading.hansheng.com.movie.MovieApplication;
import shineloading.hansheng.com.movie.network.Repository;
import shineloading.hansheng.com.movie.network.RestDataSource;

/**
 * Created by hansheng on 2016/5/26.
 */
@Module
public class MovieModule {
    private MovieApplication movieApplication;

    public MovieModule(MovieApplication movieApplication) {
        this.movieApplication = movieApplication;
    }

    @Provides
    @Singleton
    MovieApplication provideApplication() {
        return movieApplication;
    }

    @Provides
    @Singleton
    Repository provideDataRepository(RestDataSource restDataSource) {
        return restDataSource;
    }
}
