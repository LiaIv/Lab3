import java.util.Objects;

public class Button extends ControlElement {
    private String text;

    public Button(){
        this("Button", 0, 0);
    }
    public Button(String text, int x, int y) {
        super(x, y);
        setText(text);
    }
    public Button(Button other) {
        super(other); this.text = other.text;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        if (text == null || text.isBlank()) throw new IllegalArgumentException("Button text cannot be empty");
        this.text = text;
    }

    @Override public String toString() {
        return super.toString().replace("]", String.format(", text=\"%s\"]", text));
    }

    @Override public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(text, ((Button) o).text);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}
