package shineloading.hansheng.com.movie.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;



import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import shineloading.hansheng.com.movie.MovieApplication;
import shineloading.hansheng.com.movie.R;
import shineloading.hansheng.com.movie.adapter.MovieListAdapter;
import shineloading.hansheng.com.movie.injector.component.DaggerMovieListComponent;
import shineloading.hansheng.com.movie.injector.module.MovieListModule;
import shineloading.hansheng.com.movie.model.Movie;
import shineloading.hansheng.com.movie.presenter.MovieListPresenter;
import shineloading.hansheng.com.movie.ui.view.IMovieListView;

/**
 * @author hansheng
 */
public class MovieListFragment extends BaseFragment implements IMovieListView {

    public static final String API_LIST = "list";

    @Inject
    MovieListPresenter movieListPresenter;

    private Activity activity;
    private RecyclerView rvMovieList;
    private ProgressBar progressBar;
    private LinearLayoutManager layoutManager;
    private MovieListAdapter listAdapter;

    private String apiList;
    private List<Movie> movieList;

    public static MovieListFragment newInstance(String title) {
        MovieListFragment fragment = new MovieListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(API_LIST, title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
        apiList = getArguments().getString(API_LIST);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initDependencyInjector();
        initPresenter();
    }

    @Override
    public void showMovieList(List<Movie> movieList) {
        this.movieList.clear();
        this.movieList.addAll(movieList);
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    private void initView(View view) {
        rvMovieList = (RecyclerView) view.findViewById(R.id.rv_movie_list);
        progressBar = (ProgressBar) view.findViewById(R.id.pb_movie_list);
        layoutManager = new LinearLayoutManager(activity);
        rvMovieList.setLayoutManager(layoutManager);
        movieList = new ArrayList<>();
        listAdapter = new MovieListAdapter(activity, movieList);
        rvMovieList.setAdapter(listAdapter);
    }

    private void initDependencyInjector() {
        MovieApplication moiveApplication = (MovieApplication) activity.getApplication();
        DaggerMovieListComponent.builder()
                .movieListModule(new MovieListModule(activity, apiList))
                .movieComponent(moiveApplication.component())
                .build()
                .inject(this);
    }

    private void initPresenter() {
        movieListPresenter.attachView(this);
        movieListPresenter.onCreate();
    }

}
