/*
 * login.java
 *
 * Created on __DATE__, __TIME__
 */

package admin;

import java.awt.Color;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.*;

import MyEclipseGen.find_pw;
import MyEclipseGen.login;
import MyEclipseGen.registered;
import MyEclipseGen.search_ticket_mian_jm;
import model.User;

import model.admin;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import server.Client;

/**
 *
 * @author  __USER__
 */
public class admin_lodin extends javax.swing.JFrame {

    /** Creates new form login */
    public admin_lodin() {
        initComponents();
    }

    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();


        jPanel1.setBackground(new java.awt.Color(252, 207, 207));
        this.setTitle("管理员登录");
        jPanel1.setEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 20));
        jLabel1.setText("\u6b22\u8fce\u767b\u5f55");

        jButton1.setBackground(new java.awt.Color(252, 225, 225));
        jButton1.setText("\u767b\u5f55");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("\u6ce8\u518c");
        jButton2.setBackground(new java.awt.Color(244, 197, 197));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }
        });

        jLabel2.setText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                undeline(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                del_underline(evt);
            }
        });

        jLabel3.setText("\u8d26\u53f7");

        jLabel4.setText("\u5bc6\u7801");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/icon/icons8-train-80.png"))); // NOI18N

        jLabel6.setText("用户入口");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    user_lodin(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
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
                                        .addGap(108, 108, 108)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel5))
                                        .addContainerGap(112, Short.MAX_VALUE))
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                jPanel1Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel2)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                122,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(
                                                                                jLabel6))
                                                        .addComponent(
                                                                jPasswordField1,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                230,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                jTextField1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                230,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                jButton1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                230,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                jButton2,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                230,
                                                                Short.MAX_VALUE))
                                        .addGap(27, 27, 27)));
        jPanel1Layout
                .setVerticalGroup(jPanel1Layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                jTextField1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                39,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                jPasswordField1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                39,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addComponent(
                                                jButton1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(
                                                jButton2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                43,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel6))
                                        .addGap(139, 139, 139)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585,
                Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    //GEN-END:initComponents

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel6.setForeground(Color.black);
    }

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel6.setForeground(Color.red);
    }


    private void user_lodin(java.awt.event.MouseEvent evt) throws IOException {
        dispose();
        new login().setVisible(true);
        System.out.println("kkk1");
    }

    private void del_underline(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel2.setForeground(Color.black);
    }

    private void undeline(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jLabel2.setForeground(Color.red);
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        user = jTextField1.getText();
        String pw = jPasswordField1.getText();
        System.out.println(user);
        try {
            model.admin u = Client.admin_lonin(user, pw);
            if (u != null) {
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.dispose();
                jTextField1.setText("");
                jPasswordField1.setText("");
                new admin_jm().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "密码不正确");
            }
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new registered().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new admin_lodin();
    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    public static final javax.swing.JButton jButton1 = new javax.swing.JButton();
    public static final javax.swing.JButton jButton2 = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    public static final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    public static final javax.swing.JPasswordField jPasswordField1 = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    public String user;
    public JLabel icon;
    public JLabel admin;
    // End of variables declaration//GEN-END:variables

}