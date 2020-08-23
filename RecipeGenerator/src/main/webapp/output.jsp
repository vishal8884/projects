<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    

<html>
<head>
 <link rel="stylesheet" href="https://bootswatch.com/4/yeti/bootstrap.min.css">
    <style>
        
        div.a{text-align: center;}
        body {
  background-color:#DFEEE0;
}
    

.dark-mode {
  background-color: black;
  color: white;
}
    </style>
    
</head>
<body> 

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="index.jsp">Recipe Generator </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      
     
    </form>
  </div>
</nav>






    <div class="a">
        <p style="font-size:45px;">Dear user, You selected the following</p></div>
<div class="a">    
<p style="font-size:30px;">
First Ingredient : ${gs.ingridient1} <br>
Second Ingredient : ${gs.ingridient2}<br>
Third Ingredient : ${gs.ingridient3}<br>
Diet Type : ${gs.diet}<br>
    Cuisine :  ${gs.cuisine }</p></div>
    
    
   
  <div class="a">  
      <p style="font-size:45px;">You can make ${food} </p>
      
    </div>
    <button onclick="myFunction()">Dark Mode</button>

<script>
function myFunction() {
   var element = document.body;
   element.classList.toggle("dark-mode");
}
</script>
</body>  
</html>  