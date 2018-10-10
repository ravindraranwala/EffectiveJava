package org.effective.java.chapter.seven.item43;

import java.util.Map;
import java.util.TreeMap;

// Frequency table implemented with map.merge, using lambda and method reference (Page 197)
public class Freq {
    public static void main(String[] args) {
    	String[] vals = new String[] {"one", "two", "one", "four"};
        Map<String, Integer> frequencyTable = new TreeMap<>();
        
        for (String s : vals)
            frequencyTable.merge(s, 1, (count, incr) -> count + incr); // Lambda
        System.out.println(frequencyTable);

        frequencyTable.clear();
        for (String s : vals)
            frequencyTable.merge(s, 1, Integer::sum); // Method reference
        System.out.println(frequencyTable);

    }
}
