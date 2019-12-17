package admin;

import model.today_train_list;
import model.train_infromation;
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

public class all_train {
    public static JPanel JP;
    public static JFrame train_list;
    public static JButton check;
    public static Connection con;
    public static PreparedStatement pstmt;
    public static JTable table;
    public static DefaultTableModel model;
    public static ResultSet set = null;
    public static DefaultTableCellRenderer r = new DefaultTableCellRenderer();
    public int index;
    JXDatePicker datepick,datepick1;
    public JLabel startlocat,endlocat,startdate,returndate;
    public JTextField startlocatfield,endlocatfield;
    public static Object[][] data = {};
    public static String[] name={"出发日期","到达日期", "车次","出发地点","到达地点","出发时间","到达时间"};
    public all_train() throws Exception{
        train_list = new JFrame("今日列车车次");
        train_list.setBackground(Color.white);
        train_list.setLocationRelativeTo(null);
        train_list.setSize(1060,800);
        train_list.setLocationRelativeTo(null);
        train_list.setLayout(null);
        JP=new JPanel();
        JP.setSize(1060, 800);
        JP.setLayout(null);
        JP.setBackground(new java.awt.Color(246, 198, 198));



        model = new DefaultTableModel(data,name);

        Vector kk4=Client.newtrain();
        if(kk4!=null) {
            for (int i = 0; i < kk4.size(); i++) {
                train_infromation kk1 = (train_infromation) kk4.get(i);
                Object data[] = {kk1.getStartdate(), kk1.getEnddate(), kk1.getTrain_num(), kk1.getStartlocat(), kk1.getEndlocat(), kk1.getStarttime(), kk1.getEndtime()};
                model.addRow(data);
            }
        }


        table = new JTable();
        table.setBounds(0, 89, 1000, 645);
        table.setEnabled(false);
        model = new DefaultTableModel();
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

        check=new JButton("查询");
        check.setBounds(768,20, 85, 46);
        check.setBackground(new java.awt.Color(252, 225, 225));
        check.setIcon(new ImageIcon("src/icon/icons8-kicking-16.png"));


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
        JP.add(startlocat);
        JP.add(endlocat);
        JP.add(startdate);
        JP.add(returndate);
        JP.add(startlocatfield);
        JP.add(endlocatfield);
        JP.add(datepick1);
        JP.add(datepick);
        JP.add(check);

        train_list.setVisible(true);

        check.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data=simpleDateFormat.format(datepick.getDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String data1=simpleDateFormat.format(datepick1.getDate());
            System.out.println(data+"   "+data1);
            String startlocattion=startlocatfield.getText();
            String endlocation=endlocatfield.getText();
            System.out.print(startlocattion);
            if (startlocattion.equals("")==true||endlocation.equals("")==true)
            {
                JOptionPane.showMessageDialog(null, "请检查是否存在未填信息");
            }
            else {
                model.setRowCount(0);
                Vector kk4 = null;
                try {
                    kk4 = Client.gettable(startlocattion, endlocation, data);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if (kk4 != null) {
                    for (int i = 0; i < kk4.size(); i++) {
                        train_infromation kk1 = (train_infromation) kk4.get(i);
                        Object data2[] = {kk1.getStartdate(), kk1.getEnddate(), kk1.getTrain_num(), kk1.getStartlocat(), kk1.getEndlocat(), kk1.getStarttime(), kk1.getEndtime()};
                        model.addRow(data2);
                    }

                }
            }

        }});

    }
    public static void main(String args[]) throws Exception {
        new all_train();

    }
}
