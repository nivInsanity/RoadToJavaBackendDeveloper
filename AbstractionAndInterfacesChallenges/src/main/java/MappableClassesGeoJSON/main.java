package MappableClassesGeoJSON;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Prague Astronomical Clock", UsageType.GOVERNMENT));
        mappables.add(new Building("Franz Kafka Museum", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Powder Tower", UsageType.GOVERNMENT));

        mappables.add(new UtilityLine("Pařížská Street", UtilityType.ELECTRICAL));
        mappables.add(new UtilityLine("Swimming Stadium Podoli", UtilityType.WATER));

        for (var map : mappables) {
            Mappable.mapIt(map);
        }
    }
}
