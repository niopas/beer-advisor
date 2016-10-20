<%@ page import="java.util.*" %>

<html>
<body>
    <link rel="stylesheet" type="text/css" href="CSS/resultsStyle.css">
<h1 align="center">We recommend you should...</h1>
<p>

<%
  List<String> styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.println("<br>try: " + it.next());
  }
%>
</p>


</body>
</html>