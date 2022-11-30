package com.company;

/**
 * @author <B>Ibrahim Tarek Mohamed (20190007)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class Client {

    /**
     * it's the property in class Client
     * <p>1- it's 'protected' variable with type 'String'</p>
     * <p>2- it's created to hold the name of an Client</p>
     * <br>
     * it's the property in class Client
     * <p>1- it's 'protected' variable with type 'String'</p>
     * <p>2- it's created to hold the nationalID of an Client</p>
     * <br>
     * it's the property in class Client
     * <p>1- it's 'protected' variable with type 'String'</p>
     * <p>2- it's created to hold the address of an Client</p>
     */
    private String name,nationalID, address;

    /**
     * it's the property in class Client
     * <p>1- it's 'protected' variable with type 'int'</p>
     * <p>2- it's created to hold the phone of an Client</p>
     */
    private int phone;

    /**
     * it's the property in class Client
     * <p>1- it's 'protected' variable with type 'Account'</p>
     * <p>2- it's created to hold the account of an Client</p>
     */
    private Account account;

    /**
     * A constructor in class Client
     * <p>it take a parameter of type 'Account'</p>
     * @param obj of type Account and hold the account of client
     */
    public Client(Account obj){
        account =obj;
    }
    //setters

    /**
     * A method in class Client
     * <p>it take a parameter of type 'String'</p>
     * @param name of type String and hold the name of the client
     * then it sets the value of this parameter to class property 'name'
     */
    public void setClientName(String name){
        this.name=name;
    }

    /**
     * A method in class Client
     * <p>it take a parameter of type 'String'</p>
     * @param nationalID of type String and hold the nationalID of the client
     * then it sets the value of this parameter to class property 'nationalID'
     */
    public void setNationalID(String nationalID){
        this.nationalID=nationalID;
    }

    /**
     * A method in class Client
     * <p>it take a parameter of type 'String'</p>
     * @param address of type String and hold the address of the client
     * then it sets the value of this parameter to class property 'address'
     */
    public void setAddress(String address){
        this.address=address;
    }

    /**
     * A method in class Client
     * <p>it take a parameter of type 'int'</p>
     * @param phone of type int and hold the phone of the client
     * then it sets the value of this parameter to class property 'phone'
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * A method in class Client
     * <p>it take a parameter of type 'Account'</p>
     * @param account of type Account and hold the Account of the client
     * then it sets the value of this parameter to class property 'account'
     */
    public void setAccount(Account account)
    {
        account = account;
    }
    //getters

    /**
     * A method in class Client
     * @return class property 'name' as String
     */
    public String getName(){
        return name;
    }

    /**
     * A method in class Client
     * @return class property 'nationalID' as String
     */
    public String getNationalID(){
        return nationalID;
    }

    /**
     * A method in class Client
     * @return class property 'address' as String
     */
    public String getAddress(){
        return address;
    }

    /**
     * A method in class Client
     * @return class property 'phone' as String
     */
    public int getPhone() {
        return phone;
    }

    /**
     * A method in class Client
     * @return class property 'account' as int
     */
    public String getAccount() {
        if (account!= null) {
            return account.toString();
        }else{
            return null;
        }
    }

    /**
     * A method in class Client
     * @return Client information as String<br>
     * <p>1- name of property 'Client'</p>
     * <p>2- nationalID of property 'Client'</p>
     * <p>3- address of property 'Client'</p>
     */
    @Override
    public String toString() {
        return "--------------------"+
                "\nname :" + name +
                "\nnationalID :" + nationalID  +
                "\naddress :" + address+
                "\nphone :" + phone+"\n--------------------";
    }
}
class ClientMain {
    public static void main(String args[]) {

        //Client
        Account obj = new Account();;
        Client c=new Client(obj);

        obj.setAccountNumber(23412314);;

        c.setClientName("ibrahim");
        c.setAddress("14 mohamed hassan street");
        c.setNationalID("1412001");
        c.setPhone(01146520613);
        c.setAccount(obj);
        System.out.println(c);

        //CommercialClient
        CommercialClient c1=new CommercialClient(obj);

        c1.setCommercialID(01111254541);
        c1.setClientName("ibracompany");
        c1.setAddress("14 hassan mohamed street");
        c1.setPhone(01146520613);

        System.out.println(c1);
    }
}