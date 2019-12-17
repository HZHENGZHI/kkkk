package MyEclipseGen;

import model.today_train_list;
import model.train_infromation;
import model.train_ticket;
import server.Client;
import com.eltima.components.ui.DatePicker;
import org.jdesktop.swingx.JXDatePicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class train_list {
    public static JPanel JP;
    public static JFrame train_list;
    public static JButton check,return_back;
    public static Connection con;
    public static PreparedStatement pstmt;
    public static JTable table;
    public static DefaultTableModel model;
    public static ResultSet set = null;
    public static DefaultTableCellRenderer r = new DefaultTableCellRenderer();
    public int index;
    JXDatePicker datepick,datepick1;
    public JRadioButton signtrave;
    public JRadioButton return_trave;
    public JLabel startlocat,endlocat,startdate,returndate;
    public JTextField startlocatfield,endlocatfield,startdatefield,returndatefield;
    public String data1,enddate1,trainnumber1,startstation1,endstation1,starttime1,endtime1;
    public train_ticket kk;
    public static Object[][] data = {};
    public static String[] name={"出发日期","到达日期", "车次","出发地点","到达地点","出发时间","到达时间"};
    public train_list() throws Exception{
        train_list = new JFrame("今日列车车次");
        train_list.setBackground(Color.white);
        train_list.setSize(1060,800);
        train_list.setLayout(null);
        JP=new JPanel();
        JP.setSize(1060, 800);
        JP.setLayout(null);
        JP.setBackground(new java.awt.Color(246, 198, 198));
        train_list.setLocationRelativeTo(null);
        model = new DefaultTableModel(data,name);
        today_train_list kk5=Client.getmassage();
        String start=kk5.start_locat;
        String end=kk5.end_locat;
        String time=kk5.start_time;
        Vector kk4=Client.gettable(start,end,time);
        if(kk4!=null) {

            for (int i = 0; i < kk4.size(); i++) {
                train_infromation kk1 = (train_infromation) kk4.get(i);
                Object data[] = {kk1.getStartdate(), kk1.getEnddate(), kk1.getTrain_num(), kk1.getStartlocat(), kk1.getEndlocat(), kk1.getStarttime(), kk1.getEndtime()};
                model.addRow(data);
            }
        }
        table = new JTable(model);
        table.setBounds(0, 89, 1000, 645);
        table.setEnabled(false);
        r.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, r);
        table.setModel(model);
        table.setFont(new Font("AgencyFB", Font.PLAIN, 13));
        table.setRowHeight(30);
        table.setRowMargin(10);
        table.setBackground(Color.white);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBackground(Color.white);
        jsp.setBounds(1, 89, 1040, 670);
        signtrave=new JRadioButton("单程");
        signtrave.setBounds(14,14,60,16);
        signtrave.setBackground(new java.awt.Color(246, 198, 198));
        return_trave=new JRadioButton("往返");
        return_trave.setBounds(14,43,60,16);
        return_trave.setBackground(new java.awt.Color(246, 198, 198));
        ButtonGroup bg=new ButtonGroup();
        bg.add(signtrave);
        bg.add(return_trave);
        check=new JButton("查询");
        check.setBounds(768,5, 85, 36);
        check.setBackground(new java.awt.Color(252, 225, 225));
        check.setIcon(new ImageIcon("src/icon/icons8-kicking-16.png"));
        return_back=new JButton("返回");
        return_back.setBounds(768,45, 85, 36);
        return_back.setBackground(new java.awt.Color(252, 225, 225));
        return_back.setIcon(new ImageIcon("src/icon/icons8-kicking-16.png"));
        startlocat=new JLabel("出发地");
        startlocat.setBounds(106,17,70,15);
        startlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
        endlocat=new JLabel("目的地");
        endlocat.setBounds(106,43,70,15);
        endlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
        startdate=new JLabel("出发时间");
        startdate.setBounds(358,16,70,15);
        startdate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));
        returndate=new JLabel("回城时间");
        returndate.setBounds(358,48,70,15);
        returndate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));
        startlocatfield=new JTextField();
        startlocatfield.setBounds(181,11,160,23);
        endlocatfield=new JTextField();
        endlocatfield.setBounds(181,43,160,23);
        Date date = new Date();
        Date date1 = new Date();
        datepick=new JXDatePicker();
        datepick.setBounds(432, 11, 185, 21);
        datepick.setDate(date);
        datepick1=new JXDatePicker();
        datepick1.setBounds(432,48,185,23);
        datepick1.setDate(date1);
        train_list.add(JP);
        JP.add(jsp);
        JP.add(signtrave);
        JP.add(return_trave);
        JP.add(startlocat);
        JP.add(endlocat);
        JP.add(startdate);
        JP.add(returndate);
        JP.add(startlocatfield);
        JP.add(endlocatfield);
        JP.add(datepick1);
        JP.add(datepick);
        JP.add(check);
        JP.add(return_back);
        train_list.setVisible(true);

        return_back.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            train_list.dispose();
            new search_ticket_mian_jm().setVisible(true);
        }});

        check.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data=simpleDateFormat.format(datepick.getDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String data1=simpleDateFormat.format(datepick1.getDate());
            System.out.println(data+"   "+data1);
            String startlocattion=startlocatfield.getText();
            String endlocation=endlocatfield.getText();
            System.out.print(startlocattion);
            model.setRowCount(0);
            if (startlocattion.equals("")==true||endlocation.equals("")==true)
            {
                JOptionPane.showMessageDialog(null, "请检查是否存在未填信息");
            }
            try {

                Vector kk4=Client.gettable(startlocattion,endlocation,data);
                if(kk4!=null) {

                    for (int i = 0; i < kk4.size(); i++) {
                        train_infromation kk1 = (train_infromation) kk4.get(i);
                        Object data2[] = {kk1.getStartdate(), kk1.getEnddate(), kk1.getTrain_num(), kk1.getStartlocat(), kk1.getEndlocat(), kk1.getStarttime(), kk1.getEndtime()};
                        model.addRow(data2);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }});

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2)
                {
                    try {
                        int index=0;
                        index=table.rowAtPoint(e.getPoint());
                       String data=(String) table.getValueAt(index,0);
                        String enddate=(String) table.getValueAt(index,1);
                        String trainnumber= (String) table.getValueAt(index,2);
                        String  startstation=(String) table.getValueAt(index,3);
                        String endstation=(String) table.getValueAt(index,4);
                        String  starttime=(String) table.getValueAt(index,5);
                        String endtime=(String) table.getValueAt(index,6);

                        kk=Client.bookticket(trainnumber,startstation,endstation,data,enddate,starttime,endtime);

                       if(kk!=null)
                       {
                           order_details kk1=new order_details();
                           kk1.traindetails.setText(kk.train_num);
                           trainnumber1=kk.train_num;
                           kk1.startdate1.setText(kk.startdate);
                           kk1.enddate1.setText(kk.enddate);
                           kk1.starttime1.setText(kk.starttime);
                           kk1.endtime1.setText(kk.endtime);
                           kk1.startlocat1.setText(kk. startlocat);
                           kk1.endlocat1.setText(kk.endlocat);
                           kk1.money.setText(kk.business_price);
                           kk1.money1.setText(kk.one_price);
                           kk1.money2.setText(kk.two_price);
                           kk1.money3.setText(kk.stand_price);
                           if( kk.business_number.equals("0"))
                           {
                               kk1.number.setText("无座");
                           }
                           if( kk.business_number.equals("0")==false)
                           {
                               kk1.number.setText("有座");

                           }

                           if(kk.one_number.equals("0")==false)
                           {
                               kk1.number1.setText("有座");
                           }
                           else if(kk.one_number.equals("0"))
                           {
                               kk1.number1.setText("无座");
                           }
                           if(kk.two_number.equals("0")==false)
                           {
                               kk1.number2.setText("有座");
                           }
                           else if(kk.two_number.equals("0"))
                           {
                               kk1.number2.setText("无座");
                           }

                           if(kk.stand_number.equals("0")==false)
                           {
                               kk1.number3.setText("有座");
                           }
                           else if(kk.stand_number.equals("0"))
                           {
                               kk1.number3.setText("无座");
                           }
                       }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
            }});
    }
    public static void main(String args[]) throws Exception {
        new train_list();

    }
}
