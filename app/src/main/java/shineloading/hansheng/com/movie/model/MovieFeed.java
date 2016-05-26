package shineloading.hansheng.com.movie.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author huxian99
 */
public class MovieFeed implements Serializable {

    private static final long serialVersionUID = -4607470888105294220L;
    public int count;
    public int start;
    public int total;
    public List<Movie> subjects;
    public String title;

}
