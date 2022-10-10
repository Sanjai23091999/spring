<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table border="2" width="70%" cellpadding="2">
<tr>
<th>Date of Join</th>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
</tr>
   <tr>

        <td>${trainee.employeeId}</td>
        <td>${trainee.employeeName}</td>
         <td>${trainee.employeeEmail}</td>
         <td>${trainee.employeeMobileNumber}</td>
         <td>${trainee.employeeDateOfJoin}</td>

   </tr>

   </table>
   <tr>
       <td><a href="start">Home</a>
       </td>
   </tr>