<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Top Rated Posts</h1>
<!--owl carousal-->
<!-- Set up your HTML -->
<div class="owl-carousel-two owl-carousel owl-theme">

    <c:forEach items="${response.data.topTenPostList}" var="post">

        <div>
            <a href="#">
                <div class="card post-card">
                    <div class="card-body">
                        <div class="post-title">
                            <h5 class="card-title">${post.mainHeader}</h5>
                        </div>
                        <div class="post-paragraph">
                                    ${post.content}

                        </div><h6>Click To Read More</h6>
                        <p class="card-text Post-meta-data">
                            <small class="text-muted ">Song : ${post.name}</small><br>
                            <small class="text-muted ">Written by : ${post.userName}</small>
                        </p>
                        <small class="text-muted like-count">Likes : ${post.likes}</small>
                        <small class="text-muted dislike-count">DisLikes : ${post.dislikes}</small>

                    </div>
                </div>
            </a>
        </div>
    </c:forEach>
</div>