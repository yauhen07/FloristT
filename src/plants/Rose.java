package plants;

public class Rose extends Plant {
    public static final String PLANT = "Роза";
    private static final int PRICE = 10;

    public void confirmChoice() {
        System.out.println("Составляем букет " + PLANT + " стоимостью " + PRICE + " за шт");
    }

    public Rose(String color) {
        plantName = PLANT;
        colorBud = color;
        price = PRICE;
    }

    public int getPrice() {
        return PRICE;
    }

    public String getColorBud() {
        return colorBud;
    }
}
