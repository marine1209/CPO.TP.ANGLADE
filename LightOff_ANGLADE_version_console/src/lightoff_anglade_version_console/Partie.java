/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_anglade_version_console;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class Partie {
   GrilleDeJeu grille; 
   int nbCoups; 

    /**
     * créer une nouvelle partie avec les dimension de la matrice en entrée
     * @param dimension : taille de la matrice
     */
    public Partie(int dimension) {
        this.grille = new GrilleDeJeu(dimension, dimension);
        this.nbCoups = 0;
        
    }
    
    /**
     * mélange et allume certaines cases de la matrice pour que le joueur puisse jouer
     * @param melange : nombre de fois ou la matrice va être mélangée
     */
    public GrilleDeJeu initialiserPartie(int melange){
        this.grille.activerLigneColonneOuDiagonaleAleatoire();
        this.grille.melangerMatriceAleatoirement(melange);
        return grille;
    }

    /**
     * effectue la partie
     * @return renvoie gagné lorsque toutes les cellules sont eteintes
     */
    public String lancerPartie(){
        Scanner sc = new Scanner(System.in);
        int saisie=0;
        int saisie2=0;
        while (!this.grille.cellulesToutesEteintes()){
            System.out.println(this.grille.toString());
            System.out.println("que voulez vous activer : \n 1) Ligne \n 2)Colonne \n 3) diagonnale montante \n 4) diagonnale descendante");
            do {
            saisie=sc.nextInt();
            }while (saisie<1 || saisie>4);
            if (saisie==1){
             System.out.println("quelle ligne voulez vous activer");
             do { 
             saisie2=sc.nextInt();
             }while (saisie2<0 || saisie2>this.grille.nbColonnes);
             this.grille.activerLigneDeCellules(saisie2);
             this.nbCoups+=1;
        }
            else if (saisie==2){
              System.out.println("quelle colonne voulez vous activer");
             do { 
             saisie2=sc.nextInt();
             }while (saisie2<0 || saisie2>this.grille.nbColonnes);
             this.grille.activierColonneDeCellules(saisie2);
             this.nbCoups+=1;
        }
            else if (saisie==3){
             this.grille.activerDiagonaleMontante();
             this.nbCoups+=1;
        }
            else if (saisie==4){
             this.grille.activerDiagonaleDescendante();
             this.nbCoups+=1;
             
        }    
}
        return ("Vous avez gagné");
    }        
}