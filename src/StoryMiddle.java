import java.util.Scanner;

public class StoryMiddle {
   
   private static Scanner input = new Scanner(System.in);
   
       public static void storyMiddle1() {
       Output.type("Door ahead is open! do I keep exploring or chance it? Wait, and hope?");
       System.out.println();
       Output.type("I could get through this I know it. If I start exploring I may burn up this energy.");
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
       
        Output.type("Welp, I have nothing left to do but to wait");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("Oh no there is a crack in my helmet glass!");
        System.out.println("\n");
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("let me patch that before moving on!");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Got it... thank god it patched othertwise i'd be in big trouble.");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Whew!");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Yes, too close!");
        Output.delayMilliseconds(700);
        Output.type(" I think i stopped it!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type(" I need to get in the greenhouse.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I've gotta repair this or wait....I can definately get into that garage!");
        System.out.println();
        
        System.out.println("\n");

        Output.choices("Comms room STAT!", "Break down the door to garage!");


       
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                commsRoom();
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


       
      public static void commsRoom() {
        System.out.println();
        Output.type("");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("");
        Output.delayMilliseconds(700);
        Output.type(" ");
        System.out.println();
        Output.delayWithDots(3);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("");
        Output.delayMilliseconds(700);
        Output.type(" ");
        System.out.println();
        Output.delayWithDots(5);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.delayWithDots(3);
        System.out.println();
        Output.type("");
        System.out.println("\n");
        Output.type("");
        System.out.println("\n");

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
        Output.type("...");
        Output.delayMilliseconds(700);
        Output.type(" ...");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        Output.type(" ...");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Well");
        Output.delayWithDots(3);
        Output.type(" ...");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        Output.type(" ...");
        System.out.println();
        Output.delayWithDots(7);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("...");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        Output.type(" ....");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("...");
        Output.delayMilliseconds(700);
        Output.type(" ...");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("...");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("...");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        StoryMiddle.storyMiddle1();
    }
}



      