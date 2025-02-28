package exercise;


import java.util.Map;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> orignStorage = storage.toMap();
        Set<Map.Entry<String, String>> entries = orignStorage.entrySet();

        //очистить storage
        orignStorage.forEach((key, value) -> {
            storage.unset(key);
        });

        orignStorage.forEach((key, value) -> {
            storage.set(value, key);
        });

    }
}
// END
