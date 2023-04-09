package org.example.exercice3Methode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" saisir du texte");

        int longeur = s.nextLine().split(" ").length;

        System.out.println( longeur);


    }
}
