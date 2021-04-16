import java.util.Scanner;

public class StoryMiddle {
   
   private static Scanner input = new Scanner(System.in);
   
       public static void StoryMiddle() {
       Output.type("Door is open");
       System.out.println();
       Output.delayWithDots(3);
       Output.choices("Continue exploring base", "Wait for contact?");
       
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                storyMiddle1(false);
                validInput = true;
                break;
            case 2:
                StoryMiddle1(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        
       }
       }
       System.out.println();
       Output.type("Wait");
       if (wait) {
            Output.type(" I noticed a leak in the airline.");
            Output.delayMilliseconds(700);
            Output.type(" That will have to be fixed and you can continue.");
        } else {
            Output.type(" You run to the garage and oxygen runs out...");
        }
        System.out.println("\n");
        
        Output.choices("Are you going to go outside to seal it?"," Will you go stay in the greenhouse?");


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
    



   