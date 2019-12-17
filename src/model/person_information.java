package model;

import java.io.Serializable;

public class person_information implements Serializable {
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
    public String trainnumber11,startstation11,endstation11,data11,enddate11,starttime11,endtime11;
    public person_information(String name,String nationality,String sex,String birthday,String bronlocation
   , String phone_number,String Email,String ID_type,String id_number,String id_effectivedate)
    {
        super();
        this.name=name;
        this.nationality=nationality;
        this.sex=sex;
        this.birthday=birthday;
        this.bronlocation=bronlocation;
        this.phone_number=phone_number;
        this.Email=Email;
        this.ID_type=ID_type;
        this.id_number=id_number;
        this.id_effectivedate=id_effectivedate;
    }

    public void settrainmassage(String trainnumber11,String startstation11,String endstation11,String data11 ,String enddate11,String starttime11, String endtime11)
    {
        this.trainnumber11=trainnumber11;
        this.startstation11=startstation11;
        this.endstation11=endstation11;
        this.data11=data11;
        this.enddate11=enddate11;
        this.starttime11=starttime11;
        this.endtime11=endtime11;
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
