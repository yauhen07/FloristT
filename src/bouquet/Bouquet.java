package bouquet;

import plants.Plant;

public class Bouquet {

    private Plant plant;
    private int quantity;
    private int bouquetPrice;

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(int bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }
}
