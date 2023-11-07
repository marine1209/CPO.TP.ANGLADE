/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_anglade_version_console;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class LightOff_ANGLADE_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CelluleLumineuse cellule = new CelluleLumineuse(false); 
        //System.out.println(cellule.estEteint());
        //GrilleDeJeu grilleTest = new GrilleDeJeu(3,3);
        //System.out.println(grilleTest.toString());
        int n = DemanderNiveau();
        Partie test = new Partie(n);
        test.initialiserPartie();
        System.out.println(test.lancerPartie());
    }
    static int DemanderNiveau(){
        int dimension = 5; 
        Scanner sc= new Scanner(System.in);
        System.out.print("quelle difficulté voulez vous : \n 1)Facile \n 2) Moyen \n 3) Difficile\n");
        int niveau = sc.nextInt();
        
        if (niveau == 1 ){
            dimension = 5;

        }
        else if (niveau ==2){
            dimension = 7;
        }
        else if (niveau==3){
            dimension = 10;
   
      
        }
        return dimension;
    }
}

