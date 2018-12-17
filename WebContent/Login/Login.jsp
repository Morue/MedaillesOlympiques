<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="loginStyle.css">
</head>
<body>

<video id="bgvid" playsinline autoplay muted loop>
<source src="https://media.giphy.com/media/V9e4JFL1Edoqs/giphy.mp4" type="video/mp4">
</video>


	<form name="firstForm" action="../loginServlet"
	style="width:50%;margin:auto;" method="post">
                 
        <h2 style="text-align:center;color:black;">Connectez-vous</h2>
        <p class="pformulaire" style="text-align:center;">Identifiant : <br>
        <input type="text" name="login" /></p>
        <p class="pformulaire" style="text-align:center;">Mot de passe : <br>
        <input type="password" name="pwd" /></p> <br>
             
        <p  style="text-align:center;width:50%;margin:auto;">
        <input class="cta" type="submit" name="Valider" value="Valider"/>
       
        </p>       
    </form>

</body>
</html>