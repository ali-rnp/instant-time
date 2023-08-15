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

}
