import java.util.Scanner;
public class StoryEnd { 
private static Scanner input = new Scanner(System.in);
   public static void Ending(){
  Output.type("There is still hope for me, I could use the one man rocket pod to return to earth" + 
       "\n that rocket has the ability to return to earth in a week." + 
       "\n Should I investigate it further to see if it is still usable ?");
       Output.delayMilliseconds(700);
       System.out.println();
       Output.choices("Yes,at this point I think this could be your ticket back home.",
       "No,I think you should invest the little time you have into trying to reach the other base.");
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
   
   public static void scene1(){
      System.out.println();
      Output.type("Okay to reach the rocket I would need to get to the western part of the base and reach Pod A where the central diagnostic computer is." +
     "\n That computer is the key to firing up the rocket and getting off this hell hole."+
     "\n If the computer is still intact It'll tell me exactly what state the rocket is in." + 
     "\n There are two ways to get there."+
     "\n I could get there by going through the air duct system, for the most part they are still intact and there is enough space for me to crawl through." +
     "\n this is a long way and I could get lost." + 
     "\n The other option is that I could try going through the greenhouse." + 
     "\n this is the fastest route there. Only issue is the greenhouse was damaged in the explosion." +
     "\n To what extent I don't know. What do you think I should do ?"); 
     Output.delayMilliseconds(700); 
     System.out.println();
     Output.choices("Go through the greenhouse, you don't have enough time to take the long route",
     "Take the air duct system, it might be longer but it is the safer route, as you don't know what state the greenhouse is in.");
      boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene4();
                validInput = true;
                break;
            case 2:
                scene4a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
   }
   
   public static void scene4a(){
   Output.delayMilliseconds(700);
   Output.delayWithDots(30);
   System.out.println();
   Output.type("okay I hope this is the right choice, i'm running low on time but i'll take your advice... " +
   "\n Alright i'm in the air duct system and heading towards Pod A...." +
   "\n Oh no.......I think I'm lost........ Crap  I don't have time to be lost, I have no clue what part of the base I'm in... " + 
   "\n OH GOD ! a huge explosion just went off, I don't think i'm going to ma");
   Output.delayMilliseconds(700);
   Output.delayWithDots(30);
   System.out.println();
  Output.type("Tyler ran out of time and died ");
   System.out.println();
   Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene1();
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
   
   public static void scene4(){
   Output.delayMilliseconds(700);
   Output.delayWithDots(30);
   System.out.println();
   Output.type("okay i'll start making my way to the greenhouse..." + 
    "\n I'm at the greenhouse entrance, it actually doesn't look too damaged..." +
    "\n I'm in the greenhouse, I see the exit." +
    "\n I just need to get there. On the other side should be the entrance to western pods." +
    "\n I made it ! I'm in the western pod area. Should I stop by Pod C really quickly ?" + 
    "\n it is where we keep extra fuel and I could send fuel to the rocket from the computer there, the Rocket might need it." +
    "\n Or should I just keep going to Pod A, the rocket is probably fueled and I'm running out of time."); 
    System.out.println();
    Output.choices("Just keep heading to Pod A, you don't have time to go other pods,and like you said the rocket is probably fueled",
     "You might need the extra fuel, because if the rocket doesn't have enough fuel you might not make it to earth. Stop by and grab the extra fuel");
     boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene5();
                validInput = true;
                break;
            case 2:
                scene5a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }   
   }
   
   public static void scene5(){
    Output.delayMilliseconds(700);
   Output.delayWithDots(30);
      System.out.println();
      Output.type(" you're right, this base could blow up again at any moment I don't have time to waste, I'm heading straight to Pod A." +
      "\n Okay I see the pod entrance..." + 
      "\n I'm in, the computer should be here...." + 
      "\n I found it ! and it's intact, this is a miracle ! Okay let's see what kind of condition the rocket is in." +
      "\n I can't believe this, all systems are still intact, it must've survived the blast because it was in the underground silo at the time of explosion." + 
      "\n Okay time to set the coordinates to earth and get out of here." +
      "\n Oh god no..." +
      "\n there is a huge problem ! The rocket is only at 70%fuel." + 
      "\n The computer estimates the chances of making it to earth are 20% with the current fuel level." + 
      "\n What the hell should I do ? " +
      "\n I'm not sure if i have enough time to make it to Pod C and send fuel, damn it ! " + 
      "\n I should've just quickly stopped there on the way." +  
      "\n Well you got me in this mess, so what the hell should I do ?"); 
      System.out.println();
      Output.choices("you have to take the risk and just get in the rocket and get the hell out of there,you don’t have time to make it back.",
      " quickly go to Pod C and use the computer to send fuel to the rocket, you have to Hurry ! ");
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene5c();
                validInput = true;
                break;
            case 2:
                scene5b();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }         
   }
   
