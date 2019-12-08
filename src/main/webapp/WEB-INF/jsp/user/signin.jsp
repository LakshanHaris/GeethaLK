<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link href="https://fonts.googleapis.com/css?family=Merriweather&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/signin.css">
    <link rel="stylesheet" href="/css/navbar.css" type="text/css">


</head>
<body>
<div class="container">
    <jsp:include page="../../jsp/common/main_navigation.jsp"/>
    <div class="container_signIn_signUp">
        <div class="sign_in_form_div">
            <form class="form-signin" action="../user/signIn" method="post">
                <img class="geetha_logo" src="/images/Geetha_LOGO.png">
                <b>${response.successOrFail}</b>
                <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
                <label for="inputEmail" class="sr-only">Email address</label>
                <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                <div class="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                    <div class="forgot_password_link">
                        <a href="">Forgot Password</a>
                    </div>
                </div>

                <button class="btn btn-lg btn-primary btn-block form_btn" type="submit">Sign in</button>
                <div id="sign_up_label">
                    Don't have a account?
                </div>
                <div id="sign_up_link">
                    <a id="sign_up_btn" href="#">Sign Up</a>
                </div>
            </form>

        </div>

        <div class="sign_up_form_div">
            <form class="form-signup" action="/saveUser"  method="post" id="signUpForm" onsubmit="return signUpValidations()">
                <!--<img class="mb-4" src="" alt="" width="72" height="72">-->
                <h1 class="h3 mb-3 font-weight-normal">GeethaLK sign up</h1>
                <div class="form-row">
                    <div class="col">
                        <%--<label for="inputUname">Username</label>--%>
                        <input type="text" id="inputUname" name="userName" class="form-control" placeholder="Username" onfocusout="usernameValidation()">
                        <span id="messageUName"></span>
                        <br>
                        <%--<label for="inputFname">First Name</label>--%>
                        <input type="text" id="inputFname" name="firstName" class="form-control"
                               placeholder="First name" onfocusout="fNameValidation()">
                        <span id="messageFName"></span>
                        <br>
                        <%--<label for="inputLname">Last Name</label>--%>
                        <input type="text" id="inputLname" name="lastName" class="form-control" placeholder="Last name" onfocusout="lNameValidation()">
                        <span id="messageLName"></span>
                        <br>
                        <%--<label for="inputEmailSignUp">Email address</label>--%>
                        <input type="email" id="inputEmailSignUp" name="email" class="form-control"
                               placeholder="Email address" onfocusout="eMailValidation()">
                        <span id="messageEMail"></span>
                        <br>
                        <%--<label for="inputDob">Date of birth</label>--%>
                        <input type="date" id="inputDob" name="dob" class="form-control" placeholder="Date of birth" onfocusout="dobValidation()">
                        <span id="messageDOB"></span>
                        <br>
                        <%--<input placeholder="Date of birth" name="dob" class="form-control" type="text"  onblur="(this.type='date')" id="inputDob">--%>
                    </div>
                    <div class="col">
                        <%--<label for="inputPasswordSignUp">Password</label>--%>
                        <input type="password" id="inputPasswordSignUp" name="password" class="form-control"
                               placeholder="Password" onfocusout="passwordValidation()">
                        <span id="messagePassword"></span>
                        <br>
                        <%--<label for="inputConfirmPasswordSignUp">Confirm password</label>--%>
                        <input type="password" id="inputConfirmPasswordSignUp" name="confirmPassword" class="form-control"
                               placeholder="Confirm password" onfocusout="confirmPasswordValidation()">
                        <span id="messageConfirmPassword"></span>
                        <br>
                        <%--<label for="inputMobile">Mobile</label>--%>
                        <input type="text" id="inputMobile" name="mobile" class="form-control" placeholder="Mobile" onfocusout="mobileNoValidation()">
                        <span id="messageMobile"></span>
                        <br>
                        <div class="custom-control custom-radio custom-control-inline" id="inputGender">
                            <input type="radio" id="genderMale" name="gender" class="custom-control-input gender" value="male">
                            <label class="custom-control-label" for="genderMale">Male</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="genderFemale" name="gender" class="custom-control-input gender" value="female">
                            <label class="custom-control-label" for="genderFemale">Female</label>
                        </div>
                        <br>
                        <span id="messageGender"></span>
                        <br>

                        <button class="btn btn-lg btn-primary btn-block form_btn" type="submit" id="registerBtn">Register
                        </button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/signup_validation.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script>
    $(function () {
        $(".sign_up_form_div").hide();
        $("#sign_up_btn").bind("click", function () {
            $(".sign_in_form_div, .sign_up_form_div").hide();
            if ($(this).attr("id") == "sign_up_btn") {
                $(".sign_up_form_div").show();
            }
        });
    });
</script>
</body>
</html>