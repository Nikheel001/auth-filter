<%-- 
    Document   : index
    Created on : 29 Mar, 2017, 4:36:12 PM
    Author     : Nikheel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Users!</h1>
        <form action="NewServlet1" method="post" >
            <center>
            <table border="2">

<tr>
	<td>Username:</td>
	
	<td>
		<input type="text" name="unm"/>
	</td>
	
</tr>
<tr>
	<td>Password:</td>
		
		<td>	
			<input type="password" name="pwd"/>
		</td>
</tr>

<tr>
	<td>
		<input type="submit" name="Login" value="Login"/>
	</td>
	<td>
		<input type="reset" name="Reset" value="Reset"/>
	</td>
</tr>
            
</table>
                </center>
            </form>
    </body>
</html>
