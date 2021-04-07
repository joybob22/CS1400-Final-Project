import java.util.Scanner;

public class StoryBeginning {
    private static Scanner input = new Scanner(System.in);

    // This is the method that will be used to begin the story
    public static void start() {
        // Type out words
        Output.type("He ");
        Output.delayMilliseconds(700);
        System.out.println("**STATIC**");
        Output.delayMilliseconds(700);
        Output.type("Ca ");
        Output.delayMilliseconds(700);
        System.out.print("**STATIC**");
        Output.delayMilliseconds(700);
        Output.type(" me?");
        System.out.println();
        Output.delayMilliseconds(1000);
        Output.type("Hello!");
        Output.delayMilliseconds(1000);
        Output.type(" Can anybody hear me?");
        Output.delayMilliseconds(1000);
        System.out.println("\n");

        // Output the choices
        Output.choices("Yes I can hear you!", "New phone who dis?");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene1();
                validInput = true;
                break;
            case 2:
                scene1a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene1() {
        System.out.println();
        Output.type("YES!!!");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("I have been trying to get this radio working for the past 16 hours!");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("You will not believe what has been going on up here!");
        Output.delayMilliseconds(1000);
        Output.type(" My team has totally turned mad and I need out ASAP!");
        System.out.println("\n");

        // Output the choices
        Output.choices("Sounds like a me problem", "Woah woah slow down! What's going on???");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here
                scene1a();
                validInput = true;
                break;
            case 2:
                // Add a scene here

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }

    }

    public static void scene1a() {
        System.out.println();
        Output.type("HA.....");
        Output.delayMilliseconds(1000);
        Output.type("HA.....");
        Output.delayMilliseconds(1000);
        Output.type("Very funny...");
        Output.delayMilliseconds(1000);
        Output.type("I am currently trapped on Mars!!");
        Output.delayMilliseconds(1000);
        Output.type(" I need you to take this seriously!");
        System.out.println("\n");

        // Output the choices
        Output.choices("Okay fine...", "Mars? What's going on???");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here

                validInput = true;
                break;
            case 2:
                // Add a scene here

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }
}
