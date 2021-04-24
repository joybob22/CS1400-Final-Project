import java.util.Scanner;

public class StoryMiddle {
   
   private static Scanner input = new Scanner(System.in);
   
       public static void storyMiddle1() {
       Output.type("Door ahead is open! do I keep exploring or chance it? Wait, and hope?");
       System.out.println();
       Output.delayWithDots(3);
       System.out.println();

       Output.choices("Continue exploring base", "Wait for contact?");
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                storyMiddle2();
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
public static void storyMiddle2() {
       
        Output.type("Welp, I have nothing left but to wait");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("Oh no there is a crackin my helmet glass!");
        System.out.println("\n");
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("let me patch that before moving on!");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Got it");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Whew!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("Yes, too close!");
        Output.delayMilliseconds(700);
        Output.type(" I think i stopped it!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type(" I need to get in the greenhouse.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I've gotta repair this or wait.");
        System.out.println();
        
        System.out.println("\n");

        Output.choices("Comms!", "Break down the door to garage!");


       
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                tryKeys();
                validInput = true;
                break;
            case 2:
                // insert a scene here
                breakDoorWithAxe();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }


       
      public static void tryKeys() {
        System.out.println();
        Output.type("Okay I will start trying these keys and let you know how it goes.");
        System.out.println();
        Output.delayWithDots(7);
        System.out.println();
        Output.type("Still no luck.");
        Output.delayMilliseconds(700);
        Output.type(" I'll keep trying!");
        System.out.println();
        Output.delayWithDots(7);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN RUNNING LOW!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: 5 MINUTES BEFORE OXYGEN DEPLETION!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("Oh no!");
        Output.delayMilliseconds(700);
        Output.type(" Hopefully these next few keys are the right one!");
        System.out.println();
        Output.delayWithDots(5);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN DEPLETED!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.delayWithDots(5);
        System.out.println();
        Output.type("TRANSMISSION TERMINATED");
        System.out.println("\n");
        Output.type("MISSION FAILED");
        System.out.println("\n" + Colors.ANSI_RESET);

        Output.choices("Go back to last crucial decision", "End Game");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                storyMiddle1();
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

    public static void breakDoorWithAxe() {
        System.out.println();
        Output.type("I'll start swinging away!");
        Output.delayMilliseconds(700);
        Output.type(" Hopefully I am able to break through!");
        System.out.println();
        Output.delayWithDots(7);
        System.out.println();
        Output.type("Quick update: I made my first dent in the door.");
        Output.delayMilliseconds(700);
        Output.type(" This is proving to be very difficult.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Well");
        Output.delayWithDots(3);
        Output.type(" Back to swinging.");
        System.out.println();
        Output.delayWithDots(7);
        System.out.println();
        Output.type("Okay I have made a hole the size of a baseball.");
        Output.delayMilliseconds(700);
        Output.type(" This might actually be possible.");
        System.out.println();
        Output.delayWithDots(7);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: 5 MINUTES BEFORE OXYGEN DEPLETION!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("I almost have created a large enough hole in the door to sqeeze into the closet!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I think I'll make it through in time!");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Okay I'm through!");
        Output.delayMilliseconds(700);
        Output.type(" Alright lets see what we got in here.");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("Yep we got a spare oxygen tank!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN DEPLETED!");
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("Oh wow that was close!");
        Output.delayMilliseconds(700);
        Output.type(" I was literally blacking out as I put my helmet on!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("The metrics read that I have a couple days of oxygen in this tank.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("That should be enough time get a game plan going!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Now I'll depressuraize this room and get going!");
        System.out.println();
        Output.delayWithDots(7);
        System.out.println();
        StoryMiddle.storyMiddle1();
    }
}



      