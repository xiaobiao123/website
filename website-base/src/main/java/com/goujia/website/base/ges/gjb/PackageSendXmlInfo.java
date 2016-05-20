package com.goujia.website.base.ges.gjb;



/**
 * 发送给银行的package节点的xml信息
 * @author User
 *
 */
public class PackageSendXmlInfo extends PackageToXml {
   private PubSendXmlInfo pub;
    
    private ReqSendXmlInfo req;

    public PubSendXmlInfo getPub() {
        return pub;
    }

    public void setPub(PubSendXmlInfo pub) {
        this.pub = pub;
    }

    public ReqSendXmlInfo getReq() {
        return req;
    }

    public void setReq(ReqSendXmlInfo req) {
        this.req = req;
    }
    
    /**
     * 两层
     * @param pack
     * @param flag
     * @return
     */
    public String toXmlString(String pack,boolean flag){
        StringBuffer sb = new StringBuffer();
        sb.append(pub.toXmlString("pub", flag));
        sb.append(req.toXmlString("req", flag));
        if(pack!=null){
            return "<"+pack+">"+sb.toString()+"</"+pack+">";
        }else{
            return sb.toString();
        }
    }
    
    /**
     * 添加UTF-8 xml头及package头
     * @param xml
     * @return
     */
    public String addXmlHeadAndPackage(String xml){
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><package>"+xml+"</package>";
    }
    
    /**
     * 添加GBK xml头及package头
     * @param xml
     * @return
     */
    public String addGbkXmlHeadAndPackage(String xml){
        return "<?xml version=\"1.0\" encoding=\"GBK\"?><package>"+xml+"</package>";
    }

}
