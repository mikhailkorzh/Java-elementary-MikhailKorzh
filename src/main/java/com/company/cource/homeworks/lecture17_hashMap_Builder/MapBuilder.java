package homeworks.lecture17_hashMap_Builder;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("page", "1");
        map.put("lang", "UA");
        return map;
    }
}
