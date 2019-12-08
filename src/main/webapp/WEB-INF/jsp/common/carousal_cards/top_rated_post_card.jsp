<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Top Rated Posts</h1>
<!--owl carousal-->
<!-- Set up your HTML -->
<div class="owl-carousel-two owl-carousel owl-theme">

    <c:forEach items="${response.data.topTenPostList}" var="post">

        <div>
            <a href="#">
                <div class="card">
                    <div class="card-body">
                        <div class="post-title">
                            <h5 class="card-title">${post.mainHeader}</h5>
                        </div>
                        <div class="post-paragraph">
                                Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece
                                of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock,
                                a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure
                                Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word
                                in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections
                                1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by
                                Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular
                                during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes
                                from a line in section 1.10.32.

                                The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those
                                interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero
                                are also reproduced in their exact original form, accompanied by English versions from the
                                1914 translation by H. Rackham.
                                    <%--${post.content}--%>

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