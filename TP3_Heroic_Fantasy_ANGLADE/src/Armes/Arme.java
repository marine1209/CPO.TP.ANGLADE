/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marin
 */
public abstract class Arme {
    String nom; 
    int niveau; 

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau=" + niveau + '}';
    }

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (niveau>100 || niveau<0){
        this.niveau = 0;
        }
        else
        this.niveau=niveau;
    }

    public int getNiveau() {
        return niveau;
    }
    
    
    
}
