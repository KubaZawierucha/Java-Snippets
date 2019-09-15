package com.zawierucha.iterators;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

    public void Iterate() {
        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Mark", "Magda");
        sampleMap.put("Martin", "Adele");

        System.out.println("Values iteration");
        for(String value : sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("Keys iteration and values getting");
        for(String key : sampleMap.keySet()) {
            String value = sampleMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("Keys and values iteration");
        for(Map.Entry<String, String> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
