/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_anglade_version_console;

import java.util.Random;

/**
 *
 * @author marin
 */
public class GrilleDeJeu {
    int nbLignes; 
    int nbColonnes; 
    CelluleLumineuse[][] matriceCellules; 

    /**
     * creer une nouvelle grille de jeu : rempli toute la grille de cellules eteintes
     * @param nbLignes
     * @param nbColonnes
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes){ 
        this.nbColonnes=nbColonnes;
        this.nbLignes=nbLignes;
        matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];   
        for (int i = 0; i<nbLignes; i++){
            for (int j =0; j<nbColonnes; j++){
                matriceCellules[i][j]=new CelluleLumineuse(false); 
            }
    }
    }

    /**
     * eteind toutes les cellules en parcourant toute la matrice 
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i<nbLignes; i++){
            for (int j =0; j<nbColonnes; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }        

    /**
     * change de valeur les cellules d'une ligne, d'une colonne ou d'une diagonale de manière aléatoire
     */
    public void  activerLigneColonneOuDiagonaleAleatoire(){
     Random Aleat = new Random(); 
     int nbAleat = Aleat.nextInt(nbColonnes);
     int n = Aleat.nextInt(3); 
     if (n==1){
         this.activerLigneDeCellules(nbAleat);
     }
     else if(n==2){
         this.activierColonneDeCellules(nbAleat);
         }
         
     else if (n==3){
        int a = Aleat.nextInt(2); 
        if (a==1){
            this.activerDiagonaleDescendante();
        }    
        else if(a==2){
           this.activerDiagonaleMontante();
        }    
        
         
    }
     
}

    /**
     * Melange la matrice, c'est à dire, mes des cellules alumées ou eteintes de manière aléatoire
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
      this.eteindreToutesLesCellules();
      for (int i =0; i<nbTours; i++){
          this.activerLigneColonneOuDiagonaleAleatoire();
      }
      
  }

    /**
     *Change la valeur des cellules d'une ligne particuliere
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        for (int i = 0; i<nbLignes;i++)
      matriceCellules[idLigne][i].activerCellule();
  }

    /**
     * change la valeur des cellules d'une colonne particuliere
     * @param idColonne
     */
    public void activierColonneDeCellules(int idColonne){
      for (int i = 0; i<nbColonnes ;i++){
             matriceCellules[i][idColonne].activerCellule();
  }
    }

    /**
     * change la valeur des cellules de la diagonale descendante
     */
    public void activerDiagonaleDescendante(){
      for (int i = 0; i<nbLignes; i++){
          for (int j =0; j<nbColonnes; j++){
              if (i==j){
                 matriceCellules[i][j].activerCellule(); 
              }
          }
      
  }
    }
    /**
     *change la valeur des cellules de la diagonale descendante
     */
    public void activerDiagonaleMontante(){
      for (int i = 0; i<nbLignes; i++){
          for (int j=0; j<nbLignes; j++){
              if (i+j == nbLignes-1){
                  matriceCellules[i][j].activerCellule();
              }
          }
          
      }
  }

    /**
     * teste toutes les cellules de la matrice pour savoir si elles sont toutes eteintes
     * @return
     */
    public boolean cellulesToutesEteintes(){
      for (int i = 0; i<nbLignes; i++){
          for (int j = 0; j<nbColonnes; i++){
              if (matriceCellules[i][j].estEteint()==false){
                  return false;
              }
          }
      }return true;  
    }
    /**
     *Affiche la matrice et l'état des celulles
     * @return 
     */
    @Override
  public String toString(){
     String resultat="   |";
     String resultat2="";
     String resultat3="";
     String resultat4="";
     for (int i=0; i<nbColonnes+1; i++){
         resultat4+="----";
     }
     for (int i = 0; i<nbColonnes; i++){
        resultat2+= " "+i+" |";
     } 
     resultat2+="\n"+resultat4;
     for (int i = 0; i<nbLignes; i++){
         resultat3+= "\n "+i+" |" ;
         for(int j = 0; j<nbColonnes; j++){
             resultat3+= " "+matriceCellules[i][j].toString()+ " |";
         } 
         resultat3+="\n"+resultat4;
     }
     resultat += (resultat2 + resultat3);
     return resultat;
  
  }
  

}
