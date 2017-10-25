/**
 * Created by jony on 17/10/20.
 */
var timecount = 0;
var interval;

$(document).ready(function () {
    // $("p#showInfo").append(navigator.userAgent.toString());
    //
    // $("p#showInfo").append("<p>appVersion: "+navigator.appVersion.toString()+"</p>>");


    var browser={
        versions:function(){
            var u = navigator.userAgent, app = navigator.appVersion;
            return {//移动终端浏览器版本信息
                trident: u.indexOf('Trident') > -1, //IE内核
                presto: u.indexOf('Presto') > -1, //opera内核
                webKit: u.indexOf('AppleWebKit') > -1, //苹果、谷歌内核
                gecko: u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, //火狐内核
                mobile: !!u.match(/AppleWebKit.*Mobile.*/)||u.indexOf('iPad') > -1, //是否为移动终端
                ios: !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios终端
                android: u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, //android终端或者uc浏览器
                iPhone: u.indexOf('iPhone') > -1, //是否为iPhone或者QQHD浏览器
                iPad: u.indexOf('iPad') > -1, //是否iPad
                webApp: u.indexOf('Safari') == -1 //是否web应该程序，没有头部与底部
            };
        }(),
        language:(navigator.browserLanguage || navigator.language).toLowerCase()
    }


    if(browser.versions.mobile==true && browser.versions.iPad==false){
       // interval = setInterval(jumpTimer, 1000*1);
        // alert("手机端");
    }else {
       $("p#timer").append("非手机端");
    }
    interval = setInterval(jumpTimer, 1000*1);

});



function jumpTimer() {
    $("p#timer").append("跳转倒计时："+timecount);
    timecount++;

    if(timecount > 3){
        $(location).attr('href', "http://"+window.location.host+"/polling/phone/main.jsp");
        // alert(window.location.host+"/polling/phone/main.jsp");
        // $(window).attr('location','http://www.jb51.net');
        // $(location).prop('href', 'http://www.jb51.net')

        // 停止setInterval
        clearInterval(interval);
    }
}

//get client infomation
function getInfo() {

    $("p#showInfo").append(navigator.userAgent.toString());

    $("p#showInfo").append("<p>appVersion: "+navigator.appVersion.toString()+"</p>");

    $("p#showInfo").append("<p>platform: "+navigator.platform.toString()+"</p>");

    $("p#showInfo").append("<p>appName: "+navigator.appName.toString()+"</p>");


}


function info2() {

    var browser={
        versions:function(){
            var u = navigator.userAgent, app = navigator.appVersion;
            return {//移动终端浏览器版本信息
                trident: u.indexOf('Trident') > -1, //IE内核
                presto: u.indexOf('Presto') > -1, //opera内核
                webKit: u.indexOf('AppleWebKit') > -1, //苹果、谷歌内核
                gecko: u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, //火狐内核
                mobile: !!u.match(/AppleWebKit.*Mobile.*/)||u.indexOf('iPad') > -1, //是否为移动终端
                ios: !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios终端
                android: u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, //android终端或者uc浏览器
                iPhone: u.indexOf('iPhone') > -1, //是否为iPhone或者QQHD浏览器
                iPad: u.indexOf('iPad') > -1, //是否iPad
                webApp: u.indexOf('Safari') == -1 //是否web应该程序，没有头部与底部
            };
        }(),
        language:(navigator.browserLanguage || navigator.language).toLowerCase()
    }


    $("p#showInfo2").append("语言版本: "+browser.language+"<br/>");
    $("p#showInfo2").append("是否为移动终端: "+browser.versions.mobile+"<br/>");
    $("p#showInfo2").append("ios终端: "+browser.versions.ios+"<br/>");
    $("p#showInfo2").append("android终端: "+browser.versions.android+"<br/>");
    $("p#showInfo2").append("是否为iPhone: "+browser.versions.iPhone+"<br/>");
    $("p#showInfo2").append("是否iPad: "+browser.versions.iPad+"<br/>");
    // document.writeln("语言版本: "+browser.language+"<br/>");
    // document.writeln("是否为移动终端: "+browser.versions.mobile+"<br/>");
    // document.writeln("ios终端: "+browser.versions.ios+"<br/>");
    // document.writeln("android终端: "+browser.versions.android+"<br/>");
    // document.writeln("是否为iPhone: "+browser.versions.iPhone+"<br/>");
    // document.writeln("是否iPad: "+browser.versions.iPad+"<br/>");
    // document.writeln(navigator.userAgent);
}
