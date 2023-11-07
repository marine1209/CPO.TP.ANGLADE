/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_anglade_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author marin
 */
public class CelluleGraphique extends JButton  {
    CelluleLumineuse celluleLumineuseAssociee; 
    int largeur; 
    int longueur; 

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    @Override
public void paintComponent(Graphics g) {
   super.paintComponent(g);
   this.setText(celluleLumineuseAssociee.toString());
}
}
     // Methode gérant le dessin de la cellule
