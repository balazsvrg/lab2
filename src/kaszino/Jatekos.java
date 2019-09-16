package kaszino;

import kaszino.Asztal;

public abstract class Jatekos {
    protected Asztal asztal;
    protected static int numberOfPlayers = 0;
    protected Integer id;

    abstract public void lep();

    public void setAsztal(Asztal a){
        asztal = a;
    }

    public void finalize(){
        System.out.println(this.toString());
    }
}
