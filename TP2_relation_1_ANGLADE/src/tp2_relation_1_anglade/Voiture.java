/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_anglade;

/**
 *
 * @author marin
 */
public class Voiture {
    String Modele; 
    String Marque;
    int PuissanceCV; 
    Personne Proprietaire; 
    
    @Override
    public String toString(){
        return Modele+ Marque + PuissanceCV;               
    }

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire= null;
    }

   
    
}
