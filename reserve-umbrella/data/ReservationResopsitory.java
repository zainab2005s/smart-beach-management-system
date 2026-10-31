package data;
import java.util.HashMap;

import java.util.Map;

/**

 * Data layer for managing beach facility availability.

 */

public class ReservationResopsitory {

    private final Map<String, Integer> inventory = new HashMap<>();

    public ReservationResopsitory() {

        String[] beaches = {

            "Marassi Beach",

            "Al Jazayer Beach",

            "Bilaj Al Jazayer"

        };

        String[] facilities = {

            "Umbrella near water",

            "Beach chair",

            "Umbrella + two chairs"

        };

        for (String beach : beaches) {

            for (String facility : facilities) {

                inventory.put(makeKey(beach, facility), 5);

            }

        }

    }

    private String makeKey(String beach, String facility) {

        return beach + "|" + facility;

    }

    public int getAvailableCount(String beach, String facility) {

        return inventory.getOrDefault(makeKey(beach, facility), 0);

    }

    public boolean reserve(String beach, String facility) {

        String key = makeKey(beach, facility);

        int available = inventory.getOrDefault(key, 0);

        if (available <= 0) {

            return false;

        }

        inventory.put(key, available - 1);

        return true;

    }

}
 