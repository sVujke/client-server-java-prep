/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import nit.PrijemNit;

/**
 *
 * @author vujke
 */
public class KlijentGUI extends javax.swing.JFrame {
    
    Socket soket;
    BufferedReader in;
    PrintStream out;
    String kat;
    List<JButton> dugmici = new ArrayList<>();
    int brojac = 0;
    /**
     * Creates new form KlijentLogin
     */
    public KlijentGUI() {
        initComponents();
    }

    KlijentGUI(String kat, BufferedReader in, PrintStream out, Socket soket) {
        initComponents();
        this.kat = kat;
        this.in = in;
        this.out = out;
        this.soket = soket;
        dugmici.add(jbt0);
        dugmici.add(jbt1);dugmici.add(jbt2);
        dugmici.add(jbt3);
        dugmici.add(jbt4);
        dugmici.add(jbt5);
        dugmici.add(jbt6);
        dugmici.add(jbt7);
        dugmici.add(jbt8);
        dugmici.add(jbt9);
        dugmici.add(jbt10);
        dugmici.add(jbt11);
        dugmici.add(jbt12);
        dugmici.add(jbt13);
        dugmici.add(jbt14);
        dugmici.add(jbt15);
        dugmici.add(jbt16);
        dugmici.add(jbt17);
        dugmici.add(jbt18);
        dugmici.add(jbt19);
        dugmici.add(jbt20);
        dugmici.add(jbt21);
        dugmici.add(jbt22);
        dugmici.add(jbt23);
        dugmici.add(jbt24);
        
        PrijemNit nit = new PrijemNit(soket, in, out, kat, dugmici);
        nit.start();
        //jbt0.setVerifyInputWhenFocusTarget(true);
        if(kat.equals("3")){
            for (int i = 9; i < dugmici.size(); i++) {
                dugmici.get(i).setVisible(false);
            }
        } else if(kat.equals("4")){
            for (int i = 16; i < dugmici.size(); i++) {
                dugmici.get(i).setVisible(false);
            }
        } else if(kat.equals("5")){
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbt0 = new javax.swing.JButton();
        jbt1 = new javax.swing.JButton();
        jbt2 = new javax.swing.JButton();
        jbt3 = new javax.swing.JButton();
        jbt4 = new javax.swing.JButton();
        jbt5 = new javax.swing.JButton();
        jbt6 = new javax.swing.JButton();
        jbt7 = new javax.swing.JButton();
        jbt8 = new javax.swing.JButton();
        jbt9 = new javax.swing.JButton();
        jbt10 = new javax.swing.JButton();
        jbt11 = new javax.swing.JButton();
        jbt12 = new javax.swing.JButton();
        jbt13 = new javax.swing.JButton();
        jbt14 = new javax.swing.JButton();
        jbt15 = new javax.swing.JButton();
        jbt16 = new javax.swing.JButton();
        jbt17 = new javax.swing.JButton();
        jbt18 = new javax.swing.JButton();
        jbt19 = new javax.swing.JButton();
        jbt20 = new javax.swing.JButton();
        jbt21 = new javax.swing.JButton();
        jbt22 = new javax.swing.JButton();
        jbt23 = new javax.swing.JButton();
        jbt24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt0ActionPerformed(evt);
            }
        });

        jbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt1ActionPerformed(evt);
            }
        });

        jbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt2ActionPerformed(evt);
            }
        });

        jbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt3ActionPerformed(evt);
            }
        });

        jbt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt4ActionPerformed(evt);
            }
        });

        jbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt5ActionPerformed(evt);
            }
        });

        jbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt6ActionPerformed(evt);
            }
        });

        jbt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt7ActionPerformed(evt);
            }
        });

        jbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt8ActionPerformed(evt);
            }
        });

        jbt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt9ActionPerformed(evt);
            }
        });

        jbt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt10ActionPerformed(evt);
            }
        });

        jbt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt11ActionPerformed(evt);
            }
        });

        jbt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt12ActionPerformed(evt);
            }
        });

        jbt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt13ActionPerformed(evt);
            }
        });

        jbt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt14ActionPerformed(evt);
            }
        });

        jbt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt15ActionPerformed(evt);
            }
        });

        jbt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt16ActionPerformed(evt);
            }
        });

        jbt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt17ActionPerformed(evt);
            }
        });

        jbt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt18ActionPerformed(evt);
            }
        });

        jbt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt19ActionPerformed(evt);
            }
        });

        jbt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt20ActionPerformed(evt);
            }
        });

        jbt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt21ActionPerformed(evt);
            }
        });

        jbt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt22ActionPerformed(evt);
            }
        });

        jbt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt23ActionPerformed(evt);
            }
        });

        jbt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbt0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbt16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbt18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbt10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbt12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt23, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt22ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(22);
    }//GEN-LAST:event_jbt22ActionPerformed

    private void jbt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt23ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(23);
    }//GEN-LAST:event_jbt23ActionPerformed

    private void jbt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt24ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(24);
    }//GEN-LAST:event_jbt24ActionPerformed

    private void jbt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt0ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(0);
    }//GEN-LAST:event_jbt0ActionPerformed

    private void jbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt1ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(1);
    }//GEN-LAST:event_jbt1ActionPerformed

    private void jbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt2ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(2);
    }//GEN-LAST:event_jbt2ActionPerformed

    private void jbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt3ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(3);
    }//GEN-LAST:event_jbt3ActionPerformed

    private void jbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt4ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(4);
    }//GEN-LAST:event_jbt4ActionPerformed

    private void jbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt5ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(5);
    }//GEN-LAST:event_jbt5ActionPerformed

    private void jbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt6ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(6);
    }//GEN-LAST:event_jbt6ActionPerformed

    private void jbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt7ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(7);
    }//GEN-LAST:event_jbt7ActionPerformed

    private void jbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt8ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(8);
    }//GEN-LAST:event_jbt8ActionPerformed

    private void jbt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt9ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(9);
    }//GEN-LAST:event_jbt9ActionPerformed

    private void jbt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt10ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(10);
    }//GEN-LAST:event_jbt10ActionPerformed

    private void jbt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt11ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(11);
    }//GEN-LAST:event_jbt11ActionPerformed

    private void jbt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt12ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(12);
    }//GEN-LAST:event_jbt12ActionPerformed

    private void jbt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt13ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(13);
    }//GEN-LAST:event_jbt13ActionPerformed

    private void jbt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt14ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(14);
    }//GEN-LAST:event_jbt14ActionPerformed

    private void jbt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt15ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(15);
    }//GEN-LAST:event_jbt15ActionPerformed

    private void jbt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt16ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(16);
    }//GEN-LAST:event_jbt16ActionPerformed

    private void jbt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt17ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(17);
    }//GEN-LAST:event_jbt17ActionPerformed

    private void jbt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt18ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(18);
    }//GEN-LAST:event_jbt18ActionPerformed

    private void jbt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt19ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(19);
    }//GEN-LAST:event_jbt19ActionPerformed

    private void jbt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt20ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(20);
    }//GEN-LAST:event_jbt20ActionPerformed

    private void jbt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt21ActionPerformed
        // TODO add your handling code here:
        posaljiZahtev(21);
    }//GEN-LAST:event_jbt21ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlijentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbt0;
    private javax.swing.JButton jbt1;
    private javax.swing.JButton jbt10;
    private javax.swing.JButton jbt11;
    private javax.swing.JButton jbt12;
    private javax.swing.JButton jbt13;
    private javax.swing.JButton jbt14;
    private javax.swing.JButton jbt15;
    private javax.swing.JButton jbt16;
    private javax.swing.JButton jbt17;
    private javax.swing.JButton jbt18;
    private javax.swing.JButton jbt19;
    private javax.swing.JButton jbt2;
    private javax.swing.JButton jbt20;
    private javax.swing.JButton jbt21;
    private javax.swing.JButton jbt22;
    private javax.swing.JButton jbt23;
    private javax.swing.JButton jbt24;
    private javax.swing.JButton jbt3;
    private javax.swing.JButton jbt4;
    private javax.swing.JButton jbt5;
    private javax.swing.JButton jbt6;
    private javax.swing.JButton jbt7;
    private javax.swing.JButton jbt8;
    private javax.swing.JButton jbt9;
    // End of variables declaration//GEN-END:variables

    private void posaljiZahtev(int x) {
        out.println(x);
        brojac++;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
