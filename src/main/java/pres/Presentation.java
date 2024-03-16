package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main (String[]args) {
        DaoImpl2 dao = null;
        MetierImpl metier = new MetierImpl(dao);
        dao = new DaoImpl2();
        //metier.setDao(dao);
        System.out.println("Resultas=" + metier.calcul());
    }
}
