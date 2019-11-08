<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<p>${userDetails.userName}</p>




<c:forEach items="${userPrivileges}" var="privilege">
    Key = ${privilege.key}, value = ${privilege.value}<br>
</c:forEach>

<p>${userData.email}</p>