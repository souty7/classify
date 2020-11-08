package com.company;

import java.util.Date;

public class Clothing extends Goods{
    Clothing(int Id, String Name, double Price, Date purchaseDate, Date sellDate) {
        super(Id, Name, Price, "服装", purchaseDate, sellDate);

    }
}
