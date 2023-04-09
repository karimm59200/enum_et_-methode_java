package org.example.exercice3;

import org.example.exercice4.Carre;
import org.example.exercice4.Cercle;
import org.example.exercice4.Triangle;
import org.example.exercice5.Humain;
import org.example.exercice5.Informatique;
import org.example.exerciceFethi.Employe;
import org.example.exerciceFethi.Poste;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Couleur rouge = Couleur.RED;
        Couleur bleu = Couleur.BLUE;
        Couleur jaune = Couleur.YELLOW;

        System.out.println(rouge);
        System.out.println(bleu);
        System.out.println(jaune);

        melanger(rouge, bleu);
        melanger(rouge, jaune);


        Employe employe = new Employe("fethi", "fethi", Poste.DIRECTEUR);
        Employe employe1 = new Employe("bb", "bb", Poste.PRODUCT_OWNER);
        Employe employr2 = new Employe("michel", "Michel", Poste.MANAGER);

        System.out.println(employe.getPoste());
        System.out.println();

        Carre carre1 = new Carre(12);
        carre1.calculer();
        Triangle triangle1 = new Triangle(2,5);
        triangle1.calculer();
        Cercle cercle1 = new Cercle(5);
        cercle1.calculer();

        System.out.println();

        Humain humain1 = new Humain();
        humain1.jouer();
        humain1.perdre();
        System.out.println();
        Informatique informatique1 = new Informatique();

        informatique1.gagner();
        informatique1.perdre();


    }

    public static void melanger(Couleur couleur1,  Couleur couleur2){

        if(couleur1 == Couleur.BLUE && couleur2 == Couleur.RED || couleur1 == Couleur.RED && couleur2 == Couleur.BLUE ){
            System.out.println("Violet");
        } else if( couleur1 == Couleur.BLUE && couleur2 == Couleur.YELLOW  || couleur1 == Couleur.YELLOW && couleur2 == Couleur.BLUE  ){
            System.out.println(" vert");
        } else if(couleur1 == Couleur.RED && couleur2 == Couleur.YELLOW   || couleur1 == Couleur.YELLOW && couleur2 == Couleur.RED ){
            System.out.println("orange");
        }else{
            System.out.println("n'est pas une couleur primaire.");
        }
    }
}