/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_anglade;

import java.util.Scanner;



/**
 *
 * @author marin
 */
public class TP1_manipNombresInt_ANGLADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Marine Anglade, tp1, syntaxe de base, 26/09/23
        int nb1= 0;
        int nb2=0;
       Scanner sc = new Scanner (System.in); 
       System.out.println("saisissez deux entiers au choix");
       nb1 = sc.nextInt();
       nb2= sc.nextInt();
       int somme = nb1+nb2;
       int différence = nb1-nb2;
       int produit = nb1*nb2;
       System.out.println("la somme des deux entiers est :"+ somme);
       System.out.println("la différence des deux entiers est : " + différence);
       System.out.println("le produit des deux entier est : "+ produit);
       float division = nb1/nb2;
       float reste= nb1%nb2;
       System.out.println("la division des deux entiers est : "+division);
       System.out.println("le reste de la division euclidienne est :"+ reste);
       
       
               
       
       
       
       

    }
    
}
