package com.msym.catalog.clothing;

import org.springframework.data.annotation.Id;

public class Pants {
    @Id
    private String id;
    private String brand;
    private String collection;
    private String catalog_indx;  //model+rozmiar
    private float purch_price_netto;
    private float sell_price_netto;
    private Integer amount_left;
    private boolean isLong;

}
