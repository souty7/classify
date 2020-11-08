package com.company;

import java.util.Date;

class Vehicle extends Goods{
    Vehicle(int Id, String Name, double Price, String category, Date purchaseDate, Date sellDate) {
        super(Id, Name, Price,"出行用品", purchaseDate, sellDate);

    }
}
