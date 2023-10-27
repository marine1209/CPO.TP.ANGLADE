/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_anglade_version_console;

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
        Partie test = new Partie(6);
        test.initialiserPartie(8);
        System.out.println(test.lancerPartie());
    }
    
}
