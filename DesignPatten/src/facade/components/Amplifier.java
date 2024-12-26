package facade.components;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }
    public void off() {
        System.out.println("Amplifier off");
    }
    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Amplifier setDvd");
    }
    public void setSurroundSound(){
        System.out.println("Amplifier setSurroundSound");
    }
    public void setVolume(int volume) {
        System.out.println("Amplifier setVolume: " + volume);
    }
}
