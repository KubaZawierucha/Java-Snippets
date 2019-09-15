package com.zawierucha.iterators;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

    public void Iterate() {
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Martin");
        sampleList.add("Adele");
        sampleList.add("Mark");
        sampleList.add("Magda");

        System.out.println("List iteration (foreach)");
        for(String item : sampleList) {
            System.out.println(item);
        }

        System.out.println("List iteration (for)");
        for(int index = 0; index < sampleList.size(); index++) {
            System.out.print(index + ": ");
            System.out.println(sampleList.get(index));
        }
    }
}
