package Constructor;

public class Default {
   
    String Type_of_Ninja; 
    int Ninja_code;
    public Default(){
 
    }
    public void Nunchaku() {
      System.out.println("Congratulation for unlocking the Nunchaku....");  
    }
    public void Shuriken() {
        System.out.println("Congratulation for unlocking the Shuriken....");  
    }

    public static void main(String[] args) {
        Default Action=new Default();
        Action.Shuriken();
        Action.Nunchaku();

    }
}