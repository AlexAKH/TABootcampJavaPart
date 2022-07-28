package com.bootcampexercise.module8.activity;

//Needs to be completed

import java.util.Set;
import java.util.HashSet;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet nameSet = new HashSet();

        nameSet.add("Michael");
        nameSet.add("Vitaly");
        nameSet.add("Vitaly");
        nameSet.add("Inese");
        nameSet.add("Aleksejs");
        //Also try adding a few duplicate entries to this set.


        //TODO: 2 - Call print method to print the set passed as its parameter.
        SetActivity print = new SetActivity();
        print.print(nameSet);
    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        for (Object mySet : set) {
            System.out.println(mySet.toString());
            //Notice the order in which elements get printed.
        }
    }
}