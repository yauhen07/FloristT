package plants;

public class Aster extends Plant {
    public static final String PLANT = "Астра";
    private static final int PRICE = 5;

    private String colorBud;

    public Aster(String color) {
        plantName = PLANT;
        colorBud = color;
        price = PRICE;
    }

    public void confirmChoice() {
        System.out.println("Составляем букет " + PLANT + " стоимостью " + PRICE + " за шт");
    }

    public int getPrice() {
        return PRICE;
    }

    public String getColorBud() {
        return colorBud;
    }
}
