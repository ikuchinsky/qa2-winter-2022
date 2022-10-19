package hw1;

import org.junit.jupiter.api.Test;

public class Working {
    @Test
    public void workingWithBaths() {

        Bath first = new Bath();
        first.setName("PAA");
        first.setColor("White");
        first.setHeight(1.2);
        first.setWeight(25);
        first.setVolume(35);
        first.setMaterial("Acrylic");

        System.out.println("It's NEW BRAND");
        System.out.println("Let's read about it");
        System.out.println(first.getName());
        System.out.println(first.getMaterial());
        System.out.println("How tall is it?");
        System.out.println(first.getHeight());
        System.out.println("What color?");
        System.out.println(first.getColor());
        System.out.println(first.getWeight());
    }
    @Test
    public void workingWithBook() {
        Book first = new Book();
        first.setNameOfBook("Game of Robots");
        first.setAuthor("Acid Afelot");
        first.setQuantityOfPaper(365);
        first.setMaterial("Thick paper");
        first.setQuality("Good");

        System.out.println("I found a new book!");
        System.out.println("Let's saw it!");
        System.out.println("The name of book is:");
        System.out.println(first.getNameOfBook());
        System.out.println("The name of author:");
        System.out.println(first.getAuthor());
    }
    @Test
    public void workingWithChocolate () {
        Chocolate first = new Chocolate();
        first.setColor("Brown");
        first.setSize((float) 2.3);
        first.setPriceL(100);
        first.setTaste("Coffee");
        first.setManufacture("Russian Tradition");

        System.out.println("I have a chocolate with taste:");
        System.out.println(first.getTaste());
        System.out.println("The price is:");
        System.out.println(first.getPriceL());
    }
    @Test
    public void workingWithComputer (){
        Computer first = new Computer();
        first.setModel("FRX-560-01");
        first.setManufacturer("ASUS");
        first.setProcessor("AMD AMD Ryzez");
        first.setInstalledMemory(560.00);
        first.setSystemType("Aimesh");
        first.setPrice(1500.99);

        System.out.println("First ASUS with new system and style in World!");
        System.out.println(first.getManufacturer());
        System.out.println(first.getModel());
        System.out.println("NEW PROCESSOR AND SYSTEM:");
        System.out.println(first.getSystemType());
        System.out.println(first.getProcessor());
        System.out.println("New memory:");
        System.out.println(first.getInstalledMemory());
        System.out.println("And price is:");
        System.out.println(first.getPrice());

    }

    @Test
    public void workingWithFridge(){
        Fridge first = new Fridge();
        first.setName("SAMSUNG");
        first.setColor("White");
        first.setCapacity(45.45);
        first.setQuantityOfCells(4);
        first.setQuantityOfDoors(2);

        System.out.println(first.getName());
        System.out.println(first.getColor());
        System.out.println(first.getCapacity());
        System.out.println(first.getQuantityOfCells());
        System.out.println(first.getQuantityOfDoors());
    }
    @Test
    public void workingWithHuman (){
        Human first = new Human();
        first.setName("Ilya");
        first.setAge(28);
        first.setGrowht(188);
        first.setWeight(103);
        first.setQuantityOfEyes(2);
        first.setQuantityOfFingers(20);

        System.out.println(first.getName());
        System.out.println(first.getAge());
        System.out.println(first.getGrowht());
        System.out.println(first.getWeight());
        System.out.println(first.getQuantityOfEyes());
        System.out.println(first.getQuantityOfFingers());

    }

    @Test
    public void workingWithIphone () {
        Iphone first = new Iphone();
        first.setModelName("Iphone 14 PRO MAX");
        first.setColor("Purple");
        first.setBatteryL(100);
        first.setReleaseDate(11.10);
        first.setButton('*');
        first.setPrice(1299.99);

        System.out.println("Today is a nice day to release new iphone! ");
        System.out.println(first.getModelName());
        System.out.println("And new color:");
        System.out.println(first.getColor());
        System.out.println("How much it is?");
        System.out.println(first.getPrice());
        System.out.println("It's time to see a new button");
        System.out.println(first.getButton());
    }

    @Test
    public void workingWithLamps(){
        Lamps a = new Lamps();
        a.setColor("Black");
        a.setBrightness(11.22);
        a.setIllumination(7.34);
        a.setPower(1000.00);
        a.setColorfulTemperature(6.8);
        a.setQuantityOfLampsInRoom(25);

        System.out.println(a.getColor());
        System.out.println(a.getBrightness());
        System.out.println(a.getPower());
        System.out.println(a.getIllumination());
        System.out.println(a.getQuantityOfLampsInRoom());
        System.out.println(a.getColorfulTemperature());
    }

    @Test
    public void workingWithScooter(){
        Scooter b = new Scooter();
        b.setManufacture("Xiaomi");
        b.setColor("Black");
        b.setEnergyCharge(1000);
        b.setMaxSpeed(25);
        b.setQuantityOfWheels(2);

        System.out.println(b.getManufacture());
        System.out.println(b.getColor());
        System.out.println(b.getEnergyCharge());
        System.out.println(b.getMaxSpeed());
        System.out.println(b.getQuantityOfWheels());
    }

    @Test
    public void workingWithSpoon(){
        Spoon c = new Spoon();
        c.setMetalType("Silver");
        c.setColor("Gray");
        c.setWidth(0.5);
        c.setLength(15.00);
        c.setElasticity("Durable");

        System.out.println("What about spoon?");
        System.out.println(c.getMetalType());
        System.out.println(c.getColor());
        System.out.println(c.getWidth());
        System.out.println(c.getLength());
        System.out.println(c.getElasticity());
    }



}


