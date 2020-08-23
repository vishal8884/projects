<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://bootswatch.com/4/yeti/bootstrap.min.css">
    <title>About Recipe Generator</title>
    <style>
        body {
  padding: 25px;
  
    background-color:#DFEEE0;
  color: black;
  font-size: 25px;
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
    
    
    
    
        <p style="font-size:60px;text-align:center;">About Recipe Generator</p>
        

        Do you have only few ingredients at home and do not know what to make?

Recipe Generator is a recipe search engine that finds recipes you can make with the ingredients you currently have at home.<br>

Recipe Generator has indexed hundreds of thousands of recipes, so no matter what ingredients you have, Recipe Generator has you covered.



            Recipe Generator is also a practical way to save money.<br> Take full advantage of ingredients you already have, and naturally buy less groceries.</p>
        <button onclick="myFunction()">Toggle dark mode</button>

<script>
function myFunction() {
   var element = document.body;
   element.classList.toggle("dark-mode");
}
</script>
        
    
</body>
</html>