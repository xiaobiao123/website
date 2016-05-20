/*
 * dateLimit
 */
(function($, undefined) {
	function dateLimit(ele, opts){
		this.ele = $(ele);
		this.opts = $.extend({
			limit:  0,
			day: 	'.d',
			hour: 	'.h',
			minute: '.m',
			second: '.s',
			data :'data-limit'
		}, opts);

		this.init();
		
	}
	dateLimit.prototype = {
		//构建页面DOM
		init: function() {
			// this.opts.limit = (new Date()).valueOf();
			this.limit = parseInt(this.ele.attr(this.opts.data));
			this.limit = isNaN(this.limit) ? this.opts.limit : this.limit;
			// console.log(this.limit);
			this.day = this.ele.find(this.opts.day);
			this.hour = this.ele.find(this.opts.hour);
			this.minute = this.ele.find(this.opts.minute);
			this.second = this.ele.find(this.opts.second);

			this.calDHMS();
		},

		calDHMS: function() {
			var _this = this;
			setInterval(function(){
				// _this.opts.limit = (new Date()).valueOf();
				if (_this.limit > 0) {
					var timestamp = (_this.limit)/1000;
					var d = _this.checkTime(Math.floor(timestamp/86400));
					var h = _this.checkTime(Math.floor((timestamp-d*86400)/3600));
					var m = _this.checkTime(Math.floor((timestamp-d*86400-h*3600)/60));
					var s = _this.checkTime(Math.floor(timestamp-d*86400-h*3600-m*60));

					_this.setInnerHTML(d,h,m,s);
					_this.limit -= 1000;
				} else {
					_this.setInnerHTML('00','00','00','00');
				}
			}, 1000);
		},

		//add a zero in front of numbers which<10 
		checkTime: function(i){
			if (i<10) {
				i="0" + i;
			} 
			return i;
		},

		setInnerHTML: function(d,h,m,s) {
			this.day.html(d);
			this.hour.html(h);
			this.minute.html(m);
			this.second.html(s);
		},
		
		destroy: function() {
			this.ele = null;
			this.opts = null;
		}
	}

	$.fn.qfcdatelimit = function(opts) {
		return new dateLimit(this.get(0), opts);
	}
})(jQuery)