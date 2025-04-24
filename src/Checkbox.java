import java.util.Objects;

public class Checkbox extends ControlElement {
    private boolean selected;
    private String  text;

    public Checkbox() {
        this("Checkbox", false, 0, 0);
    }

    public Checkbox(String text, boolean selected, int x, int y) {
        super(x, y);
        setText(text);
        this.selected = selected;
    }
    public Checkbox(boolean selected, int x, int y) {

        this("Checkbox", selected, x, y);
    }

    public Checkbox(Checkbox other) {
        super(other);
        this.selected = other.selected;
        this.text = other.text;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean sel) {
        this.selected = sel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null || text.isBlank())
            throw new IllegalArgumentException("Checkbox text cannot be empty");
        this.text = text;
    }


    @Override public String toString() {
        return super.toString().replace("]", String.format(", selected=%b, text=\"%s\"]", selected, text));
    }

    @Override public boolean equals(Object o) {
        return super.equals(o) &&
                selected == ((Checkbox) o).selected && Objects.equals(text, ((Checkbox) o).text);
    }

    @Override public int hashCode() {

        return Objects.hash(super.hashCode(), selected, text);
    }
}
