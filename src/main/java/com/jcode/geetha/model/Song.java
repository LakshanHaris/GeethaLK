package com.jcode.geetha.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "song")
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "song_id")
    private Integer songId;
    @Basic(optional = false)
    @NotNull(message = "Song Artist cannot be null")
    @Size(min = 1, max = 45, message = "Maximum character size exceeded for song artist - 45")
    @Column(name = "artist")
    private String artist;
    @Basic(optional = false)
    @NotNull(message = "Song name cannot be null")
    @Size(min = 1, max = 45, message = "Maximum character size exceeded for song name - 45")
    @Column(name = "name")
    private String name;
    @Size(max = 45, message = "Maximum character size exceeded for song type - 45")
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull(message = "Song Mp3 cannot be null")
    @Size(min = 1, max = 85, message = "Maximum character size exceeded for song mp3 - 85")
    @Column(name = "mp3")
    private String mp3;
    @Size(max = 45, message = "Maximum character size exceeded for song musicBy - 45")
    @Column(name = "music_by")
    private String musicBy;
    @Size(max = 45, message = "Maximum character size exceeded for song lyricsBy - 45")
    @Column(name = "lyrics_by")
    private String lyricsBy;
    @JoinColumn(name = "song_lyrics_id", referencedColumnName = "lyrics_id")
    @ManyToOne(optional = false)
    private Lyrics lyricsId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "songId")
    private List<Post> postCollection;

    public Song() {
    }

    public Song(Integer songId) {
        this.songId = songId;
    }

    public Song(Integer songId, String artist, String name, String mp3) {
        this.songId = songId;
        this.artist = artist;
        this.name = name;
        this.mp3 = mp3;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }

    public String getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(String musicBy) {
        this.musicBy = musicBy;
    }

    public String getLyricsBy() {
        return lyricsBy;
    }

    public void setLyricsBy(String lyricsBy) {
        this.lyricsBy = lyricsBy;
    }

    public Lyrics getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(Lyrics lyricsId) {
        this.lyricsId = lyricsId;
    }

    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(List<Post> postCollection) {
        this.postCollection = postCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (songId != null ? songId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Song)) {
            return false;
        }
        Song other = (Song) object;
        if ((this.songId == null && other.songId != null) || (this.songId != null && !this.songId.equals(other.songId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Song[ songId=" + songId + " ]";
    }

}