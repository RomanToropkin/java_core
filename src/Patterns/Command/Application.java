package Patterns.Command;

import Patterns.Command.editor.Editor;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
