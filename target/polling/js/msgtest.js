/**
 * Created by jony on 17/10/17.
 */

//记录轮询次数
var count = 0;

//记录轮询开始时间

//轮询标示
var tag;


$(Document).ready(function(){

    $("#start").click(function(){
        tag = $("#tag").val();
        getMsg();
    });

});


function getMsg() {

    count++;
    var currentTime = (new Date()).getTime();

    $.ajax({
        url:"/polling/msg",
        type:"post",
        global:true, //默认值，会触发全局的ajax
        async:true,
        data:{"param":tag},
        success:function(data)
        {
            // if(data != null && data!="")
            //     alertShow(data.msg);

            var intervalTime = (new Date()).getTime() - currentTime;

            $("#dataShow").append("<p>第"+count+"次, data: "+data+",interval time:"+intervalTime+"</p>");
            if (data == "falled"){
                alert("轮询失败，该标识已被使用！");
                return;

            }
            getMsg();
        }
    });
}

$.ajaxError(function () {
    alert("ajax error ！");
});

setInterval()