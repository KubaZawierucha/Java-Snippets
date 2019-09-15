package com.zawierucha.iterators;

import java.util.HashSet;
import java.util.Set;

public class SetIterator {

    public void Iterate() {
        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Martin");
        sampleSet.add("Adele");
        sampleSet.add("Mark");
        sampleSet.add("Magda");

        System.out.println("Set iteration");
        for(String item : sampleSet) {
            System.out.println(item);
        }
    }
}
