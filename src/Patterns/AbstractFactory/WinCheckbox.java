package Patterns.AbstractFactory;

public class WinCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("WinCheckbox rendered");
    }
}
