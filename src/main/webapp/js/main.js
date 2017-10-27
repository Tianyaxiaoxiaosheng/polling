/**
 * Created by jony on 17/10/25.
 */

$(document).ready(function () {

 //主导航事件
    addMainNavigationEvent();

});

//主页面导航
function addMainNavigationEvent() {
    $(".main_nav_th").click(function () {

        //修改字体样式
        $(".main_nav_th").css({color:"white"});
        $(this).css({color:"darkorange"});

        //隐藏掉所有显示页
        $(".main_detail_item").hide();

        //判断点击项
        if (this.id == "main_nav_item1") {
            // alert("灯光");
            $("#lights").show();
        }else if(this.id == "main_nav_item2"){
            $("#aircon").show();
        }else if(this.id == "main_nav_item3"){
            $("#service").show();
        }
    });

    //初始化点击
    $("#main_nav_item1").click();
}

$("#lights").ready(function () {
    // $("#lights").children("div.detail_nav").children("div:first-child").click(function () {
    //     alert("123");
    // });
    // $("#lights").children("div.detail_nav:first-child").click(function () {
    //     alert("123");
    // });

    var detail_nav_temp = $("#lights").children("div.detail_nav").children("div");
    detail_nav_temp.hide();

    var detail_nav = $("#lights").children("div.detail_nav");

    for (var i = 0; i < 3; i++){
        var clone_temp = detail_nav_temp.clone();
        clone_temp.show();
        detail_nav.append(clone_temp);
    }

    $("div.detail_nav_item").click(function () {
        $(this).addClass("active");
        alert("1");
    });


    // $("#lights").children("div.detail_nav").add

});

$("#aircon").ready(function () {

});

$("#service").ready(function () {

});
