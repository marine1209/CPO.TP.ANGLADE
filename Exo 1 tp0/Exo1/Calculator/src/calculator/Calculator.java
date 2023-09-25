/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * Anglade Marine, TDB, calculatrice, 25 septembre 2023
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float result=0;
        System.out.println("Please enter the operator: ");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3)multiply");
        System.out.println("4)divide");
        System.out.println("5) modulo");
        Scanner sc = new Scanner(System.in);
        
        int operateur;
        do { 
        System.out.println("\n Entrer l'opérateur :");
     
         operateur = sc.nextInt();
        
        if (operateur>5){
            System.out.println("erreur");
        }
        } while (operateur >5);
        
        
        System.out.println("\n Entrer le premier nombre :");
        
       
        int operande1 = sc.nextInt();
        System.out.println("\n Entrer le second nombre :");
        int operande2 = sc.nextInt();
        
            
        
        if (operateur==1){
           result= operande1 + operande2;
           System.out.println(result); 
        }
        if (operateur==2){
           result= operande1 - operande2;
           System.out.println(result); 
        }
        if (operateur==3){
           result= operande1 * operande2;
           System.out.println(result); 
        }
        if (operateur==4){
           result= operande1 / operande2;
           System.out.println(result); 
        }
        if (operateur==5){
           result= operande1 % operande2;
           System.out.println(result); 
        }
        
        
    }
    
    
}
