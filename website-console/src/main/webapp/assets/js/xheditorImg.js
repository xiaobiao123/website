var xhEditorVar;
/**
 * 
 * 给编辑器添加图片上传按钮 调用此JS文件必须先包含xheditor/xheditor-zh-cn.min.js
 * 
 * @param id
 *            编辑器所在的textarea的id
 * @param module
 *            上传的模块名，默认为info
 * @return
 */

function xheditorImgUpload(id, module, setting) {
	if ($("#" + id).length == 0) {
		return;
	}
	var uploadJtext = null;
	if (!module)
		module = "product";
	var allPlugin = {
		uploadImgSWF : {
			c : 'xheIcon xheBtnImg',
			t : '上传图片',
			h : 1,
			e : function() {
				var _this = this;
				if (!uploadJtext) {
					uploadJtext = $('#' + id).prev().find(".swfupload");
				}
				_this.showDialog(uploadJtext);
			}
		}
	};

	// 追加扩展信息
	xhEditorVar = $('#' + id).xheditor(
					$.extend({},{
								tools : 'Cut,Copy,Paste,Pastetext,|,Fontface,FontSize,Bold,Italic,Underline,Strikethrough,|,FontColor,BackColor,Link,Unlink,Img,uploadImgSWF,uploadImgXC,|,Align,Fullscreen,About',
								skin : 'o2007silver',
								internalScript : false,
								inlineScript : false,
								inlineStyle : true,
								width : 600,
								height : 200,
								plugins : allPlugin
							}, setting));
	var xheditorSpan = $(".xhe_o2007silver");
	xheditorSpan.attr("style", "margin-left:5px");
};

function customCallbackForEdit(file, serverData) {
	xhEditorVar.loadBookmark();
	xhEditorVar.pasteHTML("<img src=\"" + serverData.file + "\" _xhe_src=\""
			+ serverData.file + "\" _moz_resizing=\"true\">");

}