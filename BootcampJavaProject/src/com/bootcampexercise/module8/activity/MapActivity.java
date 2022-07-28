package com.bootcampexercise.module8.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        //2 - Call print method to print the map passed as its parameter.

       Map names = new HashMap();
        names.put("id001","Vitaly");
        names.put("id002","Inese");
        names.put("id003","Pavels");
        names.put("id004","Scot");
        names.put("id005","Olga");
        names.put("id006","Jolanta");
        names.put("id007","Verners");
        names.put("id0088","Raimonds");

        MapActivity obj = new MapActivity();
        obj.print(names);
}

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()){
            String key = (String) iterat.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("*************************************");

    }
}
