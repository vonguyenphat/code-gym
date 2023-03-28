package codegym.vn.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(
        @NamedQuery(name = "findNameAndCategory", query = "select m from Music m where m.nameMusic like :name")
)
public class Music {
    @Id
    private int id;
    private String nameMusic;
    private String artistsShow;
    private String category;
    private String urlMusic;

    public Music() {
    }

    public Music(int id, String nameMusic, String artistsShow, String category, String urlMusic) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.artistsShow = artistsShow;
        this.category = category;
        this.urlMusic = urlMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getArtistsShow() {
        return artistsShow;
    }

    public void setArtistsShow(String artistsShow) {
        this.artistsShow = artistsShow;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrlMusic() {
        return urlMusic;
    }

    public void setUrlMusic(String urlMusic) {
        this.urlMusic = urlMusic;
    }
}
