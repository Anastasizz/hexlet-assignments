package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface tag;

    public LabelTag(String text, TagInterface tag) {
        this.text = text;
        this.tag = tag;
    }

    @Override
    public String render() {
        // <label>Press Submit<input type="submit" value="Save"></label>
        return "<label>" + text + tag.render() + "</label>";
    }
}
// END
