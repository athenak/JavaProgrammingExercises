package org.example;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Java Hashtable class implements a hashtable, which maps keys to values.
        // It inherits Dictionary class and implements the Map interface.

        // Java Hashtable class is synchronized.

        // Create an empty Hashtable
        Hashtable<Integer, String> htable = new Hashtable<>();

        // Adding elements to the hashtable
        htable.put(1, "Candies");
        htable.put(2, "Chocolates");
        htable.put(3, "Marshmallows");
        htable.put(4, "Jelly Beans");

        // printing out all key, value pairs in a HashTable
        for(Map.Entry i:htable.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }

        // Getting values from the hashtable
        String value1 = htable.get(1);
        System.out.println("\nValue of Key 1: " + value1);

        // Removing elements from the hashtable
        htable.remove(1);

        System.out.println("Removed the first element from the HashTable");

        // Print size and content of a HashTable
        System.out.println("Size of map is: " + htable.size());
        System.out.println(htable);

        // Check if a key is present and if
        // present, print value
        if(htable.containsKey(1)){
            String found = htable.get(1);
            System.out.println("value for Key 1 is: " + found);
        } else {
            System.out.println("\nValue for Key 1 is not in the HashTable");
        }

    }
}

