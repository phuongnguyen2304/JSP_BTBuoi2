<%@ page import="java.util.List" %>
<%@ page import="customer.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ThinkpadX1
  Date: 12/3/2024
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Danh Sách Khách Hàng</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<%!
    private String name;
%><%
    List<Customer> customerList= new ArrayList();


        customerList.add(new Customer("Nguyên Phương","2004-07-23","Hà Nội","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customerList.add(new Customer("Linh","2011-12-27","Hà Nội","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customerList.add(new Customer("Bảo Thiên","2012-12-12","Hà Nội","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customerList.add(new Customer("Hà Quân","1997-09-06","Quốc Oai","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        request.setAttribute("customers1", customerList);
%>
<h2>Danh Sách Khách Hàng</h2>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customers" items="${customers1}">
        <tr>
            <td><c:out value="${customers.name}"/></td>
            <td><c:out value="${customers.address}"/></td>
            <td><C:out value="${customers.birthDate}"/></td>
            <td><img src="<c:out value="${customers.photoURL}"/>" alt="Photo" width="100" height="100"></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
