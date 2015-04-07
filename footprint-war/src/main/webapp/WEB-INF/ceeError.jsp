
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8" />
<title>Erreur interne</title>
<script src="jslib/jquery-1.6.1.min.js" type="text/javascript"></script>
<script src="jslib/jquery-ui-1.8.10.custom.min.js"
	type="text/javascript"></script>


<link rel="stylesheet" href="css/base-style.css" />
<link rel="stylesheet" href="css/privacy.css" />
<link rel="stylesheet" href="css/cloudpro-style.css" />
<link type="text/css" href="css/jquery-ui-1.8.10.custom.css"
	rel="Stylesheet" />
</head>
<body>


	<div class="cp_container">
		<div>
			<div style="margin-right: 0px; float: right;">
				<img src="images/orange_logo_70x70.png" width="70" height="70"
					alt="Orange" />
			</div>
			<h2>
				<span class="grey-bold-title-h2">Contacts Enrichis Subscription </span> 
<!-- 				<span class="grey-bold-title-h2">Info</span> -->
			</h2>
			<hr>
			<br>
		</div>

		<div>
			<h4>Erreur interne</h4>
			<hr class="cp_separator3" />

		
			<div class="cp_mediumbox box">
				
				

	<h5>
	${errorMessage}
	</h5>
				<br />

	
				</div>


			
					
					<span class="border">
						<span class="tl"><!-- --></span>
						<span class="t"><!-- --></span>
						<span class="tr"><!-- --></span>
						<span class="r"><!-- --></span>
						<span class="br"><!-- --></span>
						<span class="b"><!-- --></span>
						<span class="bl"><!-- --></span>
						<span class="l"><!-- --></span>
					</span>
			</div>
		</div>

	</div>
	<hr>
	<br>
	
</body>
</html>