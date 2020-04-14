package Chap07_Adapter_Pacade_Pattern.PacadePattern;



public class HomeTheaterFacade {
    Amplifier amp;
    CdPlayer cd;
    Projector projector;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, CdPlayer cd, Projector projector, Screen screen, PopcornPopper popper){
        this.amp=amp;

        this.cd=cd;
        this.projector= projector;
        this.screen=screen;
        this.popper=popper;
    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie.."+movie);
        popper.on();
        popper.pop();
        screen.down();
        projector.on();
        amp.on();
        amp.setCD(cd);
        amp.setVolume(5);
        cd.on();
        cd.play();
    }
    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        screen.up();
        projector.off();
        amp.off();
        cd.off();
    }
}
