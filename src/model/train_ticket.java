package model;

import java.io.Serializable;

public class train_ticket implements Serializable {

    public   String train_num = new String();
    public String startdate = new String();
    public String enddate = new String();
    public String starttime= new String();
    public String endtime = new String();
    public String startlocat = new String();
    public String endlocat = new String();
    public String business_price = new String();
    public String one_price = new String();
    public String two_price = new String();
    public String stand_price = new String();
    public String business_number = new String();
    public String one_number = new String();
    public String two_number = new String();
    public String stand_number = new String();
    public train_ticket(String train_num,String startdate,String enddate,String starttime,String endtime,String startlocat,String endlocat,String business_price
            ,String one_price,String two_price,String stand_price,String business_number,String one_number,String two_number,String stand_number)
    {
        super();
        this.train_num=train_num;
        this.startdate=startdate;
        this.enddate=enddate;
        this.starttime=starttime;
        this.endtime=endtime;
        this.startlocat=startlocat;
        this.endlocat=endlocat;
        this.business_price= business_price;
        this.one_price=one_price;
        this.two_price=two_price;
        this.stand_price=stand_price;
        this.business_number=business_number;
        this.one_number=one_number;
        this.two_number=two_number;
        this.stand_number=stand_number;
    }
    public String getinformation ()
    {
        return two_number;
    }
}
