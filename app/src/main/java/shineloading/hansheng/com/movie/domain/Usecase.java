package shineloading.hansheng.com.movie.domain;

import rx.Observable;

/**
 * @author hansheng
 */
public interface Usecase<T> {

    Observable<T> execute();
}