      public static void scene5b(){
    Output.delayMilliseconds(700);
   Output.delayWithDots(30);
      System.out.println();
          Output.type("Okay, i'm leaving podA. I see Pod C. I'm almost there... " +
         "\n Oh god I hope I make it........." +
         "\n Oh my god a huge explosion just went off by me… I think the base is goi............" +
         "\n Tyler Died trying to get to Pod C in an explosion. ");
         System.out.println();
         Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene4();
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
      
     public static void scene5c(){
     Output.delayMilliseconds(700);
   Output.delayWithDots(30);
      Output.type("Okay I have set the launch time, I'm getting in the rocket now. Here we go, I'm taking off... " + 
      "\n I made it past the atmosphere.." +
      "\n Three days later...........");
        Output.delayMilliseconds(900);
        Output.delayWithDots(50);
      Output.type("\n Hello, if you can still hear me I have ran out of fuel.... " +
      "\n the navigation system has failed.... " +
      "\n I'm going to die out here all alone, and it's your fault..... " + 
      "\n Tyler dies in space, nowhere to be found again ");
      System.out.println();
      Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene4();
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
 
   
   
   
   
   
   
   
   
   public static void scene5a(){
      System.out.println();
      Output.type("good idea, i'll head to pod C really quickly and send fuel to the rocket in case the rocket needs it.."); 
    Output.delayMilliseconds(700);
   Output.delayWithDots(30);
     Output.type( "\n Okay I'm in pod C, I see the computer..." +
      "\n Okay the computer is up and running, there is a problem though." + 
      "\n I can't tell how much fuel the rocket already has from this computer, one of the sensors must be malfunctioning." +
      "\n The only way to find out is to go to the central computer in Pod A ." +
      "\n If I send too much and turn the rocket on it'll blow up from the extra fuel overflowing... " +
      "\n And I won't have enough time to go check and come back. What do I do ?");
      System.out.println();
      Output.choices("Don't take the risk, just head to pod A immediately and get out of there. The base could blow up at any moment.",
      "okay send 50 % fuel to the rocket, I just know that is the right amount.","okay send 30% fuel to the rocket, I just know that is the right amount.");
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene6a();
                validInput = true;
                break;
            case 2:
                scene6b();
                validInput = true;
                break;
            case 3:
                 scene6c();
                 validInput = true;
                 break;
            default:
                System.out.println("Invalid input");
            }
        }     
   }
   
