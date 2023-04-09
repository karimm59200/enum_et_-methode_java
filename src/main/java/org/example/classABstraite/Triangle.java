package org.example.exercice4;

public class Triangle  extends  CalculeAire{

    int cote;

    int hauteur;

    public Triangle(int cote, int hauteur) {
        this.cote = cote;
        this.hauteur = hauteur;
    }


    @Override
    public void calculer() {
        float res = (this.cote * this.hauteur)/2;
        System.out.println(" le triangle qui a pour coté " + this.cote +  " est une hauteur de " + hauteur + " a une aire de " + res);
    }
}
