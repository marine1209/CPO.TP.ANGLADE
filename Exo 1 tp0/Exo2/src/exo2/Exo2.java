/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class Exo2 {

    /** Anglade Marine, TDB, 25 septembre 2023, addition entier
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaration des variables
        int nb; // nombre d'entier a additionner
        int result; //resultat
        int ind; //indice 
        //nb= 5;
        Scanner sc = new Scanner(System.in); 
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
        
        //addition des nb premiers entiers
        ind=1;
        while (ind<=nb){
           result=result+ind;
           ind+=1;
        }
        //Affichage du resultat 
        System.out.println();
        System.out.println("La somme des "+ nb+"entiers est: "+ result);
     
    }
    
    
}