   public static void scene6c(){
      Output.type(" I hope you're right , okay fuel is sending right now...." +
     "\n i'm heading to pod A....... " );
   Output.delayMilliseconds(700);
   Output.delayWithDots(30); 
    Output.type("\n okay I see the central computer...." +
     "\n wish me luck the rocket and computer are about to fire up…." +
     "\n i hope i sent the right amount.... " +
     "\n Oh my god it's a miracle !" +
     "\n The rocket needed exactly 30% more fuel to be full." +
     "\n Okay let's see what kind of condition the rocket is in." +
     "\n I can’t believe this, all systems are still intact, it must’ve survived the blast because it was in the underground silo at the time of explosion." +
     "\n Okay time to set the coordinates to earth and get out of here. " +
     "\n The success rate for making it to earth is approximately 95%.........." +
     "\n I like those odds..... " +
     "\n Okay I have set the launch time, I'm getting in the rocket now... " +
     "\n Here we go, I'm taking off.... " +
     "\n I made it past the atmosphere...." +
     "\n Three days later..... " +
     "\n Hello,if you can still hear me everything is going smoothly  I should make it to earth in four days. .. " +
     "\n 4 days later.......... " +
     "\n Hello this is tyler....... " +
     "\n I SEE EARTH !!!! " +
     "\n IT FEELS SO GOOD TO BE BACK HOME!! " + 
     "\n Thank you so much for your help, without you there is no way  I could’ve made it back home !" + 
     "\n Tyler makes it to earth safely. ");
   } 
   public static void scene6b(){
       Output.type("I hope you're right , okay fuel is sending right now..." +
     "\n i'm heading to pod A.....");
   Output.delayMilliseconds(700);
   Output.delayWithDots(30);
     Output.type("\n okay I see the central computer..." +
     "\n wish me luck the rocket and computer are about to fire up... ");
    Output.delayMilliseconds(700);
   Output.delayWithDots(30);
   Output.type("\n i hope i sent the right amo.......");
   Output.delayMilliseconds(700);
   Output.delayWithDots(30);
   Output.type("\n Tyler dies from the rocket blowing because of too much fuel");
   System.out.println();
     Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene5a();
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
   public static void scene6a(){
      Output.type("you're right, this base could blow up again at any moment I don’t have time to waste, I'm heading straight to Pod A." +
      "\n Okay I see the pod entrance..." + 
      "\n I'm in, the computer should be here...." + 
      "\n I found it ! and it's intact, this is a miracle ! Okay let's see what kind of condition the rocket is in." +
      "\n I can’t believe this, all systems are still intact, it must’ve survived the blast because it was in the underground silo at the time of explosion." + 
      "\n Okay time to set the coordinates to earth and get out of here. Oh god no..." +
      "\n there is a huge problem ! The rocket is only at 70%fuel." + 
      "\n The computer estimates the chances of making it to earth are 20% with the current fuel level." +
      "\n I have no choice but to take that risk. Okay I have set the launch time, I'm getting in the rocket now." +
      "\n Here we go, I'm taking off......" +
      "\n I made it past the atmosphere...." +
      "\n Three days later... " + 
      "\n Hello if you can still hear me I have ran out of fuel....." +
      "\n the navigation system has failed....." +
      "\n I'm going to die out here all alone, and it's your fault...." +
      "\n Tyler dies in space, nowhere to be found again");
      System.out.println(); 
 Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene5a();
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
   
   
  public static void scene1a(){
   System.out.println();
   Output.type("I think you're right, the rocket could be useless for all I know. In that case I'll need to find the Rover and get it running." + 
   "\n There is no other way of reaching the other base on foot, it's about 40 miles south from here. The rover is stored in Pod B on the eastern side of the base." + 
   "\n To get there I would need to go outside and go all the way around the base to reach it. I already know the route but it will take me over an hour to get there. " +
   "\n I could scout the area and potentially find a quicker route. What do you think i should do ? ");
   System.out.println();
   Output.choices("Take the longer the route, it's safer. If you scout the area you're not guaranteed to find a quicker route and the other route could be dangerous.",
   "Scout the area and try finding a quicker route, the faster you can reach that roover the faster you can make it to safety."); 
    boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene2();
                validInput = true;
                break;
            case 2:
                scene2a();
                validInput = true;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
        
     
  }
     public static void scene2a(){
      System.out.println();
      Output.type("Good idea, let me scout the outdoor terrain and see if there is a quicker way to the Pod…………." +
      "\n I think I found a quicker route, I just need to climb over this hill and I should have a much easier path to the Pod."+
      "\n AHHHHHHHHH MY LEG !!!!!!!!!.... OMG MY LEG IS BROKEN. I feel while climbing the hill. IT HURTS SO BAD, I CAN'T MOVE." +
      "\n ………………………………… I'm not going to make it, I should’ve never listened to you……" +
      "\n   I'm going to die because of your terrible advice…….. Tyler dies because of his broken leg ");
      System.out.println();
      Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene1a();
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
     
     public static void scene2(){
      System.out.println();
      Output.type("okay I'll take the route I already know it’s longer but safer..." +
       "\n I'm approaching Pod B. I'm here, the Pod for the most part still looks intact." + 
       "\n I see the Rover, you won't believe this ! The Rover is still intact and looks ready to roll." +
       "\n I'm getting in it, wait hold on. Do you think I should run a diagnostic check on it ?" + 
       "\n that’ll tell me the fuel level and if everything is working fine. " +
       "\n I’m not sure because this base can blow up at any moment and I already took an hour to get here. What should I do ?");
       System.out.println();
       
       Output.choices("Yes do a check, you might need to make sure it has enough fuel, if you run out of fuel on the way you’re dead.",
       "No! Get the hell out of there, you don’t time to do that. Get in that Rover and start heading to the other base NOW!");
       boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene3();
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
     public static void scene3(){
      System.out.println();
      Output.type("Good idea I should make sure I have enough fuel, it's risky but the last thing I want is to get stuck in the middle of the Martian desert." +
       "\n Okay the computer is up and running...." +
       "\n Lets see here, everything looks fine except the fuel levels." +
       "\n I won't make it the full journey with the current fuel level." +
       "\n Thank god  I did this check, luckily there is extra fuel here i'll quickly fill up and get out of here." +
       "\n I'm heading out………… I’m half way there now, everything is going well….. I see the base now..." + 
       "\n I have safely made it to the base, thank you so much. If it wasn’t for you I'd be dead. Tyler makes it to the other base safely and gets help");
     }

   public static void scene3a(){
      System.out.println();
      Output.type(" You're right, what am I thinking, this base could blow up at any moment I don't have time to check." +
       "\n I'm making my way to the other base, the trip should take a hour and half.... " + 
       "\n 20 mins, everything is going fine, I can’t believe i made it out of there alive..." +
       "\n 40 mins in…. Oh no, the Rover has slowed down, I don't know what is going on, please god don’t let it be running out of fuel... " +
       "\n 1 hour in…….. The Rover has come to complete stop , this is it ! i'm done For !" +
       "\n You bastard, I shouldn't have never listened to you ! Now I'm going to die out here and it's all your fault ! "+
       "\n I hope you're happy, your terrible advice is going to get me killed, I hope this weighs on your conscience for the rest of your life ! " +
       "\n Tyler dies a cold and lonely death on the way to the other Rover base.");
       System.out.println();
        Output.choices("Go back to last crusial desison", " end game");
   boolean validInput = false;
        while (!validInput) {
            System.out.print("\nEnter choice: ");
            switch (input.nextInt()) {
            case 1:
                scene1a();
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
