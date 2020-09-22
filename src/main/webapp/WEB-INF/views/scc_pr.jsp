<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
    <title>Board</title>
</head>

<body>

<table border="1">
    <tr>
        <th align="center" width="80">name</th>
        <th align="center" width="320">grade</th>
        <th align="center" width="100">address</th>

    </tr>


            <c:forEach items="${list}" var="scc">
                <tr>
                    <td align="center">${scc.scc_name}</td>
                    <td align="center">${scc.scc_grade}</td>
                    <td align="center">${scc.scc_address}</td>
                </tr>
            </c:forEach>

</table>

</body>
</html>
