package Patterns.Command.commands;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> stack = new Stack<>();

    public void push(Command c) {
        stack.push(c);
    }

    public Command pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
