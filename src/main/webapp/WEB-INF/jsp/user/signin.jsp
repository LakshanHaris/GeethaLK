
<%--<form action="../user/signIn" method="post">--%>
    <%--Password: <input type="password" name="password"><br>--%>
    <%--E-mail: <input type="text" name="email"><br>--%>
    <%--&lt;%&ndash;user name: <input type="text" name="userName"><br>--%>
    <%--first name: <input type="text" name="firstName"><br>--%>
    <%--last name: <input type="text" name="lastName"><br>--%>
    <%--dob: <input type="date" name="dob"><br>--%>
    <%--gender: <input type="text" name="gender"><br>--%>
    <%--mobile: <input type="text" name="mobile"><br>--%>
    <%--role: <input type="text" name="role"><br>&ndash;%&gt;--%>
    <%--<input type="submit">--%>
<%--</form>--%>

<%--<c:if test="${errorResponse.message!=null}">--%>
    <%--<label>${errorResponse.message}</label>--%>
<%--</c:if>--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/signin.css">
</head>
<body>
<div class="container">
    <%--MAIN NAVBAR SHOULD BE HERE--%>

    <form class="form-signin">
        <!--<img class="mb-4" src="" alt="" width="72" height="72">-->
        <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <div id="sign_up_label">
            Don't have a account?
        </div>
        <div id="sign_up_link">
            <a  href="#">Sign Up</a>
        </div>

        <!--<p class="mt-5 mb-3 text-muted">&copy; 2017-{{ site.time | date: "%Y" }}</p>-->
    </form>


</div>

</body>
</html>