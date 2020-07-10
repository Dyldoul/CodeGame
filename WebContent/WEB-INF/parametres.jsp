<!DOCTYPE html>
<html>

	<head>
	
		<meta charset="UTF-8">
		<title>Options</title>
		
	</head>
	
	<body>
	
		<p><c:out value="La longueur du code secret est de : ${ options.longueurCode }"/></p>
		
		<p><c:out value="Le nombre d'éssais est fixé à : ${ options.nombreEssais }"/></p>
		
		
		<form>
			<input type="button" value="Retour a l'acceuil" onclick=window.location.href="/CodeGame/">
		</form>
	
	</body>

</html>