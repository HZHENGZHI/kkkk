package model;

import server.Client;

import java.util.Vector;

public class vertor {
    public Vector row=new Vector();
    public Vector name=new Vector();
    public Vector date=new Vector();
    public Object[][] trainlist;
    int n=0;
    public vertor (String date,String enddate,String train_number,String start_locat,String end_locat,String start_time,String end_time)
    {
        super();
        this.trainlist [n][0]=date;
        this.trainlist [n][1]=enddate;
        this.trainlist [n][2]=train_number;
        this.trainlist [n][3]= start_locat;
        this.trainlist [n][4]=end_locat;
        this.trainlist [n][5]=start_time;
        this.trainlist [n][6]=end_time;
    }
}
