/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.*;
/**
 *
 * @author marin
 */
public class Magicien extends Personnage {
  boolean confirme;

    public Magicien(boolean confirme, String nom, double vie) {
        super(nom, vie);
        this.confirme = confirme;
        nbPersonnage+=1;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Magicien{" + "confirme=" + confirme + '}'+ super.toString();
    }
    public void finalize(){
        nbPersonnage-=1;
    }
    public void attaquer(Personnage attaqué){
        double dommage =20;
        if (Arme_en_Main instanceof Baton){
            dommage= dommage*  ((Baton) Arme_en_Main ).age;
        } 
        if (attaqué instanceof Magicien){
            if (attaqué.confirme==true){
                dommage%=2;
            }
        }
        if (attaqué instanceof Guerrier){
            if (attaqué.cheval==true){
               dommage%=2; 
            }
        }
        attaqué.seFatiguer();
        attaqué.estAttaque(dommage);
    }

    @Override
    public void estAttaquer(int points) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
