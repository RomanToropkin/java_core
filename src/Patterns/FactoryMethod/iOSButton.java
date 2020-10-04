package Patterns.FactoryMethod;

public class iOSButton implements Button{

    @Override
    public void render() {
        System.out.println("iOS button is render!");
    }

    @Override
    public void onClick() {
        System.out.println("iOS button clicked!");
    }
}
