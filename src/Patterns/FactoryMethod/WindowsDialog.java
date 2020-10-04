package Patterns.FactoryMethod;

public class WindowsDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new AndroidButton();
    }
}
