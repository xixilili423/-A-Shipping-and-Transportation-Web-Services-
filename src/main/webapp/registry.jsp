<%--
  Created by IntelliJ IDEA.
  User: ojhgg
  Date: 2023/4/29
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        h1 {
            text-align: center;
        }

        form {
            margin: 0 auto;
            width: 300px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .error-message {
            color: red;
        }
    </style>
</head>
<body>
<h1>Login</h1>
<form action="user/registry" method="POST" enctype="application/json">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="Registry">
</form>
<br>
<form action="index.jsp">
    <input type="submit" value="Login">
</form>

<%-- Check for error parameter in URL query string --%>
<% String error = request.getParameter("status_code"); %>
<% if (error != null && error.equals("1")) { %>
<p class="error-message">Invalid username or password. Please try again.</p>
<% } else if (error != null && error.equals("2")) { %>
<p class="error-message">Registration failed. Please try again.</p>
<% } %>
</body>
</html>