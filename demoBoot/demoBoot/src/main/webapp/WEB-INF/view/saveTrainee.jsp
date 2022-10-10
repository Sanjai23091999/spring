<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html >
<head>
<body>
   <form:form id="saveTraineeForm"  modelAttribute="trainee" action="saveTrainee" >

       <table align="center">

        <tr>
            <td>
                <form:label path="userName">USER NAME</form:label>
            </td>
            <td>
                <form:input path="userName" name="userName" id="userName" />
            </td>
       </tr>
       <tr>
         <td>
             <form:label path="employeeId">EMPLOYEE ID</form:label>
         </td>
          <td>
             <form:input path="employeeId" name="employeeId" id="employeeId" />

          </td>
          </tr>
          <tr>
               <td>
                   <form:label path="employeeName">NAME</form:label>
               </td>
               <td>
                   <form:input path="employeeName" name="employeeName" id="employeeName" />
               </td>
           </tr>

           <tr>
               <td>
                   <form:label path="employeeEmail">E-MAIL</form:label>
               </td>
               <td>
                   <form:input  path="employeeEmail" name="employeeEmail" id="employeeEmail" />
               </td>
           </tr>
           <tr>
               <td>
                   <form:label path="employeeMobileNumber">MOBILE NUMBER</form:label>
               </td>
               <td>
                   <form:input path="employeeMobileNumber" name="employeeMobileNumber" id="employeeMobileNumber" />
               </td>
           </tr>
           <tr>
               <td>
                   <form:label path="employeeDateOfBirth">DATE OF BIRTH</form:label>
               </td>
               <td>

                   <form:input type="date" path="employeeDateOfBirth" name="employeeDateOfBirth" id="employeeDateOfBirth" />

               </td>
           </tr>
           <tr>
                <td>
                    <form:label path="employeeDateOfJoin">DATE OF JOIN</form:label>
                    </td>
                <td>
                     <form:input type="date" path="employeeDateOfJoin" name="employeeDateOfJoin" id="employeeDateOfJoin" />
                </td>
           </tr>

            <tr>
                <td>
                    <form:label path="password">PASSWORD</form:label>
                </td>
                <td>
                    <form:input  path="password" name="password" id="password" />
                </td>
            </tr>

               <td>
                   <form:button id="REGISTER" name="REGISTER">REGISTER</form:button>
               </td>
           </tr>
           <tr></tr>
       </table>
   </form:form>
</body>
</html>