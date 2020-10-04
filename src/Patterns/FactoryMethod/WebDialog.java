package Patterns.FactoryMethod;

public class WebDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new iOSButton();
    }
}
