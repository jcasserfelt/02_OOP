package Sprint2.ScannersMM.Gymet;

import java.util.Date;

public class MembershipPayDate {
    public static Date converter(String input) {
        Date d = new Date(Integer.parseInt(input.substring(0, 4)), Integer.parseInt(input.substring(5, 6)), Integer.parseInt(input.substring(8, 9)));
        return d;
    }
}
