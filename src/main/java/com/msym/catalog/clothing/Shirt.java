package com.msym.catalog.clothing;

import org.springframework.data.annotation.Id;

public class Shirt {
    @Id
    private String id;
    private String brand;
    private String collection;
    private String catalog_indx;  //model+rozmiar
    private float purch_price_netto;
    private float sell_price_netto;
    private Integer amount_left;
    private boolean isLongSleeve;

    public Shirt(String brand, String collection, String catalog_indx, float purch_price_netto, float sell_price_netto, Integer amount_left, boolean isLongSleeve) {
        this.brand = brand;
        this.collection = collection;
        this.catalog_indx = catalog_indx;
        this.purch_price_netto = purch_price_netto;
        this.sell_price_netto = sell_price_netto;
        this.amount_left = amount_left;
        this.isLongSleeve = isLongSleeve;
    }

    public Shirt() {
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

    public float getPurch_price_netto() {
        return purch_price_netto;
    }

    public void setPurch_price_netto(float purch_price_netto) {
        this.purch_price_netto = purch_price_netto;
    }

    public float getSell_price_netto() {
        return sell_price_netto;
    }

    public void setSell_price_netto(float sell_price_netto) {
        this.sell_price_netto = sell_price_netto;
    }

    public Integer getAmount_left() {
        return amount_left;
    }

    public void setAmount_left(Integer amount_left) {
        this.amount_left = amount_left;
    }

    public boolean isLongSleeve() {
        return isLongSleeve;
    }

    public void setLongSleeve(boolean longSleeve) {
        isLongSleeve = longSleeve;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", collection='" + collection + '\'' +
                ", catalog_indx='" + catalog_indx + '\'' +
                ", purch_price_netto=" + purch_price_netto +
                ", sell_price_netto=" + sell_price_netto +
                ", amount_left=" + amount_left +
                ", isLongSleeve=" + isLongSleeve +
                '}';
    }
}
