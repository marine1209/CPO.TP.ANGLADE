/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_anglade;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class TP2_convertisseurObjet_ANGLADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur test1 = new Convertisseur();
         Scanner sc = new Scanner(System.in );
        System.out.println("saisissez une valeur double");
        double resultat= 0;
        double valeur = sc.nextDouble();
        int saisie =0;
        do {
          System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin\n 2) Kelvin Vers Celcius 3)De Farenheit vers Celcius\n 4)De Celcius Vers Farenheit \n 5) De Kelvin Vers Farenheit \n 6) De Farenheit Vers Kelvin");
          saisie = sc.nextInt();
        }while (saisie>6);
        if (saisie == 1){
          resultat=test1.CelciusVersKelvin(valeur);
          System.out.println("le resultat de la conversion est : " + resultat);
        }
        if (saisie ==2){
           resultat=test1.KelvinVersCelcius(valeur);
           System.out.println("le resultat de la conversion est : " + resultat);
        }
        if (saisie ==4){
            resultat=test1.CelciusVersFarenheit(valeur);
            System.out.println("le resultat de la conversion est : " + resultat);
            
        }
        if (saisie==3){
            resultat=test1.FarenheitVersCelcius (valeur);
            System.out.println("le resultat de la conversion est : " + resultat);
            
        }
        if (saisie == 5){
            resultat=test1.KelvinVersFarenheit(valeur);
            System.out.println("le resultat de la conversion est : " + resultat);
            
        }
        if (saisie==6){
            resultat=test1.FarenheitVersKelvin(valeur);
            System.out.println("le resultat de la conversion est : " + resultat);
        }
        //System.out.println("le resultat de la conversion est :" +resultat);
        //System.out.println(test1.CelciusVersFarenheit(24.2));
        //System.out.println(test1.FarenheitVersKelvin(65.2));
        //System.out.println(test1.KelvinVersCelcius(36.5));
        //System.out.println(test1.toString());
        
        
        
    }

}
