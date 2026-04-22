<html>
<head>
	<title>Greeting Program</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
		String greeting = "";
		
		// get the current hour on the server machine
		java.util.Date date = new java.util.Date();
		int hour = date.getHours();
		
		// set the greeting based on the time of day
		if(hour >= 0 && hour < 12) {
			greeting = "Good morning";
		} else if(hour >= 12 && hour < 18) {
			greeting = "Good afternoon";
		} else {
			greeting = "Good evening";
		}
		
		// display the greeting
		out.println("<h1>" + greeting + ", " + userName + "!</h1>");
	%>
	<form>
		<label for="userName">Enter your name:</label>
		<input type="text" name="userName">
		<input type="submit" value="Submit">
	</form>
</body>
</html>


