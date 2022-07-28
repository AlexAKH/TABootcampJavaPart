package com.bootcampexercise.module8.activity;
//Needs to be completed

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        list.add("f");
        list.add("g");
        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity print = new ListActivity();
        print.print(list);

    }

    void print(List list) {
        System.out.println(list);
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.

    }
}
