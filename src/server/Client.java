package server;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import model.*;

public class Client implements server_12306 {
    private static Socket s;
    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;

    private static void init() throws IOException, UnknownHostException
    {
        s =new Socket("127.0.0.1",338);
        //s =new Socket("122.51.223.82",338);
        oos=new ObjectOutputStream(s.getOutputStream());
        ois=new ObjectInputStream(s.getInputStream());
    }
    public static User lonin(String uid, String upw) throws IOException, ClassNotFoundException , UnknownHostException {
        init();
        oos.writeInt(user);
        oos.flush();
        oos.writeUTF(uid);
        oos.flush();
        oos.writeUTF(upw);
        oos.flush();
        User u= (User) ois.readObject();
        return u;
    }
    public static void resgin(String id,String pw,String name,String nation,String sex,String birthday,String bronlocat,String phone_number,String Email,String id_type,String id_number,String effice_date) throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(resgin);
        oos.flush();
        oos.writeUTF(id);
        oos.flush();
        oos.writeUTF(pw);
        oos.flush();


        oos.writeUTF(name);
        oos.flush();
        oos.writeUTF(nation);
        oos.flush();
        oos.writeUTF(sex);
        oos.flush();
        oos.writeUTF(birthday);
        oos.flush();
        oos.writeUTF(bronlocat);
        oos.flush();
        oos.writeUTF(phone_number);
        oos.flush();
        oos.writeUTF(Email);
        oos.flush();
        oos.writeUTF(id_type);
        oos.flush();
        oos.writeUTF(id_number);
        oos.flush();
        oos.writeUTF(effice_date);
        oos.flush();
    }

    public static Vector gettable(String startlocat, String endlocat, String starttime) throws UnknownHostException, IOException, ClassNotFoundException {
        init();
        oos.writeInt(tableview);
        oos.flush();
        oos.writeUTF(startlocat);
        oos.flush();
        oos.writeUTF(endlocat);
        oos.flush();
        oos.writeUTF(starttime);
        oos.flush();
        Vector kk= (Vector) ois.readObject();
        return kk;
    }

    public static today_train_list getmassage() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(getmassage);
        oos.flush();
        today_train_list u= (today_train_list) ois.readObject();
        return u;
    }

    public static void gettablemassage(String startlocat, String endlocat, String starttime) throws IOException {
        init();
        oos.writeInt(gettablemassage);
        oos.flush();
        oos.writeUTF(startlocat);
        oos.flush();
        oos.writeUTF(endlocat);
        oos.flush();
        oos.writeUTF(starttime);
        oos.flush();

    }

    public static void getnewpassword(String name,String pw) throws IOException {
        init();
        oos.writeInt(findpw);
        oos.flush();
        oos.writeUTF(name);
        oos.flush();
        oos.writeUTF(pw);
        oos.flush();
    }

    public static person_information fixperson_information() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(fixperson_information);
        oos.flush();
        person_information u= (person_information) ois.readObject();
        return u;
    }

    public static train_ticket bookticket(String trainnumber,String starttation,String endstation,String data,String enddate,String startiem,String endtime) throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(bookticket);
        oos.flush();
        oos.writeUTF(trainnumber);
        oos.flush();
        oos.writeUTF(starttation);
        oos.flush();
        oos.writeUTF(endstation);
        oos.flush();
        oos.writeUTF(data);
        oos.flush();
        oos.writeUTF(enddate);
        oos.flush();
        oos.writeUTF(startiem);
        oos.flush();
        oos.writeUTF(endtime);
        oos.flush();
        train_ticket u= (train_ticket) ois.readObject();
        return u;
    }

    public static void bookbusiness(String SET) throws IOException {
        init();
        oos.writeInt(bookbusiness);
        oos.flush();
        oos.writeUTF(SET);
        oos.flush();
    }

    public static person_information bookbusinessset() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(bookbusinessset);
        oos.flush();
        person_information u= (person_information) ois.readObject();
        return u;
    }

    public static trainmassage gettrainmassage() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(trainmassage);
        oos.flush();
        trainmassage u= (trainmassage) ois.readObject();
        return u;
    }

    public static void bookone(String SET) throws IOException {
        init();
        oos.writeInt(bookone);
        oos.flush();
        oos.writeUTF(SET);
        oos.flush();
    }

    public static person_information bookoneset() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(bookoneset);
        oos.flush();
        person_information u= (person_information) ois.readObject();
        return u;
    }

    public static void booktwo(String SET) throws IOException {
        init();
        oos.writeInt(booktwo);
        oos.flush();
        oos.writeUTF(SET);
        oos.flush();
    }

    public static person_information booktwoset() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(booktwoset);
        oos.flush();
        person_information u= (person_information) ois.readObject();
        return u;
    }

    public static void bookstand() throws IOException {
        init();
        oos.writeInt(bookstand);
        oos.flush();
    }

    public static person_information bookstandset() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(bookstandset);
        oos.flush();
        person_information u= (person_information) ois.readObject();
        return u;
    }

    public static void place_order() throws IOException {
        init();
        oos.writeInt(place_order);
        oos.flush();
    }

    public static Vector histroy_list(String startlocat,String endlocat,String time) throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(history_List);
        oos.flush();
        oos.writeUTF(startlocat);
        oos.flush();
        oos.writeUTF(endlocat);
        oos.flush();
        oos.writeUTF(time);
        oos.flush();
        Vector kk= (Vector) ois.readObject();
        return kk;
    }

    public static admin admin_lonin(String uid, String upw) throws IOException, ClassNotFoundException , UnknownHostException {
        init();
        oos.writeInt(admin);
        oos.flush();
        oos.writeUTF(uid);
        oos.flush();
        oos.writeUTF(upw);
        oos.flush();
        admin u= (admin) ois.readObject();
        return u;
    }

    public static void alltrain() throws IOException {
        init();
        oos.writeInt(all_train);
        oos.flush();
    }

    public static Vector newtrain() throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(newtrain);
        oos.flush();
        Vector kk= (Vector) ois.readObject();
        return kk;
    }

    public static Vector serchername(String name,String date) throws IOException, ClassNotFoundException {
        init();
        oos.writeInt(search);
        oos.flush();
        oos.writeUTF(name);
        oos.flush();
        oos.writeUTF(date);
        oos.flush();
        Vector kk= (Vector) ois.readObject();
        return kk;
    }

    public static void delete(String name,String id_number,String startdate,String enddate,String start_time,String end_time,String startlocat,String endlocat) throws IOException {
        init();
        oos.writeInt(delete);
        oos.flush();
        oos.writeUTF(name);
        oos.flush();
        oos.writeUTF(id_number);
        oos.flush();
        oos.writeUTF(startdate);
        oos.flush();
        oos.writeUTF(enddate);
        oos.flush();
        oos.writeUTF(start_time);
        oos.flush();
        oos.writeUTF(end_time);
        oos.flush();
        oos.writeUTF(startlocat);
        oos.flush();
        oos.writeUTF(endlocat);
        oos.flush();
    }

    public static void inserttrain(String startdate1,String enddate1,String train_num,String startlocat2,String endlocat1,String starttime1,String endtime1,
                                   String business1,String oneset2,String twoset1,String oneset3,String business_set_price,String one_set_price,String two_set_price,String stand_set_price) throws IOException {
        init();;
        oos.writeInt(insert);
        oos.flush();
        oos.writeUTF(startdate1);
        oos.flush();
        oos.writeUTF(enddate1);
        oos.flush();
        oos.writeUTF(train_num);
        oos.flush();
        oos.writeUTF(startlocat2);
        oos.flush();
        oos.writeUTF(endlocat1);
        oos.flush();
        oos.writeUTF(starttime1);
        oos.flush();
        oos.writeUTF( endtime1);
        oos.flush();
        oos.writeUTF(business1);
        oos.flush();
        oos.writeUTF(oneset2);
        oos.flush();
        oos.writeUTF(twoset1);
        oos.flush();
        oos.writeUTF(oneset3);
        oos.flush();
        oos.writeUTF(business_set_price);
        oos.flush();
        oos.writeUTF(one_set_price);
        oos.flush();
        oos.writeUTF(two_set_price);
        oos.flush();
        oos.writeUTF(stand_set_price);
        oos.flush();
    }



}
