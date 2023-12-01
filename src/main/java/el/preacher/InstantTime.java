package el.preacher;

import java.time.Instant;

public class InstantTime {

    private int get(Instant instant, int beginIndex, int endIndex) {
        if (instant == null)
            return -1;
        return Integer.parseInt(
                instant.toString()
                        .substring(beginIndex, endIndex)
        );
    }

    public int getYear(Instant instant) {
        return get(instant, 0, 4);
    }

    public int getMonthValue(Instant instant) {
        return get(instant, 5, 7);
    }

    public int getDayOfMonth(Instant instant) {
        return get(instant, 8, 10);
    }

    public String getMonth(Instant instant) {
        if (instant == null)
            return "";
        switch (getMonthValue(instant)) {
            case (1): {
                return "JANUARY";
            }
            case (2): {
                return "FEBRUARY";
            }
            case (3): {
                return "MARCH";
            }
            case (4): {
                return "APRIL";
            }
            case (5): {
                return "MAY";
            }
            case (6): {
                return "JUNE";
            }
            case (7): {
                return "JULY";
            }
            case (8): {
                return "AUGUST";
            }
            case (9): {
                return "SEPTEMBER";
            }
            case (10): {
                return "OCTOBER";
            }
            case (11): {
                return "NOVEMBER";
            }
            case (12): {
                return "DECEMBER";
            }
            default: {
                return "";
            }
        }
    }

}
