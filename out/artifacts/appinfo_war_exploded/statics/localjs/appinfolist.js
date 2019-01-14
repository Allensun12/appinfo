$(".level").change(function(){
    var $nextLevel = $(this).parents("li").next().children().children(".col-md-6").children(".level");
    if($(this).attr("name") == "queryCategoryLevel1")
    	$("#queryCategoryLevel3").html("<option value=\"-1\">--请选择--</option>");
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
})

$(".addVersion").on("click",function(){
	var obj = $(this);
	window.location.href="appController/appversionadd/"+obj.attr("appinfoid");
});
$(".modifyVersion").on("click",function(){
	var obj = $(this);
	var status = obj.attr("status");
	var versionid = obj.attr("versionid");
	var appinfoid = obj.attr("appinfoid");
	if(status == "1" || status == "3"){//待审核、审核未通过状态下才可以进行修改操作
		if(versionid == null || versionid == ""){
			alert("该APP应用无版本信息，请先增加版本信息！");
		}else{
			window.location.href="appController/modifyVersion/"+ versionid + "/"+ appinfoid;
		}
	}else{
		alert("该APP应用的状态为：【"+obj.attr("statusname")+"】,不能修改其版本信息，只可进行【新增版本】操作！");
	}
});
$(".modifyAppInfo").on("click",function(){
	var obj = $(this);
	var status = obj.attr("status");
	if(status == "1" || status == "3"){//待审核、审核未通过状态下才可以进行修改操作
		window.location.href="appController/modify/"+ obj.attr("appinfoid");
	}else{
		alert("该APP应用的状态为：【"+obj.attr("statusname")+"】,不能修改！");
	}
});

$(document).on("click",".saleSwichOpen,.saleSwichClose",function(){
	var obj = $(this);
	var appinfoid = obj.attr("appinfoid");
	var saleSwitch = obj.attr("saleSwitch");
	if("open" === saleSwitch){
		saleSwitchAjax(appinfoid,obj);
	}else if("close" === saleSwitch){
		if(confirm("你确定要下架您的APP应用【"+obj.attr("appsoftwarename")+"】吗？")){
			saleSwitchAjax(appinfoid,obj);
		}
	}
});

var saleSwitchAjax = function(appId,obj){
	$.ajax({
		type:"PUT",
		url:"appController/sale/" + appId,
		dataType:"json",
		success:function(data){
            if(data.resultMsg === "success"){//操作成功
                if("open" === obj.attr("saleSwitch")){
                    $("#appInfoStatus" + obj.attr("appinfoid")).html("已上架");
                    obj.className="saleSwichClose";
                    obj.html("下架");
                    obj.attr("saleSwitch","close");
                    $("#appInfoStatus" + obj.attr("appinfoid")).css({
                        'background':'green',
                        'color':'#fff',
                        'padding':'3px',
                        'border-radius':'3px'
                    });
                    $("#appInfoStatus" + obj.attr("appinfoid")).hide();
                    $("#appInfoStatus" + obj.attr("appinfoid")).slideDown(300);
                }else if("close" === obj.attr("saleSwitch")){
                    $("#appInfoStatus" + obj.attr("appinfoid")).html("已下架");
                    obj.className="saleSwichOpem";
                    obj.html("上架");
                    obj.attr("saleSwitch","open");
                    $("#appInfoStatus" + obj.attr("appinfoid")).css({
                        'background':'red',
                        'color':'#fff',
                        'padding':'3px',
                        'border-radius':'3px'
                    });
                    $("#appInfoStatus" + obj.attr("appinfoid")).hide();
                    $("#appInfoStatus" + obj.attr("appinfoid")).slideDown(300);
                }
            }else if(data.resultMsg === "failed"){
                if("open" === obj.attr("saleSwitch")){
                    alert("很抱歉，【"+obj.attr("appsoftwarename")+"】的【上架】操作失败");
                }else if("close" === obj.attr("saleSwitch")){
                    alert("很抱歉，【"+obj.attr("appsoftwarename")+"】的【下架】操作失败");
                }
            }
		},
		error:function(data){
			alert("系统暂时异常，请稍后重试！")
		}
	});
};



$(".viewApp").on("click",function(){
	var obj = $(this);
	window.location.href="appController/appview/"+ obj.attr("appinfoid");
});

$(".deleteApp").on("click",function(){
	var obj = $(this);
	if(confirm("你确定要删除APP应用【"+obj.attr("appsoftwarename")+"】及其所有的版本吗？")){
		$.ajax({
			type:"GET",
			url:"appController/delAppInfo",
			data:{id:obj.attr("appinfoid")},
			dataType:"json",
			success:function(data){
				if(data.delResult == "true"){//删除成功：移除删除行
					alert("删除成功");
					obj.parents("tr").remove();
				}else if(data.delResult == "false"){//删除失败
					alert("对不起，删除AAP应用【"+obj.attr("appsoftwarename")+"】失败");
				}
			},
			error:function(data){
				alert("对不起，删除失败");
			}
		});
	}
});

	
