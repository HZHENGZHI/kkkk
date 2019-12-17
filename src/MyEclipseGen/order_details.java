package MyEclipseGen;

import model.train_ticket;
import server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;

public class order_details {
    public static JPanel order_details_JP;
    public static JFrame order_details_jm;
    public static JButton booksbusiness,bookoneset,booktowset,bookstandset;
    public JLabel traindetails,startdate,startdate1,starttime,starttime1,enddate,enddate1,endtime,endtime1,go_to,startlocat,startlocat1,endlocat,endlocat1;
    public JLabel settype,businessset,oneset,twoset,standset,money,money1,money2,money3,money4,number,number1,number2,number3,number4;
    public order_details() throws Exception{
        order_details_jm = new JFrame("今日列车车次");
        order_details_jm.setBackground(Color.white);
        //order_details_jm.setVisible(true);
        order_details_jm.setSize(534,589);
        order_details_jm.setLocationRelativeTo(null);
        order_details_jm.setLayout(null);
        order_details_JP=new JPanel();
        order_details_JP.setSize(534, 589);
        order_details_JP.setLayout(null);
        order_details_JP.setBackground(new java.awt.Color(246, 198, 198));
        traindetails=new JLabel("车次详细");
        traindetails.setBounds(225,21,84,28);
        traindetails.setIcon(new ImageIcon("src/icon/icons8-steam-engine-16.png"));
        booksbusiness=new JButton("预定");
        booksbusiness.setBounds(430,280, 60, 30);
        booksbusiness.setBackground(new java.awt.Color(252, 225, 225));
        bookoneset=new JButton("预定");
        bookoneset.setBounds(430,339, 60, 30);
        bookoneset.setBackground(new java.awt.Color(252, 225, 225));
        booktowset=new JButton("预定");
        booktowset.setBounds(430,392, 60, 30);
        booktowset.setBackground(new java.awt.Color(252, 225, 225));
        bookstandset=new JButton("预定");
        bookstandset.setBounds(430,453, 60, 30);
        bookstandset.setBackground(new java.awt.Color(252, 225, 225));
        startlocat=new JLabel("出发地");
        startlocat.setBounds(55,180,76,34);
        startlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
        startlocat1=new JLabel("出发地1");
        startlocat1.setBounds(55,210,76,34);
        startdate=new JLabel("出发日期");
        startdate.setBounds(55,60,100,34);
        startdate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));
        startdate1=new JLabel("出发日期1");
        startdate1.setBounds(55,90,100,34);
        starttime=new JLabel("出发时间");
        starttime.setBounds(55,127,100,24);
        starttime.setIcon(new ImageIcon("src/icon/icons8-time-machine-16.png"));
        starttime1=new JLabel("出发时间1");
        starttime1.setBounds(55,157,60,24);
        endlocat=new JLabel("目的地");
        endlocat.setBounds(401,180,76,34);
        endlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
        endlocat1=new JLabel("目的地1");
        endlocat1.setBounds(401,210,76,34);
        enddate=new JLabel("到达日期");
        enddate.setBounds(401,60,76,34);
        enddate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));
        enddate1=new JLabel("到达日期1");
        enddate1.setBounds(401,90,76,34);
        endtime=new JLabel("到达时间");
        endtime.setBounds(401,127,100,24);
        endtime.setIcon(new ImageIcon("src/icon/icons8-time-machine-16.png"));
        endtime1=new JLabel("到达时间");
        endtime1.setBounds(401,157,60,24);
        go_to=new JLabel("前往");
        go_to.setBounds(236,180,42,32);
        go_to.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 20));
        settype=new JLabel("座位类型");
        settype.setBounds(30,265,108,24);
        settype.setIcon(new ImageIcon("src/icon/icons8-tram-16.png"));
       businessset=new JLabel("商务座");
        businessset.setBounds(55,286,47,34);
        oneset=new JLabel("一等座");
        oneset.setBounds(55,344,47,34);
        twoset=new JLabel("二等座");
        twoset.setBounds(55,397,47,34);
       standset=new JLabel("无座");
        standset.setBounds(55,458,47,34);
        money4=new JLabel("价格");
        money4.setBounds(178,265,60,20);
        money4.setIcon(new ImageIcon("src/icon/icons8-money-16.png"));
        money=new JLabel("金额");
        money.setBounds(194,293,60,20);
        money1=new JLabel("金额1");
        money1.setBounds(194,351,38,20);
        money2=new JLabel("金额2");
        money2.setBounds(194,404,38,20);
        money3=new JLabel("金额3");
        money3.setBounds(194,465,38,20);
        number4=new JLabel("余量");
        number4.setBounds(293,265,60,20);
        number4.setIcon(new ImageIcon("src/icon/icons8-sigma-16.png"));
        number=new JLabel("数量");
        number.setBounds(315,293,30,20);
        number1=new JLabel("数量1");
        number1.setBounds(315,351,38,20);
        number2=new JLabel("数量2");
        number2.setBounds(315,404,38,20);
        number3=new JLabel("数量3");
        number3.setBounds(315,465,38,20);
        order_details_jm.add(order_details_JP);
        order_details_JP.add(traindetails);
        order_details_JP.add(startlocat);
        order_details_JP.add(startlocat1);
        order_details_JP.add(startdate);
        order_details_JP.add(startdate1);
        order_details_JP.add(starttime);
        order_details_JP.add(starttime1);
        order_details_JP.add(endlocat);
        order_details_JP.add(endlocat1);
        order_details_JP.add(enddate);
        order_details_JP.add(enddate1);
        order_details_JP.add(endtime);
        order_details_JP.add(endtime1);
        order_details_JP.add(booksbusiness);
        order_details_JP.add(bookoneset);
        order_details_JP.add(booktowset);
        order_details_JP.add(bookstandset);
        order_details_JP.add(go_to);
        order_details_JP.add(settype);
        order_details_JP.add(businessset);
        order_details_JP.add(oneset);
        order_details_JP.add(twoset);
        order_details_JP.add(standset);
        order_details_JP.add(money);
        order_details_JP.add(money1);
        order_details_JP.add(money2);
        order_details_JP.add(money3);
        order_details_JP.add(money4);
        order_details_JP.add(number);
        order_details_JP.add(number1);
        order_details_JP.add(number2);
        order_details_JP.add(number3);
        order_details_JP.add(number4);
        order_details_jm.setLocationRelativeTo(null);
        order_details_jm.setVisible(true);
        booksbusiness.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            try {

                order_details_jm.dispose();
                Client.bookbusinessset();
                new check_ticket_businesset().check_ticket_jm.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }});
        bookoneset.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            try {
                order_details_jm.dispose();
                Client.bookoneset();
                new check_ticket_oneset().check_ticket_jm.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }});
        booktowset.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            try {
                order_details_jm.dispose();
                Client.booktwoset();
                new check_ticket_twoset().check_ticket_jm.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }});
        bookstandset.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            try {
                order_details_jm.dispose();
                Client.bookstandset();
                new check_ticket_stand().check_ticket_jm.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }});
    }
    public static void main(String args[]) throws Exception {
        new order_details();

    }
}
