package MyEclipseGen;

import model.person_information;
import model.trainmassage;
import server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class check_ticket_stand {
    public static JPanel check_ticket_JP;
    public static JFrame check_ticket_jm;
    public static JButton return_fix,enter;
    public JLabel trainerinforma, startdate,startlocat,train_number,starttime, go_to,endlocat ,endtime;
    public JLabel trainername,trainername1,settype,settype1,ticketype,ticketype1,id_type,id_type1,id_number,id_number1,phone_number,phone_number1;
    public JLabel setnumber,number,ps;

    public check_ticket_stand() throws Exception {
        check_ticket_jm = new JFrame("核对乘车信息3");
        check_ticket_jm.setBackground(Color.white);
        check_ticket_jm.setSize(587, 275);
        check_ticket_jm.setLocationRelativeTo(null);
        check_ticket_jm.setLayout(null);
        check_ticket_JP = new JPanel();
        check_ticket_JP.setSize(587, 275);
        check_ticket_JP.setLayout(null);
        check_ticket_JP.setBackground(new java.awt.Color(246, 198, 198));
        trainerinforma = new JLabel("请核对以下信息");
        trainerinforma.setBounds(8, 11, 153, 28);
        trainerinforma.setFont(new Font("Microsoft JhengHei Light", 0, 20));
        setnumber=new JLabel("本次列车剩余站票余量:");
        setnumber.setBounds(3,135,140,15);
        number=new JLabel("余量");
        number.setBounds(130,135,40,15);
        ps=new JLabel("*系统将为您随机分配位置");
        ps.setBounds(3,150,140,15);
        ps.setForeground(Color.red);
        return_fix=new JButton("返回修改");
        return_fix.setBounds(155,185,90,30);
        enter=new JButton("确认");
        enter.setBounds(350,185,80,30);
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
        check_ticket_jm.add(check_ticket_JP);
        check_ticket_JP.add(trainerinforma);
        check_ticket_JP.add(startlocat);
        check_ticket_JP.add(startdate);
        check_ticket_JP.add(starttime);
        check_ticket_JP.add(endlocat);
        check_ticket_JP.add(endtime);
        check_ticket_JP.add(go_to);
        check_ticket_JP.add(train_number);
        check_ticket_JP.add(trainername);
        check_ticket_JP.add(trainername1);
        check_ticket_JP.add(ticketype);
        check_ticket_JP.add(ticketype1);
        check_ticket_JP.add(ps);
        check_ticket_JP.add(settype);
        check_ticket_JP.add(settype1);
        check_ticket_JP.add(id_type);
        check_ticket_JP.add(id_type1);
        check_ticket_JP.add(id_number);
        check_ticket_JP.add(id_number1);
        check_ticket_JP.add(phone_number);
        check_ticket_JP.add(phone_number1);
        check_ticket_JP.add(setnumber);
        check_ticket_JP.add(number);
        check_ticket_JP.add(enter);
        check_ticket_jm.setVisible(true);
        person_information kk=Client.bookstandset();
        trainername1.setText(kk.name);
        id_type1.setText(kk.ID_type);
        id_number1.setText(kk.id_number);
        phone_number1.setText(kk.phone_number);
        trainmassage kk1=Client.gettrainmassage();
        check_ticket_jm.setLocationRelativeTo(null);
        if(kk1!=null)
        {
            System.out.println(kk1.data11);
            startdate.setText(kk1.data11);
            startlocat.setText(kk1.startstation11);
            train_number.setText(kk1.trainnumber11);
            starttime.setText(kk1.starttime11);
            endlocat.setText(kk1.endstation11);
            endtime.setText(kk1.endtime11);
            number.setText(kk1.stand_number);
        }
        enter.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            JOptionPane.showMessageDialog(null,"已购票成功");
            try {
                Client.bookstand();

            } catch (IOException e) {
                e.printStackTrace();
            }
            check_ticket_jm.dispose();
        }});

    }

    public static void main(String args[]) throws Exception {
        new check_ticket_stand();

    }
}

