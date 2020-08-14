package toolkit;

import com.jfoenix.controls.JFXDatePicker;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tools {
    final static int MAX_NAME_LENGTH = 40;
    final static int MAX_PHONE_NUMBER_LENGTH = 20;
    final static int MAX_ADDRESS_LENGTH = 40;
    final static int MAX_CITY_LENGTH = 20;
    final static int MAX_BIRTH_LOCATION_LENGTH = 40;
    final static int MAX_NAME_ON_CARD_LENGTH = 25;

    //max 40
    public static boolean checkNameLength(String name) {
        return (name.length()>MAX_NAME_LENGTH);
    }

    // no letter and max 20
    public static boolean validPhoneNumber(String phoneNumber) {
        return (phoneNumber.length()>MAX_PHONE_NUMBER_LENGTH);

    }

    //max 40
    public static boolean validAddressLength(String address) {
        return (address.length()>MAX_ADDRESS_LENGTH);

    }

    //max 20
    public static boolean validCityLength(String city) {
        return (city.length()>MAX_CITY_LENGTH);

    }

    //max 40
    public static boolean validBirthLocationLength(String location) {
        return (location.length()>MAX_BIRTH_LOCATION_LENGTH);

    }

    //max 25
    public static boolean validNameOnCardLength(String name) {
        return (name.length()>MAX_NAME_ON_CARD_LENGTH);

    }

    public static void validDate() {

    }


}
