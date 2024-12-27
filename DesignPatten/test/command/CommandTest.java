package command;

import command.basic_command.*;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    public void run(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Command lightCommand = new LightOnCommand(light);

        remote.setCommand(lightCommand);
        remote.buttonWasPressed();

        Command garageDoor = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoor);
        remote.buttonWasPressed();

    }

    @Test
    public void runRemoteControl(){
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOnCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorOffCommand = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(0,lightOnCommand,lightOffCommand);
        remote.setCommand(1,garageDoorOnCommand,garageDoorOffCommand);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
    }
}