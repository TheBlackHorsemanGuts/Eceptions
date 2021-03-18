package exceptions;

public class OpdrachtenApp {
    public static void main(String[] args) {

        Opdracht1to6 opdracht1 = new Opdracht1to6("R34", 800);
        Opdracht1to6 opdracht2 = null;
        opdracht1.listenToRadio("106");

        opdracht1.zeroToHundred(6);

        try {
            opdracht1.listenToRadio("FM");

        } catch (NumberFormatException e) {
            System.out.println("FZ is not a valid radio channel");
            //e.printStackTrace();


            try {
                opdracht2.zeroToHundred(10);

            } catch (Throwable b) {
                System.out.println("This cannot be true, car does not exist");
            }


            try {
                opdracht1.listenToRadio("azerty");
                int i = 0 / 0;
                opdracht1.maxTopSpeed(350);

            } catch (Exception f) {
                System.out.println(" just debugging");
                System.err.println();
            } finally {
                System.out.println(" Bro are you serious? radio azerty? really? wow no imagination ! ");

            }


            try {
                opdracht1.getNissanGTR();
            } catch (Exception r) {
                System.out.println("it works mouhaha");
            } catch (ExceptionInInitializerError exceptionInInitializerError) {
                System.out.println(" I have no idea what exceptionInInitializerError is for ");
                exceptionInInitializerError.printStackTrace();
            }


        }
    }
}




