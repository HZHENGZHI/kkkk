/*
 * find_pw.java
 *
 * Created on __DATE__, __TIME__
 */

package MyEclipseGen;

import javax.sound.midi.Soundbank;
import javax.swing.*;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import server.Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLOutput;


public class find_pw extends javax.swing.JFrame {
    public static JPanel finpw_JP;
    public static JFrame find_pw;
    public static JButton findpw;
    public static JLabel name,pw1,pw2,title;
    public static JTextField namefield;
    public static JPasswordField pw1field,pw2field;
    public find_pw() {
        initComponents();
    }

    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {
        find_pw = new JFrame("找回密码");
        find_pw.setBackground(Color.white);

        find_pw.setSize(288,210);
        find_pw.setLocationRelativeTo(null);
        find_pw.setLayout(null);

        finpw_JP=new JPanel();
        finpw_JP.setSize(288, 210);
        finpw_JP.setLayout(null);
        find_pw.add(finpw_JP);
        finpw_JP.setBackground(new java.awt.Color(246, 198, 198));

        title=new JLabel("找回密码");
        title.setFont(new Font("Microsoft JhengHei Light", 0, 20));
        title.setBounds(12,3,84,22);

        name=new JLabel("用户名");
        name.setBounds(18,36,60,15);
        Icon icon=new ImageIcon("src/icon/icons8-person-16.png");
        name.setIcon(icon);


        namefield=new JTextField(20);
        namefield.setBounds(89,32,160,23);

        pw1=new JLabel("密码");
        pw1.setBounds(18,74,60,15);
        Icon icon1=new ImageIcon("src/icon/icons8-password-16.png");
        pw1.setIcon(icon1);

        pw1field=new JPasswordField(20);
        pw1field.setBounds(89,70,160,23);

        pw2=new JLabel("新密码");
        pw2.setBounds(18,111,60,15);
        Icon icon2=new ImageIcon("src/icon/icons8-password-16.png");
        pw2.setIcon(icon2);



        pw2field=new JPasswordField(20);
        pw2field.setBounds(89,107,160,23);

        findpw=new JButton("完成");
        findpw.setBounds(128,134,60,33);
        findpw.setBackground(new java.awt.Color(245, 168, 168));


        finpw_JP.add(title);
        finpw_JP.add(name);
        finpw_JP.add(namefield);
        finpw_JP.add(pw1);
        finpw_JP.add(pw1field);
        finpw_JP.add(pw2);
        finpw_JP.add(pw2field);
        finpw_JP.add(findpw);
        findpw.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            try {
                String name=namefield.getText();
                String pw=pw1field.getText();
                String pw1=pw1field.getText();
                if(pw.equals(pw1))
                {
                    Client.getnewpassword(name,pw);
                    JOptionPane.showMessageDialog(null, "找回密码成功");
                    find_pw.dispose();
                    new login().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "输入两次密码不正确");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }});
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new find_pw();
    }
}