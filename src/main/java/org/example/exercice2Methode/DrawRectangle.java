package org.example.exercice2Methode;

public class DrawRectangle {
    public static void draw(int hauteur, int largeur) {
        for (int i = 0; i < hauteur; i++) {
            System.out.println();
            for (int j = 0; j < largeur; j++) {
                if (i == 0 || i == hauteur - 1 || j == 0 || j == largeur-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }

        }
    }
}
