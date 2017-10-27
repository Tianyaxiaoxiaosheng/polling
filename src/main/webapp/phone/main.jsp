<%--
  Created by IntelliJ IDEA.
  User: jony
  Date: 17/10/24
  Time: 上午10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--适应手机--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>手机控制终端</title>

        <%--网站的名字是polling，而第一个“/”表示是直接从根目录开始的--%>
    <link rel="stylesheet" href="/polling/css/main_phone.css" type="text/css">
    <script src="/polling/js/jquery-3.2.1.js" type="text/javascript" language="JavaScript"></script>
    <script src="/polling/js/main.js" type="text/javascript" language="JavaScript"></script>

</head>
<body>

<%--主显示区--%>
<div class="main_detail">

    <%--灯光界面--%>
    <div class="main_detail_item" id="lights">

        <%--灯光导航--%>
        <div class="detail_nav" id="lights_nav">

            <div class="detail_nav_item">
                <p class="detail_nav_item_zh">中文</p>
                <p class="detail_nav_item_en">English</p>

            </div>
        </div>

        <%--灯光显示--%>
        <div class="detail_show" id="lights_show">

            <div class="detail_show_item" id="detail_show_temp">

            </div>
        </div>

    </div>

     <%--空调界面--%>
     <div class="main_detail_item" id="aircon">空调</div>

        <%--服务界面--%>
     <div class="main_detail_item" id="service">服务</div>

</div>

<%--主导航区--%>
<div class="main_nav">
    <table class="main_nav_table">
        <tr class="main_nav_tr">
            <td class="main_nav_th" id="main_nav_item1">
                <p class="main_nav_item_zh">灯光</p>
                <p class="main_nav_item_en">LIGHTS</p>
            </td>
            <td class="main_nav_th" id="main_nav_item2">空调<br/>AIRCON</td>
            <td class="main_nav_th" id="main_nav_item3">服务<br/>SERVICE</td>
        </tr>
    </table>
</div>

</body>
</html>
