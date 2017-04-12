
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, Spring</title>
</head>
<body>
    <table>
        <tr>
            <td>title</td>
            <td>"${bean.title}"</td>
        </tr>
        <tr>
            <td>staff</td>
            <td>"${bean.staff}"</td>
        </tr>
        <tr>
            <td>description</td>
            <td>"${bean.description}"</td>
        </tr>
    </table>

</body>
</html>
