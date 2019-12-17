package MyEclipseGen;

import model.person_information;
import server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class person_information_jm {
    public static JPanel person_information_JP;
    public static JFrame person_information;
    public static JButton fixinformation;
    public static JLabel title, id, readlyname, sex, nation, id_type, id_number, phone_number, email;
    public static JTextField idfield, readlynamefield, sexfield, nationfield, id_typefield, id_numberfield, phone_numberfield, emailfield;

    public person_information_jm() throws IOException {
        initComponents();
    }

    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException {
        person_information = new JFrame("个人信息");
        person_information.setBackground(Color.white);
        person_information.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        person_information.setSize(272, 395);
        person_information.setLocationRelativeTo(null);
        person_information.setLayout(null);
        person_information_JP = new JPanel();
        person_information_JP.setSize(272, 395);
        person_information_JP.setLayout(null);
        person_information.add(person_information_JP);
        person_information_JP.setBackground(new java.awt.Color(246, 198, 198));
        title = new JLabel("个人信息");
        title.setFont(new Font("Microsoft JhengHei Light", 0, 20));
        title.setBounds(12, 3, 84, 22);
        id = new JLabel("");
        id.setBounds(30, 35, 36, 15);
        id.setIcon(new ImageIcon("src/icon/icons8-person-16.png"));
        idfield = new JTextField(20);
        idfield.setBounds(74, 31, 160, 23);
        idfield.setText("***");
        idfield.setBackground(Color.white);
        idfield.setEditable(false);
        readlyname = new JLabel("");
        readlyname.setBounds(30, 64, 24, 15);
        readlyname.setIcon(new ImageIcon("src/icon/icons8-name-16.png")); // NOI18N
        readlynamefield = new JTextField(20);
        readlynamefield.setBounds(74, 68, 160, 23);
        readlynamefield.setText("***");
        readlynamefield.setBackground(Color.white);
        readlynamefield.setEditable(false);
        sex = new JLabel("");
        sex.setBounds(30, 104, 24, 15);
        sex.setIcon(new ImageIcon("src/icon/icons8-gender-16.png"));
        sexfield = new JTextField(20);
        sexfield.setBounds(76, 108, 160, 23);
        sexfield.setText("***");
        sexfield.setBackground(Color.white);
        sexfield.setEditable(false);
        nation = new JLabel("");
        nation.setBounds(30, 143, 24, 15);
        nation.setIcon(new ImageIcon("src/icon/icons8-flag-filled-16.png"));
        nationfield = new JTextField(20);
        nationfield.setBounds(76, 139, 160, 23);
        nationfield.setText("***");
        nationfield.setBackground(Color.white);
        nationfield.setEditable(false);
        id_type = new JLabel("");
        id_type.setBounds(30, 180, 48, 15);
        id_type.setIcon(new ImageIcon("src/icon/icons8-id-verified-16.png"));
        id_typefield = new JTextField(20);
        id_typefield.setBounds(76, 176, 160, 23);
        id_typefield.setText("***");
        id_typefield.setBackground(Color.white);
        id_typefield.setEditable(false);
        id_number = new JLabel("");
        id_number.setBounds(30, 214, 48, 15);
        id_number.setIcon(new ImageIcon("src/icon/icons8-token-card-code-16.png"));
        id_numberfield = new JTextField(20);
        id_numberfield.setBounds(76, 210, 160, 23);
        id_numberfield.setText("***");
        id_numberfield.setBackground(Color.white);
        id_numberfield.setEditable(false);
        phone_number = new JLabel("");
        phone_number.setBounds(30, 239, 45, 15);
        phone_number.setIcon(new ImageIcon("src/icon/icons8-phone-16.png"));
        phone_numberfield = new JTextField(20);
        phone_numberfield.setBounds(76, 243, 160, 23);
        phone_numberfield.setText("***");
        phone_numberfield.setBackground(Color.white);
        phone_numberfield.setEditable(false);
        email = new JLabel("");
        email.setBounds(30, 276, 24, 15);
        email.setIcon(new ImageIcon("src/icon/icons8-email-16.png"));
        emailfield = new JTextField(20);
        emailfield.setBounds(76, 280, 160, 23);
        emailfield.setText("***");
        emailfield.setBackground(Color.white);
        emailfield.setEditable(false);
        fixinformation = new JButton("显示内容");
        fixinformation.setBounds(97, 311, 101, 42);
        fixinformation.setBackground(new java.awt.Color(245, 168, 168));
        person_information_JP.add(title);
        person_information_JP.add(id);
        person_information_JP.add(idfield);
        person_information_JP.add(readlyname);
        person_information_JP.add(readlynamefield);
        person_information_JP.add(sex);
        person_information_JP.add(sexfield);
        person_information_JP.add(nation);
        person_information_JP.add(nationfield);
        person_information_JP.add(id_type);
        person_information_JP.add(id_typefield);
        person_information_JP.add(id_number);
        person_information_JP.add(id_numberfield);
        person_information_JP.add(phone_number);
        person_information_JP.add(phone_numberfield);
        person_information_JP.add(email);
        person_information_JP.add(emailfield);
        person_information_JP.add(fixinformation);
        person_information.setVisible(true);
        login lg = new login();
        String id1 = lg.jTextField1.getText();
        System.out.println(id1);
        person_information.setLocationRelativeTo(null);
        fixinformation.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0)
        {
            try {
                model.person_information kk= Client.fixperson_information();
                if(kk!=null)
                {
                    idfield.setText(id1);
                    readlynamefield.setText(kk.name);
                    sexfield.setText(kk.sex);
                    nationfield.setText(kk.nationality);
                    id_typefield.setText(kk.ID_type);
                    id_numberfield.setText(kk.id_number);
                    phone_numberfield.setText(kk.phone_number);
                    emailfield.setText(kk.Email);

                }

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }});
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        new person_information_jm();
    }
}
