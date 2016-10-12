package com.example.model;

import java.util.*;

public class BeerExpert {
    public List getBrands(String color) {

    List brands = new ArrayList();

        switch (color) {
            case "amber":
                brands.add("Tröegs Nugget Nectar");
                brands.add("Tocobaga Red Ale");
                break;
            case "dark":
                brands.add("Gulden Draak");
                brands.add("St. Bernardus Abt 12");
                brands.add("Dogfish Head");
                break;
            case "light":
                brands.add("Amstel Light");
                brands.add("Bud Light");
                break;
            case "brown":
                brands.add("Cubano-Style Espresso Brown Ale");
                brands.add("Samuel Smith's Nut Brown Ale");
                break;
            default:
                break;
        }
    return(brands);
   }
}