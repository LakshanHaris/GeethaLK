<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <%--<link rel="stylesheet" href="/css/signin.css">--%>

</head>
<body>
<div class="container">
    <jsp:include page="../../jsp/common/main_navigation.jsp"/>
</div>
<div class="container container-form">
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


<%--MAIN NAVBAR SHOULD BE HERE--%>
    <%--<form class="form-signin" action="../user/signIn" method="post" id="signInForm">--%>
        <%--<!--<img class="mb-4" src="" alt="" width="72" height="72">-->--%>
        <%--<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>--%>
        <%--<label for="inputEmailSignIn" class="sr-only">Email address</label>--%>
        <%--<input type="email" id="inputEmailSignIn" name="email" class="form-control"--%>
               <%--placeholder="Email address"--%>
               <%--required--%>
               <%--autofocus>--%>
        <%--<label for="inputPasswordSignIn" class="sr-only">Password</label>--%>
        <%--<input type="password" id="inputPasswordSignIn" name="password" class="form-control"--%>
               <%--placeholder="Password"--%>
               <%--required>--%>
        <%--<div class="checkbox mb-3">--%>
            <%--<label>--%>
                <%--<input type="checkbox" name="remember_me" value="remember-me"> Remember me--%>
            <%--</label>--%>
        <%--</div>--%>
        <%--<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>--%>
        <%--<!--<p class="mt-5 mb-3 text-muted">&copy; 2017-{{ site.time | date: "%Y" }}</p>-->--%>
    <%--</form>--%>

    <%--<label>Don't have a account?</label><br>--%>
    <%--<button class="btn btn-lg btn-primary btn-block" id="signUpBtn">Sign up</button>--%>

    <%--<form class="form-signin" action="saveUser" method="post" id="signUpForm" hidden>--%>
        <%--<!--<img class="mb-4" src="" alt="" width="72" height="72">-->--%>
        <%--<h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>--%>
        <%--<label for="inputUname">User Name</label>--%>
        <%--<input type="text" id="inputUname" name="userName" class="form-control" placeholder="User name"--%>
               <%--required--%>
               <%--autofocus>--%>
        <%--<label for="inputFname">First Name</label>--%>
        <%--<input type="text" id="inputFname" name="firstName" class="form-control"--%>
               <%--placeholder="First name" required--%>
               <%--autofocus>--%>
        <%--<label for="inputLname">Last Name</label>--%>
        <%--<input type="text" id="inputLname" name="lastName" class="form-control" placeholder="Last name"--%>
               <%--required--%>
               <%--autofocus>--%>
        <%--<label for="inputEmailSignUp">Email address</label>--%>
        <%--<input type="email" id="inputEmailSignUp" name="" class="form-control"--%>
               <%--placeholder="Email address" required--%>
               <%--autofocus>--%>
        <%--<label for="inputPasswordSignUp">Password</label>--%>
        <%--<input type="password" id="inputPasswordSignUp" name="" class="form-control"--%>
               <%--placeholder="Password"--%>
               <%--required>--%>
        <%--<label for="inputConfirmPasswordSignUp">Confirm password</label>--%>
        <%--<input type="password" id="inputConfirmPasswordSignUp" name="" class="form-control"--%>
               <%--placeholder="Confirm password" required>--%>
        <%--<label for="inputDob">Date of birth</label>--%>
        <%--<input type="date" id="inputDob" name="dob" class="form-control" placeholder="Date of birth"--%>
               <%--required>--%>
        <%--<div class="checkbox mb-3" id="inputGender">--%>
            <%--<label>--%>
                <%--<input type="checkbox" name="gender" value="male"> Male--%>
                <%--<input type="checkbox" name="gender" value="female"> Female--%>
            <%--</label>--%>
        <%--</div>--%>
        <%--<label for="inputMobile">Mobile</label>--%>
        <%--<input type="number" id="inputMobile" name="mobile" class="form-control" placeholder="Mobile"--%>
               <%--required>--%>
        <%--<div id="inputRole">--%>
            <%--<select>--%>
                <%--<option value="1">Admin</option>--%>
                <%--<option value="2">User</option>--%>
                <%--<option value="3">Super Admin</option>--%>
            <%--</select>--%>
        <%--</div>--%>
        <%--<br>--%>
        <%--<button class="btn btn-lg btn-primary btn-block" type="submit" id="registerBtn">Register--%>
        <%--</button>--%>
        <%--<!--<p class="mt-5 mb-3 text-muted">&copy; 2017-{{ site.time | date: "%Y" }}</p>-->--%>
    <%--</form>--%>

</div>
<div>
    <jsp:include page="../../jsp/common/main_footer.jsp"/>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/user.js"></script>
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