$("#signUpBtn").onclick(function(){
    console.log("inside sign in btn");
    $("#signInForm").attr('hidden','true');
    $("#signUpForm").attr('hidden','false');

});

$("#registerBtn").onclick(function(){
    console.log("inside sign up btn");
    $("#signInForm").show();
    $("#signUpForm").hide();
});