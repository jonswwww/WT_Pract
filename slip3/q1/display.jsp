<%@page language="java"%>
<html>
<head>
    <title>Patient Details</title>
        
</head>
<body>
    <h2>Patient Details</h2>
    <table border=2>
        <tr>
            <th>Patient No</th>
            <th>Patient Name</th>
            <th>Address</th>
            <th>Age</th>
            <th>Disease</th>
        </tr>
        <tr>
            <td><%= request.getParameter("pno") %></td>
            <td><%= request.getParameter("pname") %></td>
            <td><%= request.getParameter("address") %></td>
            <td><%= request.getParameter("age") %></td>
            <td><%= request.getParameter("disease") %></td>
        </tr>
    </table>
    <br>
</body>
</html>
