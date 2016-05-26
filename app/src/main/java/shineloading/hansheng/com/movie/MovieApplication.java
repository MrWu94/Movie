package shineloading.hansheng.com.movie;

import android.app.Application;

import shineloading.hansheng.com.movie.injector.component.DaggerMovieComponent;
import shineloading.hansheng.com.movie.injector.component.MovieComponent;
import shineloading.hansheng.com.movie.injector.module.MovieModule;

/**
 * Created by hansheng on 2016/5/26.
 */
public class MovieApplication extends Application{
    private MovieComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        setGraph();
    }

    private void setGraph() {
        component= DaggerMovieComponent.builder()
                .movieModule(new MovieModule(this))
                .build();
        component.inject(this);
    }

    public MovieComponent component(){
        return component;
    }
}
