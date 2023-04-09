package org.example.exercice4;

public class Cercle extends CalculeAire {


    int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public void calculer() {
         double res = Math.PI * this.rayon *this.rayon;
        System.out.println("l'air du cercle qui a pour rayon : " + this.rayon + " est de : " + res  + ".");
    }
}
