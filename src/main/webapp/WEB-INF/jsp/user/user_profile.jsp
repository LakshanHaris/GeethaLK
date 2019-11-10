<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<p>${data.user.userName}</p>




<c:forEach items="${data.userPrivilegesMap}" var="privilege">
    Key = ${privilege.key}, value = ${privilege.value}<br>
</c:forEach>

<p>${userData.email}</p>