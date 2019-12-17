package model;

import java.io.Serializable;

public class trainmassage implements Serializable {
    public String trainnumber11,startstation11,endstation11,data11,enddate11,starttime11,endtime11;
    public String business_number = new String();
    public String one_number = new String();
    public String two_number = new String();
    public String stand_number = new String();

    public  trainmassage(String trainnumber11,String startstation11,String endstation11,String data11 ,String enddate11,String starttime11, String endtime11,String business_number,String one_number,String two_number,String stand_number)
    {
        super();
        this.trainnumber11=trainnumber11;
        this.startstation11=startstation11;
        this.endstation11=endstation11;
        this.data11=data11;
        this.enddate11=enddate11;
        this.starttime11=starttime11;
        this.endtime11=endtime11;
        this.business_number=business_number;
        this.one_number=one_number;
        this.two_number=two_number;
        this.stand_number=stand_number;
    }

}
