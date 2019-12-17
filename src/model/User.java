package model;

import java.io.Serializable;

public class User implements Serializable {
    public String acount=new String();
    public String pw=new String();
    public String name=new String();
    public String englishname=new String();
    public String nationality=new String();
    public String sex=new String();
    public String birthday=new String();
    public String bronlocation=new String();
    public String phone_number=new String();
    public String Email=new String();
    public String ID_type=new String();
    public String id_number=new String();
    public String id_effectivedate=new String();

    public User(String acount,String pw)
    {
        super();
        this.acount=acount;
        this.pw=pw;
    }

    public String getAcount() {
        return this.acount;
    }

    public String getPw()
    {
        return this.pw;
    }

    public String name()
    {
        return this.name;
    }

    public String englishname()
    {
        return this.englishname;
    }

    public String nationality()
    {
        return this.nationality;
    }

    public String sex()
    {
        return this.sex;
    }

    public String birthday()
    {
        return this.birthday;
    }

    public String bronlocation()
    {
        return this.bronlocation;
    }

    public String phone_number()
    {
        return this.phone_number;
    }

    public String Email()
    {
        return this.Email;
    }

    public String ID_type()
    {
        return this.ID_type;
    }

    public String ID_number()
    {
        return this.id_number;
    }

    public String id_effectivedate()
    {
        return this.id_effectivedate;
    }

}
