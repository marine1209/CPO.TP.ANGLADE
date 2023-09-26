/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_anglade;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class TP1_convertisseur_ANGLADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // marine anglade, tp1, convertisseur, 26/09/26
        double valeur=0;
        double resultat=0;
        int saisie = 0;
        Scanner sc = new Scanner(System.in );
        System.out.println("saisissez une valeur double");
        valeur = sc.nextDouble();
        do {
          System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin\n 2) Kelvin Vers Celcius 3)De Farenheit vers Celcius\n 4)De Celcius Vers Farenheit \n 5) De Kelvin Vers Farenheit \n 6) De Farenheit Vers Kelvin");
          saisie = sc.nextInt();
        }while (saisie>6);
        if (saisie == 1){
          resultat= CelciusVersKelvin(valeur);
        
        }
        if (saisie ==2){
           resultat = KelvinVersCelcius(valeur);
        }
        if (saisie ==4){
            resultat = CelciusVersFarenheit(valeur);
        }
        if (saisie==3){
            resultat= FarenheitVersCelcius (valeur);
            
        }
        if (saisie == 5){
            resultat= KelvinVersFarenheit(valeur);
            
        }
        if (saisie==6){
            resultat=FarenheitVersKelvin(valeur);
        }
        System.out.println("le resultat de la conversion est :" +resultat);

        
       
    
    }
    
    
    public static double CelciusVersKelvin (double tCelcius) {
        double Kelvin = tCelcius + 273;
        return Kelvin;
    }    
 // à completer
    public static double KelvinVersCelcius (double tKelvin) {
        double Celcius = tKelvin + 273;
        return Celcius;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double Celcius = tFarenheit -17.22;
        return Celcius;
        
    } 
    public static double CelciusVersFarenheit (double tCelcius) {
        double Farenheit = tCelcius +17.22;
        return Farenheit;
        
        
        
    } 
    public static double KelvinVersFarenheit (double tKelvin) {
        double Farenheit = tKelvin - 457.87;
        return Farenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit ) {
        double Kelvin = tFarenheit + 457.87;
        return Kelvin;
    }
    
    
}
    
    

