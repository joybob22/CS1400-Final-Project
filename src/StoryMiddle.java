import java.util.Scanner;

public class StoryMiddle {
   
   private static Scanner input = new Scanner(System.in);
                                                   
                                                      //Method my story continues from

       public static void storyMiddle1() {
       Output.type("Door ahead is open! do I keep exploring or chance it? Wait, and hope?");
       System.out.println();
       Output.type("I could get through this I know it. If I start exploring I may burn up this little energy.");
       Output.delayWithDots(3);
       Output.type("Well I can not afford to sit around and find out, I gotta move");

       System.out.println();

       Output.type("Wait");
//        if (wait) {
//             Output.type("I noticed a leak in the airline.");
//             Output.delayMilliseconds(700);
//             Output.type("That will have to be fixed and you can continue, Or chance it and run.");
//         } else {
//             Output.type("You run to the garage and oxygen runs out...");
//         }
        System.out.println("\n");
        
        Output.choices("Are you going to go outside to seal it?"," Will you go stay/wait in the greenhouse?");



       Output.choices("Continue exploring base", "Wait for contact?");  //Choices output
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:                 //Calling a scene based off Choices
                storyMid2();
                validInput = true;
                break;
            case 2:
                storyMiddle2();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }

    }
    
public static void storyMid2(){
   Output.type("You begin running around the base, only to have a steel beam impale you.");


   

   Output.choices("Go back to last crucial decision", "End Game");
   
                                       //Paths based on input depending on choice
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


public static void storyMiddle2() {
       
        Output.type("Welp, I have nothing left to do but to wait");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("Oh no wait... there is a crack in my helmet glass!");
        System.out.println("\n");
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("If I started exploring i'd have died!");
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
        Output.type(" I need to get in the COMMS Room.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I've gotta repair communication or wait a sec...I can definately get into that garage!");
        System.out.println();
        Output.type(" The warning lights are going off in the COMMS room though, might be risky.");

        
        System.out.println("\n");

        Output.choices("Comms room STAT!", "Break down the door to garage!");


       
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // scene here
                commsRoom();
                validInput = true;
                break;
            case 2:
                // scene here
                breakDoor();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }


       
      public static void commsRoom() {
        System.out.println();
        Output.type("Uh-oh this might have been a bad call");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("I see the emergency power switch");
        Output.delayMilliseconds(700);
        Output.type(" There is a puddle on the ground");
        System.out.println();
        Output.delayWithDots(3);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("I do'nt know what it is but I better avoid it");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("It is only a couple feet wide I can jump it.");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("Better that than walk through it, I see exposed wires everywhere");
        Output.delayMilliseconds(700);
        Output.type(" Plus I dunno what the liquid is.");
        System.out.println();
        Output.delayWithDots(5);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("**As you clear the puddle upon landing a wire gets dislodged from the ceiling**");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.delayWithDots(3);
        System.out.println();
        Output.type("UH-OH");
        System.out.println("\n");
        Output.type("The wire hits your chest with and couple million volts come with it");
        System.out.println("\n");
        Output.type("...DEAD");

        Output.choices("Go back to last crucial decision", "End Game");

        // Continue choosing paths based on inout and what scene is called
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

    public static void breakDoor() {
        System.out.println();
        Output.type("I got in!");
        Output.delayMilliseconds(700);
        Output.type(" The Rover!!");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("...If I can take this we will be golden");
        Output.delayMilliseconds(700);
        Output.type(" I just may make it out of here");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Well");
        Output.delayWithDots(3);
        Output.type(" Oh no the Rover is dead");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("This can not be happening, I have gotta find a way.");
        Output.delayMilliseconds(700);
        Output.type(" I see an audio log from the former crew i'll play that.");
        System.out.println();
        Output.delayWithDots(3);
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("***If anyone hears this the Rover needs to be charged before you can use it***");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("***We did'nt have the time, an emergency power cell is in here use it***");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("***you may get further than we did, we were forced to carry on on foot***");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("okay got it repaired");
        Output.delayMilliseconds(700);
        Output.type(" Should I bail out or keep exploring the base I wonder");
        System.out.println();
        Output.delayWithDots(3);
        System.out.println();
        Output.type("Well I have to do something, I can not waste any more time");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.type("I can Take the Rover or keep exploring");
        Output.delayMilliseconds(700);
        System.out.println("\n");
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("I have a sinking feeling I wont be coming back");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        StoryMiddle.storyMiddle1();   // segway further into story
    }
}



      