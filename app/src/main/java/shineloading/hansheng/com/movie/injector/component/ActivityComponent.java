package shineloading.hansheng.com.movie.injector.component;

import android.content.Context;

import dagger.Component;
import shineloading.hansheng.com.movie.injector.ActivityScope;
import shineloading.hansheng.com.movie.injector.module.ActivityModule;

/**
 * Created by hansheng on 2016/5/26.
 */
@ActivityScope
@Component(dependencies = MovieComponent.class,modules = {ActivityModule.class})
public interface ActivityComponent {

    Context context();
}
