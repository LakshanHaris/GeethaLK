function signUpValidations() {

    if (this.usernameValidation() && this.fNameValidation() && this.lNameValidation() && this.eMailValidation() && this.dobValidation() && this.passwordValidation() && this.confirmPasswordValidation() && this.mobileNoValidation() && this.genderValidation()){
        return true
    }
        return false
}



/***
 * function to validate username
 * @returns {boolean}
 */
function usernameValidation() {
    var input= $("#inputUname").val();
    if (!input) {
        $("#messageUName").text("Please enter your username");
        return false
    }
    else{
        $("#messageUName").text("");
        return true
    }
}

/**
 *
 * @returns {boolean}
 */
function fNameValidation() {
    var input= $("#inputFname").val();
    if (!input) {
        $("#messageFName").text("Please enter your first name");
        return false
    }
    else{
        $("#messageFName").text("");
        return true
    }
}

/***
 *
 * @returns {boolean}
 */
function lNameValidation() {
    var input= $("#inputLname").val();
    if (!input) {
        $("#messageLName").text("Please enter your last name");
        return false
    }
    else{
        $("#messageLName").text("");
        return true
    }
}

/***
 *
 * @returns {boolean}
 */
function eMailValidation() {
    var regEx = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    var input= $("#inputEmailSignUp").val();
    if (!input) {
        $("#messageEMail").text("Please enter your e-mail");
        return false
    }
    else if(!regEx.test(String( $("#inputEmailSignUp").val()).toLowerCase())){
        $("#messageEMail").text("Invalid email");
        return false
    }
    else{
        $("#messageEMail").text("");
        return true
    }
}


/***
 *
 * @returns {boolean}
 */
function dobValidation() {
    var input= $("#inputDob").val();
    if (!input) {
        $("#messageDOB").text("Please enter your date of birth");
        return false
    }
    else{
        $("#messageDOB").text("");
        return true
    }
}

/***
 *
 * @returns {boolean}
 */
function passwordValidation() {
    var input= $("#inputPasswordSignUp").val();
    if (!input) {
        $("#messagePassword").text("Please enter your password");
        return false;
    }
    else if ( input.length < 6){
        $("#messagePassword").text("password should have at least 6 characters");
        return false
    }else if(($("#inputPasswordSignUp").val())!=($("#inputConfirmPasswordSignUp").val())){
        $("#messagePassword").text("confirm password does not match");
    }
    else{
        $("#messagePassword").text("");
        return true;
    }
}

/***
 *
 * @returns {boolean}
 */
function confirmPasswordValidation() {
    var input= $("#inputConfirmPasswordSignUp").val();
    if (!input) {
        $("#messageConfirmPassword").text("Please confirm your password");
        return false
    }
    else{
        $("#messageConfirmPassword").text("");
        return true
    }
}

/***
 *
 * @returns {boolean}
 */
function mobileNoValidation() {
    var input= $("#inputMobile").val();
    if (!input) {
        $("#messageMobile").text("Please enter your mobile number");
        return false
    }else if (isNaN(input)){
        $("#messageMobile").text("invalid mobile number");
        return false
    } else if(input.length != 10){
        $("#messageMobile").text("Invalid mobile number");
        return false
    }
    else{
        $("#messageMobile").text("");
        return true
    }
}

/***
 *
 * @returns {boolean}
 */
function genderValidation() {
    var inputGender = $('input[name=gender]:checked').val();
    if (!inputGender) {
        $("#messageGender").text("Please enter your gender");
        return false
    }
    else{
        $("#messageGender").text("");
        return true
    }
}