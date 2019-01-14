function delfile(id){
	$.ajax({
		type:"GET",//请求类型
		url:"appController/delImage",//请求的url
		data:{id:id},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			if(data.result == "success"){
				alert("删除成功！");
				$("#uploadfile").show();
				$("#logoFile").html('');
			}else if(data.result == "failed"){
				alert("删除失败！");
			}
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("请求错误！");
		}
	});  
}

$(function(){
    $(".level").change(function(){
        var $nextLevel = $(this).parents(".item").next().children(".col-md-6").children(".level");
        if($(this).attr("name") == "categoryLevel1")
        	$("#categoryLevel3").html("<option value=\"-1\">--请选择--</option>");
        $.ajax({
            type:"GET",//请求类型
            url:"appController/categoryJson",
            data:{parentId:$(this).val()},
            dataType:"json",
            success:function(data){
                if($nextLevel == null || $nextLevel == "" || $nextLevel == undefined) return;
                $nextLevel.html("");
                var options = "<option value=\"-1\">--请选择--</option>";
                for(var i = 0; i < data.length; i++){
                    options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
                }
                $nextLevel.html(options);
            },
            error:function(data){
                alert("加载分类失败！");
            }
        });
    });
	
	$("#back").on("click",function(){
		window.location.href = "appController/getAppList";
	});

	//LOGO图片---------------------
	var logoPicPath = $("#logoPicPath").val();
	var id = $("#id").val();
	if(logoPicPath == null || logoPicPath == "" ){
		$("#uploadfile").show();
	}else{
		$("#logoFile").append("<p><img src=\""+logoPicPath+"?m="+Math.random()+"\" width=\"100px;\"/> &nbsp;&nbsp;"+
							"<a href=\"javascript:;\" onclick=\"delfile('"+id+"');\">删除</a></p>");
		
	}

});
      
      
      