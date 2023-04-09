package org.example.exercice1Methode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" veuillez entrer des nombres séparés par un espace.");

       String saisie = s.nextLine();
       int [] tableauDeInt = convertTab(saisie.split( " "));


       int max = maxInTab(tableauDeInt);

        System.out.println(" est le valeur max : "  + max);
    }

    public static int[] convertTab(String [] tab){
        int  [] tableauInt = new  int [tab.length];

        for (int i = 0; i < tab.length; i++) {
              tableauInt[i] = Integer.parseInt(tab[i]);
        }
        return tableauInt;
    }


    public static int maxInTab(int [] tableauDeInt){

        int max = Integer.MIN_VALUE;

        for (int j : tableauDeInt) {
            max = Math.max(max, j);
        }
        return max;
    }
}


