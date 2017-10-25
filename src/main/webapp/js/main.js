/**
 * Created by jony on 17/10/25.
 */

$(document).ready(function () {

 //主导航事件
    $(".main_nav_th").click(function () {

        //修改字体样式
        $(".main_nav_th").css({color:"white"});
        $(this).css({color:"darkorange"});

        //隐藏掉所有显示页
        $(".main_detail_item").hide();

        //判断点击项
        if (this.id == "main_nav_item1") {
            // alert("灯光");
            $("#main_detail_item1").show();
        }else if(this.id == "main_nav_item2"){
            $("#main_detail_item2").show();
        }else if(this.id == "main_nav_item3"){
            $("#main_detail_item3").show();
        }
    });

    //初始化点击
    $("#main_nav_item1").click();
});