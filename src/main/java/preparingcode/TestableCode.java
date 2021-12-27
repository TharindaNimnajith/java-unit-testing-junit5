package preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestableCode {
    public static String[] knownNames = {"Zeynep", "Tess", "Marina", "Jade", "Eric", "Jamal", "Malika", "James"};
    public static String[] specialNames = {"Zach", "Martin", "Noah", "Tess"};

    public String greetUser(String name) {
        String greetUser = "";
        if (Arrays.asList(knownNames).contains(name)) {
            greetUser += "I know you, " + name + ".";
            if (Arrays.asList(specialNames).contains(name))
                greetUser += "You're even on our VIP list!";
        } else if (Arrays.asList(specialNames).contains(name))
            greetUser += "I don't know you, " + name + ". But you are on our VIP list!";
        else
            greetUser += "stranger";
        return greetUser;
    }

    public String greetDay(LocalDateTime dateTime) {
        String greetDayPart = "";
        if (dateTime.getHour() < 6)
            greetDayPart += "Good night, ";
        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12)
            greetDayPart += "Good morning,";
        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18)
            greetDayPart += "Good afternoon, ";
        if (dateTime.getHour() >= 18)
            greetDayPart += "Good evening, ";
        return greetDayPart;
    }
}
