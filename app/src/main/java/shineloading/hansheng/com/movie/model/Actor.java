package shineloading.hansheng.com.movie.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author huxian99
 */
public class Actor implements Serializable {
    private static final long serialVersionUID = -337822238788581692L;

    private String id;
    private String name;
    private String name_en;
    private ImageLink avatars;
    private String alt;
    private String mobile_url;
    private String summary;
    private String website;
    private List<String> aka;
    private List<String> aka_en;
    private String gender;
    private String birthday;
    private String born_place;
    private List<String> professions;
    private String constellation;
    private List<Photo> photos;
    private List<Movie> works;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getName_en() {
        return name_en;
    }

    public ImageLink getAvatars() {
        return avatars;
    }

    public String getAlt() {
        return alt;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public String getSummary() {
        return summary;
    }

    public String getWebsite() {
        return website;
    }

    public List<String> getAka() {
        return aka;
    }

    public List<String> getAka_en() {
        return aka_en;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBorn_place() {
        return born_place;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public String getConstellation() {
        return constellation;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Movie> getWorks() {
        return works;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public void setAvatars(ImageLink avatars) {
        this.avatars = avatars;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public void setAka_en(List<String> aka_en) {
        this.aka_en = aka_en;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBorn_place(String born_place) {
        this.born_place = born_place;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public void setWorks(List<Movie> works) {
        this.works = works;
    }
}
