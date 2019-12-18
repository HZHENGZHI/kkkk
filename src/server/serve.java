package server;

import MyEclipseGen.*;
import admin.*;
import admin.all_train;
import admin.quit_ticket;
import model.*;
import server.database;
import server.server_12306;
//import model.train_infromation;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;


public class serve implements server_12306,Runnable {
    private Socket s;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    public static ResultSet set = null;
    public PreparedStatement psmt;
    public String id, readlyname, sex, nation, id_type, id_number, phone_number, email,id_number1,F1;
    public Connection con;
    public String traindetails,startdate1,enddate1,starttime1,endtime1,startlocat1,endlocat1,number,number1,number2,number3,
            money,money1,money2,money3,train_id;

    public String trainnumber11,startstation11,endstation11,data11,enddate11,starttime11,endtime11,business_set,one_set,two_set,stand_set,train_id11;

    public String getStartlocat1,getEndlocat1,getStartdate1;


    public serve() throws Exception {
        ServerSocket SS = new ServerSocket(338);

        while (true) {
            s = SS.accept();
            Thread T = new Thread(this);
            T.start();

        }
    }
    public void run() {
        try {
            ois = new ObjectInputStream((s.getInputStream()));
            oos = new ObjectOutputStream(s.getOutputStream());
            System.out.println(s.getInetAddress());
            int command = 0;
            command = ois.readInt();
            if (command ==user) {
                this.getconntion_user();
                System.out.println("123"+s.getInetAddress());

            }

            if (command == resgin) {
                this.getconntion_register();
            }

            if (command == tableview){

                this.tableview();
                System.out.print("444");
            }

            if(command==findpw)
            {
                 this.getconntion_Connection();
                this.getnewpw();
            }
            if(command==fixperson_information)
            {
                this.getconntion_Connection();
            this.fixperson_information();
        }
            if(command==bookticket)
            {
                this.buyticketdetails();
            }

            if(command==bookbusiness)
            {
                this.bookbusiness();
                this.place_orderbusiness();
            }

            if(command==bookbusinessset)
            {
                this.bookbusinessset();
                this.gettrainmassage();

            }

            if(command==bookone)
            {
               this.bookone();
                this.place_orderone();
            }

            if(command==bookoneset)
            {
                this.bookonesset();
                this.gettrainmassage();
            }



            if(command==booktwo)
            {
                 this.booktwo();
                this.place_ordertwo();
            }
            if(command==booktwoset)
            {
                this.booktwoset();
                this.gettrainmassage();
            }


            if(command==bookstand)
            {
                 this.bookstand();
                this.place_orderstand();
            }

            if(command==bookstandset)
            {
                this.bookstandset();
                this.gettrainmassage();
            }

            if(command==place_order)
            {
            }

            if(command==history_List)
            {
                this.getconntion_Connection();
                this.history_list();
            }
            if(command==admin)
            {
                this.admin();
            }
            if(command==history_List)
            {
                this.history_list();
            }
            if(command==all_train)
            {
                this.getconntion_Connection();
                this.alltrainlist();
                System.out.print("444");
            }
            if(command==newtrain)
            {
                this.getconntion_Connection();
                this.newtrain();
                System.out.println("123213131");
            }
            if(command==search)
            {
                this.getconntion_Connection();
                this.quit_ticket();
                System.out.println("iwiw");
            }
            if(command==delete)
            {
                this.deleteticket();
                System.out.println("2234");
            }
            if(command==insert)
            {
                this.inserttrain();
            }
            if(command==trainmassage)
            {
                this.gettrainmassage();
            }
            if(command==getmassage)
            {
                this.getmassage();
            }
            if(command==gettablemassage)
            {
                this.gettablemassage();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    private void inserttrain() throws IOException, ClassNotFoundException, SQLException {
        String startdate=ois.readUTF();
        String endate=ois.readUTF();
        String train_num=ois.readUTF();
        String startlocat=ois.readUTF();
        String endlcoat=ois.readUTF();
        String starttime=ois.readUTF();
        String endtime=ois.readUTF();
        String business=ois.readUTF();
        String oneset=ois.readUTF();
        String twoset=ois.readUTF();
        String standset=ois.readUTF();
        String business_set_price=ois.readUTF();
        String one_set_price=ois.readUTF();
        String two_set_price=ois.readUTF();
        String stand_set_price=ois.readUTF();
        Connection conn;
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql:"
                + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
        String SQL1="insert into today_train_list values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        psmt=(PreparedStatement)conn.prepareStatement(SQL1);
        psmt.setString(1,startdate);
        psmt.setString(2,endate);
        psmt.setString(3,train_num);
        psmt.setString(4,startlocat);
        psmt.setString(5,endlcoat);
        psmt.setString(6, starttime);
        psmt.setString(7, endtime);
        psmt.setString(8, "60");
        psmt.setString(9, business);
        psmt.setString(10, oneset);
        psmt.setString(11,twoset);
        psmt.setString(12,standset);
        psmt.setString(13,business_set_price);
        psmt.setString(14,one_set_price);
        psmt.setString(15,two_set_price);
        psmt.setString(16,stand_set_price);
        psmt.setString(17,"23");
        psmt. executeUpdate();

    }

    private void deleteticket() throws IOException, SQLException, ClassNotFoundException {
        String name=ois.readUTF();
        String id_number=ois.readUTF();
        String startdate=ois.readUTF();
        String enddate=ois.readUTF();
        String start_time=ois.readUTF();
        String end_time=ois.readUTF();
        String startlocat=ois.readUTF();
        String endlocat=ois.readUTF();
        String train_number=ois.readUTF();
        String sql="delete from order_list where name ='"+name+"'"+"and id_number='"+id_number+"'"+"and startdate ='"+startdate+"'"+"and enddate='"+enddate+"'"
                +"and start_time='"+start_time+"'"+"and end_time='"+end_time+"'"+"and startlocat ='"+startlocat+"'"+"and endlocat='"+endlocat+"'"
                +"and train_number='"+train_number+"'";
        database.getStat().executeUpdate(sql);


    }

    private void quit_ticket() throws Exception {
        String name=ois.readUTF();
        String date=ois.readUTF();
        String sql = "select *from order_list where name='"+name+"'"+"and startdate='"+date+"'";
        ResultSet resultSet=database.getStat().executeQuery(sql);
        order_list kk = null;
        Vector<order_list> hang = new Vector<order_list>(100);
        while (resultSet.next())
        {
            kk=new order_list();
            kk.setName(resultSet.getString(1));
            kk.setId_number(resultSet.getString(2));
            kk.setTrain_number(resultSet.getString(3));
            kk.setStartdate(resultSet.getString(4));
            kk.setEndate(resultSet.getString(5));
            kk.setStart_time(resultSet.getString(6));
            kk.setEnd_time(resultSet.getString(7));
            kk.setStartlocat(resultSet.getString(8));
            kk.setEndlocat(resultSet.getString(9));
            kk.setBusiness_set(resultSet.getString(10));
            kk.setOne_set(resultSet.getString(11));
            kk.setTwo_set(resultSet.getString(12));
            kk.setStand_set(resultSet.getString(13));
            hang.add(kk);
        }
        oos.writeObject(hang);
        oos.flush();

    }

    private void newtrain() throws Exception {

        String sql = "select * from today_train_list";
        ResultSet resultSet=database.getStat().executeQuery(sql);
        train_infromation kk = null;
        Vector<train_infromation> hang = new Vector<train_infromation>(100);
        while (resultSet.next())
        {
            kk=new train_infromation();
            kk.setStartdate(resultSet.getString(1));
            kk.setEnddate(resultSet.getString(2));
            kk.setTrain_num(resultSet.getString(3));
            kk.setStartlocat(resultSet.getString(4));
            kk.setEndlocat(resultSet.getString(5));
            kk.setStarttime(resultSet.getString(6));
            kk.setEndtime(resultSet.getString(7));
            hang.add(kk);
        }
        oos.writeObject(hang);
        oos.flush();

    }

    private void alltrainlist() throws Exception {

        all_train kk = new  all_train();
        kk.train_list.setVisible(true);
        {
            String sql = "select * from today_train_list ";
            kk.pstmt = con.prepareStatement(sql);
            set = kk.pstmt.executeQuery();
            ResultSetMetaData rsmd ;
            rsmd= (ResultSetMetaData) set.getMetaData();
            int count = rsmd.getColumnCount();
            for (int i = 1; i <= count-10; i++) {
                kk.model.addColumn(rsmd.getColumnName(i));
            }
            String[] row = new String[count];
            while (set.next()) {
                for (int i = 0; i < count-10; i++)
                    row[i] = set.getString(i + 1);
                kk.model.addRow(row);
            }
            set.close();
        }
    }

    private void admin() throws IOException, SQLException, ClassNotFoundException {
        String uid = ois.readUTF();
        String upw = ois.readUTF();
        model.admin u = null;
        String sql =  "select * from user where id=" + uid + " and pw= '"
                + upw + "'";
        ResultSet re = database.getStat().executeQuery(sql);
        if (re.next()) {
            u = new admin(uid, upw);
        }
        oos.writeObject(u);
        oos.flush();
    }

    public void getconntion_user() throws IOException, SQLException, ClassNotFoundException {
        String uid = ois.readUTF();
        id=uid;
        System.out.println(id);
        String upw = ois.readUTF();
        User u = null;
        String sql = "select * from person_information where id=" + uid + " and pw= '"
                + upw + "'";
        ResultSet re = database.getStat().executeQuery(sql);
        if (re.next()) {
            u = new User(uid, upw);
            id_number1=re.getString(9);
        }
        oos.writeObject(u);
        oos.flush();
    }
    public void getconntion_register() throws IOException, SQLException, ClassNotFoundException {
        String id=ois.readUTF();
        String pw=ois.readUTF();
        String name=ois.readUTF();
        String nation=ois.readUTF();
        String sex=ois.readUTF();
        String birthday=ois.readUTF();
        String bronlocat=ois.readUTF();
        String phone_number=ois.readUTF();
        String Email=ois.readUTF();
        String id_type=ois.readUTF();
        String id_number=ois.readUTF();
        String effice_date=ois.readUTF();


        String sql="select * from user where id="+id;
        ResultSet re = database.getStat().executeQuery(sql);
        if(re.next()==false)
        {
            String SQL="insert into user(id,pw) values ("+id+","+pw+")";
            database.getStat().executeUpdate(SQL);
        }

        String SQL="select * from person_information where id_number ="+id_number;
        ResultSet RE = database.getStat().executeQuery(SQL);
        if(RE.next()==false)
        {
            Connection conn;
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            String SQL1="insert into person_information values (?,?,?,?,?,?,?,?,?,?,?,?)";
            psmt=(PreparedStatement)conn.prepareStatement(SQL1);
            psmt.setString(1,name);
            psmt.setString(2,nation);
            psmt.setString(3,sex);
            psmt.setString(4,birthday);
            psmt.setString(5,bronlocat);
            psmt.setString(6, phone_number);
            psmt.setString(7, Email);
            psmt.setString(8, id_type);
            psmt.setString(9, id_number);
            psmt.setString(10,effice_date);
            psmt.setString(11,id);
            psmt.setString(12,pw);
            psmt. executeUpdate();
        }
    }





    public   Connection getconntion_Connection()throws IOException, SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }



    private void gettablemassage() throws SQLException, ClassNotFoundException, IOException
    {
        String start23=ois.readUTF();
        String end23=ois.readUTF();
        String date23=ois.readUTF();
        getStartlocat1=start23;
        getEndlocat1=end23;
        getStartdate1=date23;
    }


    private void getmassage() throws SQLException, ClassNotFoundException, IOException {
        today_train_list kk;
        kk=new today_train_list(getStartlocat1,getEndlocat1,getStartdate1);
        oos.writeObject(kk);


    }


    public void tableview() throws Exception
    {
            String startlocat=ois.readUTF();
            String endlocat=ois.readUTF();
            String startime=ois.readUTF();
        String sql = "select * from today_train_list  WHERE start_locat='"+startlocat+"'"+"and end_locat='"+endlocat+"'"+"and date ='"+startime+"'";
        ResultSet resultSet=database.getStat().executeQuery(sql);
        train_infromation kk = null;
        Vector<train_infromation> hang = new Vector<train_infromation>(100);
        while (resultSet.next())
        {
            kk=new train_infromation();
            kk.setStartdate(resultSet.getString(1));
            kk.setEnddate(resultSet.getString(2));
            kk.setTrain_num(resultSet.getString(3));
            kk.setStartlocat(resultSet.getString(4));
            kk.setEndlocat(resultSet.getString(5));
            kk.setStarttime(resultSet.getString(6));
            kk.setEndtime(resultSet.getString(7));

            hang.add(kk);
        }
        oos.writeObject(hang);
        oos.flush();

    }











    public void getnewpw() throws IOException, SQLException, ClassNotFoundException {
        String id=ois.readUTF();
        String pw=ois.readUTF();
        String sql="UPDATE user set pw='"+pw+"'"+"where id='"+id+"'";
        database.getStat().executeUpdate(sql);
        String SQL="UPDATE person_information set pw='"+pw+"'"+"where id='"+id+"'";
        database.getStat().executeUpdate(SQL);
    }
    public void fixperson_information() throws IOException, SQLException, ClassNotFoundException
    {
        System.out.println(id);
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re =  database.getStat().executeQuery(sql);
        person_information kk=null;
        while(re.next())
        {
            kk=new person_information(re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)
            ,re.getString(6),re.getString(7),re.getString(8),re.getString(9),re.getString(10));
        }
        oos.writeObject(kk);
        oos.flush();
    }



















    public void buyticketdetails() throws Exception {
        String trainnumber=ois.readUTF();
        String startstation=ois.readUTF();
        String endstation=ois.readUTF();
        String data=ois.readUTF();
        String enddate=ois.readUTF();
        String starttime=ois.readUTF();
        String endtime=ois.readUTF();

        trainnumber11=trainnumber;
        startstation11=startstation;
        endstation11=endstation;
        data11=data;
        enddate11=enddate;
        starttime11=starttime;
        endtime11=endtime;

        String sql="select *from today_train_list where date ='"+data+"'"+"and train_number ='"+trainnumber+"'"+"and start_locat ='"+startstation+"'"+"and end_locat='"+endstation+"'"+"and enddate='"+enddate+"'"+"and start_time='"+starttime+"'"+"and end_time='"+endtime+"'";
        ResultSet re =  database.getStat().executeQuery(sql);
        train_ticket kk=null;
        while (re.next())
        {
            kk=new train_ticket(re.getString(3),re.getString(1),re.getString(2),
                    re.getString(6),re.getString(7),
                    re.getString(4),re.getString(5),
                    re.getString(13),re.getString(14),re.getString(15),re.getString(16),
                    re.getString(9),re.getString(10),re.getString(11),re.getString(12));
            business_set=re.getString(9);
            one_set=re.getString(10);
            two_set=re.getString(11);
            stand_set=re.getString(12);

            traindetails=re.getString(3);
            startdate1=re.getString(1);
            enddate1=re.getString(2);
            starttime1=re.getString(6);
            endtime1=re.getString(7);
            startlocat1=re.getString(4);
            endlocat1=re.getString(5);
            train_id11=re.getString(17);



        }
        oos.writeObject(kk);
        oos.flush();
    }



    private void bookbusiness() throws Exception {
        String sql="select *from train_gc_123";
        ResultSet re =  database.getStat().executeQuery(sql);
        int count=0;
        String F1=ois.readUTF();
        while (re.next())
        {
            count++;
            int numberset=Integer.parseInt(re.getString(8));
            int id=Integer.parseInt(re.getString(1));
            if(F1.equals("A")) {
                if (re.getString(2).equals("0") && re.getString(8).equals(0) == false&&numberset>0&&id<=10)
                {
                    int number_1=Integer.parseInt(business_set)-1;
                    int number = Integer.parseInt(re.getString(8)) - 1;
                    System.out.println(number+"   "+business_set+train_id11);
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",business_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set business_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                    break;
                }


                else if(id==10&&re.getString(2).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "A位座已无余量请选择其他座位");

                }
            }

            if(F1.equals("C")) {
                if (re.getString(4).equals("0") && re.getString(8).equals(0) == false&&numberset>0&&id<=10) {
                    int number_1=Integer.parseInt(business_set)-1;
                    int number = Integer.parseInt(re.getString(8)) - 1;
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",business_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set business_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                    break;
                }
                else if(id==10&&re.getString(4).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "C位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("F")) {
                if (re.getString(6).equals("0") && re.getString(8).equals(0) == false&&numberset>0&&id<=10) {
                    int number_1=Integer.parseInt(business_set)-1;
                    int number = Integer.parseInt(re.getString(8)) - 1;
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",business_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set business_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
               //     new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==10&&re.getString(6).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "F位座已无余量请选择其他座位");
                }
            }
        }
    }

    private void bookbusinessset() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        person_information kk=null;
        System.out.println(trainnumber11);
        while(re.next())
        {
            kk=new person_information(re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)
                    ,re.getString(6),re.getString(7),re.getString(8),re.getString(9),re.getString(10));
        }
        oos.writeObject(kk);
        oos.flush();
    }

    private void gettrainmassage() throws SQLException, ClassNotFoundException, IOException {

        String sql="select *from today_train_list where date ='"+data11+"'"+"and train_number ='"+trainnumber11+"'"+"and start_locat ='"+startstation11+"'"+"and end_locat='"+endstation11+"'"+"and enddate='"+enddate11+"'"+"and start_time='"+starttime11+"'"+"and end_time='"+endtime11+"'";
        ResultSet re =  database.getStat().executeQuery(sql);
        model.trainmassage kk=null;
        while (re.next())
        {
            kk=new trainmassage(re.getString(3),re.getString(4),re.getString(5),re.getString(1),
                    re.getString(2),re.getString(6),re.getString(7),re.getString(9),re.getString(10),re.getString(11)
                    ,re.getString(12));
        }
        oos.writeObject(kk);
        oos.flush();
    }








    private void bookone() throws Exception {
        String sql="select *from train_gc_123";
        ResultSet re =  database.getStat().executeQuery(sql);
        int count=0;
        F1=ois.readUTF();
        while (re.next())
        {
            count++;
            int numberset=Integer.parseInt(re.getString(9));
            int id=Integer.parseInt(re.getString(1));
            if(F1.equals("A")) {
                if (re.getString(2).equals("0") && re.getString(9).equals(0) == false&&numberset>0&&id>=11&&id<=20)
                {
                    int number_1=Integer.parseInt(one_set)-1;
                    int number = Integer.parseInt(re.getString(9)) - 1;
                    System.out.println(count + "    " + re.getString(9));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",one_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
              //      new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==20&&re.getString(2).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "A位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("C")) {
                if (re.getString(4).equals("0") && re.getString(9).equals(0) == false&&numberset>0&&id>=11&&id<=20) {
                    int number_1=Integer.parseInt(one_set)-1;
                    int number = Integer.parseInt(re.getString(9)) - 1;
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",one_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                  //  new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==20&&re.getString(4).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "C位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("F")) {
                if (re.getString(6).equals("0") && re.getString(9).equals(0) == false&&numberset>0&&id>=11&&id<=20) {
                    int number_1=Integer.parseInt(one_set)-1;
                    int number = Integer.parseInt(re.getString(9)) - 1;
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",one_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                    break;
                }
                else if(id==20&&re.getString(6).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "F位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("D")) {
                if (re.getString(5).equals("0") && re.getString(9).equals(0) == false&&numberset>0&&id>=11&&id<=20) {
                    int number_1=Integer.parseInt(one_set)-1;
                    int number = Integer.parseInt(re.getString(9)) - 1;
                    System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",one_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                 //   new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==20&&re.getString(5).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "D位座已无余量请选择其他座位");
                }
            }
        }
    }

    public  void bookonesset() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        person_information kk=null;
        System.out.println(trainnumber11);
        while(re.next())
        {
            kk=new person_information(re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)
                    ,re.getString(6),re.getString(7),re.getString(8),re.getString(9),re.getString(10));
        }
        oos.writeObject(kk);
        oos.flush();
    }



    private void booktwo() throws Exception {
        String sql="select *from train_gc_123";
        ResultSet re =  database.getStat().executeQuery(sql);
        int count=0;
        String F1=ois.readUTF();
        while (re.next())
        {
            count++;
            int numberset=Integer.parseInt(re.getString(10));
            int id=Integer.parseInt(re.getString(1));
            if(F1.equals("A")) {
                if (re.getString(2).equals("0") && re.getString(10).equals(0) == false&&numberset>0&&id>=21&&id<=30)
                {

                    int number_1=Integer.parseInt(two_set)-1;
                    int number = Integer.parseInt(re.getString(10)) - 1;
                    System.out.println(count + "    " + re.getString(10));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",two_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                 //   new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==30&&re.getString(2).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "A位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("C")) {
                if (re.getString(4).equals("0") && re.getString(10).equals(0) == false&&numberset>0&&id>=21&&id<=30) {

                    int number_1=Integer.parseInt(two_set)-1;
                    int number = Integer.parseInt(re.getString(10)) - 1;
                    // System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",two_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                   // new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==30&&re.getString(4).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "C位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("F")) {
                if (re.getString(6).equals("0") && re.getString(10).equals(0) == false&&numberset>0&&id>=21&&id<=30) {

                    int number_1=Integer.parseInt(two_set)-1;
                    int number = Integer.parseInt(re.getString(10)) - 1;
                    //System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",two_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                  //  new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==30&&re.getString(6).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "F位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("D")) {
                if (re.getString(5).equals("0") && re.getString(10).equals(0) == false&&numberset>0&&id>=21&&id<=30) {

                    int number_1=Integer.parseInt(two_set)-1;
                    int number = Integer.parseInt(re.getString(10)) - 1;
                    // System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",two_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                  //  new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==30&&re.getString(5).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "D位座已无余量请选择其他座位");
                }
            }

            if(F1.equals("B")) {
                if (re.getString(3).equals("0") && re.getString(10).equals(0) == false&&numberset>0&&id>=21&&id<=30) {

                    int number_1=Integer.parseInt(two_set)-1;
                    int number = Integer.parseInt(re.getString(10)) - 1;
                    // System.out.println(count + "    " + re.getString(8));
                    String SQL = "UPDATE  train_gc_123 set " + F1 + "='" + 1 + "'" + ",two_set_number='" + number + "'" + "where id='" + count + "'";
                    database.getStat().executeUpdate(SQL);
                    String SQL1="UPDATE today_train_list set one_set='"+number_1+"'"+"where id ='"+train_id11+"'";
                    database.getStat().executeUpdate(SQL1);
                 //   new place_order().place_order_jm.setVisible(true);
                    break;
                }
                else if(id==30&&re.getString(3).equals("1"))
                {
                    JOptionPane.showMessageDialog(null, "B位座已无余量请选择其他座位");
                }
            }
        }
    }

    public void booktwoset() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        person_information kk=null;
        System.out.println(trainnumber11);
        while(re.next())
        {
            kk=new person_information(re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)
                    ,re.getString(6),re.getString(7),re.getString(8),re.getString(9),re.getString(10));
        }
        oos.writeObject(kk);
        oos.flush();
    }

    private void bookstand() throws Exception {
        String sql = "select *from train_gc_123";
        ResultSet re = database.getStat().executeQuery(sql);
        while (re.next()) {
            int number_1 = Integer.parseInt(stand_set) - 1;
            String SQL1 = "UPDATE today_train_list set stand_set='" + number_1 + "'" + "where id ='" + train_id11+ "'";
            database.getStat().executeUpdate(SQL1);
           // new place_order().place_order_jm.setVisible(true);
            break;
        }
    }

    public void bookstandset() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        person_information kk=null;
        System.out.println(trainnumber11);
        while(re.next())
        {
            kk=new person_information(re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)
                    ,re.getString(6),re.getString(7),re.getString(8),re.getString(9),re.getString(10));
        }
        oos.writeObject(kk);
        oos.flush();
    }
       // kk.check_ticket_jm.setVisible(true);

    public void place_order_business() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        place_order kk=new place_order();
        while(re.next())
        {
            kk.trainername.setText(re.getString(1));
            kk.id_number1.setText(re.getString(9));
            kk.startdate.setText(startdate1);
            kk.startlocat.setText(startlocat1);
            kk.train_number.setText(traindetails);
            kk.starttime.setText(starttime1);
            kk.endlocat.setText(endlocat1);
            kk.price.setText(money);
        }
       // kk.place_order_jm.setVisible(true);
    }

    public void place_order_one() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        place_order kk=new place_order();
        while(re.next())
        {
            kk.trainername.setText(re.getString(1));
            kk.id_number1.setText(re.getString(9));
            kk.startdate.setText(startdate1);
            kk.startlocat.setText(startlocat1);
            kk.train_number.setText(traindetails);
            kk.starttime.setText(starttime1);
            kk.endlocat.setText(endlocat1);
            kk.price.setText(money1);
        }
       // kk.place_order_jm.setVisible(true);
    }

    public void place_order_two() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        place_order kk=new place_order();
        while(re.next())
        {
            kk.trainername.setText(re.getString(1));
            kk.id_number1.setText(re.getString(9));
            kk.startdate.setText(startdate1);
            kk.startlocat.setText(startlocat1);
            kk.train_number.setText(traindetails);
            kk.starttime.setText(starttime1);
            kk.endlocat.setText(endlocat1);
            kk.price.setText(money2);
        }
       // kk.place_order_jm.setVisible(true);
    }

    public void place_order_stand() throws Exception {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        place_order kk=new place_order();
        while(re.next())
        {
            kk.trainername.setText(re.getString(1));
            kk.id_number1.setText(re.getString(9));
            kk.startdate.setText(startdate1);
            kk.startlocat.setText(startlocat1);
            kk.train_number.setText(traindetails);
            kk.starttime.setText(starttime1);
            kk.endlocat.setText(endlocat1);
            kk.price.setText(money3);
        }
       // kk.place_order_jm.setVisible(true);
    }

    public void place_orderbusiness() throws SQLException, ClassNotFoundException {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        while(re.next())
        {
            Connection conn;
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            String SQL1="insert into order_list values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            psmt=(PreparedStatement)conn.prepareStatement(SQL1);
            psmt.setString(1,re.getString(1));
            psmt.setString(2,re.getString(9));
            psmt.setString(3,traindetails);
            psmt.setString(4,startdate1);
            psmt.setString(5,enddate1);
            psmt.setString(6,starttime1);
            psmt.setString(7,endtime1 );
            psmt.setString(8,startlocat1 );
            psmt.setString(9,endlocat1 );
            psmt.setString(10,"yes" );
            psmt.setString(11,"no" );
            psmt.setString(12,"no" );
            psmt.setString(13,"no" );
            psmt.setString(14, id);
            psmt. executeUpdate();
        }
    }


    public void place_orderone() throws SQLException, ClassNotFoundException {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        while(re.next())
        {
            Connection conn;
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            String SQL1="insert into order_list values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            psmt=(PreparedStatement)conn.prepareStatement(SQL1);
            psmt.setString(1,re.getString(1));
            psmt.setString(2,re.getString(9));
            psmt.setString(3,traindetails);
            psmt.setString(4,startdate1);
            psmt.setString(5,enddate1);
            psmt.setString(6,starttime1);
            psmt.setString(7,endtime1 );
            psmt.setString(8,startlocat1 );
            psmt.setString(9,endlocat1 );
            psmt.setString(10,"no" );
            psmt.setString(11,"yes" );
            psmt.setString(12,"no" );
            psmt.setString(13,"no" );
            psmt.setString(14, id);
            psmt. executeUpdate();
        }
    }

    public void place_ordertwo() throws SQLException, ClassNotFoundException {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        while(re.next())
        {
            Connection conn;
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            String SQL1="insert into order_list values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            psmt=(PreparedStatement)conn.prepareStatement(SQL1);
            psmt.setString(1,re.getString(1));
            psmt.setString(2,re.getString(9));
            psmt.setString(3,traindetails);
            psmt.setString(4,startdate1);
            psmt.setString(5,enddate1);
            psmt.setString(6,starttime1);
            psmt.setString(7,endtime1 );
            psmt.setString(8,startlocat1 );
            psmt.setString(9,endlocat1 );
            psmt.setString(10,"no" );
            psmt.setString(11,"no" );
            psmt.setString(12,"yes" );
            psmt.setString(13,"no" );
            psmt.setString(14, id);
            psmt. executeUpdate();
        }
    }

    public void place_orderstand() throws SQLException, ClassNotFoundException {
        String sql="select *from person_information where id='"+id+"'";
        ResultSet re= database.getStat().executeQuery(sql);
        while(re.next())
        {
            Connection conn;
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/12306?characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            String SQL1="insert into order_list values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            psmt=(PreparedStatement)conn.prepareStatement(SQL1);
            psmt.setString(1,re.getString(1));
            psmt.setString(2,re.getString(9));
            psmt.setString(3,traindetails);
            psmt.setString(4,startdate1);
            psmt.setString(5,enddate1);
            psmt.setString(6,starttime1);
            psmt.setString(7,endtime1 );
            psmt.setString(8,startlocat1 );
            psmt.setString(9,endlocat1 );
            psmt.setString(10,"no" );
            psmt.setString(11,"no" );
            psmt.setString(12,"no" );
            psmt.setString(13,"yes" );
            psmt.setString(14, id);
            psmt. executeUpdate();
        }
    }
    public void history_list() throws Exception {
        String startlocat=ois.readUTF();
        String endlocat=ois.readUTF();
        String time=ois.readUTF();
        String sql = "select *from order_list where id_number='"+id_number1+"'"+"and startlocat='"+startlocat+"'"+"and endlocat='"+endlocat+"'"+"and startdate='"+time+"'";
        ResultSet resultSet=database.getStat().executeQuery(sql);
        order_list kk = null;
        Vector<order_list> hang = new Vector<order_list>(100);
        while (resultSet.next())
        {
            kk=new order_list();
            kk.setName(resultSet.getString(1));
            kk.setId_number(resultSet.getString(2));
            kk.setTrain_number(resultSet.getString(3));
            kk.setStartdate(resultSet.getString(4));
            kk.setEndate(resultSet.getString(5));
            kk.setStart_time(resultSet.getString(6));
            kk.setEnd_time(resultSet.getString(7));
            kk.setStartlocat(resultSet.getString(8));
            kk.setEndlocat(resultSet.getString(9));
            kk.setBusiness_set(resultSet.getString(10));
            kk.setOne_set(resultSet.getString(11));
            kk.setTwo_set(resultSet.getString(12));
            kk.setStand_set(resultSet.getString(13));
            hang.add(kk);
        }
        oos.writeObject(hang);
        oos.flush();

    }
    public static void main(String[] args)
    {
        try
        {
            new serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
