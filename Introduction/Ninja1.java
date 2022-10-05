

// simple object templates
class Ninja1{
public void fight() {
   System.out.println("Here Comes my moves...."); 
}
public void shoot() {
    System.out.println("I am gonna kill you all "); 
 } 
 public void kill() {
    System.out.println("Die You  fools"); 
 }  

 public static void main(String[] args) {
    
 System.out.println("I am a Ninja ");
Ninja1 Action=new Ninja1();

Action.fight();

    Action.kill();
    Action.shoot();

}
}