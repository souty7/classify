package com.company;

import java.util.Date;

public class Dailyuse extends Goods{
    Dailyuse(int Id, String Name, double Price, Date purchaseDate, Date sellDate) {
        super(Id, Name, Price,"日用品", purchaseDate, sellDate);

    }
}
