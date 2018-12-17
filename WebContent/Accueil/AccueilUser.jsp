<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil User</title>
<link rel="stylesheet" type="text/css" href="accueilStyle.css">
</head>
<body>
<div class="boutondeco"> <a href="../Accueil/Accueil.jsp" class="btn btn-sm animated-button victoria-one">Accueil
</a> </div>

<div class="boutondeco"> <a href="../Accueil/Accueil.jsp" class="btn btn-sm animated-button victoria-one">Déconnection
</a> </div>

<video id="bgvid" playsinline autoplay muted loop>
<source src="https://media.giphy.com/media/bsArWQNLx48mY/giphy.mp4" type="video/mp4">
</video> 


<% String login= (String)session.getAttribute("login");  %>
	<h2>Bienvenue à toi <%= login %> !</h2>



<form name="secondForm" action=""
	style="width:50%;margin:auto;" method="post">  
  
  <h2 style="text-align:center;">Ajouter un athlète</h2>
        <p class="pformulaire" style="text-align:center;">Nom <br>
        <input type="text" name="nom" /></p>

        <p class="pformulaire" style="text-align:center;"> Prénom <br>
        <input type="text" name="prenom" /></p>
        
        <p class="pformulaire" style="text-align:center;">Discipline <br>
        <input type="text" name="discipline" /></p> 
  
  <div style="text-align:center;">
   <label class="pformulaire"   for="utilise">Médaille gagnée </label> <br>
    <select name="medaille" id="utilise" >
   <option value="Or"> Or</option>
   <option value="Argent"> Argent</option>
   <option value="Bronze"> Bronze</option>
   </div>
    
    <p  style="text-align:center;width:50%;margin:auto;">
        <input class="cta" type="submit" name="Ajouter" value="Ajouter"/>
       
        </p>
   
   </select>
</form>
	
</body>
</html>