
<form action="../user/signIn" method="post">
    Password: <input type="password" name="password"><br>
    E-mail: <input type="text" name="email"><br>
    <%--user name: <input type="text" name="userName"><br>
    first name: <input type="text" name="firstName"><br>
    last name: <input type="text" name="lastName"><br>
    dob: <input type="date" name="dob"><br>
    gender: <input type="text" name="gender"><br>
    mobile: <input type="text" name="mobile"><br>
    role: <input type="text" name="role"><br>--%>
    <input type="submit">
</form>

<c:if test="${errorResponse.message!=null}">
    <label>${errorResponse.message}</label>
</c:if>