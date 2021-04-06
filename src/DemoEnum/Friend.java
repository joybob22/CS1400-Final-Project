public class Friend{

   private String name;
   private Address address;
   
   public Friend(String name, Address address){
   
      this.name = name;
      this.address = address;
      
      @override
      public String toString(){
      return name + "(" + address + ") ";
}
}      