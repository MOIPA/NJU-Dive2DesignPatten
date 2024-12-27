package command;

import command.basic_command.Command;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl() {}
    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed() {
        this.slot.execute();
    }
}
