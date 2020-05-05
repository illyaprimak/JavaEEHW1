<%--
  Created by IntelliJ IDEA.
  User: MAX
  Date: 04.01.2020
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title}</title>
    <style>
      form{
        text-align: center;
        margin-top: 350px;
      }
      input{
        margin: 10px;
      }
    </style>
  </head>
  <body>
    ${body}
    <form method="post">
      <input type="text" name="login"  placeholder="login">
      <br>
      <input type="password" name="password" placeholder="password">
      <br>
      <input type="submit" value="Submit">
      <br>
    </form>
  </body>
</html>
