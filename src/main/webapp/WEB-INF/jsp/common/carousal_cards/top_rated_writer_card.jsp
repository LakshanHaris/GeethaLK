<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Top Rated Writers</h1>

<div class="owl-carousel-two owl-carousel owl-theme">
    <c:forEach items="${response.data.topTenUserList}" var="user">
        <div>
            <a href="#">
                <div class="card writer-card">
                    <div class="card-body">
                        <div class="song-title">
                            <h5 class="card-title">${user.firstName} ${user.lastName}</h5>
                        </div>
                        <div class="user-thumbnail">
                            <img src="/images/user_default_image.jpg" class="card-img-top user-thumbnail-img" alt="...">

                        </div>
                        <br>
                        <h6>Rank : ${user.rank}</h6>
                        <br>
                        <small class="text-muted user-meta-attribute">Likes : ${song.numOfPosts}</small>
                        <small class="text-muted user-meta-attribute">DisLikes : ${song.numOfPosts}</small>
                        <small class="text-muted user-meta-attribute">Total Posts : ${song.numOfPosts}</small>
                    </div>
                </div>
            </a>
        </div>
    </c:forEach>
</div>