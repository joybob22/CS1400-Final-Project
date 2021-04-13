import java.util.concurrent.TimeUnit;

public class Output {
    public static void type(String theOutput, String... color) {
        for (int i = 0; i < theOutput.length(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(70);
                System.out.print((color.length != 0 ? color[0] : "") + theOutput.charAt(i));
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

    public static void delayWithDots(int sec) {
        for (int i = 0; i < sec; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(". ");
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED!!!");
            }
        }
    }

    public static void choices(String option1, String option2) {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[1] " + option1);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[2] " + option2);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED!!!");
        }
    }

    public static void choices(String option1, String option2, String option3) {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[1] " + option1);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[2] " + option2);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("[3] " + option3);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED!!!");
        }
    }
}
