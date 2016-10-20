package com.example.model;

import java.util.*;

public class BeerExpert {
    public List<String> getBrands(String color) {

    List<String> brands = new ArrayList<String>();

        switch (color) {
            case "amber":
                brands.add("Tröegs Nugget Nectar");
                brands.add("Zoe");
                brands.add("Tocobaga Red Ale");
                break;
            case "dark":
                brands.add("Gulden Draak");
                brands.add("St. Bernardus Abt 12");
                brands.add("Dogfish Head");
                break;
            case "light":
                brands.add("Sam Adams Light");
                brands.add("Amstel Light");
                brands.add("Bud Light");
                break;
            case "brown":
                brands.add("Founders Sumatra Mountain Brown");
                brands.add("Cubano-Style Espresso Brown Ale");
                brands.add("Samuel Smith's Nut Brown Ale");
                break;
            default:
                break;
        }
    return(brands);
   }
}