<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${response.data.latestTopTenSongList}" var="song">
    <div>
        <a href="#">
            <div class="card">
                <img src="/images/slider.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${song.name}</h5>
                    <p class="card-text">${song.artist}</p>
                    <p class="card-text">${song.type}</p>
                    <p class="card-text"><small class="text-muted">Music by : ${song.musicBy}</small></p>
                    <p class="card-text"><small class="text-muted">Lyrics by ${song.lyricsBy}</small></p>
                </div>
            </div>
        </a>
    </div>
</c:forEach>