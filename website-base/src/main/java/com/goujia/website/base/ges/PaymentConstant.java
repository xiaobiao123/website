package com.goujia.website.base.ges;
public class PaymentConstant {
    
    public static final Integer TEN=10;
    
    //
    public static final Integer PAY_PERIOD_TEN=0;
    
    public static final Integer PAY_PERIOD_NINETY=1;
    
    public static final Integer PAY_PERIOD_THIRTY=2;
    
    public static final Integer RECORD_SOURCE_ZERO=0;
    public static final Integer RECORD_SOURCE_ONE=1;
    
    public static final String STATUS_TEN="prepaying";
    public static final String STATUS_NINETY="accepted_AZZC";
    public static final String STATUS_THIRTY_FIRST="paying_AZZC";
    public static final String STATUS_THIRTY_SECOND="accepted_JZFZ";
    public static final String STATUS_THIRTY_THIRD="accepted_YSCS";
    public static final String STATUS_TEN_WAIT="arriving_earnest";
    
    public static final Integer PAY_STATUS_ZERO=0;
    public static final Integer PAY_STATUS_ONE=1;
    public static final Integer PAY_STATUS_TWO=2;
    public static final Integer PAY_STATUS_THREE=3;
    
    public static final String GOODS_TYPE_BALCONY="y";
    
    public enum PayWay{
        POS("POS支付"),
        EBANK("网银支付"),
        OFFLINE("线下支付"),
        WAIT("待支付"),
        GJB("购家宝确认支付"),
        REFUND("退款")
        ;
        
        private String text;

        private PayWay(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
        
    }
    
    public enum PayStatus{
        NOPAY("未支付"),
        PAYFAIL("支付失败"),
        PAYEDWAIT("支付成功，待到账"),
        PAYED("已支付")
        ;
        private String text;

        private PayStatus(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
        
        
    }
    
    
}