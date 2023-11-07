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
   int dimension; 
   int nbCoupsMax; 
   int nbMelange; 

    /**
     * créer une nouvelle partie avec les dimension de la matrice en entrée
     * @param dim
     * @param dimension : taille de la matrice
     */
    public Partie(int dim) {
        this.grille = new GrilleDeJeu(dim, dim);
        this.nbCoups = 0;
        this.dimension=dim; 
        
    }
    
    /**
     * mélange et allume certaines cases de la matrice pour que le joueur puisse jouer
     * @param melange : nombre de fois ou la matrice va être mélangée
     */
    public GrilleDeJeu initialiserPartie(){
        if (dimension==5){
          this.nbCoupsMax=20;
          this.nbMelange=50;
        }
        else if (dimension==7){
         this.nbCoupsMax=15;
         this.nbMelange=100;   
        }
        else if (dimension== 10){
          this.nbCoupsMax=2;
          this.nbMelange=150;  
        }
        this.grille.activerLigneColonneOuDiagonaleAleatoire();
        this.grille.melangerMatriceAleatoirement(nbMelange);
        return grille;
    }

    /**
     * effectue la partie
     * @return renvoie gagné lorsque toutes les cellules sont eteintes
     */
    public String lancerPartie(){
        
        int nbCoupsRestants;
        Scanner sc = new Scanner(System.in);
        int saisie=0;
        int ChoixLigneOuColonne=0;
        while (!this.grille.cellulesToutesEteintes()){
          
            System.out.println(this.grille.toString());
            nbCoupsRestants = nbCoupsMax-nbCoups;
            System.out.println( "nombre de coups restants : "+ nbCoupsRestants);
            System.out.println("que voulez vous activer : \n 1) Ligne \n 2)Colonne \n 3) diagonnale montante \n 4) diagonnale descendante");
            do {
            saisie=sc.nextInt();
            }while (saisie<1 || saisie>4);
            if (saisie==1){
             System.out.println("quelle ligne voulez vous activer");
             do { 
             ChoixLigneOuColonne=sc.nextInt();
             }while (ChoixLigneOuColonne<0 || ChoixLigneOuColonne>this.grille.nbColonnes);
             this.grille.activerLigneDeCellules(ChoixLigneOuColonne);
             this.nbCoups+=1;
        }
            else if (saisie==2){
              System.out.println("quelle colonne voulez vous activer");
             do { 
             ChoixLigneOuColonne=sc.nextInt();
             }while (ChoixLigneOuColonne<0 || ChoixLigneOuColonne>this.grille.nbColonnes);
             this.grille.activierColonneDeCellules(ChoixLigneOuColonne);
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
        if (nbCoups==nbCoupsMax){
            return "Vous avez utilisé tous vos coups";
        }    
   
     
    
}

        return ("Vous avez gagné");
    }  
    
}
