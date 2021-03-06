<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Geetha</title>
    <link href="https://fonts.googleapis.com/css?family=Merriweather&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/home_page.css" type="text/css">
    <link rel="stylesheet" href="../css/navbar.css" type="text/css">
    <link rel="stylesheet" href="../css/footer.css" type="text/css">
    <link rel="stylesheet" href="../css/carousel_cards/post_carousel_cards.css" type="text/css">
    <link rel="stylesheet" href="../css/carousel_cards/songs_carousel_cards.css" type="text/css">
    <link rel="stylesheet" href="../css/carousel_cards/user_carousel_cards.css" type="text/css">
    <link rel="stylesheet" href="../OwlCarousel2-2.3.4/dist/assets/owl.carousel.css" type="text/css">
    <link rel="stylesheet" href="../OwlCarousel2-2.3.4/dist/assets/owl.theme.default.css"
          type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<%--IMPORT MAIN NAV BAR HERE--%>
<div class="container">
    <jsp:include page="../jsp/common/main_navigation.jsp"/>
</div>

<%--COMMON CSS AND JS WILL BE LOADED THROUHT MAIN NAV FILE--%>

<!--home page main image carousal-->
<div id="owl-carousel-main" class="owl-carousel owl-theme">
    <div class="item"><img src="../images/slider.png"></div>
    <div class="item"><img src="../images/slider.png"></div>
    <div class="item"><img src="../images/slider.png"></div>
</div>
<div class="container">

    <br>
    <jsp:include page="../jsp/common/carousal_cards/top_rated_post_card.jsp"/>

    <br>
    <jsp:include page="../jsp/common/carousal_cards/top_rated_song_card.jsp"/>

    <br>
    <jsp:include page="../jsp/common/carousal_cards/top_rated_writer_card.jsp"/>
    <br><br>

</div>
<jsp:include page="../jsp/common/main_footer.jsp"/>
<script src="../OwlCarousel2-2.3.4/docs/assets/vendors/jquery.min.js" type="text/javascript"></script>
<script src="../OwlCarousel2-2.3.4/dist/owl.carousel.js" type="text/javascript"></script>

<%--Script for main header carousel--%>
<script type="text/javascript">
    var owl_main = $('#owl-carousel-main');
    owl_main.owlCarousel({
        items: 1,
        loop: true,
        margin: 10,
        autoplay: true,
        autoplayTimeout: 4000,
        smartSpeed: 1000,
        autoplayHoverPause: true
    });
    $('.play').on('click', function () {
        owl_main.trigger('play.owl.autoplay', [4000])
    });
    $('.stop').on('click', function () {
        owl_main.trigger('stop.owl.autoplay')
    });
</script>

<script type="text/javascript">
    var owl = $('.owl-carousel-two');
    owl.owlCarousel({
        loop: false,
        nav: false,
        margin: 10,
        responsiveClass: true,
        responsive: {
            0: {
                items: 1,
            },
            600: {
                items: 3,
            },
            1000: {
                items: 4,

    var owl = $('.owl-carousel-two');
    owl.owlCarousel({
        loop: false,
        nav: false,
        margin: 10,
        responsiveClass: true,
        responsive: {
            0: {
                items: 1,
            },
            600: {
                items: 3,
            },
            1000: {
                items: 5,
            }
        }
    });
    // owl.on('mousewheel', '.owl-stage', function (e) {
    //     if (e.deltaY>0) {
    //         owl.trigger('next.owl');
    //     } else {
    //         owl.trigger('prev.owl');
    //     }
    //     e.preventDefault();
    // });

    var owl_main = $('#owl-carousel-main');
    owl_main.owlCarousel({
        items: 1,
        loop: true,
        margin: 10,
        autoplay: true,
        autoplayTimeout: 2000,
        autoplayHoverPause: true
    });
    $('.play').on('click', function () {
        owl_main.trigger('play.owl.autoplay', [1500])
    });
    $('.stop').on('click', function () {
        owl_main.trigger('stop.owl.autoplay')
    });
</script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>