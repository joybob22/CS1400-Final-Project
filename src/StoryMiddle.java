import java.util.Scanner;

public class StoryMiddle {
   
   private static Scanner input = new Scanner(System.in);
   
       public static void storyMiddle1() {
       Output.type("Door is open, do I keep exploring or chance it, wait, and hope?");
       System.out.println();
       Output.delayWithDots(3);
       Output.choices("Continue exploring base", "Wait for contact?");
       
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                storyMiddle2(false);
                validInput = true;
                break;
            case 2:
                storyMiddle2(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        
       }
       }
       public static void scene1(boolean wait) {

       System.out.println();
       Output.type("Wait");
       if (wait) {
            Output.type("I noticed a leak in the airline.");
            Output.delayMilliseconds(700);
            Output.type("That will have to be fixed and you can continue, Or chance it and run.");
        } else {
            Output.type("You run to the garage and oxygen runs out...");
        }
        System.out.println("\n");
        
        Output.choices("Are you going to go outside to seal it?"," Will you go stay/wait in the greenhouse?");


   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                repair(false);
                validInput = true;
                break;
            case 2:
                repair(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }

    }
    
  public static void garage(boolean searching) {
    if (searching) {
     Output.type("Continue searching base and you find a comms room and garage. ");
     System.out.println();
     Output.delayWithDots(3);
     Output.type("You see live dangling wires in Comms Room");
     System.out.println();
     Output.type("Through the Garage door window you see the Rover, and an audio log next to it!");
}
   Output.choices("Comms Room?", "Garage?");
   boolean validInput = false;
   while (!validInput) {
    System.out.print("\nEnter choice: ");
    switch (input.nextInt()) {
     case 1:
        garage1();
        validInput = true;
        break;
     case 2:
        garage2();
        validInput = true;
        break;
        default:
        System.out.println("Invalid input");
        }
      }
   }
   public static void battery() {
        System.out.println();
        Output.type("Do you wait to listen to logs or jump in the Rover and bounce ", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("There must be a reason for leaving that, I hope the Rover is charged", Colors.ANSI_GREEN);
        System.out.println();
        System.out.println("\n");

        Output.choices("Listen to logs", "Roll out!");

        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                battery1(true);
                validInput = true;
                break;
            case 2:
                battery1(false);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }
     public static void rover() {
        Output.type("okay I see a battery repair kit, or there is another doorway but the pressure alarm is going off! ", Colors.ANSI_RED);
        System.out.println();
       
        System.out.println("\n");

        Output.choices("Repair the battery.", "Risk another route.");

        // Choose path
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // Add scene 
                rover2();
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

    public static void charged(boolean sun) {
        Output.delayMilliseconds(700);
        if (sun) {
            Output.type("The sun is setting...");
            Output.delayMilliseconds(700);
            Output.type(" I'm worried, oxygen and solar power are going to die soon.");
            System.out.println();
            Output.delayWithDots(3);
            System.out.println();
            Output.type("We are going to have to hurry and stay safe at the same time.");
            Output.delayMilliseconds(700);
            Output.type(" We need lights.");
        } else {
            Output.type("Im confused ");
            Output.delayWithDots(3);
            Output.type("Should I just go?!");
        }
        System.out.println("\n");
        Output.choices("You gonna just go?", "Take the time to make sure auxillary power lasts.");

        // choosing path
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

    public static void searching() {
        Output.type("Thank god the oxygen and lights will stay on.");
        Output.delayMilliseconds(700);
        Output.type(" We still do not have a lot of time.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Well I could try just using my suit to get there");
        Output.delayWithDots(3);
        Output.type("Or I could walk around one last time, I am missing something I know it.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Gotta make a choice");
        Output.delayWithDots(4);
        System.out.println("\n");

        Output.choices("Search the room one final time.", "Use only your space suit!?");

        // choosing path
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                //scene 

                validInput = true;
                break;
            case 2:
                //scene 

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void transitionScene2() {
        Output.type("Found a map!");
        Output.delayMilliseconds(700);
        Output.type(" There is a shortcut to the escape ship pods! Or should I stay in here");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type(
                "Now to decide...");
        System.out.println("\n");
        Output.choices("Make a break for it!", "Stay inside main base!");

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
}


