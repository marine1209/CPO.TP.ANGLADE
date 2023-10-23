/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_anglade.etreVivant;

/**
 *
 * @author marin
 */
public abstract class Personnage implements etreVivant {

    String nom;
    double vie;
    Arme Arme_en_Main = null;
    int nbPersonnage;

    public Personnage(String nom, double vie) {
        this.nom = nom;
        this.vie = vie;
        
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + ", Arme_en_Main=" + Arme_en_Main + ", ArmesPersonnage=" + ArmesPersonnage + '}';
    }

    
    ArrayList<Arme> ArmesPersonnage = new ArrayList();

    public void AjouterArme(Arme Arme) {
        if (ArmesPersonnage.size() <= 5) {
            ArmesPersonnage.add(Arme);
            nbPersonnage+=1;
        }
    }

    public void EquiperArme(Arme arme) {
        for (int i =0; i<ArmesPersonnage.size(); i++){
            if (ArmesPersonnage.get(i)== arme){
                Arme_en_Main= ArmesPersonnage.get(i); 
                System.out.println("l'arme à été trouvée");
            }
            else 
                System.out.println("l'arme n'a pas été trouvée");
        }

    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    public void finalize(){
        nbPersonnage-=1;
    }
    @Override
    public void seFatiguer(){
        vie-=10; 
    }
    @Override
    public boolean estVivant(){
        if (vie>0){
            return true;
        }
        else 
            return false; 
    }
    public void estAttaque(double points){
        vie-=points; 
    }
    
}
