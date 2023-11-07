/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_anglade_version_console;

/**
 *
 * @author marin
 */
public class CelluleLumineuse {
   private boolean allume;  
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * // constructeur qui met automatiquement la valeur de allumé à false
     * @param allume
     */
    public CelluleLumineuse(boolean allume) {
        this.allume = false;
         
    }

    /**
     *change la valeur de allumer en son contraire (false si true et true si false)
     */
    public void activerCellule(){ 
        if(this.allume == false){
            this.allume = true;
        }
        else 
            this.allume=false;
    }

    /**
     *met la valeur de allumé à false. Ne renvoie rien
       
     */
    public void eteindreCellule(){ 
           allume=false;
        
    }

    /**renvoie true si la cellule est éteinte et false si la cellule est éteinte. 
     *
     * @return boolean 
     */
    public boolean estEteint(){ 
       return allume==false; 
    }

    /**renvoie l'état de la cellule: true si allumée et false si éteinte.
     *
     * @return boolean
     */
    public boolean getEtat(){ 
        return allume; 
    }

    /**retourne 0 si la cellule est éteinte et X si la cellule est allumée
     *
     * @return
     */
    @Override
    public String toString() { 
        if (allume == false){  // test pour savoir si la cellule est éteinte ou allumée
            return ANSI_PURPLE +"0" + ANSI_RESET;
            
        }
        else 
            return ANSI_CYAN +"X"+ANSI_RESET;
    }
    
}
