package com.ztaober.skudemo.bean;

import java.util.List;

/**
 * Created by troy on 2017/10/27.
 * Gmail ztaober@gmail.com
 * Description
 */
public class GoodsDetailBean {

    /**
     * firstSku : {"alias":"怡宝桶装水","costPrice":6,"discount":10,"goodsAttr":"容量:4.9L; 类别:纯净水","goodsId":2432001,"id":2432028,"imageUrl":"image/C7AA45E6-08E0-0001-11CF-159565E72930","marketPrice":8,"phoneNum":"13523252627","price":7,"sellingPrice":8,"storeGoodsId":2433605,"storeId":2433441,"supplyPeriod":1}
     * firstSkuList : [{"alias":"怡宝桶装水","attributes":[{"attributeId":2431461,"attributeValId":2431503,"id":2432055,"skuGoodsId":2432028},{"attributeId":2431961,"attributeValId":2431983,"id":2432056,"skuGoodsId":2432028},{"attributeId":2431962,"attributeValId":2431991,"id":2432066,"skuGoodsId":2432028}],"costPrice":6,"discount":10,"goodsAttr":"容量:4.9L; 类别:纯净水","goodsId":2432001,"id":2432028,"imageUrl":"image/C7AA45E6-08E0-0001-11CF-159565E72930","marketPrice":8,"price":7,"sellingPrice":8,"storeGoodsId":2433605,"storeId":2433441,"supplyPeriod":1},{"alias":"怡宝桶装水","attributes":[{"attributeId":2431461,"attributeValId":2431503,"id":2432057,"skuGoodsId":2432029},{"attributeId":2431961,"attributeValId":2431982,"id":2432058,"skuGoodsId":2432029},{"attributeId":2431962,"attributeValId":2431991,"id":2432066,"skuGoodsId":2432028}],"costPrice":7,"discount":10,"goodsAttr":"容量:4.9L; 类别:蒸馏水","goodsId":2432001,"id":2432029,"imageUrl":"image/C7AA45E6-F450-0001-DD21-EEA2155919DF","marketPrice":9,"price":8,"sellingPrice":9,"storeGoodsId":2435104,"storeId":2433441,"supplyPeriod":1},{"alias":"怡宝桶装水","attributes":[{"attributeId":2431461,"attributeValId":2431502,"id":2432045,"skuGoodsId":2432023},{"attributeId":2431961,"attributeValId":2431982,"id":2432046,"skuGoodsId":2432023},{"attributeId":2431962,"attributeValId":2431991,"id":2432066,"skuGoodsId":2432028}],"costPrice":10,"discount":10,"goodsAttr":"容量:6.8L; 类别:蒸馏水","goodsId":2432001,"id":2432023,"imageUrl":"image/C7AA45DF-B990-0001-2974-B02012701D4E","marketPrice":13,"price":13,"sellingPrice":13,"storeGoodsId":2435102,"storeId":2433441,"supplyPeriod":1},{"alias":"怡宝桶装水","attributes":[{"attributeId":2431461,"attributeValId":2431502,"id":2432041,"skuGoodsId":2432021},{"attributeId":2431961,"attributeValId":2431981,"id":2432042,"skuGoodsId":2432021},{"attributeId":2431962,"attributeValId":2431991,"id":2432066,"skuGoodsId":2432028}],"costPrice":12,"discount":10,"goodsAttr":"容量:6.8L; 类别:矿泉水","goodsId":2432001,"id":2432021,"imageUrl":"image/C7AA45DD-6770-0001-EF72-E326134B6AD0","marketPrice":15,"price":14,"sellingPrice":15,"storeGoodsId":2435101,"storeId":2433441,"supplyPeriod":1},{"alias":"怡宝桶装水","attributes":[{"attributeId":2431461,"attributeValId":2431501,"id":2432049,"skuGoodsId":2432025},{"attributeId":2431961,"attributeValId":2431983,"id":2432050,"skuGoodsId":2432025},{"attributeId":2431962,"attributeValId":2431992,"id":2432066,"skuGoodsId":2432028}],"costPrice":16,"discount":10,"goodsAttr":"容量:18.9L; 类别:纯净水","goodsId":2432001,"id":2432025,"imageUrl":"image/C7AA45E2-0CB0-0001-315D-130518785CD0","marketPrice":22,"price":20,"sellingPrice":22,"storeGoodsId":2435103,"storeId":2433441,"supplyPeriod":1}]
     * goods : {"attrNames":"容量 类别","brandId":2431401,"brandName":"怡宝","createdBy":40,"creationDate":1504240178000,"details":"<p>怡宝桶装水&nbsp;商品详情描述<\/p>","firstLevelCategoryId":2431381,"goodsName":"怡宝桶装水[请别修改]","id":2432001,"inventory":999,"isParts":0,"lastUpdateDate":1504600955000,"lastUpdatedBy":40,"minOrderQuantity":1,"multiDelivery":1,"owCity":1,"priceUnit":"13","publicityPicPath":"image/C7AA4615-8960-0001-7046-8AC0E5BE1DA8","resume":"怡宝桶装水 商品简介","secondLevelCategoryId":2431382,"serialNumber":"SPC20170901122936882","status":1,"supplierId":2222081,"thirdLevelCategoryId":2431383,"type":"01","url":"","voidFlag":1}
     * pictures : [{"goodsId":2432001,"id":212400,"picUrl":"image/C7AA4616-9D00-0001-8087-84C42B6F44A0"},{"goodsId":2432001,"id":212401,"picUrl":"image/C7AA4617-C2B0-0001-2418-16A015001010"}]
     */

