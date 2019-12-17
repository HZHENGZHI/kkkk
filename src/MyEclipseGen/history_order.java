package MyEclipseGen;

import model.order_list;
import model.today_train_list;
import model.train_infromation;
import org.jdesktop.swingx.JXDatePicker;
import server.Client;

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class history_order {

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
    public JRadioButton signtrave;
    public JRadioButton return_trave;
    public JLabel startlocat,endlocat,startdate,returndate;
    public JTextField startlocatfield,endlocatfield,startdatefield,returndatefield;
    public static Object[][] data = {};
    public static String[] name={"姓名","身份证号码", "车次","出发日期","到达日期","出发时间","到达时间","出发地点","到达地点","商务座","一等座","二等座","无座"};
    public history_order() throws Exception{
        train_list = new JFrame("历史订单");
        train_list.setBackground(Color.white);
        train_list.setSize(1060,800);
        train_list.setLocationRelativeTo(null);
        train_list.setLayout(null);
        JP=new JPanel();
        JP.setSize(1060, 800);
        JP.setLayout(null);
        JP.setBackground(new java.awt.Color(246, 198, 198));
        model = new DefaultTableModel(data,name);
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
        jsp.setBackground(new java.awt.Color(249, 168, 168));

        check=new JButton("查询");
        check.setBounds(768,20, 85, 46);
        check.setBackground(new java.awt.Color(252, 225, 225));

        startlocat=new JLabel("出发地");
        startlocat.setBounds(106,17,70,15);
        startlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));

        endlocat=new JLabel("目的地");
        endlocat.setBounds(106,43,70,15);
        endlocat.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));

        startdate=new JLabel("出发时间");
        startdate.setBounds(358,16,70,15);
        startdate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));

        startlocatfield=new JTextField();
        startlocatfield.setBounds(181,11,160,23);

        endlocatfield=new JTextField();
        endlocatfield.setBounds(181,43,160,23);
        Date date = new Date();

        datepick=new JXDatePicker();
        datepick.setBounds(432, 11, 185, 21);
        datepick.setDate(date);

        train_list.add(JP);
        JP.add(jsp);
        JP.add(startlocat);
        JP.add(endlocat);
        JP.add(startdate);
        JP.add(startlocatfield);
        JP.add(endlocatfield);
        JP.add(datepick);
        JP.add(check);
        train_list.setVisible(true);
        check.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
            String startlocat=startlocatfield.getText();
            String endlcoat=endlocatfield.getText();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data=simpleDateFormat.format(datepick.getDate());
            Vector kk4= null;
            try {
                kk4 = Client.histroy_list(startlocat,endlcoat,data);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if(kk4!=null) {

                for (int i = 0; i < kk4.size(); i++) {
                    order_list kk1 = (order_list) kk4.get(i);
                    Object data1[] = {kk1.getName(), kk1.getId_number(), kk1.getTrain_number(), kk1.getStartdate(), kk1.getEndate(), kk1.getStart_time(),
                            kk1.getEnd_time(),kk1.getStartlocat(),kk1.getEndlocat(),kk1.getBusiness_set(),kk1.getOne_set(),kk1.getTwo_set(),kk1.getStand_set()};
                    model.addRow(data1);
                }
            }
        }});

    }
    public static void main(String args[]) throws Exception {
        new history_order();
    }
}
