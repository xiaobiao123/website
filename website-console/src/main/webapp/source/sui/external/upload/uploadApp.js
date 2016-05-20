/**
 * Modified by ZhangJL on 2015/1/7.
 */

function upload_pic(fileToUpload,success,error) {
     $.ajaxFileUpload({
         url: $(".ajaxfileupload_weburl").val() + "/store/upload_pic.htm",   //submit to UploadFileServlet
         secureuri: false,
         fileElementId: fileToUpload,
         dataType: 'text', //or json xml whatever you like~
         success: success,
         error: error,
         uploadType: "pic"
     });
     return false;
}

function upload_flash(fileToUpload,success,error) {
    $.ajaxFileUpload({
        url: $(".ajaxfileupload_weburl").val() + "/store/upload_file.htm",   //submit to UploadFileServlet
        secureuri: false,
        fileElementId: fileToUpload,
        dataType: 'text', //or json xml whatever you like~
        success: success,
        error: error,
        uploadType: "file"
    });
    return false;
}

