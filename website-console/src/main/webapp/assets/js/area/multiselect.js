var MultiSelect	= function(pId,hdId,allData){
	this.pId	= pId;
	this.hdId	= hdId;
	this.all	= allData;
	this.pName  = 'sel_';//默认名
	this.pNames = '';//自定义名称
	this.pLabels  = '';//默认
	this.pStart = 1;//选中开始
	this.pLevel = 3;//深度
	this.pClass = '';//自定义样式
}

MultiSelect.prototype = 
{
	//获取子分类
	getSubCategory:function(ev){
		$(ev.target).nextAll('select').each(function(){
			 $(this).find('option').not(':first').remove();
		});
		
		var id	= $(ev.target).val();
		var cls	= ev.data.cls;
		var select	= $('#'+ev.data.id);
		if(id==0)
		{
			var o	= $(ev.target).prev();
			if(o.is('select'))
			{
				$('#'+cls.hdId).val(o.val());
			}
			else
			{
				$('#'+cls.hdId).val("");
			}
			if (typeof MultiSelectChange!='undefined')MultiSelectChange(cls);
			return;
		}
		
		$('#'+cls.hdId).val(id);
		
		var sId = document.getElementById(ev.data.id);
		if (!sId)return;
		sId.options.length = 1;
		
		for(var i in cls.all)
		{
			if (cls.all[i].pid==id)
			{
				sId.options.add(new Option(cls.all[i].name,cls.all[i].value));
			}
		}
		
		if (typeof MultiSelectChange!='undefined')MultiSelectChange(cls);
	},
	//返回name
	getName:function(k){
		if (this.pNames[k-1])
		{
			return this.pNames[k-1];
		}
		return this.pName+k;
	},
	getLabel:function(k){
		if (this.pLabels[k-1])
		{
			return this.pLabels[k-1];
		}
		return '请选择';
	},

	//初始化
	init:function(id) {
		//初始化id
		var id = id || 0;
		//select 的name
		this.pNames = this.pNames.split(',');
		//下拉提示
		this.pLabels = this.pLabels.split(',');
		
		//第一次select初始化
		var select	= $("<select name='"+this.getName(1)+"' id='"+this.getName(1)+"' class='"+this.pClass+"'></select>");
		select.bind(
			"change",
			{cls: this, id:this.getName(2)}, 
			this.getSubCategory
		);
		//第一层select option 提示
		select.append($("<option value=''>"+this.getLabel(1)+"</option>"));
		//第一层select option 内容
		for(var i in this.all)
		{
			if (this.all[i].pid==id)
			{
				var option=$("<option value='"+this.all[i]['value']+"'>"+this.all[i]['name']+"</option>");
				select.append(option);
			}
		}

		//select 层数
		if (this.pLevel==0)this.pLevel=this.pNames.length;
		//第一层select 插入页面
		$('#'+this.pId).append(select);
		this.firstChild	= select;

		//显示对应层级内容并插入页面
		for(var i=2;i<=this.pLevel;i++)
		{
			var select	= $("<select name='"+this.getName(i)+"' id='"+this.getName(i)+"'  class='"+this.pClass+"'></select>");

			select.append($("<option value=''>"+this.getLabel(i)+"</option>"));
			select.bind("change", {cls: this,id:this.getName(i+1)}, this.getSubCategory);

			$('#'+this.pId).append(select);
		}
		
	},
	//选中
	select:function(val) {
		//id
		var key		= val;
		var keys	= new Array();

		//省市区层级
		while( this.all[key] ) {
			keys.unshift(key);
			var key	= this.all[key].pid;
		}

		var len		= keys.length;

		//选中第一层select
		this.firstChild.val(keys[this.pStart]);
		var select	= this.firstChild;
		select.change();

		//选择 后续select
		for(var i=this.pStart+1;i<len;i++){
			select = select.next();
			if(select.is('select')){
				select.val(keys[i]);
				select.change();
			}else{
				break;
			}
		}
	}
}