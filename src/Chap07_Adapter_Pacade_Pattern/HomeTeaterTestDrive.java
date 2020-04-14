package Chap07_Adapter_Pacade_Pattern;

public class HomeTeaterTestDrive {
    public static void main(String [] args){
        Amplifier amp = new Amplifier();
        CdPlayer cd=new CdPlayer();
        Projector projector=new Projector();
        Screen screen=new Screen();
        PopcornPopper popper=new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amp, cd, projector, screen, popper);
        homeTheaterFacade.watchMovie("Raiders of the lost ark");
        homeTheaterFacade.endMovie();
    }
}
