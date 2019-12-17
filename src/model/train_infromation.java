package model;

import server.database;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class train_infromation implements Serializable {
    public   String train_num = new String();
    public String startdate = new String();
    public String enddate = new String();
    public String starttime= new String();
    public String endtime = new String();
    public String startlocat = new String();

    public String endlocat = new String();
    public void setTrain_num(String train_num)
    {
        this.train_num=train_num;
    }


    public String getTrain_num()

    {
        return train_num;
    }

    public void setStartlocat(String startlocat)
    {
        this.startlocat=startlocat;
    }

    public String getStartlocat()
    {
        return startlocat;
    }

    public void setEndlocat(String endlocat)
    {
        this.endlocat=endlocat;
    }

    public String getEndlocat()
    {
        return   endlocat;
    }

    public void setStartdate(String startdate)
    {
        this.startdate=startdate;
    }

    public String getStartdate()
    {
        return startdate;
    }


    public void setEnddate(String enddate)
    {
        this.enddate=enddate;
    }

    public String getEnddate()
    {
        return enddate;
    }


    public void setStarttime(String starttime)
    {
        this.starttime=starttime;
    }

    public String getStarttime()
    {
        return starttime;
    }

    public void setEndtime(String endtime)
    {
        this.endtime=endtime;
    }

    public String getEndtime()
    {
        return endtime;
    }
}
