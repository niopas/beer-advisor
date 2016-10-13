<%@ page import="java.util.*" %>

<html>
<body>
    <link rel="stylesheet" type="text/css" href="CSS/resultsStyle.css">
<h1 align="center">We reccomend you should...</h1>
<p>

<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>
</p>
</body>
</html>