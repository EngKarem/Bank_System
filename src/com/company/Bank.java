package com.company;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author <B>karem Mostafa Ibrahim (20190387)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class Bank {

    /**
     * it's the property in class Bank
     * <p>1- it's 'public' variable with type 'String'</p>
     * <p>2- it's created to hold the name of an Bank</p>
     * <br>
     * it's the property in class Bank
     * <p>1- it's 'public' variable with type 'String'</p>
     * <p>2- it's created to hold the address of an Bank</p>
     */
    private String name ,address;

    /**
     * it's the property in class Bank
     * <p>1- it's 'public' variable with type 'int'</p>
     * <p>2- it's created to hold the phone of an Bank</p>
     */
    private int phone;

    /**
     * ArrayList in class bank
     * <p>1- it's 'public' with type 'Account'</p>
     * <p>2- it's created to store Accounts</p>
     */
    public ArrayList<Account> Accounts = new ArrayList<Account>();

    /**
     * ArrayList in class bank
     * <p>1- it's 'public' with type 'Client'</p>
     * <p>2- it's created to store Clients</p>
     */
    public ArrayList<Client> Clients = new ArrayList<Client>();

    /**
     * A default constructor in class Bank
     * <p>set a default value for each property</p>
     * <p>it set "" for name and address</p>
     * <p>it set 0 for phone</p>
     */
    public Bank()
    {
        name = "";
        address = "";
        phone = 0;
    }

    //setters.
    /**
     * A method in class Bank
     * <p>it take a parameter of type 'String'</p>
     * @param Name of type String and hold the Name of the Bank
     * then it sets the value of this parameter to class property 'name'
     */
    public void setName(String Name)
    {
        name = Name;
    }

    /**
     * A method in class Bank
     * <p>it take a parameter of type 'String'</p>
     * @param Address of type String and hold the Address of the Bank
     * then it sets the value of this parameter to class property 'address'
     */
    public void setAddress(String Address)
        {
            address = Address;
        }

    /**
     * A method in class Bank
     * <p>it take a parameter of type 'int'</p>
     * @param Phone of type int and hold the Phone of the Bank
     * then it sets the value of this parameter to class property 'phone'
     */
    public void setPhone(int Phone)
        {
            phone = Phone;
        }
    //getters

    /**
     * A method in class Bank
     * @return class property 'name' as String
     */
    public String getName()
    {
        return name;
    }

    /**
     * A method in class Bank
     * @return class property 'address' as String
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * A method in class Bank
     * @return class property 'phone' as int
     */
    public int getPhone()
    {
        return phone;
    }

    /**
     * A method in class Bank
     * <p>Add new Clients and there Accounts</p>
     */
    public void addClient()
    {
        String data;
        int num;
        Scanner scan =new Scanner(System.in);
        Account obj = new Account();
        Client c=new Client(obj);
        CommercialClient c1=new CommercialClient(obj);
        SpecialAccount obj2 = new SpecialAccount();
        System.out.println("1- Create client\n"+"2- Create CommercialClient");
        int ClientType = scan.nextInt();;
        switch (ClientType){
            case 1:

                System.out.println("Enter Client's name");
                data = scan.next();
                c.setClientName(data);

                System.out.println("Enter Client's Address");
                scan.nextLine();
                data = scan.nextLine();
                c.setAddress(data);

                System.out.println("Enter Client's Phone");
                num = scan.nextInt();
                c.setPhone(num);

                System.out.println("Enter Client's NationalID");
                data = scan.next();
                c.setNationalID(data);
                Clients.add(c);
                break;
            case 2:

                System.out.println("Enter CommercialClient's name");
                data = scan.next();
                c1.setClientName(data);

                System.out.println("Enter CommercialClient's Address");
                scan.nextLine();
                data = scan.nextLine();
                c1.setAddress(data);

                System.out.println("Enter CommercialClient's Phone");
                num = scan.nextInt();
                c1.setPhone(num);

                System.out.println("Enter CommercialClient's CommercialID");
                data = scan.next();
                c1.setNationalID(data);

                System.out.println("Enter Client's NationalID");
                num = scan.nextInt();
                c1.setCommercialID(num);
                Clients.add(c1);
                break;
            default:
                System.out.println("invalid input");
        }
        System.out.println("1- NormalAccount\n"+"2- SpecialAccount");
        int AccountType = scan.nextInt();
        switch (AccountType){
            case 1:

                System.out.println("Enter AccountNumber");
                num = scan.nextInt();
                obj.setAccountNumber(num);

                System.out.println("Enter the Balance");
                num = scan.nextInt();
                obj.setBalance(num);
                Accounts.add(obj);
                break;
            case 2:

                System.out.println("Enter AccountNumber");
                num = scan.nextInt();
                obj2.setAccountNumber(num);

                System.out.println("Enter the Balance");
                num = scan.nextInt();
                obj2.setBalance(num);
                Accounts.add(obj2);
                break;
            default:
                System.out.println("invalid input");
        }
    }

    public void ModifyClientInformation(){
        String data;
        Scanner scan =new Scanner(System.in);
        System.out.println("=========Which Client want to modify===========");
        int ClientNum = scan.nextInt();
        System.out.println("=========Modify Client information===========");
        System.out.println("1- Change Client's name\n"+"2- Change Client's ID\n"+"3- Change Client's address\n"+"4- Change Client's phone\n"+"5- Deposit\n"+"6- Withdraw\n"+"7- Exit");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Enter the client name:");
                data= scan.next();
                Clients.get(ClientNum-1).setClientName(data);
                break;
            case 2:
                System.out.println("Enter the client ID");
                data=scan.nextLine();
                Clients.get(ClientNum-1).setNationalID(data);
                break;
            case 3:
                System.out.println("Enter client address");
                data=scan.next();
                Clients.get(ClientNum-1).setAddress(data);
                break;
            case 4:
                System.out.println("Enter the phone number");
                int phone = scan.nextInt();
                Clients.get(ClientNum-1).setPhone(phone);
                break;
            case 5:
                System.out.println("Enter the deposit");
                float de = scan.nextFloat();
                Accounts.get(ClientNum-1).deposit(de);
                break;
            case 6:
                System.out.println("Enter the Withdraw");
                float wd = scan.nextFloat();
                Accounts.get(ClientNum-1).withdraw(wd);
                break;
            case 7:
                break;
            default:
                System.out.println("invalid value");
        }
    }

    /**
     * A method in class Bank
     * <p>Printing all Clients and Accounts</p>
     */
    public void display()
    {
        for(int i=0;i<Accounts.size();i++)
        {
            System.out.println("Account "+ (i+1));
            System.out.println(Accounts.get(i));
            System.out.println("Client "+ (i+1));
            System.out.println(Clients.get(i));
        }
    }
}
class BankMain {
    public static void main(String args[]) {
        Bank B=new Bank();

        B.addClient();
        B.display();

        B.addClient();
        B.display();

    }
}
