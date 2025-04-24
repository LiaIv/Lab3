public class Queries {

    public static void printSelectedCheckboxTexts(ControlElement[] elements) {
        for (ControlElement e : elements) {
            if (e instanceof Checkbox cb && cb.isSelected()) {
                System.out.println(cb.getText());
            }
        }
    }

    public static void printNonEmptyTextFieldsWithHint(ControlElement[] elements) {
        for (ControlElement e : elements) {
            if (e instanceof TextField tf && !tf.getHint().isBlank() && !tf.getText().isBlank()) {
                System.out.println(tf.getText());
            }
        }
    }

    public static void printElementsByX(ControlElement[] elements, int value) {
        for (ControlElement e : elements) {
            if (e.getX() == value) {
                System.out.println(e);
            }
        }
    }
}
