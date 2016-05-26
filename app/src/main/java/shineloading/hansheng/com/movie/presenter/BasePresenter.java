package shineloading.hansheng.com.movie.presenter;

import shineloading.hansheng.com.movie.ui.view.IView;

/**
 * Created by hansheng on 2016/5/26.
 */
public interface BasePresenter {

    void onCreate();
    void attachView(IView view);
}
