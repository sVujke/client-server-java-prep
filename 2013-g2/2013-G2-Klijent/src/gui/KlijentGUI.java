/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import niti.PrijemNit;

/**
 *
 * @author vujke
 */
public class KlijentGUI extends javax.swing.JFrame {
    BufferedReader in;
    PrintStream out;
    Socket soket;
    /**
     * Creates new form KlijentGUI
     */
    public KlijentGUI() {
        initComponents();
    }

    public KlijentGUI(BufferedReader in, PrintStream out, Socket soket){
        initComponents();
        this.out = out;
        this.soket = soket;
        this.in = in;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtPozicija = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtIzbaciElement = new javax.swing.JButton();
        jtxtPorukaServer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtPozicija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPozicijaActionPerformed(evt);
            }
        });

        jLabel1.setText("Izbaci element sa pozicije");

        jbtIzbaciElement.setText("Izbaci element");
        jbtIzbaciElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIzbaciElementActionPerformed(evt);
            }
        });

        jLabel2.setText("Poruka:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jtxtPorukaServer, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtIzbaciElement)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jtxtPozicija)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPozicija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addComponent(jbtIzbaciElement)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtPorukaServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtIzbaciElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIzbaciElementActionPerformed
        // TODO add your handling code here:
        String p = jtxtPozicija.getText().trim();
        int pozicija = 0;
        try {
            pozicija = Integer.parseInt(p);
            if(pozicija<1 || pozicija >10){
                JOptionPane.showMessageDialog(rootPane, "Mora vece od 0 i manje od 10!");
                return;
            }
            pozicija = pozicija-1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Nije unet broj!");
            return;
        }
        
        PrijemNit nit = new PrijemNit(in, out, soket, jtxtPorukaServer);
        nit.start();
        out.println(""+pozicija);
        //int pozicija = Integer.parseInt(p);
    }//GEN-LAST:event_jbtIzbaciElementActionPerformed

    private void jtxtPozicijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPozicijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPozicijaActionPerformed

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
            java.util.logging.Logger.getLogger(KlijentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KlijentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KlijentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KlijentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlijentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtIzbaciElement;
    private javax.swing.JTextField jtxtPorukaServer;
    private javax.swing.JTextField jtxtPozicija;
    // End of variables declaration//GEN-END:variables
}