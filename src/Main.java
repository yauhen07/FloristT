import data.FlowerCollection;
import plants.Plant;
import bouquet.Bouquet;
import util.BouquetPrice;
import util.InputData;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        FlowerCollection flowerCollection = new FlowerCollection();
        Bouquet myBouquet = new Bouquet();
        InputData inputData = new InputData();

        List<Plant> actualPlants = flowerCollection.getListCollection();


        System.out.println("Сегодня в наличии есть следующие цветы: ");
        for (Plant plant :actualPlants) {
            System.out.println(plant.getPlantName() + " " + plant.getColorBud());
        }
        System.out.println("****************************************************");
        System.out.println("Выберите цветок из которых будем совтавлять букет: ");
        for (Plant plant :actualPlants) {
            System.out.println(plant.getPlantName());
        }

        String flower = inputData.inputFlowers();
        System.out.println("Введите количество цветков в букете");

        for (int i = 0; i <actualPlants.size(); i++) {
            Plant plant = actualPlants.get(i);
            if(flower.equalsIgnoreCase(plant.getPlantName())){
                myBouquet.setPlant(plant);
            }
        }

        if(null == myBouquet.getPlant()) {
            System.out.println("Выбранный цветок не найден");
            System.exit(0);
            //как опция можно добавить предложение выбрать другой цветок и перезапустить main
        }


        myBouquet.setQuantity(inputData.numberOfFlowers());
        myBouquet.getPlant().confirmChoice();

        myBouquet.setBouquetPrice(BouquetPrice.calculatePrice(myBouquet));

        System.out.println("Цена букета соствляет: " + myBouquet.getBouquetPrice());
    }
}
