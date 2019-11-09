<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--<link href="css/bootstrap.css" rel="stylesheet">-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="OwlCarousel2-2.3.4/OwlCarousel2-2.3.4/dist/assets/owl.carousel.css" type="text/css">
    <link rel="stylesheet" href="OwlCarousel2-2.3.4/OwlCarousel2-2.3.4/dist/assets/owl.theme.default.css"
          type="text/css">


    <link rel="stylesheet" href="css/home_page.css" type="text/css">
    <!--<script type="text/javascript" src="js/bootstrap.min.js"></script>-->

</head>

<body>


<div class="container">
    <!--main nav bar-->
    <nav class="navbar navbar-expand-lg navbar-light bg-transparent">
        <a class="navbar-brand" href="#">Geetha LOGO</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Songs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Leaderboard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sign In</a>
                </li>
                <!--Make this visible for logged user-->
                <!--<li class="nav-item dropdown">-->
                <!--<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">-->
                <!--Hi Minindu-->
                <!--</a>-->
                <!--<div class="dropdown-menu" aria-labelledby="navbarDropdown">-->
                <!--<a class="dropdown-item" href="#">Profile</a>-->
                <!--<div class="dropdown-divider"></div>-->
                <!--<a class="dropdown-item" href="#">Logout</a>-->
                <!--</div>-->
                <!--</li>-->
            </ul>
        </div>
    </nav>
</div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <script src="OwlCarousel2-2.3.4/OwlCarousel2-2.3.4/docs/assets/vendors/jquery.min.js" type="text/javascript"></script>
    <script src="OwlCarousel2-2.3.4/OwlCarousel2-2.3.4/dist/owl.carousel.js" type="text/javascript"></script>

<script type="text/javascript">
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
</body>

</html>