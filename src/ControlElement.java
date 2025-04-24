import java.util.Objects;

public abstract class ControlElement {
    private static int nextId = 1;
    private final int id;
    private int x;    // ≥ 0
    private int y;    // ≥ 0


    public ControlElement() {
        this(0, 0);
    }

    public ControlElement(int x, int y) {
        this.id = nextId++;
        setX(x);
        setY(y);
    }

    public ControlElement(ControlElement other) {
        this.id = other.id;
        this.x  = other.x;
        this.y  = other.y;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        requireNonNegative(x, "x"); this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        requireNonNegative(y, "y"); this.y = y;
    }

    private static void requireNonNegative(int v, String name) {
        if (v < 0) throw new IllegalArgumentException(name + " must be ≥ 0");
    }

    @Override public String toString() {
        return String.format("%s[id=%d, x=%d, y=%d]",
                getClass().getSimpleName(), id, x, y);
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControlElement that = (ControlElement) o;
        return id == that.id && x == that.x && y == that.y;
    }

    @Override public int hashCode() {
        return Objects.hash(id, x, y);
    }
}
