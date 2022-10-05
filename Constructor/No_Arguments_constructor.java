package Constructor;

class No_Arguments_Constructor {
   
    String Type_of_Ninja; 
    int Ninja_code;


    public No_Arguments_Constructor(){
  System.out.println("Welcome to Ninja game...");
    }


    public void Nunchaku() {
      System.out.println("Congratulation for unlocking the Nunchaku....");  
    }
    public void Shuriken() {
        System.out.println("Congratulation for unlocking the Shuriken....");  
    }

    public static void main(String[] args) {
        No_Arguments_Constructor Action=new No_Arguments_Constructor();
        Action.Shuriken();
        Action.Nunchaku();

    }
}
