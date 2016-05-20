$(function(){
	
	
	$( "#J_Import" ).on('click', function(e) {
		e.preventDefault();

		var dialog = $( "#dialog-import" ).removeClass('hide').dialog({
			modal: true,
			title: "导入发货信息",
			title_html: true,
			width: 380,
			buttons: [ 
				{
					text: "导入",
					"class" : "btn btn-primary btn-xs",
					click: function() {
						var formId = "#importForm";
						
						var options = {
								url : $(formId).attr("action"),
								type : 'POST',
								dataType : 'JSON',
								success: function(res){
									 if(res.successFlag){
										var msg = res.msg ? res.msg : DS.msg.success;
										alertify.alert(msg,  function () {
											window.location.reload();
										});
									 } else {
										var msg = res.msg ? res.msg : res.errorMsg;
										alertify.alert(msg);
									 }
							    }
							}; 
							$(formId).ajaxSubmit(options);
						
						
					}
				},
				{
					text: "取消",
					"class" : "btn btn-xs",
					click: function() {
						$( this ).dialog( "close" ); 
					} 
				}
			]
		});

	});
	
	
		$("#J_Export").on('click', function(e){
		   var actionurl = $("#searchForm").attr("action");
		   $("#searchForm").attr("action", "export.htm");
		   $("#searchForm").attr("target", "_blank");
		   $("#searchForm").submit();
		   $("#searchForm").attr("action", actionurl);
		   $("#searchForm").attr("target", "");
		});
	
	    /**
	     * 创建对话框
	     */
	    function createDialog(dialogId, title, formId, width) {
			//e.preventDefault();
	    	var initWidth =  width ?  width : 400;
			var dialog = $(dialogId).removeClass('hide').dialog({
				modal: true,
				title: "<div class='widget-header widget-header-small'>"+title+"</div>",
				title_html: true,
				width:initWidth,
				buttons: [ 
					{
						text: "确认",
						"class" : "btn btn-primary btn-xs",
						click: function() {
							
							  //验证逻辑 
							  if(!$(formId).valid()){
							     return;
							  }
							  var jsonData = $(formId).serializeArray();
							
							
							$.ajax({
								 dataType: "json",
								 type: "POST",
								 url: $(formId).attr("action"),
								 data: jsonData,
								 success: function(res){
										 if(res.successFlag){
											var msg = res.msg ? res.msg : DS.msg.success;
											alertify.alert(msg,  function () {
												window.location.reload();
											});
										 } else {
											var msg = res.errorMsg ? res.errorMsg : DS.msg.fail;
											alertify.alert(msg);
										 }
								 },
								 error: function() {
									alertify.alert(DS.msg.error);
								 }
							});
						}
					},
					{
						text: "取消",
						"class" : "btn btn-xs",
						click: function() {
							$( this ).dialog( "close" ); 
						} 
					}
				]
			});
	    	
	    	
	    }
	
	
	
	
	    //发货逻辑
		$("#sendForm").validate({
				rules : {
					LogisticeCompanyCode : {
						required : true
					},
					outSid : {
						required : true
					}
				},
				messages: {
				}
			});
      
		
		  $("#companyCode").change(function(){
			  
			  if ($(this).val() == 'no') {
				  $("#outSidDiv").hide();
			  } else {
				  $("#outSidDiv").show();
			  }
			  
		  });
			//发货
			$( "#J_Deliver" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-deliver", "选择物流公司", "#sendForm");
			});


			// 电话号码验证
			jQuery.validator.addMethod("mobileANdphone", function(value, element) {
				var phoneValue = $("input[name='receiverPhone']").val();
				var mobileValue = $("input[name='receiverMobile']").val();
				return $.trim(phoneValue).length > 0 || $.trim(mobileValue).length > 0;
				
			}, "手机号码或电话号码必须有输入一个");
			
			
			//地址验证逻辑
			$("#addressForm").validate({
					rules : {
						receiverName : {
							required : true
						},
						receiverPhone : {
							mobileANdphone : true,
							phone : true
						},
						receiverMobile : {
							mobileANdphone : true,
							mobile : true
						},
			
						receiverState : {
							required : true
						},

						receiverCity : {
							required : true
						},

						receiverDistrict : {
							required : true
						},

						receiverAddress : {
							required : true
						},
						receiverZip : {
							required : true,
							zipCode:true
						}
					},
					messages: {
					}
				});



			//修改地址
			$( "#J_ChangeAddr" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-addr", "修改收货地址", "#addressForm", 500);
			});


			
			$("#exceptionForm").validate({
				rules : {
					memo : {
						required : true
					}
				},
				messages: {
				}
			});
			
			$( ".J_Exception" ).on('click', function(e) {
				e.preventDefault();
				 $("#exceptionFlag").val($(this).attr("flag"));
				createDialog("#dialog-exception", $(this).attr("title"), "#exceptionForm");
			});
			
			
			$("#closeForm").validate({
				rules : {
					reason : {
						required : true
					}
				},
				messages: {
				}
			});
			
			$( "#J_Close" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-close", "关闭交易", "#closeForm");
			});
			
			
			
			$( "#J_Audit" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-audit", "审单", "#auditForm");
			});
			
			
			$( "#J_Memo" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-memo", "备注 ", "#memoForm");
			});
			
			$( "#J_Dept" ).on('click', function(e) {
				e.preventDefault();
				createDialog("#dialog-dept", "更改归属 ", "#deptForm");
			});
			
			
			
			
			$("#J_SysTrade").on('click', function(e){
				
				
				var innerTid = $("#innerTid").val();
				jsonData = {
					innerTid:innerTid
				}
				$.ajax({
					   dataType: "json",
					   type: "GET",
					   url: "doSyn.htm",
					   data: jsonData,
					   success: function(res){
							 if(res.successFlag){
								var msg = res.msg ? res.msg : DS.msg.success;
								alertify.alert(msg,  function () {
									window.location.reload();
								});
							 } else {
								var msg = res.msg ? res.msg : DS.msg.fail;
								alertify.alert(msg);
							 }
						 },
						 error: function() {
							alertify.alert(DS.msg.error);
						 }
					});
				
			});


})
       