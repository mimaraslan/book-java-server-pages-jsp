<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<title>Registration Form</title>

</head>


<body>
<p align="left"><b>Registration Form</b></p>

<jsp:useBean id="bean" class="asamaliPaketi.DorgulamaSinifi" scope="session"/>

<%
asamaliPaketi.DorgulamaSinifi register=(asamaliPaketi.DorgulamaSinifi)session.getAttribute("bean");

%>

<form name="registerationForm" method="POST" action="multipage2.jsp">


<table border="1" width="70%" cellspacing="1" cellpadding="0" id="table1">

<%

    String errors=(String)request.getAttribute("errors");

    if(errors != null && errors.trim().length()>0){

        out.println("<tr><td colspan='2'>The following are the errors with given data<br>"+errors+"</td></tr>");

    }

%>

<tr>

<td width="50%">First Name</td>

<td><input type="text" name="loginName" size="20" value="<%=register.getLoginName()!=null?register.getLoginName():""%>"></td>

</tr>

<tr>

<td width="50%">Last Name</td>

<td><input type="text" name="password" size="20" value="<%=register.getPassword()!=null?register.getPassword():""%>"></td>

</tr>

<tr>

<td width="50%">Introduce Yourself</td>

<td><textarea name="intro" cols="40" rows="10"><%=register.getIntro()!=null?register.getIntro():""%></textarea></td>

</tr>

<tr>

<td width="50%">Gender</td>

<td>



<% if(register.getGender()==null || register.getGender().equals("male")){ %>

<input type="radio" value="male" checked name="gender">male

<input type="radio" name="gender" value="female">female

<%}else{ %>

<input type="radio" value="male" name="gender">male

<input type="radio" name="gender" checked value="female">female

<%} %>

</td>



</tr>



</table>

<p><input type="submit" value="Submit" name="B1"><input type="reset" value="Reset" name="B2"></p>

</form>


</body>


</html>