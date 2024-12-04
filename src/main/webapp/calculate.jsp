<%--
  Created by IntelliJ IDEA.
  User: ThinkpadX1
  Date: 12/4/2024
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="calculate"method="post">
    <%--@declare id="firstoperand"--%><%--@declare id="operator"--%><%--@declare id="secondoperand"--%><label for="firstOperand">First operand : </label>
    <input type="text" id="firstOperand" name="firstOperand" required><br><br>

    <label for="operator">Operator : </label>
    <select id="operator" name="operator">
        <option value="add">Addition</option>
        <option value="subtract">Subtraction</option>
        <option value="multiply">Multiplication</option>
        <option value="divide">Division</option>
    </select><br><br>

    <label for="secondOperand">Second operand : </label>
    <input type="text" id="secondOperand" name="secondOperand" required><br><br>

    <input type="submit" value="Calculate">
</form>

</body>
</html>
