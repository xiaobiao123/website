package com.goujia.website.base.ges.entity;

public class ProductParam {
        private String cityId;
        private String countyId;
        private String house_type;
        private String house_style;
        private String buildingId;
        private String maxPrice="8000000";
        private String minPrice="0";
        private String maxArea="2000";
        private String minArea="0";
        public String getCityId() {
            return cityId;
        }
        public void setCityId(String cityId) {
            this.cityId = cityId;
        }
        public String getCountyId() {
            return countyId;
        }
        public void setCountyId(String countyId) {
            this.countyId = countyId;
        }
        public String getHouse_type() {
            return house_type;
        }
        public void setHouse_type(String house_type) {
            this.house_type = house_type;
        }
        public String getHouse_style() {
            return house_style;
        }
        public void setHouse_style(String house_style) {
            this.house_style = house_style;
        }
        public String getBuildingId() {
            return buildingId;
        }
        public void setBuildingId(String buildingId) {
            this.buildingId = buildingId;
        }
        public String getMaxPrice() {
            return maxPrice;
        }
        public void setMaxPrice(String maxPrice) {
            this.maxPrice = maxPrice;
        }
        public String getMinPrice() {
            return minPrice;
        }
        public void setMinPrice(String minPrice) {
            this.minPrice = minPrice;
        }
        public String getMaxArea() {
            return maxArea;
        }
        public void setMaxArea(String maxArea) {
            this.maxArea = maxArea;
        }
        public String getMinArea() {
            return minArea;
        }
        public void setMinArea(String minArea) {
            this.minArea = minArea;
        }
        
}
