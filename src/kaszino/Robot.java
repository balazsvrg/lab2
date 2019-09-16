package kaszino;

public class Robot extends Jatekos {
    Robot(){ id = ++numberOfPlayers; }

    public String toString(){
        return "Robot " + id.toString();
    }

    public void lep(){
        System.out.println(this.toString()+" Passzol");
    }
}
