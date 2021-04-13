import java.util.Scanner;

public class StoryBeginning {
    private static Scanner input = new Scanner(System.in);

    // This is the method that will be used to begin the story
    public static void start() {
        // Type out words
        Output.type("INCOMING TRANSMISSION");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("He ");
        Output.delayMilliseconds(700);
        System.out.print("**STATIC**");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("D ");
        Output.delayMilliseconds(700);
        System.out.print("**STATIC**");
        Output.delayMilliseconds(700);
        Output.type(" py?");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("Hello! ");
        Output.delayWithDots(2);
        Output.delayMilliseconds(1000);
        Output.type(" Does anybody copy?");
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
                scene1(false);
                validInput = true;
                break;
            case 2:
                scene1(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene1(boolean silly) {
        System.out.println();
        Output.type("Contact");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("I actually made contact.");
        Output.delayMilliseconds(700);
        if (silly) {
            Output.type(" I need you to take this seriously.");
            Output.delayMilliseconds(700);
            Output.type(" Then maybe I'll have a shot at living another day.");
        } else {
            Output.type(" Maybe I'll survive.");
        }
        System.out.println("\n");

        // Output the choices
        Output.choices("Uhhhh whats going on?", "Little dramatic if you ask me.");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene1a(false);
                validInput = true;
                break;
            case 2:
                scene1a(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }

    }

    public static void scene1a(boolean drama) {
        if (drama) {
            Output.type("You have no idea. ");
        }
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("This morning at 0200 hours there was an explosion.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Most likely caused by a hydrogen leak in the green house.");
        System.out.println();
        Output.type("When the explosion happened I immediatly threw on my space suit in case of an oxygen leak.");
        System.out.println();
        Output.type(
                "Lucky for me I put my helmet on just in time before my door swung open, resulting in all the air whooshing out.");
        System.out.println();
        Output.type(
                "My air tank only had about 5 minutes thanks to my laziness of not wanting to refill it last night after our trip from pod 37B.");
        System.out.println();
        Output.type("I had to act quick so I ran faster than I have ever ran before -- directly to the comms room.");
        System.out.println();
        Output.type("Once I got here I engaged the airlock on the door and prayed the backup oxygen would kick in.");
        System.out.println();
        Output.type(
                "I waited impatiently for the green light next to the door to turn on indicating that the room was pressurized.");
        System.out.println();
        Output.type(
                "I kid you not. The moment my oxygen ran out the light turned green and I threw my helmet right off my head.");
        System.out.println();
        Output.type("Luckily none of the comms equipement seemed to have been damaged in the explosion.");
        System.out.println();
        Output.type("Well ... I can't seem to control where my frequency is recieved.");
        System.out.println();
        Output.type("Hence me reaching out to you rather than to NASA.");
        System.out.println("\n");

        // Output the choices
        Output.choices("Space?", "NASA?");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here
                scene2();
                validInput = true;
                break;
            case 2:
                // Add a scene here
                scene2();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene2() {
        System.out.println();
        Output.type("Right. ");
        Output.delayMilliseconds(700);
        Output.type("I should probably give you some background on the situation.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("You are currently communicating with the first colony on mars.");
        Output.delayMilliseconds(700);
        Output.type(" Well ");
        Output.delayWithDots(3);
        Output.type(" at least whats left of it.");
        System.out.println();
        Output.delayWithDots(4);
        System.out.println();
        Output.type("I need a minute.");
        Output.delayMilliseconds(1000);
        System.out.println();
        System.out.println();
        Output.type("TRANSMISSION TERMINATED");
        System.out.println();
        Output.delayWithDots(10);
        System.out.println();
        System.out.println();
        Output.type("ATTEMPTING RECONNECTION . . . ");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        System.out.println();
        Output.type("RECONNECTION UNSUCCESSFUL");
        System.out.println();
        System.out.println();
        Output.type("TRY AGAIN?");
        System.out.println("\n");

        Output.choices("Yes", "No");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here
                reconnect();
                validInput = true;
                break;
            case 2:
                // Add a scene here
                disconnect();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void reconnect() {
        System.out.println();
        Output.type("ATTEMPTING RECONNECTION . . . ");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        System.out.println();
        Output.type("RECONNECTION SUCCESSFUL");
        System.out.println();
        Output.type("SEND MESSAGE:");
        System.out.println("\n");

        Output.choices("Are there any other survivors?", "Get it together!");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here
                scene3(true);
                validInput = true;
                break;
            case 2:
                scene3(false);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void disconnect() {
        Output.type("TRANSMISSION PERMANENTLY TERMINATED");
        System.out.println();
        Output.type("MISSION FAILED");
        System.out.println("\n");

        Output.choices("Go back to last crucial decision", "End game");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add a scene here
                scene2();
                validInput = true;
                break;
            case 2:

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene3(boolean survivors) {
        Output.delayMilliseconds(1000);
        if (survivors) {
            Output.type("I don't know.");
            Output.delayMilliseconds(700);
            Output.type(" I'm worried.");
            System.out.println();
            Output.delayWithDots(3);
            System.out.println();
            Output.type("Judging by the blast.");
            Output.delayMilliseconds(700);
            Output.type(" I might be the last one here.");
        } else {
            Output.type("I ");
            Output.delayWithDots(3);
            Output.type("I don't know what to do.");
        }
        System.out.println("\n");
        Output.choices("I want to help you.", "Lets take this one step at a time. I won't let you die.");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:

                validInput = true;
                break;
            case 2:

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene3a() {
        Output.type("Thank you.", Colors.ANSI_BLUE);
        Output.delayMilliseconds(1000);
        Output.type(" I need to somehow stabalize the oxygen across the facility.", Colors.ANSI_YELLOW);
        Output.type(" How do");
    }
}
