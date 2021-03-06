<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save customer</title>

     <link type="text/css"
           rel="stylesheet"
           href="${pageContext.request.contextPath}/resources/css/style.css">
   
    <link type="text/css"
           rel="stylesheet"
           href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
 
</head>
<body>

<div id="wrapper">
   <div id="header">
   <h2>CRM - Customer Relationship manager</h2>
   </div>
</div>
 
<div id="container">

 <h3>Save Customer</h3>
 
 <form:form action="saveCustomer" modelAttribute="customer" method="POST"> <!-- customer is passed from controller it prepopulates firstname and....all -->
 <!--  need to associate this data with customer id -->
 
 <form:hidden path="id" /> <!-- imp line this gets by customer.getid and on submit customer.setid is done -->
 
  <table>
  
     <tbody>
        <tr>
           <td><label>First name:</label></td>
           <td><form:input path="firstName" /></td>
        </tr>
        <tr>
           <td><label>Last name:</label></td>
           <td><form:input path="lastName" /></td>
        </tr>
        <tr>
           <td><label>Email:</label></td>
           <td><form:input path="email" /></td>
        </tr>
        <tr>
           <td><label></label></td>
           <td><input type="submit" value="save" class="save"/></td>
        </tr>
     </tbody>
  </table>
   
 
 </form:form>
 
 <div style="clear; both;"></div>
 
 <p>
     <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
 </p>

</div>


</body>
</html>