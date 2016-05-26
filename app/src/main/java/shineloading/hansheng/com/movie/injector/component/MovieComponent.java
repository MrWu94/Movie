package shineloading.hansheng.com.movie.injector.component;

import javax.inject.Singleton;

import dagger.Component;
import shineloading.hansheng.com.movie.MovieApplication;
import shineloading.hansheng.com.movie.injector.module.MovieModule;
import shineloading.hansheng.com.movie.model.Movie;
import shineloading.hansheng.com.movie.network.Repository;

/**
 * Created by hansheng on 2016/5/26.
 */
@Singleton
@Component(modules = {MovieModule.class})
public interface MovieComponent {
    void inject(MovieApplication movieApplication);
    MovieApplication application();
    Repository repository();
}
