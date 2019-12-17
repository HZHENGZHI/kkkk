package model;
public class train_GC {
    public String one_set_number;
    public String two_set_number;
    public String business_set_number;
    public String stand_set_number;
    public train_GC()
    {

    }

    public String getBusiness_get_number() {
        return this.business_set_number;
    }
    
    public void getBusiness_set_number(String business_set_number) {
        this.business_set_number=business_set_number;
    }
    
    
    
    public String getOne_get_number() {
        return this.one_set_number;
    }
    
    public void getOne_set_number(String one_set_number) {
        this.one_set_number=one_set_number;
    }

    public String getTwo_get_number() {
        return this.two_set_number;
    }

    public String getStand_get_number() {
        return this.stand_set_number;
    }
    
    public void getStand_set_number(String stand_set_number) {
         this.stand_set_number=stand_set_number;
    }
}
