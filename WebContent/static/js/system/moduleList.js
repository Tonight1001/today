$(document).ready(function() {
    var dataTable = $('#moduleTable').DataTable({
    	ajax:{
    		type:"get",
    		url:basePath + "system/module",
    		dataSrc:"data"
    	},
    	columns:[
    		{"data":"moduleId"},
    		{"data":"moduleName"}
    	],
    	columnDefs:[{
    		"targets": 2,
    		render: function(data,type,row){
    			return "<button class='btn btn-danger delRow'>删除</button>";
    		}
    	}],
    	pageLength:10//设置每页显示的记录数
    	//serverSide:true//服务器端实现分页
    });
    
    
    $('#moduleTable').on("click",".delRow",function(){
    	var row = dataTable.row($(this).closest("tr")).data();
    	alert(row.moduleName);
    	$.ajax({
    		type : 'post',
    		url : basePath + "system/module",
    		data : {_method:"delete", moduleId:row.moduleId},
    		dataType : "json",
    		cache : "false",
    		success : function(data) {
    			alert(data.msg);
    			dataTable.draw();
    		},
    		error : function(err) {
    			alert(err);
    		}
    	});
    });
    
    $("#btn-add").click(function(){
    	$.dialog({
    	    title: '增加模块',
    	    content: 'url:' + basePath + 'system/moduleAdd',
    	    onContentReady: function(){
    	    	$("#btn-save").click(function(){
    	        	//var moduleNameValue = $("input[name='moduleName']").val();
    	    		//[{name:'moduleName',value:'xxx'},{name:'moduleDesc',value:'aaaaa'}]
    	    		var formData = $("#addForm").serializeArray();
    	    		//{moduleName:'xxx',moduleDesc:'aaaa',_method:'put'}
    	    		var param = {};
    	    		formData.forEach(function(e){
    	    			param[e.name] = e.value;
    	    		});
    	    		param['_method'] = 'post';
    	        	
    	        	$.ajax({
    	        		type : 'post',
    	        		url : basePath + "system/module",
    	        		data : param,
    	        		dataType : "json",
    	        		cache : "false",
    	        		success : function(data) {
    	        			alert(data.msg);
    	        			dataTable.draw();
    	        		},
    	        		error : function(err) {
    	        			alert(err);
    	        		}
    	        	});
    	        	
    	        });
    	    }
    	});
    });
    
    
    
});