package com.company;

/**
 * @author <B>Ibrahim Tarek Mohamed (20190007)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class CommercialClient extends Client{

    /**
     * it's the property in class CommercialClient
     * <p>1. it's 'protected' variable with type 'int'</p>
     * <p>2. it's created to hold the commercialID of an CommercialClient</p>
     */
    private int commercialID;

    /**
     * A constructor in class CommercialClient
     * @param obj of type Account and hold the account of client
     */
    public CommercialClient(Account obj){
        super(obj);
        this.commercialID=00000000;
    }

    /**
     * A method in class CommercialClient
     * <p>it take a parameter of type 'int'</p>
     * @param commercialID of type int and hold the commercialID
     * then it sets the value of this parameter to class property 'commercialID'
     */
    public void setCommercialID(int commercialID){
        this.commercialID=commercialID;
    }

    /**
     * A method in class CommercialClient
     * @return class property 'commercialID' as int
     */
    public int getCommercialID() {
        return commercialID;
    }

    /**
     * A method in class CommercialClient
     * @return CommercialClient information as String<br>
     * <p>1- name of property 'CommercialClient'</p>
     * <p>2- address of property 'CommercialClient'</p>
     * <p>3- phone of property 'CommercialClient'</p>
     */
    public String toString() {

        return  "--------------------"+
                "\nname :" + getName() +
                "\nnationalID :" + getNationalID()+
                "\naddress :" + getAddress()+
                "\nphone :" + getPhone()+
                "\ncommercialID :" + commercialID +"\n--------------------";
    }
}
