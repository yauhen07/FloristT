package plants;

abstract public class Plant {
    protected String colorBud;
    protected String plantName;
    protected int price;

    public abstract void confirmChoice();

    public String getColorBud() {
        return colorBud;
    }

    public String getPlantName() {
        return plantName;
    }

    public int getPrice() {
        return price;
    }
}
