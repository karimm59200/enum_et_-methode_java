package org.example.exercice5;

public class Informatique implements Joueur {
    @Override
    public void jouer() {
        System.out.println("joueur informatique joue.");
    }

    @Override
    public void gagner() {
        System.out.println("joueur informatique gagne.");
    }

    @Override
    public void perdre() {
        System.out.println("joueur informatique perd.");
    }
}
