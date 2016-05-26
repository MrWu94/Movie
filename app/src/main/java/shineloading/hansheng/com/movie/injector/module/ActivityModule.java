package shineloading.hansheng.com.movie.injector.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import shineloading.hansheng.com.movie.injector.ActivityScope;

/**
 * Created by hansheng on 2016/5/26.
 */
@Module
public class ActivityModule {
    private Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    Context provideContext(){return context;}
}
