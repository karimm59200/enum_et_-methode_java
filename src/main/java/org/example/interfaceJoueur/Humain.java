package org.example.exercice5;

public class Humain  implements Joueur{
    @Override
    public void jouer() {
        System.out.println(" joueur humain joue.");
    }

    @Override
    public void gagner() {
        System.out.println("joueur humain gagne.");
    }

    @Override
    public void perdre() {
        System.out.println("joueur humain perd.");
    }
}
