import java.util.concurrent.TimeUnit;

public class Output {
    public static void type(String theOutput) {
        for (int i = 0; i < theOutput.length(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(80);
                System.out.print(theOutput.charAt(i));
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED!!!");
            }
        }
    }

    public static void delayMilliseconds(int milli) {
        try {
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED!!!");
        }
    }

    public static void choices(String option1, String option2) {
        System.out.println("[1] " + option1);
        System.out.println("[2] " + option2);
    }

    public static void choices(String option1, String option2, String option3) {
        System.out.println("[1] " + option1);
        System.out.println("[2] " + option2);
        System.out.println("[3] " + option3);
    }
}
