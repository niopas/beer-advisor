<%@ page import="java.util.*" %>

<html>
    <head>
        <title>Beer Advisor</title>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<body>
    
    <link rel="stylesheet" type="text/css" href="CSS/MainPageStyle.css">
        <h1 align="center">Beer Advisor </h1>
        <div align="right">

        <%
        List<String> info = (List) request.getAttribute("info");
        Iterator it = info.iterator();
        out.print("Welcome,");
        while(it.hasNext()) {
            out.print("<br>" + it.next());
       }
        %>
        </div>
        <form method="POST" action="BeerSelect.do" >
        Select beer
        Type:
        <select name="color" size="1">
            <option value="light">light</option>
            <option value="amber">amber</option>
            <option value="brown">brown</option>
            <option value="dark">dark</option>
        </select>
        <br><br>
        <center>
            <input type="Submit">
        </center>
        </form>

</body>