package hw2;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

public class WorkingTransportAndRoad {
    @Test
    public void WorkingTransRoad (){

        Transport car = new Transport();
        car.setTypeOfTransport("Car");
        car.setConsumption(6.9);
        car.setVolume(65);


        Transport train = new Transport();
        train.setTypeOfTransport("Train");
        train.setConsumption(25);
        train.setVolume(6800);

        Transport plane = new Transport();
        plane.setTypeOfTransport("Plane");
        plane.setConsumption(2000);
        plane.setVolume(23830);

        Road first = new Road();
        first.setPointA("Jurmala");
        first.setPointB("Panevezys");
        first.setDistance(142.00);

        Road second = new Road();
        second.setPointA("Riga");
        second.setPointB("Paris");
        second.setDistance(1703.00);

        Road third = new Road();
        third.setPointA("Riga");
        third.setPointB("Rome");
        third.setDistance(1866.00);

        System.out.print ("Road from ");
        System.out.print(first.getPointA());
        System.out.print(" to ");
        System.out.println(first.getPointB());
        System.out.println(car.getTypeOfTransport());
        System.out.print(car.getVolume());







    }
}
