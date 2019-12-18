package admin;

import model.order_list;
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

public class quit_ticket {
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
    public JLabel trian_person,endlocat,startdate,returndate,ps;
    public JTextField startlocatfield,endlocatfield;
    public static Object[][] data = {};
    public static String[] name={"姓名","身份证号码", "车次","出发日期","到达日期","出发时间","到达时间","出发地点","到达地点","商务座","一等座","二等座","无座"};
    public quit_ticket() throws Exception{
        train_list = new JFrame("退票");
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
        jsp.setBounds(1, 75, 1040, 680);

        check=new JButton("查询");
        check.setBounds(768,20, 85, 46);
        check.setBackground(new java.awt.Color(252, 225, 225));
        check.setIcon(new ImageIcon("src/icon/icons8-kicking-16.png"));


        trian_person=new JLabel("乘车人");
        trian_person.setBounds(106,17,70,15);
        trian_person.setIcon(new ImageIcon("src/icon/icons8-person-16.png"));

        ps=new JLabel("双击即可退票");
        ps.setBounds(106,43,120,15);
        ps.setIcon(new ImageIcon("src/icon/icons8-warning-shield-16.png"));
        startdate=new JLabel("出发时间");
        startdate.setBounds(358,16,70,15);
        startdate.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png"));




        startlocatfield=new JTextField();
        startlocatfield.setBounds(181,11,160,23);

        Date date = new Date();

        datepick=new JXDatePicker();
        datepick.setBounds(432, 11, 185, 21);
        datepick.setDate(date);

        datepick1=new JXDatePicker();
        datepick1.setBounds(432,48,185,23);





        train_list.add(JP);
        JP.add(jsp);
        JP.add(trian_person);
        JP.add(startdate);
        JP.add(startlocatfield);
        JP.add(datepick);
        JP.add(check);
        JP.add(ps);

        train_list.setVisible(true);

        check.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data=simpleDateFormat.format(datepick.getDate());
            System.out.println(data+"   ");
            String name=startlocatfield.getText();
            String date=data;
            Vector kk4= null;
            try {
                kk4 = Client.serchername(name,data);
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

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
               if(e.getClickCount()==2)
                {
                    try {
                        int index;
                        index=table.rowAtPoint(e.getPoint());
                        String name=(String) table.getValueAt(index,0);
                        String id_number=(String) table.getValueAt(index,1);
                        String train_number=(String) table.getValueAt(index,2);
                        String startdate= (String) table.getValueAt(index,3);
                        String enddate=(String) table.getValueAt(index,4);
                        String start_time=(String) table.getValueAt(index,5);
                        String end_time=(String) table.getValueAt(index,6);
                        String startlocat=(String) table.getValueAt(index,7);
                        String endlocat=(String) table.getValueAt(index,8);
                        Client.delete(name,id_number,startdate,enddate,start_time,end_time,startlocat,endlocat,train_number);
                        JOptionPane.showMessageDialog(null, "退票成功");
                        train_list.dispose();
                  } catch (Exception ex) {
                       ex.printStackTrace();
                    }

               }
           }});
    }
    public static void main(String args[]) throws Exception {
        new quit_ticket();

    }
}
