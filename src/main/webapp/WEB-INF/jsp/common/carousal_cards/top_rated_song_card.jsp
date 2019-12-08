<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Top Rated Songs</h1>
<!--owl carousal-->
<!-- Set up your HTML -->
<div class="owl-carousel-two owl-carousel owl-theme">

    <c:forEach items="${response.data.topTenSongList}" var="song">

        <div>
            <a href="#">
                <div class="card song-card">
                    <div class="card-body">
                        <div class="song-title">
                            <h5 class="card-title">${song.name}</h5>
                        </div>
                        <div class="song-thumbnail">
                            <img src="/images/music_default_image.jpg" class="card-img-top thumbnail-img" alt="...">

                        </div>
                        <p class="card-text Song-data">
                            <small class="text-muted ">Artist : ${song.artist}</small><br>
                            <small class="text-muted ">Music : ${song.musicBy}</small><br>
                            <small class="text-muted ">Lyrics : ${song.lyricsBy}</small>
                        </p>
                        <small class="text-muted song-meta-attribute">Likes : ${song.numOfPosts}</small>
                        <small class="text-muted song-meta-attribute">DisLikes : ${song.numOfPosts}</small>
                        <small class="text-muted song-meta-attribute">Posts : ${song.numOfPosts}</small>

                    </div>
                </div>
            </a>
        </div>
    </c:forEach>
</div>