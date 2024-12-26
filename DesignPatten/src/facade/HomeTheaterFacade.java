package facade;

import facade.components.*;

import java.awt.event.AdjustmentEvent;

// 外观模式封装组件，提供简单的调用方式
public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcorPopper popper;

    public HomeTheaterFacade(
            Amplifier amplifier, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector
            , Screen screen, TheaterLights lights, PopcorPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvd;
        this.cdPlayer = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie " + movie);
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.dvdOn();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down theater");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
