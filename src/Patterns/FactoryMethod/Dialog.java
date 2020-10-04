package Patterns.FactoryMethod;

import java.util.ArrayList;

public abstract class Dialog {

    public void render(){
        Button btn = createButton();
        btn.render();
        btn.onClick();
    }

    protected abstract Button createButton();

}
