/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_anglade;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marin
 */
public class TP1_stats_ANGLADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP1, TDB, Anglade Marine, statistiques, 28/09/23, 
        int[] TableauEntier = new int[6];
        int saisie = 0;
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("saisissez un entier");
        saisie = sc.nextInt();
        for (int i = 0; i < saisie; i++) {
            int nbAlea = generateurAleat.nextInt(6);
            for (int j = 0; j < 6; j++) {
                if (nbAlea == j) {
                    TableauEntier[j] += 1;
                }
            }
            
            
        }
        for (int k =0; k<6; k++){
            System.out.println(TableauEntier[k]);
            double Pourcent = 100*TableauEntier[k]/saisie;
            System.out.println(Pourcent +"%");
        }

    }

}
