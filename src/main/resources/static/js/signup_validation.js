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
        $("#messageUName").text("Please Enter Your Username");
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
        $("#messageFName").text("Please Enter Your First Name");
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
        $("#messageLName").text("Please Enter Your Last Name");
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
    checkAvailability();
    if (!input) {
        $("#messageEMail").text("Please Enter Your E-mail");
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
        $("#messageDOB").text("Please Enter Your Date of Birth");
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
        $("#messagePassword").text("Please Enter Your Password");
        return false;
    }
    else if ( input.length < 6){
        $("#messagePassword").text("Password Should Have at Least 6 Characters");
        return false
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
        $("#messageConfirmPassword").text("Please Confirm Your Password");
        return false
    }else if(($("#inputPasswordSignUp").val())!=($("#inputConfirmPasswordSignUp").val())){
        $("#messageConfirmPassword").text("Confirm Password Does Not Match");
    }else{
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
        $("#messageMobile").text("Please Enter Your Mobile Number");
        return false
    }else if (isNaN(input)){
        $("#messageMobile").text("Invalid Mobile Number");
        return false
    } else if(input.length != 10){
        $("#messageMobile").text("Mobile Number Must Have 10 digits");
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
        $("#messageGender").text("Please Enter Your Gender");
        return false
    }
    else{
        $("#messageGender").text("");
        return true
    }
}

function checkAvailability() {
    jQuery.ajax({
        url: "/user/verifyEmail",
        data:'email='+$("#inputEmailSignUp").val(),
        type: "POST",
        dataType: "json",
        success:function(data){
            if (data.successOrFail === "failed") {
                $("#messageEMail").text(data.message);

                return false
            }
            console.log(data.successOrFail);

        },
        error:function (){}
    });
}