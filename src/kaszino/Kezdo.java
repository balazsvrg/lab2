package kaszino;

public class Kezdo extends Jatekos {
    Kezdo(){ id = ++numberOfPlayers; }

    public String toString(){
        return "Kezdo " + id.toString();
    }

    public void lep(){
        if (asztal.getKor() % 2 == 0){
            asztal.emel(1);
            System.out.println(this.toString()+" Emel");

        }

        else{
            System.out.println(this.toString()+" Passzol");
        }
    }
}
