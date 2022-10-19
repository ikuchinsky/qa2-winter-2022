package hw1;

public class Computer {
    //-------------------ATTRIBUTES---------
    private String manufacturer;
    private String model;
    private String processor;
    private double installedMemory;
    private String systemType;
    private double price;

    //-------------GETTERS/SETTERS-----------

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getInstalledMemory() {
        return installedMemory;
    }

    public void setInstalledMemory(double installedMemory) {
        this.installedMemory = installedMemory;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
