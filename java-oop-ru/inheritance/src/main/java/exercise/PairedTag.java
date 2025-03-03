package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    private String text;
    private List<Tag> childTags;

    public PairedTag(String name,
                     Map<String, String> attributes,
                     String text,
                     List<Tag> childTags) {
        super(name, attributes);
        this.text = text;
        this.childTags = childTags;
    }

    public String toString() {
        // <p id="abc">Text paragraph</p>
        //<div class="y-5"><br id="s"><hr class="a-5"></div>
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

//        childTags.forEach((child) -> {
//            sb.append(child.toString());
//        });

        String childText = childTags.stream()
                                    .map(Tag::toString)
                                    .collect(Collectors.joining());

        sb.append(childText);
        sb.append(text);
        sb.append(String.format("</%s>", getName()));
        return sb.toString();
    }
}
// END
