public class Main {
    public static void main(String[] args) {

        ControlElement[] elements = new ControlElement[20];

        for (int i = 0; i < elements.length; i++) {
            int x = i * 10, y = i * 5;
            switch (i % 3) {
                case 0 -> elements[i] = new Button("Btn" + i, x, y);
                case 1 -> elements[i] = new Checkbox("Opt" + i, i % 2 == 0, x / 3, y / 4);
                case 2 -> elements[i] = new TextField("Hint", "val" + i, x / 5, y / 5);
            }
        }


        for (ControlElement e : elements) System.out.println(e);

        System.out.println("\n1) Текст выбранных чекбоксов:");
        Queries.printSelectedCheckboxTexts(elements);

        System.out.println("\n2) Текст полей с hint’ом (не пустых):");
        Queries.printNonEmptyTextFieldsWithHint(elements);

        System.out.println("\n3) Элементы с x == 30:");
        Queries.printElementsByX(elements, 30);
    }
}
