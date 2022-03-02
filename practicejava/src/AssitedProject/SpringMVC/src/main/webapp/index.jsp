<%@page import="com.student.Student"%>
<html>
<body>

<%Student stu=(Student)request.getAttribute("raise"); %>  
<table border=10>
<tr>
<td><%=stu.getSname() %> </td>
<td><%=stu.getSid() %> </td>   
<td><%=stu.getScity() %> </td> 
</tr>
</table>
</body>
</html>
