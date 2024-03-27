<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	$("#stCode").change(function(){
		 alert("hi");
		$.ajax({
		    url : "dist?stCode="+$("#stCode").val(),
		    type: "GET",
		    success: function(data)
		    {
		        console.log(data);
		        $("#d").empty();
		        
		        for(var i=0; i<data.length; i++ ){
		        	$("#d").append("<option value="+data[i].distCode+">"+data[i].distName+"</option>");
		        }
		    },
		    error: function (errorThrown)
		    {
		    	console.log(errorThrown);
		 
		    }
		   });
		 
	});
	
});

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<body>
<f:form action="regist" modelAttribute="tt" method="post">

<table bgcolor="yellow" border="2">
<tr><td>State Name</td>
<td><f:select path="stCode" id="stCode">
<f:option value="0">-Select State-</f:option>

<f:options items="${sttt}" itemValue="stCode" itemLabel="stName"></f:options>

</f:select></td>
<td>District Name</td>
<td><f:select path="distCode" id="d">

</f:select></td>

</tr>

<tr><td>Name</td><td><f:input path="name"/></td>
<td>Phone</td><td><f:input path="phone"/></td>
</tr>
<tr><td>UPLOAD PHOTO</td><td><input type="file" name="abc"></td></tr>
<tr><td><input type="submit" value="SAVE REGISTRATION"></td></tr>

</table>

</f:form>
</body>
</html>