import java.util.Scanner;

public class StoryBeginning {
    private static Scanner input = new Scanner(System.in);

    // This is the method that will be used to begin the story
    public static void start() {
        // Type out words
        Output.type("INCOMING TRANSMISSION", Colors.ANSI_GREEN);
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
        Output.type("TRANSMISSION TERMINATED", Colors.ANSI_RED);
        System.out.println();
        Output.delayWithDots(10);
        System.out.println();
        System.out.println();
        Output.type("ATTEMPTING RECONNECTION . . . ", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        System.out.println();
        Output.type("RECONNECTION UNSUCCESSFUL", Colors.ANSI_RED);
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
        Output.type("ATTEMPTING RECONNECTION . . . ", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        System.out.println();
        Output.type("RECONNECTION SUCCESSFUL", Colors.ANSI_GREEN);
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
        Output.type("TRANSMISSION PERMANENTLY TERMINATED", Colors.ANSI_RED);
        System.out.println();
        Output.type("MISSION FAILED", Colors.ANSI_RED);
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
                scene3a();
                validInput = true;
                break;
            case 2:
                scene3a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene3a() {
        Output.type("Thank you.");
        Output.delayMilliseconds(1000);
        Output.type(" I need to somehow stabalize the oxygen across the facility before the backup oxygen runs out.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("Well");
        Output.delayWithDots(3);
        Output.type("I need to first refill my oxygen tank before depressurizing this room.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Now how do I go about this?");
        Output.delayWithDots(4);
        System.out.println("\n");

        Output.choices("Search the room.", "How long can you hold your breath?");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                scene3b(false);
                validInput = true;
                break;
            case 2:
                // insert a scene here
                scene3c();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene3b(boolean spooked) {
        if (spooked) {
            Output.delayWithDots(4);
            Output.type("I don't like that you are even considering holding my breath as an option. ");
            Output.delayWithDots(4);
            System.out.println();
            Output.type("Lets agree to make holding my breath as a last resort");
            Output.delayWithDots(4);
            System.out.println();
            Output.type("Now to searching the room.");
            Output.delayMilliseconds(700);
            System.out.println();
        } else {
            Output.delayMilliseconds(1000);
            Output.type("Thats a great idea!");
        }

        Output.delayMilliseconds(700);
        Output.type(" Lets see what we got here. ");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Okay we got a closet.");
        Output.delayMilliseconds(700);
        Output.type(" The only issue. ");
        Output.delayWithDots(3);
        Output.type(" Its locked. ");
        Output.delayWithDots(3);
        System.out.println();
        Output.type("There might be a spare oxygen tank in there.");
        System.out.println("\n");

        Output.choices("Bust the door open! We need that!", "Keep searching the room.");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                passOutFromBrokenCollarBone();
                validInput = true;
                break;
            case 2:
                // insert a scene here
                scene4();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void scene3c() {
        Output.type("Uhhhhh about a minute");
        Output.delayWithDots(3);
        Output.type("Why?");
        System.out.println("\n");

        Output.choices("Depressurize the room and go find a full tank of oxygen to attatch to your suit.",
                "Just wondering. You should probably search the room before we worry about that though.");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                depressurizeEarly();
                validInput = true;
                break;
            case 2:
                // insert a scene here
                scene3b(true);
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void depressurizeEarly() {
        Output.delayMilliseconds(1000);
        Output.type("Oh man");
        Output.delayWithDots(3);
        Output.type("You're crazy.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I trust you though");
        Output.delayWithDots(3);
        Output.type("Here goes nothing.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("CONNECTION LOST", Colors.ANSI_RED);
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("ATTEMPTING RECONNECTION", Colors.ANSI_YELLOW);
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("RECONNECTION FAILED", Colors.ANSI_RED);
        Output.delayWithDots(3);
        System.out.println("\n");
        Output.type("TRANSMISSION PERMANENTLY TERMINATED", Colors.ANSI_RED);
        System.out.println("\n");
        Output.type("MISSION FAILED", Colors.ANSI_RED);
        System.out.println("\n");
        System.out.print(Colors.ANSI_RESET);

        Output.choices("Go back to last crucial decision?", "End game.");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene3c();
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

    public static void passOutFromBrokenCollarBone() {
        Output.type("Okay here goes nothing! ");
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Oh man.");
        Output.delayMilliseconds(1000);
        Output.type(" This door is strong!");
        System.out.println();
        Output.type("One more try. ");
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Oh no");
        Output.delayWithDots(3);
        Output.type("I think I broke my collar bone. ");
        Output.delayWithDots(3);
        Output.type("I think");
        Output.delayWithDots(3);
        Output.type(" I might");
        Output.delayWithDots(3);
        Output.type("pass out.");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN RUNNING LOW!", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("OXYGEN LOGS: BACKUP OXYGEN DEPLETED!", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("TRANSMISSION TERMINATED", Colors.ANSI_RED);
        System.out.println("\n");
        Output.type("MISSION FAILED", Colors.ANSI_RED);
        System.out.println("\n" + Colors.ANSI_RESET);

        Output.choices("Go back to last crucial decision", "End Game");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene3b(false);
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

    public static void scene4() {
        Output.type("Good call.");
        Output.delayMilliseconds(700);
        Output.type(" That door is metal.");
        Output.delayMilliseconds(700);
        Output.type(" Would be difficult to get open.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Maybe I'll find a key.");
        Output.delayMilliseconds(700);
        Output.type(" Lets see what else we got in this room.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("Theres some drawers I can look through.");
        Output.delayWithDots(4);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN RUNNING LOW.", Colors.ANSI_YELLOW);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: 5 MINUTES BEFORE OXYGEN DEPLETION.", Colors.ANSI_YELLOW);
        System.out.println("\n");
        Output.type("Oh no!");
        Output.delayMilliseconds(700);
        Output.type(" I'm going to see if I can access the oxygen system from one of these displays.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I might be able to redirect all oxygen to this room which could give me more time.");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Okay we got a bit of a problem. The on screen language is changing every few seconds.");
        System.out.println();
        Output.type("I'm going to see if I can make my way through this.");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Okay. ");
        Output.delayWithDots(4);
        Output.type(" Good. ");
        Output.delayWithDots(4);
        Output.type("Interesting");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("I believe I have found where to divert all oxygen to the room I am in.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("I now have one of two buttons I need to click.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("The buttons are vertically stacked.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("One of the buttons will divert all oxygen away from here.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("The other will divert all oxygen to this room. ");
        Output.delayWithDots(4);
        System.out.println();
        Output.type("So uh, which button do you think I should click on?");
        System.out.println("\n");

        Output.choices("Choose the first button!", "Try the second button?");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                divertOxygenAway();
                validInput = true;
                break;
            case 2:
                // insert a scene here
                scene4a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }

    }

    public static void divertOxygenAway() {
        Output.type("Lets do it!");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: OXYGEN DIVERTING FROM ROOM -- COMMS!", Colors.ANSI_YELLOW);
        System.out.println();
        Output.delayMilliseconds(5);
        System.out.println();
        Output.type("OXYGEN LOGS: OXYGEN SUCCESSFULLY DIVERTED!", Colors.ANSI_GREEN);
        System.out.println("\n");
        Output.delayWithDots(5);
        Output.type("TRANSMISSION TERMINATED", Colors.ANSI_RED);
        System.out.println("\n");
        Output.type("MISSION FAILED", Colors.ANSI_RED);
        System.out.println("\n" + Colors.ANSI_RESET);

        Output.choices("Go back to last crucial decision", "End Game");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene3b(false);
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

    public static void scene4a() {
        Output.type("Well");
        Output.delayWithDots(3);
        Output.type(" Here goes nothing!");
        System.out.println();
        Output.delayMilliseconds(7);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: ALL OXYGEN DIVERTING TO ROOM -- COMMS!", Colors.ANSI_YELLOW);
        System.out.println("\n");
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: ALL OXYGEN SUCCESSFULLY DIVERTED TO ROOM -- COMMS!", Colors.ANSI_GREEN);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN RUNNING LOW!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: 30 MINUTES BEFORE OXYGEN DEPLETION!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("Yes!");
        Output.delayMilliseconds(700);
        Output.type(" We did it!");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("This should give us plenty of time to figure out how to open up this closet door.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("I'm going to look through these drawers and cabinets and let you know what I find.");
        System.out.println();
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Yes");
        Output.delayWithDots(3);
        Output.type("Okay this could be useful");
        Output.delayWithDots(5);
        System.out.println();
        Output.type("Okay heres what we got!");
        Output.delayMilliseconds(700);
        Output.type(" I found us a couple items that could prove to be useful.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type(
                "In one of the drawers I found a large ring of keys. I would guess theres a few hundred keys on this ring.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type(
                "I worry that if we were to try each of these keys on the closet door it could take hours to get through all the keys.");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type("Which we obviously don't have that kind of time.");
        Output.delayMilliseconds(700);
        Output.type(" Could be risky to try to find the right key.");
        Output.delayMilliseconds(700);
        System.out.println();
        Output.type("I also found a large axe.");
        Output.delayMilliseconds(700);
        Output.type(" The door to the closet is metal which could mean breaking down the door would also be timely.");
        System.out.println();
        Output.delayWithDots(4);
        System.out.println();
        Output.type("What do you think we should do?");
        System.out.println("\n");

        Output.choices("Try to find the right key!", "Break down the door!");

        // Determine which path to take based off of user input
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
        Output.type("I'll keep trying!");
        System.out.println();
        Output.delayWithDots(7);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN RUNNING LOW!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: 5 MINUTES BEFORE OXYGEN DEPLETION!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("Oh no!");
        Output.delayMilliseconds(700);
        Output.type(" Hopefully these next few keys are the right one!");
        System.out.println();
        Output.delayWithDots(5);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.type("OXYGEN LOGS: BACKUP OXYGEN DEPLETED!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.delayWithDots(5);
        System.out.println();
        Output.type("TRANSMISSION TERMINATED", Colors.ANSI_RED);
        System.out.println("\n");
        Output.type("MISSION FAILED", Colors.ANSI_RED);
        System.out.println("\n" + Colors.ANSI_RESET);

        Output.choices("Go back to last crucial decision", "End Game");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene4a();
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
        Output.type("OXYGEN LOGS: 5 MINUTES BEFORE OXYGEN DEPLETION!", Colors.ANSI_YELLOW);
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
        Output.type("OXYGEN LOGS: BACKUP OXYGEN DEPLETED!", Colors.ANSI_YELLOW);
        Output.delayMilliseconds(1000);
        System.out.println("\n");
        Output.delayWithDots(7);
        System.out.println("\n");
        Output.type("Oh wow that was close!");
        Output.delayMilliseconds(700);
        Output.type("I was literally blacking out as I put my helmet on!");
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

    public static void transitionScene() {
        Output.type("It worked!");
        Output.delayMilliseconds(700);
        Output.type(" The door opened up!");
        Output.delayMilliseconds(1000);
        System.out.println();
        Output.type(
                "I should probably go stablize the oxygen across the facility before the backup oxygen in my pack runs out.");
        System.out.println("\n");
        Output.choices("Great idea!", "Be careful!");

        // Determine which path to take based off of user input
        boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                // insert a scene here
                validInput = true;
                break;
            case 2:
                // insert a scene here

                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }
}
