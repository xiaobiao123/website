package com.goujia.website.base.ges.entity;

public class ProductResultType {
        private String id;
        private String name;
        private String price;
        private String area;
        private String styleId;
        private String styleName;
        private String houseTypeID;
        private String houseType;
        private String buidingId;
        private String buidingName;
        
        public String getStyleId() {
            return styleId;
        }
        public void setStyleId(String styleId) {
            this.styleId = styleId;
        }
        public String getStyleName() {
            return styleName;
        }
        public void setStyleName(String styleName) {
            this.styleName = styleName;
        }
        public String getHouseTypeID() {
            return houseTypeID;
        }
        public void setHouseTypeID(String houseTypeID) {
            this.houseTypeID = houseTypeID;
        }
        public String getHouseType() {
            return houseType;
        }
        public void setHouseType(String houseType) {
            this.houseType = houseType;
        }
        public String getBuidingId() {
            return buidingId;
        }
        public void setBuidingId(String buidingId) {
            this.buidingId = buidingId;
        }
        public String getBuidingName() {
            return buidingName;
        }
        public void setBuidingName(String buidingName) {
            this.buidingName = buidingName;
        }
        private int isEnabel=0;
        
        public String getPrice() {
            return price;
        }
        public void setPrice(String price) {
            this.price = price;
        }
        public String getArea() {
            return area;
        }
        public void setArea(String area) {
            this.area = area;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getIsEnabel() {
            return isEnabel;
        }
        public void setIsEnabel(int isEnabel) {
            this.isEnabel = isEnabel;
        }
        
}
