package Constructor;
 class Constructor {
   
    String Type_of_Ninja; 
    int Ninja_code;
    Constructor(){
  System.out.println("Welcome My ninja game");
    }
    public void Nunchaku() {
      System.out.println("Congratulation for unlocking the Nunchaku");  
    }
    public void Shuriken() {
        System.out.println("Congratulation for unlocking the Shuriken");  
    }

    public static void main(String[] args) {
        Constructor Action=new Constructor();
        Action.Shuriken();
    }
}
