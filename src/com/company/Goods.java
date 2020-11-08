package com.company;

import java.util.Date;

public class Goods {
    private int Id;
    private String Name;
    private double Price;
    private String category;
    private Date purchaseDate;
    private Date sellDate;

    Goods(int Id, String Name, double Price, String category, Date purchaseDate, Date sellDate) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.sellDate = sellDate;

    }
    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public String getCategory() {
        return category;
    }
    public Date getpurchaseDate() {
        return purchaseDate;
    }
    public void setpurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public Date getsellDate() {
        return sellDate;
    }
    public void setsellDate(Date sellDate) {
        this.sellDate = sellDate;
    }
    @Override
    public String toString() {
        return Id + '\t' + Name + '\t' + Price + '\t' +category + '\t' + purchaseDate + '\t' + sellDate;
    }
}


