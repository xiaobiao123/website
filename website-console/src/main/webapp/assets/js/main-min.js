var DS = window.DS ? window.DS : {};

DS.msg = {
	tip: '提示',
	success: '操作成功',
	fail: '操作失败',
	error: '网络错误，请稍后再试！'
},

DS.util = {

	/**
	 * get list页url
	 * 
	 * @param {}
	 * url
	 * refresh
	 */
	hrefHandle: function(url) {
		if (url == "refresh") {
			window.location.reload();
			return;
		}

		if (url) {

			if (url.indexOf(DS.config.path.rootPath) > -1) {
				window.location.href = url;
			} else {
				window.location.href = DS.config.path.rootPath + url;
			}

		} else {
			window.location.href = DS.config.path.rootPath + "/index.htm";
		}
	},

	/*
	 * iframe弹框
	 */
	iframeModal: function(o)  {

		if (o.nodeName == "INPUT") {
			var $obj = $(o).parent().find("a");
		} else if (o.nodeName == 'A' || o.nodeName == 'BUTTON') {
			var $obj = $(o);
		} else {
			return false
		}

		var id = $obj.attr('href') ? $obj.attr('href') : "#modal-table";
		var src = $obj.data('src') ? $obj.data('src') : '';

		$(id).modal();


		if (src) {
			$(id+' .modal-body').html('');
			// var iframe = new Iframe;

			var width = $obj.data("width") ? $obj.data("width") : '800px';
			var height = $obj.data("height") ? $obj.data("height") : 'auto';
			$(id).find('.modal-dialog').css({'width':width, 'height':height})

			var $iframe = $('<iframe frameborder="no" class="loading" src='+src+' border="0" width="100%" height="400px">');
			$iframe.appendTo($(id+' .modal-body'));

			$iframe.load(function() {
				$(this).removeClass('loading');
			});
		}



		var title = $obj.data("title") ? $obj.data("title") : '请选择';
		$(id).find(".table-header b").html(title);
	},


	//查看、修改、删除
	tableBtnOpt: function(id, opt, isAjax, tip) {
		var url = window.location.pathname;
		var gotourl;
		if (typeof opt == 'string') {
			opt = [opt];
		}
		if(opt[1]) {
			gotourl = url.replace(opt[1], opt[0]);
		} else {
			gotourl = url + "/" + opt[0];
		}
		if(id) {
			gotourl = gotourl + "/" + id;
		}
		gotourl = gotourl.replace("//", "/");

		if(isAjax){
			bootbox.confirm(tip, function(result) {

				if(result) {

					$.ajax({
						type: "GET",
						url: gotourl,
						success: function(res){
							if(res.code == 0){
								location.href=window.location.href;
								return false;
							}else{
								if(res.msg){
									bootbox.alert(res.msg);
								}
							}
						},
						dataType: "json"
					});
				}

			});
		}else{
			location.href=gotourl;
			return false;
		}
	},


	//TODO jquery ui 
	// alertDialog: function (msg,fun) {
	// 	var alertDialog = $(msg).dialog({
	// 		autoOpen : false,
	// 		modal: true,
	// 		title: "<div class='widget-header widget-header-small'>"+DS.msg.tip+"</div>",
	// 		title_html: true,
	// 		show: true,
	// 		moveToTop: true,
	// 		buttons: [ 
	// 			{
	// 				text: "确认",
	// 				"class" : "btn btn-primary btn-xs",
	// 				click: function() {
	// 					if ($.isFunction(fun)) {
	// 						fun.call(this);
	// 					}
	// 					$( this ).dialog( "close" ); 
	// 				}
	// 			}
	// 		]
	// 	});

	// 	return alertDialog;
	// },

	/* 全选时返回选中id
	 * param table 要操作的表
	 * return String （逗号分割）
	 */
	checkAllData: function(table, other) {
		var data = [];
		
		if (typeof other == 'string') other = [other];
		var i = 0;

		table.find('tbody tr').each(function() {
			var _this = $(this);
			if ($('.J_SelectSub', this).prop('checked') == false) {
				return true;
			}

			// data[i] = data[i] ? data[i] : [];
			data[i] = [];
			var _id = _this.attr('data-id');
			if (_id) data[i].push(_id);

			if (other != undefined && other.length) {

				for (var j = 0; j<other.length; j++) {

					var _d = _this.find('td['+other[j]+']').attr(other[j]);
					if (_d) data[i].push(_d);
				}
			}
			i++
		});

		return data;
	}



};


//override dialog's title function to allow for HTML titles
if ($.ui != undefined) {
	$.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
		_title: function(title) {
			var $title = this.options.title || '&nbsp;'
			if( ("title_html" in this.options) && this.options.title_html == true )
				title.html($title);
			else title.text($title);
		}
	}));
}



