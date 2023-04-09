package org.example.exercice4Methode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("saisir des mots aléatoires");
        String mots = sc.nextLine();

        System.out.println();
        System.out.println(" entrez une longeur minimale");
        int longeur = sc.nextInt();

        String[] tab = mots.split(" ");

        System.out.println(Arrays.toString(filterWordsByLength(longeur, tab)));
    }


    public static String[] filterWordsByLength(int minLength, String[] mots) {

        String sortie="";
        for (int i = 0; i< mots.length; i++) {
            if( mots[i].length()>= minLength){
                   sortie += mots[i]+",";
            }
        }
        return sortie.split(",");
    }
}
