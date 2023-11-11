/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_anglade_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author marin
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeJeu grille;
    int nbCoups;
    int dimension;
    int nbCoupsMax;
    int nbMelange;
    int i;

    public FenetrePrincipale() {
        initComponents();
        BoutonFacile.setVisible(false);
        BoutonMoyen.setVisible(false);
        BoutonDifficile.setVisible(false);
        PanneauGrille.setVisible(false);
        pannel_infos.setVisible(false);
        pannel_finDePartie.setVisible(false);
    }

    public void creerPanel() {
        // initComponents();
        int nbLignes = dimension;
        int nbColonnes = dimension;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(dimension, dimension));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // création d'un bouton

                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }

        }
        initialiserPartie();
        boutonsVerticaux.setLayout(new GridLayout(nbLignes + 1, 1));
        getContentPane().add(boutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1 * 40, (nbLignes + 1) * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i <= nbLignes; i++) {
            if (i == nbLignes) {
                JButton bouton_diagonale_montante = new JButton();
                ActionListener ecouteurClick = new ActionListener() {
                    final int j = i;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        grille.activerDiagonaleMontante();
                        nbCoups++;
                        lbl_nbCoups.setText("Coups restants : " + Integer.toString(nbCoupsMax - nbCoups));
                        repaint();
                        Gagner();
                    }
                };
                bouton_diagonale_montante.addActionListener(ecouteurClick);
                boutonsVerticaux.add(bouton_diagonale_montante);
            } else {
                JButton bouton_ligne = new JButton();
                ActionListener ecouteurClick = new ActionListener() {
                    final int j = i;

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        grille.activerLigneDeCellules(j);
                        nbCoups++;
                        lbl_nbCoups.setText("Coups restants : " + Integer.toString(nbCoupsMax - nbCoups));
                        repaint();
                        Gagner();
                    }
                };

                bouton_ligne.addActionListener(ecouteurClick);
                boutonsVerticaux.add(bouton_ligne);
            };
        }
        boutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(boutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, (nbColonnes + 1) * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = -1; i < nbColonnes; i++) {
            if (i == -1) {
                JButton bouton_diagonale_descendante = new JButton();
                ActionListener ecouteurClick = new ActionListener() {
                    final int j = i;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        grille.activerDiagonaleDescendante();
                        nbCoups++;
                        lbl_nbCoups.setText("Coups restants : " + Integer.toString(nbCoupsMax - nbCoups));
                        repaint();
                        Gagner();
                    }
                };
                bouton_diagonale_descendante.addActionListener(ecouteurClick);
                boutonsHorizontaux.add(bouton_diagonale_descendante);
            } else {
                JButton bouton_colonne = new JButton();
                ActionListener ecouteurClick = new ActionListener() {
                    final int j = i;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        grille.activierColonneDeCellules(j);
                        nbCoups++;
                        lbl_nbCoups.setText("Coups restants : " + Integer.toString(nbCoupsMax - nbCoups));
                        repaint();
                        Gagner();
                    }
                };
                bouton_colonne.addActionListener(ecouteurClick);
                boutonsHorizontaux.add(bouton_colonne);
            };
        }
        PanneauGrille.setVisible(true);
        BoutonMoyen.setVisible(false);
        BoutonDifficile.setVisible(false);
        BoutonFacile.setVisible(false);
        demanderNiveau.setVisible(false);

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        boutonsVerticaux = new javax.swing.JPanel();
        demanderNiveau = new javax.swing.JButton();
        BoutonFacile = new javax.swing.JButton();
        BoutonMoyen = new javax.swing.JButton();
        BoutonDifficile = new javax.swing.JButton();
        boutonsHorizontaux = new javax.swing.JPanel();
        pannel_infos = new javax.swing.JPanel();
        lbl_nbCoups = new javax.swing.JLabel();
        pannel_finDePartie = new javax.swing.JPanel();
        lbl_finDePartie = new javax.swing.JLabel();
        lbl_msg_fin_de_partie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 102, 255));
        PanneauGrille.setAutoscrolls(true);

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 430, 400));

        javax.swing.GroupLayout boutonsVerticauxLayout = new javax.swing.GroupLayout(boutonsVerticaux);
        boutonsVerticaux.setLayout(boutonsVerticauxLayout);
        boutonsVerticauxLayout.setHorizontalGroup(
            boutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        boutonsVerticauxLayout.setVerticalGroup(
            boutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(boutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 30, 360));

        demanderNiveau.setText("Choix du niveau");
        demanderNiveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanderNiveauActionPerformed(evt);
            }
        });
        getContentPane().add(demanderNiveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        BoutonFacile.setText("Facile");
        BoutonFacile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonFacileActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonFacile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BoutonMoyen.setText("Moyen");
        BoutonMoyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMoyenActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonMoyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        BoutonDifficile.setText("Difficile");
        BoutonDifficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDifficileActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonDifficile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        boutonsHorizontaux.setPreferredSize(new java.awt.Dimension(360, 0));

        javax.swing.GroupLayout boutonsHorizontauxLayout = new javax.swing.GroupLayout(boutonsHorizontaux);
        boutonsHorizontaux.setLayout(boutonsHorizontauxLayout);
        boutonsHorizontauxLayout.setHorizontalGroup(
            boutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        boutonsHorizontauxLayout.setVerticalGroup(
            boutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(boutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 470, 40));

        pannel_infos.setBackground(new java.awt.Color(102, 204, 255));
        pannel_infos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nbCoups.setBackground(new java.awt.Color(153, 204, 255));
        lbl_nbCoups.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lbl_nbCoups.setText("nbCoups");
        pannel_infos.add(lbl_nbCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 50));

        getContentPane().add(pannel_infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 310, 100));

        pannel_finDePartie.setBackground(new java.awt.Color(255, 0, 0));
        pannel_finDePartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_finDePartie.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_finDePartie.setText("Fin de partie");
        pannel_finDePartie.add(lbl_finDePartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, 30));

        lbl_msg_fin_de_partie.setText("Message de fin de partie");
        pannel_finDePartie.add(lbl_msg_fin_de_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 80));

        getContentPane().add(pannel_finDePartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 310, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void demanderNiveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanderNiveauActionPerformed
        // TODO add your handling code here:
        BoutonMoyen.setVisible(true);
        BoutonDifficile.setVisible(true);
        BoutonFacile.setVisible(true);

    }//GEN-LAST:event_demanderNiveauActionPerformed
    public void initialiserPartie() {
        if (dimension == 5) {
            this.nbCoupsMax = 20;
            this.nbMelange = 100;
        } else if (dimension == 7) {
            this.nbCoupsMax = 15;
            this.nbMelange = 150;
        } else if (dimension == 10) {
            this.nbCoupsMax = 10;
            this.nbMelange = 200;
        }
        this.grille.activerLigneColonneOuDiagonaleAleatoire();
        this.grille.melangerMatriceAleatoirement(nbMelange);

        lbl_nbCoups.setText("Coups restants : " + Integer.toString(nbCoupsMax - nbCoups));
        pannel_infos.setVisible(true);

    }

    public void Gagner() {
        if (nbCoupsMax == nbCoups) {
            finDePartie();
            lbl_msg_fin_de_partie.setText("Vous avez perdu !");
        }
        if (grille.cellulesToutesEteintes() == true && nbCoups != nbCoupsMax) {
           pannel_finDePartie.setBackground(new java.awt.Color(102, 255, 51));
           finDePartie();
           lbl_msg_fin_de_partie.setText("Vous avez gagné en "+ nbCoups+" coups !");
        }
    }

    public void finDePartie() {
        PanneauGrille.setVisible(false);
        pannel_infos.setVisible(false);
        boutonsHorizontaux.setVisible(false);
        boutonsVerticaux.setVisible(false);
        pannel_finDePartie.setVisible(true);
    }

    private void BoutonMoyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMoyenActionPerformed
        // TODO add your handling code here:
        this.dimension = 7;
        creerPanel();
    }//GEN-LAST:event_BoutonMoyenActionPerformed

    private void BoutonFacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonFacileActionPerformed
        // TODO add your handling code here:
        this.dimension = 5;
        creerPanel();
    }//GEN-LAST:event_BoutonFacileActionPerformed

    private void BoutonDifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDifficileActionPerformed
        // TODO add your handling code here:
        this.dimension = 10;
        creerPanel();


    }//GEN-LAST:event_BoutonDifficileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonDifficile;
    private javax.swing.JButton BoutonFacile;
    private javax.swing.JButton BoutonMoyen;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel boutonsHorizontaux;
    private javax.swing.JPanel boutonsVerticaux;
    private javax.swing.JButton demanderNiveau;
    private javax.swing.JLabel lbl_finDePartie;
    private javax.swing.JLabel lbl_msg_fin_de_partie;
    private javax.swing.JLabel lbl_nbCoups;
    private javax.swing.JPanel pannel_finDePartie;
    private javax.swing.JPanel pannel_infos;
    // End of variables declaration//GEN-END:variables
}
