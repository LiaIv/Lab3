import java.util.Objects;

public class TextField extends ControlElement {
    private String hint;
    private String text;

    public TextField() {
        this("Введите текст", "", 0, 0);
    }

    public TextField(String hint, String text, int x, int y) {
        super(x, y);
        setHint(hint);
        setText(text);
    }
    public TextField(TextField other) {
        super(other); this.hint = other.hint; this.text = other.text;
    }

    public String getHint() {
        return hint;
    }
    public void setHint(String hint) {
        if (hint == null) throw new IllegalArgumentException("Hint can't be null");
        this.hint = hint;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Text can't be null");
        this.text = text;
    }

    @Override public String toString() {
        return super.toString().replace("]", String.format(", hint=\"%s\", text=\"%s\"]", hint, text));
    }

    @Override public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        TextField tf = (TextField) o;
        return Objects.equals(hint, tf.hint) && Objects.equals(text, tf.text);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), hint, text);
    }
}
