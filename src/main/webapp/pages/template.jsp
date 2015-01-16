<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: somesh.shrivastava
  Date: 15/01/15
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title></title>
</head>
<body>
<div id="banner">
  <tiles:insertAttribute name="header" />
</div>
<div></div>
<tiles:insertAttribute name="navigation_bar" />
<div></div>
<div id="page">
  <tiles:insertAttribute name="content" />
</div>
<div></div>
<div id="footer_wrapper">
  <tiles:insertAttribute name="footer" />
</div>
</body>
</html>
