package hw1;

public class Iphone {
    //-------------ATTRIBUTES----------------
    private String modelName;
    private long batteryL;
    private double releaseDate; // Как отображать дату?
    private String screen;
    private String color; //как отображать цвет?
    private double price;
    private char button; //Будет ли иметь смысл?


    //-------------GETTERS/SETTERS-----------

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public long getBatteryL() {
        return batteryL;
    }

    public void setBatteryL(long batteryL) {
        this.batteryL = batteryL;
    }

    public double getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(double releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getButton() {
        return button;
    }

    public void setButton(char button) {
        this.button = button;
    }

}
