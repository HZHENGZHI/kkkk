/*
 * www.java
 *
 * Created on __DATE__, __TIME__
 */

package admin;

import MyEclipseGen.find_pw;
import server.Client;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 *
 * @author  __USER__
 */
public class  admin_jm extends javax.swing.JFrame {

    /** Creates new form www */
    public  admin_jm() {
        initComponents();
    }

    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 163, 163));

        jPanel1.setBackground(new java.awt.Color(255, 147, 147));

        jLabel1.setText("\u9000\u51fa");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    alltrain(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton1.setText("\u4eca\u65e5\u5168\u90e8\u8f66\u6b21");
        jButton1.setBackground(new java.awt.Color(235, 157, 157));
        jButton1.setIcon(new ImageIcon("src/icon/icons8-railway-station-30.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton2.setText("\u9000\u7968");
        jButton2.setBackground(new java.awt.Color(236, 159, 159));
        jButton2.setIcon(new ImageIcon("src/icon/icons8-ticket-30.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        jButton3.setBackground(new java.awt.Color(245, 152, 152));
        jButton3.setText("\u6dfb\u52a0\u4eca\u65e5\u73ed\u6b21");
        jButton3.setIcon(new ImageIcon("src/icon/icons8-add-list-30.png")); // NOI18N
        jButton3.setText("\u6dfb\u52a0\u4eca\u65e5\u73ed\u6b21");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
                jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout
                .setHorizontalGroup(jPanel1Layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                jPanel1Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel1)
                                                                        .addContainerGap(
                                                                                162,
                                                                                Short.MAX_VALUE))
                                                        .addGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(
                                                                                                jButton3,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                162,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(
                                                                                                jButton1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                162,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(
                                                                                                jButton2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                162,
                                                                                                Short.MAX_VALUE))
                                                                        .addGap(
                                                                                37,
                                                                                37,
                                                                                37)))));
        jPanel1Layout
                .setVerticalGroup(jPanel1Layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(
                                                jButton1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(
                                                jButton2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(
                                                jButton3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(28, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    //GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel1.setForeground(Color.red);
    }
    private void alltrain(java.awt.event.MouseEvent evt) throws Exception {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
        new admin_lodin().setVisible(true);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new newtrain().setVisible(true);

    }
    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel1.setForeground(Color.black);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        // TODO add your handling code here:
        Client.alltrain();
        System.out.println("yes");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        // TODO add your handling code here:
        new quit_ticket();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_jm().setVisible(true);
            }
        });
    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}