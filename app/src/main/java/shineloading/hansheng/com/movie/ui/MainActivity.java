package shineloading.hansheng.com.movie.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import shineloading.hansheng.com.movie.R;
import shineloading.hansheng.com.movie.ui.fragment.MovieListFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initView();
    }

    private void initView() {
        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.fl_drawer_container,
                MovieListFragment.newInstance(getResources().getString(R.string.in_theaters_english)),
                getResources().getString(R.string.in_theaters_chinese)).commit();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);

    }
}
