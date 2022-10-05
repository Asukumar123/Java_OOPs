// Creating Object using Methods

class Ninja3 {
    String Weapons;
    int player_No;

    public void Command(String a, int b) {
        Weapons=a;
        player_No=b;
    }
    public void Display() {
        System.out.println("i am ninja! my ninja code is  " + player_No   + "! My weapons is  " +  Weapons + "!");
    }
public static void main(String[] args) {
    Ninja3 Action=new Ninja3();
    Action.Command("Shuriken (Ninja Star)",2106137);
    Action.Display();
    Action.Command("Throwing knives",2106124);
    Action.Display();
    Action.Command("Chigriki",2106173);
    Action.Display();
}
}
