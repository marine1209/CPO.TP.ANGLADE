/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marin
 */
public class Epee extends Arme {
    public double finesse; 

    public Epee(double finesse, String nom, int niveau) {
        super(nom, niveau);
        if (finesse>100 || finesse<0){
        this.finesse=0;
        }
        else
            this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + '}'+super.toString();
    }
    
    
    
}
