package org.effective.java.chapter.eight.item52;
import java.util.*;

// What does this program print? (Page 241)
public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
            // Corrected version
            // list.remove(Integer.valueOf(i));
        }
        System.out.println(set + " " + list);
    }
}
