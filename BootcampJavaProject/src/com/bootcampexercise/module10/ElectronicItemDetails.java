package com.bootcampexercise.module10;

import java.util.HashMap;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ElectronicItemDetails {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("TV", 199.99);
        map.put("Refrigerator",499.99);
        map.put("Washing machine",365.99);
        map.put("Laptop",1499.56);


        ElectronicItemDetails obj = new ElectronicItemDetails();
        obj.print(map);
    }
    void print(Map map) {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        System.out.println("Electronic\tItems\tDetails");
        System.out.println("*************************************");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()) {
            String key = (String) iterat.next();
            System.out.println("Price of " +key+ " is" + "\t" + map.get(key));
        }
        System.out.println("*************************************");

    }
    }