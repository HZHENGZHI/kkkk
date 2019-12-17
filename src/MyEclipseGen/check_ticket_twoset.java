package MyEclipseGen;

import model.person_information;
import model.trainmassage;
import server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class check_ticket_twoset {
    public static JPanel check_ticket_JP;
    public static JFrame check_ticket_jm;
    public static JButton bookstwo_A, bookstwo_B,bookstwo_C,bookstwo_D,bookstwo_F,return_fix,enter;
    public JLabel trainerinforma, startdate,startlocat,train_number,starttime, go_to,endlocat ,endtime;
    public JLabel trainername,trainername1,settype,settype1,ticketype,ticketype1,id_type,id_type1,id_number,id_number1,phone_number,phone_number1,readyselect,getSettype;
    public JLabel placeselectset,setnumber,number;
    public String set_type;

    public check_ticket_twoset() throws Exception {
        check_ticket_jm = new JFrame("核对乘车信息2");
        check_ticket_jm.setBackground(Color.white);
        check_ticket_jm.setSize(587, 305);
        check_ticket_jm.setLocationRelativeTo(null);
        check_ticket_jm.setLayout(null);
        check_ticket_JP = new JPanel();
        check_ticket_JP.setSize(587, 305);
        check_ticket_JP.setLayout(null);
        check_ticket_JP.setBackground(new java.awt.Color(246, 198, 198));
        trainerinforma = new JLabel("请核对以下信息");
        trainerinforma.setBounds(8, 11, 153, 28);
        trainerinforma.setFont(new Font("Microsoft JhengHei Light", 0, 20));
        bookstwo_A = new JButton("A");
        bookstwo_A.setBounds(101, 159, 80, 30);
        bookstwo_A.setIcon(new ImageIcon("src/icon/icons8-theatre-seat-16.png"));
        bookstwo_A.setBackground(new java.awt.Color(252, 225, 225));
        bookstwo_B = new JButton("B");
        bookstwo_B.setBounds(191, 159, 80, 30);
        bookstwo_B.setBackground(new java.awt.Color(252, 225, 225));
        bookstwo_B.setIcon(new ImageIcon("src/icon/icons8-theatre-seat-16.png"));
        bookstwo_C = new JButton("C");
        bookstwo_C.setBounds(282, 159, 80, 30);
        bookstwo_C.setBackground(new java.awt.Color(252, 225, 225));
        bookstwo_C.setIcon(new ImageIcon("src/icon/icons8-theatre-seat-16.png"));
        bookstwo_D = new JButton("D");
        bookstwo_D.setBounds(411, 159, 80, 30);
        bookstwo_D.setBackground(new java.awt.Color(252, 225, 225));
        bookstwo_D.setIcon(new ImageIcon("src/icon/icons8-theatre-seat-16.png"));
        bookstwo_F = new JButton("F");
        bookstwo_F.setBounds(501, 159, 80, 30);
        bookstwo_F.setBackground(new java.awt.Color(252, 225, 225));
        bookstwo_F.setIcon(new ImageIcon("src/icon/icons8-theatre-seat-16.png"));
        placeselectset=new JLabel("请选择座位");
        placeselectset.setBounds(23,168,76,15);
        setnumber=new JLabel("本次列车剩余二等座余量:");
        setnumber.setBounds(3,208,140,15);
        number=new JLabel("余量");
        number.setBounds(140,208,40,15);
        return_fix=new JButton("返回修改");
        return_fix.setBounds(175,225,90,30);
        enter=new JButton("确认");
        enter.setBounds(350,225,80,30);
        enter.setBackground(new java.awt.Color(252, 225, 225));
        enter.setIcon(new ImageIcon("src/icon/icons8-kicking-16.png"));
        startdate = new JLabel("2019-10-01");
        startdate.setBounds(10, 47, 68, 34);
        startlocat = new JLabel("出发站台");
        startlocat.setBounds(90, 47, 48, 34);
        starttime = new JLabel("17:08");
        starttime.setBounds(210, 47, 48, 34);
        train_number = new JLabel("GC-123");
        train_number.setBounds(150, 47, 48, 34);
        endlocat = new JLabel("广州南站");
        endlocat.setBounds(300, 47, 48, 34);
        endtime = new JLabel("20:08");
        endtime.setBounds(359, 47, 48, 34);
        go_to = new JLabel("-->");
        go_to.setBounds(256, 47, 48, 34);
        go_to.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 20));
        trainername=new JLabel("乘车人");
        trainername.setBounds(24,84,36,15);
        trainername1=new JLabel("春秋战国");
        trainername1.setBounds(24,110,50,15);
        ticketype=new JLabel("席别");
        ticketype.setBounds(91,84,50,15);
        ticketype1=new JLabel("商务座");
        ticketype1.setBounds(91,110,50,15);
        settype=new JLabel("车票类型");
        settype.setBounds(143,84,48,15);
        settype1=new JLabel("成人票");
        settype1.setBounds(143,110,48,15);
        id_type=new JLabel("证件类型");
        id_type.setBounds(220,84,48,15);
        id_type1=new JLabel("中国居民身份证");
        id_type1.setBounds(200,110,90,15);
        id_number=new JLabel("证件号码");
        id_number.setBounds(335,84,48,15);
        id_number1=new JLabel("44152220000221901X");
        id_number1.setBounds(305,110,130,15);
        phone_number=new JLabel("手机号码");
        phone_number.setBounds(482,84,48,15);
        phone_number1=new JLabel("13049424341");
        phone_number1.setBounds(472,110,80,15);
        readyselect=new JLabel("已选择:");
        readyselect.setBounds(180,208,40,15);
        getSettype=new JLabel("");
        getSettype.setBounds(220,208,40,15);
        check_ticket_jm.add(check_ticket_JP);
        check_ticket_JP.add(trainerinforma);
        check_ticket_JP.add(startlocat);
        check_ticket_JP.add(startdate);
        check_ticket_JP.add(starttime);
        check_ticket_JP.add(endlocat);
        check_ticket_JP.add(endtime);
        check_ticket_JP.add(bookstwo_A);
        check_ticket_JP.add(bookstwo_B);
        check_ticket_JP.add(bookstwo_C);
        check_ticket_JP.add(bookstwo_D);
        check_ticket_JP.add(bookstwo_F);
        check_ticket_JP.add(go_to);
        check_ticket_JP.add(train_number);
        check_ticket_JP.add(trainername);
        check_ticket_JP.add(trainername1);
        check_ticket_JP.add(ticketype);
        check_ticket_JP.add(ticketype1);
        check_ticket_JP.add(settype);
        check_ticket_JP.add(settype1);
        check_ticket_JP.add(id_type);
        check_ticket_JP.add(id_type1);
        check_ticket_JP.add(id_number);
        check_ticket_JP.add(id_number1);
        check_ticket_JP.add(phone_number);
        check_ticket_JP.add(phone_number1);
        check_ticket_JP.add(placeselectset);
        check_ticket_JP.add(setnumber);
        check_ticket_JP.add(number);
        check_ticket_JP.add(enter);
        check_ticket_JP.add(readyselect);
        check_ticket_JP.add(getSettype);
        check_ticket_jm.setVisible(true);
        check_ticket_jm.setLocationRelativeTo(null);
        person_information kk=Client.booktwoset();
        trainername1.setText(kk.name);
        id_type1.setText(kk.ID_type);
        id_number1.setText(kk.id_number);
        phone_number1.setText(kk.phone_number);
        trainmassage kk1=Client.gettrainmassage();
        if(kk1!=null)
        {
            System.out.println(kk1.data11);
            startdate.setText(kk1.data11);
            startlocat.setText(kk1.startstation11);
            train_number.setText(kk1.trainnumber11);
            starttime.setText(kk1.starttime11);
            endlocat.setText(kk1.endstation11);
            endtime.setText(kk1.endtime11);
            number.setText(kk1.two_number);
        }
        bookstwo_A.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            set_type=bookstwo_A.getText();
            getSettype.setText(set_type);
            getSettype.setForeground(Color.red);

        }});


        bookstwo_B.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            set_type=bookstwo_B.getText();
            getSettype.setText(set_type);
            getSettype.setForeground(Color.red);

        }});


        bookstwo_C.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            set_type=bookstwo_C.getText();
            getSettype.setText(set_type);
            getSettype.setForeground(Color.red);
        }});

        bookstwo_D.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            set_type=bookstwo_D.getText();
            getSettype.setText(set_type);
            getSettype.setForeground(Color.red);

        }});

        bookstwo_F.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            set_type=bookstwo_F.getText();
            getSettype.setText(set_type);
            getSettype.setForeground(Color.red);

        }});

        enter.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            System.out.println(set_type);
            JOptionPane.showMessageDialog(null,"已选择"+set_type+"座位,已购票成功");
            try {
                Client.booktwo(set_type);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            check_ticket_jm.dispose();
        }});



    }

    public static void main(String args[]) throws Exception {
        new check_ticket_twoset();

    }
}
