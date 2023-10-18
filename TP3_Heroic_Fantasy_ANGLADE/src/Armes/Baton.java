/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marin
 */
public class Baton extends Arme {
    double age; 

    public Baton(double age, String nom, int niveau) {
        super(nom, niveau);
        if (age>100 || age<0){
        this.age = 0;
        }
        else
        this.age=age;
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    

}
