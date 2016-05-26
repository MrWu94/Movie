package shineloading.hansheng.com.movie.model;

import java.io.Serializable;

/**
 * @author huxian99
 */
public class ImageLink implements Serializable {

    private static final long serialVersionUID = 903922582976226766L;

    private String small;
    private String large;
    private String medium;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
