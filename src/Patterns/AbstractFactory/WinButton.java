package Patterns.AbstractFactory;

public class WinButton implements Button{

    @Override
    public void render() {
        System.out.println("WinButton rendered");
    }
}
