<html>

<head>
<title>Recipee Generator</title>
    <link rel="stylesheet" href="https://bootswatch.com/4/yeti/bootstrap.min.css">
    
<style>
    body
    {
        background-color:#DFFDFE;
        <b></b>
        
    }
    img
    {
        
  border-radius: 8px;


    }
    th
    {
        font-size: 20px;
    }
    table.maintable
    {
        margin-left: 290px;
       width: 800px;
       
    }
    
    .submit
    {
    margin-top:40px;
    margin-left:600px;
    }
    
    .dark-mode {
  background-color: black;
  color: white;
}
    
    
   
        
</style>
</head>

<body>



 <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Recipe Generator</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
    </ul>
   
  </div>
</nav>   
    
    
    
    <form action="output">
<div class="a1">
    

    

 <table id="maintable" class="maintable">
  <tr class="table-danger">
    <th>Diet Type</th>
    <th>Cuisine</th>
    <th>Select Ingredients</th>
  </tr>
  <tr class="table-active">
            <td>
                
           </td>
           <td>
               <img src="https://static.toiimg.com/thumb/61050397.cms?imgsize=246859&width=800&height=800" alt="Flowers in Chania" width="80px" height="80px"><br>
     <input type="radio" name="cuisine" id="indian" value="indian" >
  <label for="indian">Indian</label> 
      
           </td>
      
      <td>

      
      </td>
    
  </tr>
  <tr class="table-active">
             <td>
                 <img src="https://1.bp.blogspot.com/_EVFeFJfPBBw/TPaWUpTqEoI/AAAAAAAAAi4/8S1CmXHR1Ik/s1600/nonveg.jpg" alt="non veg" width="80px" height="80px"><br>
   <input type="radio" id="Non-Vegetarian" name="diet" value="Non-Vegetarian">
   
                 
  <label for="Non-Vegetarian">Non Vegetarian</label>
                     
            </td>
      <td>
          <img src="https://cdn.vox-cdn.com/thumbor/n-o6I2U_grf0OeAXY00igRIV2vI=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/16182432/mannys_016.jpg" alt="mexican" width="80px" height="80px"><br>
      <input type="radio" id="mexican" name="cuisine" value="mexican" >
  <label for="mexican">Mexican</label> 
      </td>
      <td>
      <label for="ingridient1">Ingredient 1:</label>
  <select name="ingridient1" id="ingridient1">
    <option value="Ajinomoto">Ajinomoto</option>
    <option value="Avacado">Avacado</option>
    <option value="Babycorn">Babycorn</option>
    <option value="Bawn">Bawn</option>
    <option value="Bay Leaf">Bayleaf</option>
    <option value="Beaf">Beaf</option>
    <option value="Beans">Beans</option>
    <option value="Bun">Bun</option>
    <option value="Cake">Cake</option>
    <option value="Capsicum">Capsicum</option>
    <option value="Cayenne">Cayenne</option>
    <option value="Chana">Chana</option>
    <option value="Chicken">Chicken</option>
    <option value="Cilantro">Cilantro</option>  
    <option value="Corn Starch">Corn Starch</option>
    <option value="Crisco">Crisco</option>  
    <option value="Cumin">Cumin</option>  
    <option value="Egg">Egg</option>
    <option value="Feta">Feta</option>    
    <option value="Fish">Fish</option>
    <option value="Flour">Flour</option>
    <option value="Hard Rolls">Hard Rolls</option>  
    <option value="Hazelnuts">Hazelnuts</option>  
    <option value="Hing">Hing</option> 
    <option value="Ketchup">Ketchup</option>  
    <option value="Lentils">Lentils</option>  
    <option value="Maida">Maida</option>
    <option value="Masala">Masala</option>
    <option value="Mayonnaise">Mayonnaise</option>  
    <option value="Methi">Methi</option>  
    <option value="Mushroom">Mushroom</option>  
    <option value="Mutton">Mutton</option>
    <option value="Noo1dles">Noodles</option>  
    <option value="Nutmeg">Nutmeg</option>  
    <option value="Paav">Paav</option>  
    <option value="Paneer">Paneer</option>
    <option value="Pork">Pork</option>  
    <option value="Potato">Potato</option>  
    <option value="Prawn">Prawn</option>
    <option value="Raddish">Raddish</option>
    <option value="Salt">Salt</option>
    <option value="Sauce">Sauce</option>
    <option value="Scallion">Scallion</option>
    <option value="Sesame">Sesame</option>
    <option value="Soy Sauce">Soy Sauce</option>
    <option value="Tamarind">Tamarind</option>
    <option value="Yogurt">Yogurt</option>
  </select>
      
      </td>
    
  </tr>
     
     
     <tr class="table-active">
     <td><img src="https://www.vegetariantimes.com/.image/t_share/MTQ3MDM3MzQ5NjA2MzM2NDA3/zi3000-shutterstock-buddha-bowl.jpg" alt="Flowers in Chania" width="80px" height="80px"><br>
  <input type="radio" id="Vegetarian" name="diet" value="Vegetarian" >
  <label for="Vegetarian">Vegetarian</label></td>
         <td>
             <img src="https://s23209.pcdn.co/wp-content/uploads/2015/12/IMG_0318edit-360x360.jpg" alt="chinese" width="80px" height="80px"><br>
     <input type="radio" id="chinese" name="cuisine" value="chinese" >
  <label for="chinese">Chinese</label> 
     </td>
         <td>
      <label for="ingridient2">Ingredient 2:</label>
  <select name="ingridient2" id="ingridient2">
    <option value="Ajinomoto">Ajinomoto</option>
    <option value="Avacado">Avacado</option>
    <option value="Babycorn">Babycorn</option>
    <option value="Bawn">Bawn</option>
    <option value="Bay Leaf">Bayleaf</option>
    <option value="Beaf">Beaf</option>
    <option value="Beans">Beans</option>
    <option value="Bun">Bun</option>
    <option value="Cake">Cake</option>
    <option value="Capsicum">Capsicum</option>
    <option value="Cayenne">Cayenne</option>
    <option value="Chana">Chana</option>
    <option value="Chicken">Chicken</option>
    <option value="Cilantro">Cilantro</option>  
    <option value="Corn Starch">Corn Starch</option>
    <option value="Crisco">Crisco</option>  
    <option value="Cumin">Cumin</option>  
    <option value="Egg">Egg</option>
    <option value="Feta">Feta</option>    
    <option value="Fish">Fish</option>
    <option value="Flour">Flour</option>
    <option value="Hard Rolls">Hard Rolls</option>  
    <option value="Hazelnuts">Hazelnuts</option>  
    <option value="Hing">Hing</option> 
    <option value="Ketchup">Ketchup</option>  
    <option value="Lentils">Lentils</option>  
    <option value="Maida">Maida</option>
    <option value="Masala">Masala</option>
    <option value="Mayonnaise">Mayonnaise</option>  
    <option value="Methi">Methi</option>  
    <option value="Mushroom">Mushroom</option>  
    <option value="Mutton">Mutton</option>
    <option value="Noo1dles">Noodles</option>  
    <option value="Nutmeg">Nutmeg</option>  
    <option value="Paav">Paav</option>  
    <option value="Paneer">Paneer</option>
    <option value="Pork">Pork</option>  
    <option value="Potato">Potato</option>  
    <option value="Prawn">Prawn</option>
    <option value="Raddish">Raddish</option>
    <option value="Salt">Salt</option>
    <option value="Sauce">Sauce</option>
    <option value="Scallion">Scallion</option>
    <option value="Sesame">Sesame</option>
    <option value="Soy Sauce">Soy Sauce</option>
    <option value="Tamarind">Tamarind</option>
    <option value="Yogurt">Yogurt</option>
  </select>
      
      </td>
     </tr>
     
     <tr class="table-active">
     <td></td>
     <td><img src="https://img.food.boxspace.in/image/rbk_59424a6b1c168/xhdpi.jpg" alt="tandoori" width="80px" height="80px"><br>
         <input type="radio" id="tandoori" name="cuisine" value="tandoori" >
  <label for="tandoori">Tandoori</label> </td> 
         <td>
      <label for="ingridient3">Ingredient 3:</label>
  <select name="ingridient3" id="ingridient3">
    <option value="Ajinomoto">Ajinomoto</option>
    <option value="Avacado">Avacado</option>
    <option value="Babycorn">Babycorn</option>
    <option value="Bawn">Bawn</option>
    <option value="Bay Leaf">Bayleaf</option>
    <option value="Beaf">Beaf</option>
    <option value="Beans">Beans</option>
    <option value="Bun">Bun</option>
    <option value="Cake">Cake</option>
    <option value="Capsicum">Capsicum</option>
    <option value="Cayenne">Cayenne</option>
    <option value="Chana">Chana</option>
    <option value="Chicken">Chicken</option>
    <option value="Cilantro">Cilantro</option>  
    <option value="Corn Starch">Corn Starch</option>
    <option value="Crisco">Crisco</option>  
    <option value="Cumin">Cumin</option>  
    <option value="Egg">Egg</option>
    <option value="Feta">Feta</option>    
    <option value="Fish">Fish</option>
    <option value="Flour">Flour</option>
    <option value="Hard Rolls">Hard Rolls</option>  
    <option value="Hazelnuts">Hazelnuts</option>  
    <option value="Hing">Hing</option> 
    <option value="Ketchup">Ketchup</option>  
    <option value="Lentils">Lentils</option>  
    <option value="Maida">Maida</option>
    <option value="Masala">Masala</option>
    <option value="Mayonnaise">Mayonnaise</option>  
    <option value="Methi">Methi</option>  
    <option value="Mushroom">Mushroom</option>  
    <option value="Mutton">Mutton</option>
    <option value="Noo1dles">Noodles</option>  
    <option value="Nutmeg">Nutmeg</option>  
    <option value="Paav">Paav</option>  
    <option value="Paneer">Paneer</option>
    <option value="Pork">Pork</option>  
    <option value="Potato">Potato</option>  
    <option value="Prawn">Prawn</option>
    <option value="Raddish">Raddish</option>
    <option value="Salt">Salt</option>
    <option value="Sauce">Sauce</option>
    <option value="Scallion">Scallion</option>
    <option value="Sesame">Sesame</option>
    <option value="Soy Sauce">Soy Sauce</option>
    <option value="Tamarind">Tamarind</option>
    <option value="Yogurt">Yogurt</option>
  </select>
      
      </td>
     
     </tr>
     
     <tr class="table-active">
     <td></td>
     <td></td>
     <td>
      
      
      </td>
     
     
</table>    
    
    <div class="submit">
    <input type="submit" name="submit" value="Get Recipe"> 
    </div> 
    
</div>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
</form>
<button onclick="myFunction()">Dark Mode</button>
<script>
function myFunction() {
   var element = document.body;
   element.classList.toggle("dark-mode");
}
</script>
</body>
</html>