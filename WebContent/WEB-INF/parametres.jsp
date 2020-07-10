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
			<input type="button" value="Retour" onclick="history.go(-1)">
		</form>
	
	</body>

</html>