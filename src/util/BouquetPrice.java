package util;

import bouquet.Bouquet;

public class BouquetPrice {

    public static int calculatePrice(Bouquet bouquet) {
        return bouquet.getPlant().getPrice() * bouquet.getQuantity();
    }
}