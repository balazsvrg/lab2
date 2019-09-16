package kaszino;

import kaszino.Jatekos;
import kaszino.NincsJatekos;
import java.util.*;

public class Asztal {
    private List<Jatekos> jatekosok;
    private double tet;
    private int korok;

    Asztal(){
        jatekosok = new ArrayList<>();
    }

    public void ujJatek(){
        tet = 0;
        korok = 0;
    }

    public void addJatekos(Jatekos jatekos){
        if (jatekosok.size() < 10){
            jatekosok.add(jatekos);
            jatekos.setAsztal(this);
        }
    }

    public int getKor(){ return korok; }

    public void emel(double d){ tet += d; }

    public void kor() throws NincsJatekos {
        if (jatekosok.isEmpty()) throw new NincsJatekos();
        ListIterator<Jatekos> i = jatekosok.listIterator();
        while (i.hasNext()) {
            Jatekos curr = i.next();
            curr.lep();
        }
        korok++;
    }


}
