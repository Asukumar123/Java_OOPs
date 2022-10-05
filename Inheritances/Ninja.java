package Inheritances;

 
    
    class Ninja1{
     void Nunchaku() {
        System.out.println("Congratulation for unlocking the Nunchaku....");  
      }
     
    }

 class Ninja2 extends Ninja1{
   void Shuriken() {
        System.out.println("Congratulation for unlocking the Shuriken....");  
    }  
 }
class Playgroun{
 
public static void main(String[] args) {
    Ninja1 Action=new Ninja1();
    Action.Nunchaku();
    Action.Shuriken();
}
}