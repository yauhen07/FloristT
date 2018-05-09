package plants;

public class Chamomile extends Plant {
    public static final String PLANT = "Ромашка";
    final private static int PRICE = 3;

    public Chamomile(String color) {
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
