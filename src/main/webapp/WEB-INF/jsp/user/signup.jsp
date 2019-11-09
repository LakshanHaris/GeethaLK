<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/signup.css">
</head>
<body>
<div class="container">
    <%--MAIN NAV BAR SHOULD BE HERE--%>

    <form class="form-signin">
        <!--<img class="mb-4" src="" alt="" width="72" height="72">-->
        <h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>
        <label for="inputFname">First Name</label>
        <input type="text" id="inputFname" class="form-control" placeholder="First Name" required autofocus>
        <label for="inputLname">Last Name</label>
        <input type="text" id="inputLname" class="form-control" placeholder="Last Name" required autofocus>
        <label for="address">Address</label>
        <input type="text" id="address" class="form-control" placeholder="Address" required autofocus>

        <label for="inputEmail">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <label for="inputConfirmPassword">Confirm Password</label>
        <input type="password" id="inputConfirmPassword" class="form-control" placeholder="Confirm Password" required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>

        <!--<p class="mt-5 mb-3 text-muted">&copy; 2017-{{ site.time | date: "%Y" }}</p>-->
    </form>

</div>

</body>
</html>