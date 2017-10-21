/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mohamed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeTheatreFacade facade = new HomeTheatreFacade(
                                                            new Amplifier(),
                                                            new Tuner(),
                                                            new DvdPlayer(),
                                                            new CdPlayer(),
                                                            new Projector(),
                                                            new TheatreLights(),
                                                            new Screen(),
                                                            new PopcornPopper()
                    );
        facade.watchMovie("Raiders of the lost ark");
        facade.endMovie();
    }
    
}
