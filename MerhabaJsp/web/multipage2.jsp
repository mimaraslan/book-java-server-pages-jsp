<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>

</head>


<body>


<p align="left"><b>Registration Form</b></p>

<jsp:useBean id="bean" class="asamaliPaketi.DorgulamaSinifi" scope="session"/>

<jsp:setProperty name="bean" property="loginName"/>

<jsp:setProperty name="bean" property="password"/>

<jsp:setProperty name="bean" property="gender"/>

<jsp:setProperty name="bean" property="intro"/>

<form name="registerationForm" method="POST" action="multipage3.jsp">


<table border="1" width="70%" cellspacing="1" cellpadding="0" id="table1">

<%

asamaliPaketi.DorgulamaSinifi register=(asamaliPaketi.DorgulamaSinifi)session.getAttribute("bean");


String errors=(String)request.getAttribute("errors");

    if(errors != null && errors.trim().length()>0){

    out.println("<tr><td colspan='2'>The following are the errors with given data<br>"+errors+"</td></tr>");

}

%>



<tr>

<td width="50%">Phone</td>

<td><input type="text" name="phone" size="20" value="<%=register.getPhone()!=null?register.getPhone():""%>"></td>

</tr>

<tr>

<td width="50%">Address</td>

<td><input type="text" name="address" size="20" value="<%=register.getAddress()!=null?register.getAddress():""%>"></td>

</tr>

<tr>

<td width="50%">City</td>

<td><input type="text" name="city" size="20" value="<%=register.getCity()!=null?register.getCity():""%>"></td>

</tr>

<tr>

<td width="50%">State</td>

<td><input type="text" name="state" size="20" value="<%=register.getState()!=null?register.getState():""%>"></td>

</tr>

<tr>

<td width="50%">Country</td>

<td><select size="1" name="country">

<option selected value="United Kingdom">United Kingdom</option>

<option value="USA">USA</option>

<option value="other">Other</option>

</select></td>

</tr>

</table>

<p><input type="submit" value="Submit" name="B1"><input type="reset" value="Reset" name="B2"></p>

</form>


</body>


</html>