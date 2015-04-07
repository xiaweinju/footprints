<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8" />
<title>Contacts Enrichis</title>
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
	<script type="text/javascript">
			$(document).ready(function(){
			
				$("#dialog").dialog({autoOpen:false, modal:true, 
					closeOnEscape:false,
					open: function(event, ui) {$(this).parent().children().children('.ui-dialog-titlebar-close').hide(); }});			
				//if the confirmation is set to true, we open the modal
				if (${result == 1}){		
					$("#dialog").dialog('open');
				}			
			});		
			
			$(document).ready(function(){
				
				$("#dialog_error").dialog({autoOpen:false, modal:true, 
					closeOnEscape:false,
					open: function(event, ui) {$(this).parent().children().children('.ui-dialog-titlebar-close').hide(); }});			
				//if the confirmation is set to true, we open the modal
				if (${result == 0}){		
					$("#dialog_error").dialog('open');
				}			
			});
			
			
		function closeWindow() {
			 window.open('','_parent','');
			  window.close();
			}
		
		</script>
		
			<div id="dialog">
				<p>
					Vous avez déjà vous inscrit
					<br/>
						<form:form  method="post">
							<input type="button" onclick="javascript:closeWindow();" value="ok"></input>
						</form:form>
				</p>
			</div>
			
			<div id="dialog_error">
				<p>
					ERROR
					<br/>
						<form:form  method="post">
							<input type="button" onclick="window.close();" value="ok"></input>
						</form:form>
				</p>
			</div>

	<div class="cp_container">
		<div>
			<div style="margin-right: 0px; float: right;">
				<img src="images/orange_logo_70x70.png" width="70" height="70"
					alt="Orange" />
			</div>
			<h2>
				<span class="grey-bold-title-h2">Contacts Enrichis</span> 
<!-- 				<span class="grey-bold-title-h2">Info</span> -->

			</h2>
			<hr>
			<br>
		</div>
<%-- <c:if test="${!empty userName.userName}"> --%>
			<div class="cp_loggedas">
				<p style="text-align: right;">
					Vous êtes identifié en tant que
					<strong>${userName}</strong>.
				</p>
			</div>
		<div>
			<h4>Enrichissement des profils des contacts</h4>
			<hr class="cp_separator3" />

		
	


			
					
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
<%-- 		</c:if> --%>
<%-- 			<c:if test="${empty userName.userName}"> --%>
<!-- 			<div class="cp_notlogged"> -->
<!-- 				<h4>Probl&#232;me d&#39;authentification client</h4> -->
<!-- 				<hr class="cp_separator3" />  -->
				
<!-- 				<p>Vous n&#39;&#234;tes actuellement plus authentifi&#233; sur votre session Orange.</p> -->
<!-- 				<p> -->
<!-- 					Afin de partager vos profils, nous vous invitons à vous r&#233;authentifier  -->
<%-- 					<a href="${command.authenticationFormUrl}" class="arrow-bl"> --%>
<!-- 			        	ici -->
<!-- 			        </a>. -->
<!-- 				</p>  -->
		
<!-- 			</div> -->
<%-- 		</c:if> --%>
	</div>
	<hr>
	<br>
	
</body>
</html>