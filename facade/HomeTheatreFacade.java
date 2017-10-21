

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamed
 */
public class HomeTheatreFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheatreLights lights;
    private Screen screen;
    private PopcornPopper popper;
    
    public HomeTheatreFacade(
            Amplifier amp,
            Tuner tuner,
            DvdPlayer dvd,
            CdPlayer cd,
            Projector projector,
            TheatreLights lights,
            Screen screen,
            PopcornPopper popper
    ) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }
    
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch " + movie);
        popper.on();
        lights.on();
        screen.on();
        projector.on();
        amp.on();
        dvd.on();
    }
    
    public void endMovie() {
        System.out.println("Shutting down movie theatre....");
        popper.off();
        lights.off();
        screen.off();
        projector.off();
        amp.off();
        dvd.off();
    }
}
