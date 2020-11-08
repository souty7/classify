package com.company;


import java.util.Date;

class Food extends Goods{
    Food(int Id, String Name, double Price, Date purchaseDate, Date sellDate) {

        super(Id, Name, Price,"食品", purchaseDate, sellDate);

    }

}