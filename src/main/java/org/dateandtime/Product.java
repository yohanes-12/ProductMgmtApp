package org.dateandtime;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private long productId;
    private String name;
    private String dateSupplied;

    private int qualityInStock;
    private double unitPrice;

    public Product (){
    }

    public Product( long productId, String name, String dateSupplied, int qualityInStock, double unitPrice){
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.qualityInStock = qualityInStock;
        this.unitPrice = unitPrice;

    }

    public Product(long productId, String name, String dateSupplied, int qualityInStock) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.qualityInStock = qualityInStock;
    }

    public void setProductId(long productId){
        this.productId = productId;
    }

    public long getProductId(){
        return productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQualityInStock() {
        return qualityInStock;
    }

    public void setQualityInStock(int qualityInStock) {
        this.qualityInStock = qualityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toString(){
        return "ProductId" + productId + "Name" + name + "DataSupplied" + dateSupplied + "Quality in Stock" + qualityInStock + "UnitPrice" + unitPrice;
    }



}
