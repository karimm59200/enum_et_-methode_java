package org.example.classABstraite;

public class Carre  extends CalculeAire{

    int cote;

    public Carre(int cote){
        this.cote = cote;

    }


    @Override
    public void calculer() {
        double res = this.cote * this.cote;
        System.out.println("le carré qui a pour coté : " + this.cote + " a une aire de " + res);
    }
}
