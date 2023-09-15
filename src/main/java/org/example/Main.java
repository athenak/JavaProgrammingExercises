package org.example;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Java Hashtable class implements a hashtable, which maps keys to values.
        // It inherits Dictionary class and implements the Map interface.

        // Java Hashtable class is synchronized.

        Hashtable<Integer, String> htable = new Hashtable<Integer, String>();

        htable.put(1, "Candies");
        htable.put(2, "Chocolates");
        htable.put(3, "Marshmallows");
        htable.put(4, "Jelly Beans");

        for(Map.Entry i:htable.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}

