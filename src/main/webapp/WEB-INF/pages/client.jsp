<%--
  Created by IntelliJ IDEA.
  User: jony
  Date: 17/10/20
  Time: 下午3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设备信息获取测试</title>
    <script src="<%=request.getContextPath()%>/js/client.js" type="text/javascript" language="JavaScript"></script>
    <script src="<%=request.getContextPath()%>/js/jquery-3.2.1.js" type="text/javascript" language="JavaScript"></script>
</head>
<body>
<button type="button" id="getInfo" onclick="getInfo()">获取设备信息</button>
<button type="button" onclick="info2()">显示全部信息</button>

<p id="showInfo">
    设备信息:
</p>

<p id="showInfo2">
    信息2:
</p>


</body>
</html>
