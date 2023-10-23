/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_anglade;

import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author marin
 */
public class TP3_Heroic_Fantasy_ANGLADE {

    /**
     * Marine Anglade, TP3, Héritage, classe abstraite et interface, 18/10/23
     */
    public static void main(String[] args) {
        Epee Excalibur= new Epee(7.5, "excalibur", 6);
        Epee Durandal=new Epee(4.7, "durandal", 4); 
        Epee Solide =new Epee(5, "solide", 2);
        Baton Chene=new Baton(4.5 , "chene", 5);
        Baton Charme=new Baton (5, "charme", 6);
        Baton Baguette=new Baton (19, "baguette", 9);
        ArrayList <Arme> ListeArmes= new ArrayList();
        ListeArmes.add(Chene); 
        ListeArmes.add(Charme); 
        ListeArmes.add(Excalibur); 
        ListeArmes.add(Durandal); 
        for (int i =0; i<ListeArmes.size(); i++){
            System.out.println(ListeArmes.get(i));
        }
        Magicien Gandalf =new Magicien (true, "Gandlaf",65);
        Magicien Garcimore =new Magicien (false, "Garcimore", 4);
        Guerrier Conan =new Guerrier(false, "Conan", 78); 
        Guerrier Lannister=new Guerrier(true, "Lannister", 45);
        ArrayList<Personnage> ListePersonnage=new ArrayList(); 
        ListePersonnage.add(Conan);
        ListePersonnage.add(Gandalf);
        ListePersonnage.add(Garcimore);
        ListePersonnage.add(Lannister); 
        for(int i=0; i<ListePersonnage.size(); i++){
           System.out.println(ListePersonnage.get(i));           
        }
        Conan.AjouterArme(Baguette);
        Conan.AjouterArme(Solide);
        Conan.AjouterArme(Durandal);
        Conan.EquiperArme(Durandal);
        Gandalf.AjouterArme(Charme);
        Gandalf.AjouterArme(Chene);
        Gandalf.AjouterArme(Excalibur);
        System.out.println(Conan.toString());
        Lannister.seFatiguer();
        if (Lannister.estVivant()== true){
            System.out.println("il est vivant");
        }
        if (Lannister.estVivant()== false){ 
            System.out.println("il n'est pas vivant");
        
        }
        Lannister.attaquer(Gandalf);
        System.out.println(Gandalf.toString());
        Garcimore.AjouterArme(Charme);
        Garcimore.AjouterArme(Excalibur);
        Lannister.AjouterArme(Chene);
        Lannister.AjouterArme(Excalibur);
        Garcimore.EquiperArme(Charme);
        Garcimore.EquiperArme(Chene);
        Lannister.attaquer(Garcimore);
        Garcimore.attaquer(Lannister);
        System.out.println(Lannister.estVivant());
        System.out.println(Garcimore.estVivant());
    }   
    
}
