<%--
  Created by IntelliJ IDEA.
  User: jony
  Date: 17/10/17
  Time: 下午3:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>长轮询测试</title>

    <script src="<%=request.getContextPath()%>/js/jquery-3.2.1.js" type="text/javascript" language="JavaScript"></script>
    <script src="<%=request.getContextPath()%>/js/msgtest.js" type="text/javascript" language="JavaScript"></script>
</head>
<body>

<p>
    长轮询测试页面
</p>

<p>
    <button type="button" id="start">开始轮询</button>
</p>
<p id="dataShow">轮询过程：</p>
</body>
</html>
