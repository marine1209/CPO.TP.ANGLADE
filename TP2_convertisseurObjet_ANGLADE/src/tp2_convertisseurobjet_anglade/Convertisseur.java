/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_anglade;

/**
 *
 * @author marin
 */
public class Convertisseur {
    double nbConversions;
    public Convertisseur(){
        nbConversions=0;
    }
    public double CelciusVersKelvin (double tCelcius) {
        double Kelvin = tCelcius + 273;
        nbConversions += 1;
        return Kelvin;
        
    }    
    public double KelvinVersCelcius (double tKelvin) {
        double Celcius = tKelvin + 273;
        nbConversions += 1;
        return Celcius;
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        double Celcius = tFarenheit -17.22;
        nbConversions += 1;
        return Celcius;
        
    } 
    public double CelciusVersFarenheit (double tCelcius) {
        double Farenheit = tCelcius +17.22;
        nbConversions += 1;
        return Farenheit;     
    } 
    public double KelvinVersFarenheit (double tKelvin) {
        double Farenheit = tKelvin - 457.87;
        nbConversions += 1;
        return Farenheit;
    }
    public double FarenheitVersKelvin (double tFarenheit ) {
        double Kelvin = tFarenheit + 457.87;
        nbConversions += 1;
        return Kelvin;
    }
    @Override
    public String toString () {
        return "nb de conversions : "+ nbConversions;
    }
}
