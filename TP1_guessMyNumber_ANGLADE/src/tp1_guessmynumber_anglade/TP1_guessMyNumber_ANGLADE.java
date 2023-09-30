/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_anglade;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marin
 */
public class TP1_guessMyNumber_ANGLADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP1, deviner un nombre, TDB, Marine Anglade, 26/09/23
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int y=0;
        int nbUtilisateur=0;
        int n = generateurAleat.nextInt(50);
        double a = generateurAleat.nextDouble(20);
        System.out.println(a);
        System.out.println("quelle difficulté choisissez vous : 1)facile \n 2)moyen \n 3)difficile");
        int choix=0;
        do {
        choix= sc.nextInt();
        if (choix >3 || choix<1){
            System.out.println("erreur");
        }    
        }while (choix <1 || choix>3);
        if (choix == 1){
        int nbAlea= generateurAleat.nextInt(100);
        System.out.println("saisissez un entier entre 1 et 100");
        do{
        nbUtilisateur = sc.nextInt();
        y+=1;
        if (nbUtilisateur<nbAlea){
            if (nbUtilisateur<2*nbAlea){
            System.out.println(" vraiment trop petit");
            }
        System.out.println("trop petit");
        }
        if (nbUtilisateur>nbAlea){ 
            if (nbUtilisateur>2*nbAlea){
            System.out.println(" vraiment trop grand");
            }
        System.out.println("trop grand");    
        }
        }while (nbAlea!=nbUtilisateur);
        
     
        System.out.println("GAGNE"+ y);
        }
    if (choix == 2){
    
        int nbAlea= generateurAleat.nextInt(100);
        System.out.println("saisissez un entier entre 1 et 100");
        do{
        nbUtilisateur = sc.nextInt();
        y+=1;
        if (nbUtilisateur<nbAlea){
            System.out.println("trop petit");
        }
        if (nbUtilisateur>nbAlea){ 
            System.out.println("trop grand");
            
        }
        }while (nbAlea!=nbUtilisateur);
        if (y>5){
            System.out.println("PERDU, vous avez essayé plus de 5 fois");
        }
        else 
        System.out.println("GAGNE"+ y);
    } 
    if (choix == 3){
    int nbAlea= generateurAleat.nextInt(1000);
        System.out.println("saisissez un entier entre 1 et 1000");
        do{
        nbUtilisateur = sc.nextInt();
        y+=1;
        if (nbUtilisateur<nbAlea){
            System.out.println("trop petit");
        }
        if (nbUtilisateur>nbAlea){ 
            System.out.println("trop grand");
            
        }
        }while (nbAlea!=nbUtilisateur);
        if (y>10){
            System.out.println("PERDU, vous avez essayez plus de 10 fois");
        }
     
        System.out.println("GAGNE"+ y);    
    }
    } 
    
}

        
        
        
        
        
        
        
        
    
    

