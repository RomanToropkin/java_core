package Patterns.FactoryMethod;

public class AndroidButton implements Button{

    @Override
    public void render() {
        System.out.println("Android button is render!");
    }

    @Override
    public void onClick() {
        System.out.println("Android button clicked!");
    }
}
