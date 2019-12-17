package model;

import javax.naming.Name;
import java.io.Serializable;

public class order_list implements Serializable {
    public String Name;
    public String id_number;
    public String train_number;
    public String startdate;
    public String endate;
    public String start_time;
    public String end_time;

    public void setName(String name) {
        Name = name;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public void setTrain_number(String train_number) {
        this.train_number = train_number;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public void setEndate(String endate) {
        this.endate = endate;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setStartlocat(String startlocat) {
        this.startlocat = startlocat;
    }

    public void setEndlocat(String endlocat) {
        this.endlocat = endlocat;
    }

    public void setBusiness_set(String business_set) {
        this.business_set = business_set;
    }

    public void setOne_set(String one_set) {
        this.one_set = one_set;
    }

    public void setTwo_set(String two_set) {
        this.two_set = two_set;
    }

    public void setStand_set(String stand_set) {
        this.stand_set = stand_set;
    }

    public String getName() {
        return Name;
    }

    public String getId_number() {
        return id_number;
    }

    public String getTrain_number() {
        return train_number;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEndate() {
        return endate;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getStartlocat() {
        return startlocat;
    }

    public String getEndlocat() {
        return endlocat;
    }

    public String getBusiness_set() {
        return business_set;
    }

    public String getOne_set() {
        return one_set;
    }

    public String getTwo_set() {
        return two_set;
    }

    public String getStand_set() {
        return stand_set;
    }

    public String startlocat;
    public String endlocat;
    public String business_set;
    public String one_set;
    public String two_set;
    public String stand_set;

    public order_list()
    {

    }

}
