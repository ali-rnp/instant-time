package el.preacher;

import java.time.Instant;

public class InstantTime {

    public int getYear(Instant instant){
        if (instant == null)
            return -1;
        return Integer.parseInt(
                instant.toString()
                        .substring(0, 4)
        );
    }

    public int getMonthValue(Instant instant){
        if (instant == null)
            return -1;
        return Integer.parseInt(
                instant.toString()
                        .substring(5, 7)
        );
    }

    public String getMonth(Instant instant){
        if (instant == null)
            return "";
        switch (getMonthValue(instant)) {
            case (1) : {
                return "JANUARY";
            }
            case (2) : {
                return "FEBRUARY";
            }
            case (3) : {
                return "MARCH";
            }
            case (4) : {
                return "APRIL";
            }
            case (5) : {
                return "MAY";
            }
            case (6) : {
                return "JUNE";
            }
            case (7) : {
                return "JULY";
            }
            case (8) : {
                return "AUGUST";
            }
            case (9) : {
                return "SEPTEMBER";
            }
            case (10) : {
                return "OCTOBER";
            }
            case (11) : {
                return "NOVEMBER";
            }
            case (12) : {
                return "DECEMBER";
            }
            default : {
                return "";
            }
        }
    }

    public int getDayOfMonth(Instant instant){
        if (instant == null)
            return -1;
        return Integer.parseInt(
                instant.toString()
                        .substring(8, 10)
        );
    }
}
