import java.util.concurrent.TimeUnit;

public class Output {
    public static void type(String theOutput) {
        for (int i = 0; i < theOutput.length(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(65);
                System.out.print(theOutput.charAt(i));
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED!!!");
            }
        }
    }
}
