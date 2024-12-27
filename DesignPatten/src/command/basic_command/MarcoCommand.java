package command.basic_command;

public class MarcoCommand implements Command {

    Command[] commands;

    public MarcoCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = this.commands.length-1; i >= 0; i--) {
            this.commands[i].undo();
        }
    }
}
