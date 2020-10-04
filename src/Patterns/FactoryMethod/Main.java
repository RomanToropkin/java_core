package Patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        WebDialog dialog1 = new WebDialog();
        WindowsDialog dialog2 = new WindowsDialog();
        dialog1.render();
        dialog2.render();

    }
}
