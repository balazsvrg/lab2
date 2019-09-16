package kaszino;

public class Main {
    public static void main(String[] args) {
        Asztal pokerAsztal = new Asztal();
        Asztal pokerAsztal2 = new Asztal();

        Jatekos p1 = new Kezdo();
        Jatekos p2 = new Kezdo();
        Jatekos p3 = new Robot();

        pokerAsztal.addJatekos(p1);
        pokerAsztal.addJatekos(p2);
        pokerAsztal.addJatekos(p3);

        pokerAsztal.ujJatek();

        try {
            for (int i = 0; i < 3; ++i) {
                pokerAsztal.kor();
            }

            pokerAsztal2.kor();
        }
        catch (NincsJatekos nj){
            System.out.println("NincsJatekosException: Az asztalnál nincs játékos!");
        }

        System.gc();

        pokerAsztal = null;
        pokerAsztal2 = null;


    }
}
