package pageobject;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.*;
import pageobject.pages.PassengersInfo;

public class TicketsTestOnPages {
    private final String URL = "qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("TestName", "TestSurname", "CCC", 2,
                1, 4, "16-05-2018");
        int seatNr = RandomUtils.nextInt(1, 35);


        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengersInfo infoPage = new PassengersInfo(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Error msg!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Error msg!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error msg");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error msg!");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error message!");
        infoPage.book();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);
        int selectedSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

        seatSelectionPage.book();

        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");

    }
}