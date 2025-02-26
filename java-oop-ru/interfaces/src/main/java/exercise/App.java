package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        return homes.stream()
                .sorted((h1, h2) -> Double.compare(h1.getArea(), h2.getArea()))
                .limit(count)
                .map(home -> home.toString())
                .toList();
    }
}
// END
