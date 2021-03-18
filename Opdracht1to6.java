package exceptions;

public class Opdracht1to6 {

    private String nissanGTR;
    private int autonomie;


    public Opdracht1to6(String nissanGTR, int autonomie) {
        this.nissanGTR = nissanGTR;
        this.autonomie = autonomie;
    }

    public String getNissanGTR() {
        return nissanGTR;
    }

    public void setNissanGTR(String nissanGTR) throws Exception{
        this.nissanGTR = nissanGTR;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    public void zeroToHundred(int seconds){
        System.out.println(" 0 to 100 in in: " +seconds+ "seconds");

    }

    public void listenToRadio (String FM){
        int channel = Integer.parseInt("FM");
        System.out.println("EuroBeat");
    }

    public void maxTopSpeed (int kmPerHour) throws CustomClassException {
        if (kmPerHour>250) throw new CustomClassException();
        System.out.println("that car is f'in fast bro, it goes: " +kmPerHour+ " Km per hour " );
    }
}
