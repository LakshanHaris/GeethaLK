<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<p>${response.data.user.userName}</p>
<p>${response.message}</p>
<p>${response.successOrFail}</p>




<c:forEach items="${response.data.userPrivilegesMap}" var="privilege">
    Key = ${privilege.key}, value = ${privilege.value}<br>
</c:forEach>

<p>${userData.email}</p>