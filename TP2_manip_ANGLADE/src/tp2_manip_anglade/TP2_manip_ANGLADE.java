/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_anglade;

/**
 *
 * @author marin
 */
public class TP2_manip_ANGLADE {

    /**
     * Marine Anglade, TDB, TP2 manip, 13/10/23
     */
    public static void main(String[] args) {
       Tartiflette assiette1 = new Tartiflette(500) ;
       Tartiflette assiette2 = new Tartiflette(600);
       Tartiflette assiette3=assiette2; //deux tartiflettes ont été créee puisque assiette3 n'est pas ajouté dans la classe Tartiflette. Ce sont les deux même tartiflette
       System.out.println ("nb calories de assiette2 : "+assiette2.nbCalories);
       System.out.println ("nb calories de assiette2 : "+assiette3.nbCalories);
       // Moussaka assiette666 = assiette1; 
       // Moussaka assiette667=new Tartiflette(); 
       // les deux notations sont correctes, 
       Tartiflette [] tableau = new Tartiflette [10];
       for (int i=0; i<10; i++){
           tableau[i]=new Tartiflette(i*200);
       }
       //
       
       
       
    }
    
}
