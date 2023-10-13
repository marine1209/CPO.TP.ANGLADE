/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_anglade;

/**
 *
 * @author marin
 */
public class TP2_bieres_ANGLADE {

    /**
     * Marine Anglade, TDB, bieres, 06/10/23
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteillesBiere uneBiere = new BouteillesBiere("Cuvée des Trolls", 7.0, "Dubuisson" ); 
        uneBiere.ouverte= false;
        uneBiere.lireEtiquette(); 
        BouteillesBiere secondeBiere= new BouteillesBiere("Abbaye de Leffe",6.6,"Leffe");
        secondeBiere.lireEtiquette();
        uneBiere.ouverte = uneBiere.Décapsuler();
        System.out.println(uneBiere);
        
    }
    
}
