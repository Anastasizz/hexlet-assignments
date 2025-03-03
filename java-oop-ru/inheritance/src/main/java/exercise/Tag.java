package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes ) {
        this.name = name;
        this.attributes = new LinkedHashMap<String, String>(attributes);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<%s", name));

        attributes.forEach((key,value) -> {
            sb.append(String.format(" %s=\"%s\"", key, value));
        });

//        String attrText = attributes.entrySet().stream()
//                .map((value) -> {
//                    return String.format(" %s=\"%s\"", value.getKey(), value.getValue());
//                })
//                .collect(Collectors.joining());
//        sb.append(attrText);

        sb.append(">");
        return sb.toString();
    }
}
// END
