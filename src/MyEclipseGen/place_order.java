package MyEclipseGen;

import server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class place_order {
    public static JPanel place_order_JP;
    public static JFrame place_order_jm;
    public static JButton close_order,submit_order;
    public JLabel  startdate,startlocat,train_number,starttime, endlocat,go_to;

    public JLabel trainername,id_number1,select_paymethod;
    public JLabel price,ps;
    public JRadioButton WeChat,Alipay;

    public place_order() throws Exception {
        Font font=new Font("Microsoft JhengHei",0,20);
        place_order_jm = new JFrame("核对订单信息");
        place_order_jm.setBackground(Color.white);

        place_order_jm.setSize(455, 295);
        place_order_jm.setLocationRelativeTo(null);
        place_order_jm.setLayout(null);
        place_order_JP = new JPanel();
        place_order_JP.setSize(455, 295);
        place_order_JP.setLayout(null);
        place_order_JP.setBackground(new java.awt.Color(246, 198, 198));

        startdate = new JLabel("2019-10-01");
        startdate.setBounds(12, 46, 100, 24);
        //startdate.setFont(new Font("Microsoft JhengHei",0,18));

        startlocat = new JLabel("广州站");
        startlocat.setBounds(20, 16, 60, 27);
        //startlocat.setFont(font);

        starttime = new JLabel("17:08");
        starttime.setBounds(122, 46, 60, 24);
        //starttime.setFont(new Font("Microsoft JhengHei",0,18));

        go_to=new JLabel("开");
        go_to.setBounds(175,46,18,24);
       // go_to.setFont(new Font("Microsoft JhengHei",0,18));

        train_number = new JLabel("GC-123");
        train_number.setBounds(190, 20, 80, 20);
        //train_number.setFont(new Font("Microsoft JhengHei",0,20));



        endlocat = new JLabel("深圳站");
        endlocat.setBounds(358, 16, 60, 27);
       // endlocat.setFont(font);

        ps=new JLabel("仅限当日当次列车");
        ps.setBounds(98,83,130,22);
       // ps.setFont(new Font("Microsoft JhengHei",0,16));
        ps.setForeground(Color.red);


        price=new JLabel("价格");
        price.setBounds(26,83,32,22);
        //price.setFont(new Font("Microsoft JhengHei",0,16));

        select_paymethod=new JLabel("选择付款方式");
        select_paymethod.setBounds(14,173,96,22);
     //   select_paymethod.setFont(new Font("Microsoft JhengHei",0,16));

        WeChat=new JRadioButton("微信");
        WeChat.setBounds(128,176,61,22);
       // WeChat.setFont(new Font("Microsoft JhengHei",0,16));
        WeChat.setBackground(new java.awt.Color(246, 198, 198));

        Alipay=new JRadioButton("支付宝");
        Alipay.setBounds(294,176,77,22);
        Alipay.setBackground(new java.awt.Color(246, 198, 198));
      //  Alipay.setFont(new Font("Microsoft JhengHei",0,16));
        ButtonGroup bg=new ButtonGroup();
        bg.add(WeChat);
        bg.add(Alipay);
        trainername=new JLabel("黄XX");
        trainername.setBounds(275,138,40,26);


        id_number1=new JLabel("44152220000221901X");
        id_number1.setBounds(13,138,188,26);

        close_order=new JButton("关闭订单");
        close_order.setBounds(304,213,100,37);
       // close_order.setFont(new Font("Microsoft JhengHei",0,16));
        close_order.setBackground(new java.awt.Color(252, 225, 225));

        submit_order=new JButton("提交订单");
        submit_order.setBounds(50,213,115,37);
      //  submit_order.setFont(new Font("Microsoft JhengHei",0,18));
        submit_order.setBackground(new java.awt.Color(252, 225, 225));
        place_order_jm.setLocationRelativeTo(null);
        place_order_jm.add(place_order_JP);
        place_order_JP.add(startdate);
        place_order_JP.add(startlocat);
        place_order_JP.add(train_number);
        place_order_JP.add(starttime);
        place_order_JP.add(endlocat);
        place_order_JP.add(go_to);
        place_order_JP.add(trainername);
        place_order_JP.add(id_number1);
        place_order_JP.add(select_paymethod);
        place_order_JP.add(price);
        place_order_JP.add(ps);
        place_order_JP.add(WeChat);
        place_order_JP.add(Alipay);
        place_order_JP.add(close_order);
        place_order_JP.add(submit_order);
        place_order_jm.setVisible(true);
        submit_order.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            if(WeChat.isSelected()||Alipay.isSelected())
            {
                try {
                    Client.place_order();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }});

        close_order.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
           place_order_jm.dispose();
        }});

    }

    public static void main(String args[]) throws Exception {
        new place_order();

    }
}
