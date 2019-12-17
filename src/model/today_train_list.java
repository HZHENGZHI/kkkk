package model;

import server.database;

import java.io.Serializable;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class today_train_list implements Serializable {
	public String date;
	public String enddate;
    public String train_number;
    public String start_locat;
    public String end_locat;
    public String start_time;
    public String end_time;
    public String last_time;
    public String business_set;
    public String one_set;
    public String two_set;
    public String stand_set;
    public Vector rowData,columnNames;

    public today_train_list(String start_locat,String end_locat,String start_time)
    {
        super();
        this.start_locat = start_locat;
        this.end_locat = end_locat;
        this.start_time = start_time;
    }


    public String getDate(){
        return date;
    }
    public String getEnddate(){
        return enddate;
    }
    public String getTrain_number(){
        return train_number;
    }
    public String getStart_locat(){
        return start_locat;
    }
    public String getEnd_locat(){
        return end_locat;
    }
    public String getStart_time(){
        return start_time;
    }
    public String getEnd_time(){
        return end_time;
    }
    public String getBusiness_set(){
        return business_set;
    }
    public String getOne_set(){
        return one_set;
    }
    public String getTwo_set(){
        return two_set;
    }
    public String getStand_set(){
        return stand_set;
    }

}

