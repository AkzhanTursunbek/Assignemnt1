<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><center>Welcome</center> </h1>
<%
    String name = "";
    String ID = "";
    Cookie[] cookiesArray = request.getCookies();
    if(cookiesArray !=null){
        for(Cookie cookie: cookiesArray){
            if(cookie.getName().equals("name")){
                name=cookie.getValue();
            }
            if(cookie.getName().equals("ID")){
                ID=cookie.getValue();
            }
        }
    }
%>
<form action="http://localhost:8080/Assignemnt1_war/hello-servlet" method="post">
    Enter Username: <input type = "text" name = "name" value='<%=name%>'/>
    Enter ID: <input type="number" name = "ID" value=''<%=ID%>'/>
    <input type = "submit" value="Ok">
</form>

</body>
</html>