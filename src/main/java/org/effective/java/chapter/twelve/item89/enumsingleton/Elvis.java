package org.effective.java.chapter.twelve.item89.enumsingleton;

import java.util.*;

// Enum singleton - the preferred approach - Page 311
public enum Elvis {
    INSTANCE;
    private String[] favoriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}