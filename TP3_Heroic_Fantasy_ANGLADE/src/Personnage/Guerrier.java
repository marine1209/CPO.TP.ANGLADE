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
public class Guerrier extends Personnage {
    boolean cheval; 

    public Guerrier(boolean cheval, String nom, double vie) {
        super(nom, vie);
        this.cheval = cheval;
        nbPersonnage+=1;
    }

    public boolean isCheval() {
        return cheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "cheval=" + cheval + '}'+super.toString();
    }
    public void finalize(){
        nbPersonnage-=1;
    }
    public void attaquer(Personnage attaqué){
        int dommage =20;
        if (Arme_en_Main instanceof Epee epee){
            dommage= (int) (dommage*epee.finesse);
        } 
        if (attaqué instanceof Magicien magicien){
            if (magicien.confirme==true){
                dommage/=2;
            }
        }
        if (attaqué instanceof Guerrier){
            if (((Guerrier)attaqué).cheval==true){
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
