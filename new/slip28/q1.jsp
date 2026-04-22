<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reverse String</title>
</head>
<body>
    <h1>Reverse String</h1>
    <form method="post">
        <label for="inputString">Enter a string:</label>
        <input type="text" id="inputString" name="inputString">
        <button type="submit">Reverse</button>
    </form>
    
    <%-- Check if form has been submitted --%>
    <% if (request.getMethod().equals("POST")) {
        // Get input string from user
        String inputString = request.getParameter("inputString");
        
        // Reverse the input string
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
    %>
    
    <hr>
    <h2>Result:</h2>
    <p>The reversed string is: <%= reversedString %></p>
    
    <% } // end if %>
</body>
</html>
