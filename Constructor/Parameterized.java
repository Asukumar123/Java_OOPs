package Constructor;

class Parameterized {
   
    String Type_of_Ninja; 
    int Ninja_code;

    
   public Parameterized(String name){
  System.out.println("Welcome to Ninja game  "+ name);
    }


    public void Nunchaku() {
      System.out.println("Congratulation for unlocking the Nunchaku");  
    }
    public void Shuriken() {
        System.out.println("Congratulation for unlocking the Shuriken");  
    }

    public static void main(String[] args) {
        Parameterized Action=new Parameterized("suku");
        Action.Shuriken();
        Parameterized Action2=new Parameterized("goku");
        Action2.Shuriken();
    }
}
