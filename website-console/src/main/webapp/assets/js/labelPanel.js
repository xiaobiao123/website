        var dialog_map={};
        function get_pop_label_array(dialog_id){
            var array=dialog_map[dialog_id];
            if(array==null || array==undefined){
                dialog_map[dialog_id]=new Array();
                array=dialog_map[dialog_id];
            }
            return array;
        }

        function label_pop_ready_show(key){
            var value=dialog_map[key];
            if(value!=null && value!=undefined && value.length!=0)
            {
                var show=$("#"+key+" #checked_label");
                for(var i=0;i<value.length;i++){
                    show.append("<span>"+value[i].name+"</span>");
                }
                var list=$("#"+key+" .childLabel a");
                $.each(list,function(i,obj){
                    obj=$(obj);
                    var id=obj.attr("value");
                    if(is_contain(value,id))
                        obj.addClass("checked");
                });
            }
        }
        function is_contain(array,id){
            for(var i=0;i<array.length;i++){
                if(array[i].id==id)
                    return true;
            }
        }
        

        function pop_clear_label(dialog_id){
            var show=$("#"+dialog_id+" #checked_label");
            show.empty();
            dialog_map[dialog_id]=new Array();
            var list=$("#"+dialog_id+" .childLabel .checked");
            $.each(list,function(i,obj){
                $(obj).removeClass("checked");
            });
        }
        function pop_submit(show_input,dialog_id){
            var pop_label_array=get_pop_label_array(dialog_id);
            var str="";
            for(var i=0;i<pop_label_array.length;i++){
                str+=pop_label_array[i].name;
                str+=';';
            }
            $("#"+show_input).val(str);
            $("#"+dialog_id).modal("hide");
        }
        function pop_check_label(dialog_id,obj,id){
            var pop_label_array=get_pop_label_array(dialog_id);
            obj=$(obj);
            if(obj.hasClass('checked')){
                obj.removeClass('checked');
                for(var i=pop_label_array.length-1;i>=0;i--){
                    if(pop_label_array[i].id==id){
                        pop_label_array.splice(i,1);
                        break;
                    }
                }
                var show=$("#"+dialog_id+" #checked_label");
                show.empty();
                for(var i=0;i<pop_label_array.length;i++){
                    show.append("<span>"+pop_label_array[i].name+"</span>");
                }
                        
            }
            else{
                var val=obj.text();
                var label={id:id,name:val};
                pop_label_array.push(label);
                obj.addClass('checked');
                $("#"+dialog_id +" #checked_label").append("<span>"+val+"</span>");
            }
        }