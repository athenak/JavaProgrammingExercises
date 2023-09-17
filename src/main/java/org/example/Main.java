package org.example;

// Import the HashMap class
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap object called provinceCapitals
        HashMap<String, String> provinceCapitals = new HashMap<String, String>();

        //Add keys and values (Province, City)
        provinceCapitals.put("Quebec", "Quebec City");
        provinceCapitals.put("British Columbia", "Victoria");
        provinceCapitals.put("Alberta", "Edmonton");
        provinceCapitals.put("Saskatchewan", "Regina");
        provinceCapitals.put("Manitoba", "Winnipeg");
        provinceCapitals.put("Ontario", "Toronto");
        provinceCapitals.put("New Brunswick", "Fredericton");
        provinceCapitals.put("Nova Scotia", "Halifax");
        provinceCapitals.put("Newfoundland", "St. John's");
        provinceCapitals.put("Prince Edward Island", "Charlottetown");

        // To access a value in the HashMap, use the get() method and refer to its key
        provinceCapitals.get("Quebec");

            // print out a key
        System.out.println(provinceCapitals.get("Quebec"));

       // To find out how many items there are, use the size() method
        provinceCapitals.size();
        System.out.println(provinceCapitals.size());

        // Loop through the items of a HashMap with a for-each loop


        System.out.println();

        // To remove an item, use the remove() method and refer to the key
        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values
        // Print keys
        for (String i : provinceCapitals.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        // Print values
        for (String i : provinceCapitals.values()) {
            System.out.println(i);
        }






        }
}