    public FirstSkuBean firstSku;
    public GoodsBean goods;
    public List<SkuBean> firstSkuList;
    public List<PicturesBean> pictures;


    public static class FirstSkuBean {
        /**
         * alias : 怡宝桶装水
         * costPrice : 6.0
         * discount : 10
         * goodsAttr : 容量:4.9L; 类别:纯净水
         * goodsId : 2432001
         * id : 2432028
         * imageUrl : image/C7AA45E6-08E0-0001-11CF-159565E72930
         * marketPrice : 8.0
         * phoneNum : 13523252627
         * price : 7.0
         * sellingPrice : 8.0
         * storeGoodsId : 2433605
         * storeId : 2433441
         * supplyPeriod : 1
         */

        public String alias;
        public double costPrice;
        public int discount;
        public String goodsAttr;
        public int goodsId;
        public int id;
        public String imageUrl;
        public double marketPrice;
        public String phoneNum;
        public double price;
        public double sellingPrice;
        public int storeGoodsId;
        public int storeId;
        public int supplyPeriod;

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public double getCostPrice() {
            return costPrice;
        }

        public void setCostPrice(double costPrice) {
            this.costPrice = costPrice;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public String getGoodsAttr() {
            return goodsAttr;
        }

        public void setGoodsAttr(String goodsAttr) {
            this.goodsAttr = goodsAttr;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getSellingPrice() {
            return sellingPrice;
        }

        public void setSellingPrice(double sellingPrice) {
            this.sellingPrice = sellingPrice;
        }

        public int getStoreGoodsId() {
            return storeGoodsId;
        }

        public void setStoreGoodsId(int storeGoodsId) {
            this.storeGoodsId = storeGoodsId;
        }

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public int getSupplyPeriod() {
            return supplyPeriod;
        }

        public void setSupplyPeriod(int supplyPeriod) {
            this.supplyPeriod = supplyPeriod;
        }
    }

    public static class GoodsBean {
        /**
         * attrNames : 容量 类别
         * brandId : 2431401
         * brandName : 怡宝
         * createdBy : 40
         * creationDate : 1504240178000
         * details : <p>怡宝桶装水&nbsp;商品详情描述</p>
         * firstLevelCategoryId : 2431381
         * goodsName : 怡宝桶装水[请别修改]
         * id : 2432001
         * inventory : 999
         * isParts : 0
         * lastUpdateDate : 1504600955000
         * lastUpdatedBy : 40
         * minOrderQuantity : 1
         * multiDelivery : 1
         * owCity : 1
         * priceUnit : 13
         * publicityPicPath : image/C7AA4615-8960-0001-7046-8AC0E5BE1DA8
         * resume : 怡宝桶装水 商品简介
         * secondLevelCategoryId : 2431382
         * serialNumber : SPC20170901122936882
         * status : 1
         * supplierId : 2222081
         * thirdLevelCategoryId : 2431383
         * type : 01
         * url :
         * voidFlag : 1
         */

        public String attrNames;
        public int brandId;
        public String brandName;
        public int createdBy;
        public long creationDate;
        public String details;
        public int firstLevelCategoryId;
        public String goodsName;
        public int id;
        public int inventory;
        public int isParts;
        public long lastUpdateDate;
        public int lastUpdatedBy;
        public int minOrderQuantity;
        public int multiDelivery;
        public int owCity;
        public String priceUnit;
        public String publicityPicPath;
        public String resume;
        public int secondLevelCategoryId;
        public String serialNumber;
        public int status;
        public int supplierId;
        public int thirdLevelCategoryId;
        public String type;
        public String url;
        public int voidFlag;

        public String getAttrNames() {
            return attrNames;
        }

        public void setAttrNames(String attrNames) {
            this.attrNames = attrNames;
        }

        public int getBrandId() {
            return brandId;
        }

        public void setBrandId(int brandId) {
            this.brandId = brandId;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public int getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(int createdBy) {
            this.createdBy = createdBy;
        }

        public long getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(long creationDate) {
            this.creationDate = creationDate;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public int getFirstLevelCategoryId() {
            return firstLevelCategoryId;
        }

        public void setFirstLevelCategoryId(int firstLevelCategoryId) {
            this.firstLevelCategoryId = firstLevelCategoryId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getInventory() {
            return inventory;
        }

        public void setInventory(int inventory) {
            this.inventory = inventory;
        }

        public int getIsParts() {
            return isParts;
        }

        public void setIsParts(int isParts) {
            this.isParts = isParts;
        }

        public long getLastUpdateDate() {
            return lastUpdateDate;
        }

        public void setLastUpdateDate(long lastUpdateDate) {
            this.lastUpdateDate = lastUpdateDate;
        }

        public int getLastUpdatedBy() {
            return lastUpdatedBy;
        }

        public void setLastUpdatedBy(int lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
        }

        public int getMinOrderQuantity() {
            return minOrderQuantity;
        }

        public void setMinOrderQuantity(int minOrderQuantity) {
            this.minOrderQuantity = minOrderQuantity;
        }

        public int getMultiDelivery() {
            return multiDelivery;
        }

        public void setMultiDelivery(int multiDelivery) {
            this.multiDelivery = multiDelivery;
        }

        public int getOwCity() {
            return owCity;
        }

        public void setOwCity(int owCity) {
            this.owCity = owCity;
        }

        public String getPriceUnit() {
            return priceUnit;
        }

        public void setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
        }

        public String getPublicityPicPath() {
            return publicityPicPath;
        }

        public void setPublicityPicPath(String publicityPicPath) {
            this.publicityPicPath = publicityPicPath;
        }

        public String getResume() {
            return resume;
        }

        public void setResume(String resume) {
            this.resume = resume;
        }

        public int getSecondLevelCategoryId() {
            return secondLevelCategoryId;
        }

        public void setSecondLevelCategoryId(int secondLevelCategoryId) {
            this.secondLevelCategoryId = secondLevelCategoryId;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(int supplierId) {
            this.supplierId = supplierId;
        }

        public int getThirdLevelCategoryId() {
            return thirdLevelCategoryId;
        }

        public void setThirdLevelCategoryId(int thirdLevelCategoryId) {
            this.thirdLevelCategoryId = thirdLevelCategoryId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getVoidFlag() {
            return voidFlag;
        }

        public void setVoidFlag(int voidFlag) {
            this.voidFlag = voidFlag;
        }
    }




    public static class PicturesBean {
        /**
         * goodsId : 2432001
         * id : 212400
         * picUrl : image/C7AA4616-9D00-0001-8087-84C42B6F44A0
         */

        public int goodsId;
        public int id;
        public String picUrl;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }
    }
}
