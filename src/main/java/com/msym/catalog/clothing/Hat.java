package com.msym.catalog.clothing;


import org.springframework.data.annotation.Id;

public class Hat implements Clothing {
    @Id
    private String id;
    private String brand;
    private String collection;
    private String catalog_indx;  //model+rozmiar
    private Float purch_price_netto;
    private Float sell_price_netto;
    private Integer amount_left;

    public Hat(String brand, String collection, String catalog_indx, Float purch_price_netto, Float sell_price_netto, Integer amount_left) {
        this.brand = brand;
        this.collection = collection;
        this.catalog_indx = catalog_indx;
        this.purch_price_netto = purch_price_netto;
        this.sell_price_netto = sell_price_netto;
        this.amount_left = amount_left;
    }

    public Hat() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getCatalog_indx() {
        return catalog_indx;
    }

    public void setCatalog_indx(String catalog_indx) {
        this.catalog_indx = catalog_indx;
    }

    public Float getPurch_price_netto() {
        return purch_price_netto;
    }

    public void setPurch_price_netto(Float purch_price_netto) {
        this.purch_price_netto = purch_price_netto;
    }

    public Float getSell_price_netto() {
        return sell_price_netto;
    }

    public void setSell_price_netto(Float sell_price_netto) {
        this.sell_price_netto = sell_price_netto;
    }

    public Integer getAmount_left() {
        return amount_left;
    }

    public void setAmount_left(Integer amount_left) {
        this.amount_left = amount_left;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", collection='" + collection + '\'' +
                ", catalog_indx='" + catalog_indx + '\'' +
                ", purch_price_netto=" + purch_price_netto +
                ", sell_price_netto=" + sell_price_netto +
                ", amount_left=" + amount_left +
                '}';
    }
}
