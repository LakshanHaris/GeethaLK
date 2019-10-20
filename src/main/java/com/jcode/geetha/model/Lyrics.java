package com.jcode.geetha.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "lyrics")
public class Lyrics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lyrics_id")
    private Integer lyricsId;
    @Size(max = 100, message = "Maximum character size exceeded for lyrics description- 100")
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lyricsId")
    private List<Song> songCollection;

    public Lyrics() {
    }

    public Lyrics(Integer lyricsId) {
        this.lyricsId = lyricsId;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Song> getSongCollection() {
        return songCollection;
    }

    public void setSongCollection(List<Song> songCollection) {
        this.songCollection = songCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lyricsId != null ? lyricsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lyrics)) {
            return false;
        }
        Lyrics other = (Lyrics) object;
        if ((this.lyricsId == null && other.lyricsId != null) || (this.lyricsId != null && !this.lyricsId.equals(other.lyricsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Lyrics[ lyricsId=" + lyricsId + " ]";
    }

}

