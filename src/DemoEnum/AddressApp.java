public class AddressApp{

   public static void main(String[] args){
   
      testEnum();
      }
      
      private static void testEnum(){
      
      State myHomeState = State.TX;
      System.out.println("my home state: " + myHomeState);
      
      int count = 0;
      for (State s: State.values())
      System.out.print(s + " ");
      count++;
      if(count % 10 == 0){
      System.out.println();
   
          }
       }
     }
     private static void testAddress(){
     
      Address myAddress = new Address("1 ocean way", "ft. lauderdale", State.FL, 12345);
      System.out.prinntln("my address is: " + myAddress);
      }
      
      private static void testFriend(){
      
      Friend myFriend = new Friend("wendy", new Address("123 s main st.", "herriman", State.UT, 84096));
      System.out.println("my friend is: " + myFriend 
}