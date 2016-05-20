(function($){
  //表格操作：全选
  $(".J_SelectAll").on("change", function(){
  	var table = $(this).closest('.J_Table');
    if ($(this).prop("checked")) {
      table.find(".J_SelectSub").prop("checked", true);
    } else {
       table.find(".J_SelectSub").prop("checked", false);
    }
  });

  //提交
  
  $('.J_LoadingBtn').on(ace.click_event, function () {
		var btn = $(this);
		btn.button('loading')
		setTimeout(function () {
			btn.button('reset')
		}, 2000)
	});
})(jQuery);