(function($){

	//价格正则
	$(document).on('keyup', '.J_Price', function() {
		if (!(/^([1-9][0-9]*|0)(\.[0-9]*)?$/.test(this.value))) {
			this.value = this.value ? this.value.substr(0,(this.value.length-1)) : "";
		} 
	});

	//库存正则
	$(document).on('keyup', '.J_Stock', function() {
		if (!(/^\d*$/.test(this.value))) {
			this.value = this.value ? this.value.substr(0,(this.value.length-1)) : "";
		} 
	});

	$(".J_Table").on('click', function(e) {
		var obj = e.target,btn;
		var $tr = $(obj).closest('tr');

		if (obj.nodeName == "BUTTON") {
			btn = obj;
		} else if (obj.parentNode.nodeName == "BUTTON") {
			btn = obj.parentNode;
		}

		if (btn) {
			var id =  $tr.attr('data-id');
			var href = $(btn).attr('data-href');
			var isAjax = $(btn).attr('data-isAjax') ? $(btn).attr('data-isAjax'): 0;
			var tip = $(btn).attr('data-tip') ? $(btn).attr('data-tip'): '';
			if (id && href) {
				DS.util.tableBtnOpt(id, href, isAjax, tip);
			}
		}
	});

	//表格删除行
	$(".table").on('click', '.J_BtnTabDel', function() {
	  var _this = $(this);

	  bootbox.confirm("确定要删除这条数据吗？", function(result) {
	    if(result) {
	      var deletehref = _this.attr("data-href");
	      if(deletehref){
	    	  $.ajax({
		  		   type: "GET",
		  		   url: deletehref,
		  		   dataType: "json",
		  		   success: function(data){
		  		     if(data) {
		  		    	 bootbox.alert("已经删除");
		  		    	_this.parent().parent().remove();
		  		     } else {
		  		    	bootbox.alert("删除失败");
		  		     }
		  		   },
		  		});
	      }else{
	    	  _this.parent().parent().remove();
	      }
	    }
	  });
	});


	//表格操作：全选
	$(".J_SelectAll").on("change", function(){
		var table = $(this).closest('.J_Table');
		if ($(this).prop("checked")) {
			table.find(".J_SelectSub").prop("checked", true);
		} else {
			table.find(".J_SelectSub").prop("checked", false);
		}
	});

	//提交按钮
	$('.J_LoadingBtn').on('click', function () {
		var btn = $(this);
		btn.button('loading')
		setTimeout(function () {
			btn.button('reset');
		}, 2000);
	});



	// 所属分类弹框
	$(".J_IframeInput").focus(function() {
		DS.util.iframeModal(this);
	});


	$(".J_IframeA").focus(function(){
		$("#modal-table").modal();
		var title = $(this).data("title");
		if (title) {
			$("#modal-table").find(".table-header p").html(title)
		}
	});

	//首页欢迎alert
	if (ace.data.get("indexAlert")==1) {
		$("#J_IndexAlert").remove();
	}
	$("#J_IndexAlert .icon-remove").click(function(){
		$("#J_IndexAlert").remove();			
		ace.data.set("indexAlert",1);
	});


	var defaultrule = {

			errorElement: 'div',
			errorClass: 'help-block',
			focusInvalid: false,

			success: function (e) {
				// $(e).closest('.row').removeClass('has-error').addClass('has-info');
				// $(e).remove();

				$(e).closest('.form-group').removeClass('has-error').addClass('has-info');
				$(e).remove();

			},
			
			invalidHandler: function (event, validator) { //display error alert on form submit   
				$('.alert-danger', $('.login-form')).show();
			},
			highlight: function (e) {
				$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
			},
			submitHandler: function (form) {
			},
		   /* 错误信息的显示位置 */
		   errorPlacement: function(error, element) {
			 //   	var tmp = error[0].outerHTML;
				// if ( $('.J_ErrorBox').length==0) {
				// 	 $('<div class="form-group"><div class="col-xs-12 col-sm-12"><div class="row"><label for="form-field-2" class="J_ErrorBox col-sm-2 control-label wsnw"></label><div class="col-sm-6"></div></div></div></div>').insertBefore($(".form-actions"));
				// }
				// $('.J_ErrorBox').append(tmp);

				if(element.is(':checkbox') || element.is(':radio')) {
					var controls = element.closest('div[class*="col-"]');
					if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
					else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
				}
				else if(element.is('.select2')) {
					error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
				}
				else if(element.is('.chosen-select')) {
					error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
				}
				else error.insertAfter(element.parent());
		   },
			
	};

	if ($.validator)
		$.validator.setDefaults(defaultrule);


})(jQuery);



$(function(){
	if ($('#tarea').length == 0) return;
	xheditorImgUpload('tarea');
	xheditorImgUpload('recruitContext', 'book', {width:695, height:837});
	//activate per 5 mins
	setInterval(function(){
		$.get(siteUrl+"/common/active.htm");
	}, 300 * 1000);
});
					
function flashCall(){
	if(fls.f)return;
	else {
		//if(!confirm("只有安装flash插件,才能提供本地上传功能，确定安装该插件吗?"))return;
		//$("#_object",$("#mydiv")).remove();
		//var HTML ='<object width="0" height="0" type="application/x-shockwave-flash"'+
		//		'codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7"'+
		//      	'classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="_object">'+
		//      	'<param value="movie" name="${request.contextPath}/js/jquery/swfupload/swfupload.swf">'+
		//		'<param value="opaque" name="wmode">'+
		//		'<param value="always" name="allowscriptaccess">'+
		//		'<param value="adlink=&amp;_did=2856483" name="flashvars">'+
		//		'<embed width="0" height="0" flashvars="adlink=&amp;_did=2856483"'+
		//		'allowscriptaccess="always" wmode="opaque" type="application/x-shockwave-flash"'+
		//		'pluginspage="http://www.macromedia.com/go/getflashplayer" quality="High"'+
		//		'src="${request.contextPath}/js/jquery/swfupload/swfupload.swf" id="17948_swf" >'+
		//		'</object>';
		// $("#mydiv").append(HTML);
	}
}		

/*时间格式化*/
Date.prototype.Format = function (fmt) {
	var o = {
			"M+": this.getMonth() + 1, //月份 
			"d+": this.getDate(), //日 
			"h+": this.getHours(), //小时 
			"m+": this.getMinutes(), //分 
			"s+": this.getSeconds(), //秒 
			"q+": Math.floor((this.getMonth() + 3) / 3), //季度 
			"S": this.getMilliseconds() //毫秒 
	};
	if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for (var k in o)
	if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	return fmt;
}
