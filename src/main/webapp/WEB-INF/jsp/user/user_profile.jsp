<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>This is under developing - A dummy page for user's profile</h1>
<br>
<p>Response success or failed : <b>${response.successOrFail}</b></p>
<p>Message from the server : <b>${response.message}</b></p>

<p>User name : <b>${response.data.userDTO.userName}</b></p>
Privileges granted :<br>
<c:forEach items="${response.data.userPrivilegesMap}" var="privilege">
    <b>${privilege.value}</b><br>
</c:forEach>

<p>This text comes from session : <b>${userData.email}</b> is the user's email.</p>
<label>Happy coding with JCode- Geetha!</label>