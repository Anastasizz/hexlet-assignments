package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> orignStorage = storage.toMap();
        var entries = orignStorage.entrySet();

        //очистить storage
        orignStorage.forEach(( key,value ) -> {
            storage.unset(key);
        });

        orignStorage.forEach(( key,value ) -> {
            storage.set(value, key);
        });

    }
}
// END
