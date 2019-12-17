package model;

import java.io.Serializable;

public class admin implements Serializable {
    public String acount=new String();
    public String pw=new String();
    public admin(String acount,String pw)
    {
        super();
        this.acount=acount;
        this.pw=pw;
    }
}
