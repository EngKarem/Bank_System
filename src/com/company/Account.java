package com.company;

/**
 * @author <B>Bassem Yasser Taha (20190129)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class Account {

    /**
     * it's the property in class Account
     * <p>1- it's 'protected' variable with type 'float'</p>
     * <p>2- it's created to hold the balance of an Account</p>
     */
    private float balance;

    /**
     * it's the property in class Account
     * <p>1- it's 'protected' variable with type 'int'</p>
     * <p>2- it's created to hold the accountNumber</p>
     */
    private int accountNumber;
    /**
     * A default constructor in class Account
     * <p>set a default value for each property</p>
     * <p>it set 0 for balance and accountNumber</p>
     */
    public Account()
    {
        balance = 0;
        accountNumber = 0;
    }
    //setters

    /**
     * A method in class Account
     * <p>it take a parameter of type 'float'</p>
     * @param AccountBalance of type float and hold the balance of the account
     * then it sets the value of this parameter to class property 'balance'
     */
    public void setBalance(float AccountBalance)
    {
        this.balance = AccountBalance;
    }

    /**
     * A method in class Account
     * <p>it take a parameter of type 'int'</p>
     * @param AccountNumber of type int and hold the AccountNumber
     * then it sets the value of this parameter to class property 'accountNumber'
     */
    public void setAccountNumber(int AccountNumber)
    {
        this.accountNumber = AccountNumber;
    }

    //getters

    /**
     * A method in class Account
     * @return class property 'balance' as float
     */
    public float getBalance()
    {
        return balance;
    }

    /**
     * A method in class Account
     * @return class property 'AccountNumber' as int
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * A method in class Account
     * <p>it take a parameter of type 'float'</p>
     * @param BalanceDeposit of type float
     */
    public void deposit(float BalanceDeposit) //put
    {
        this.balance+=BalanceDeposit;
    }

    /**
     * A method in class Account
     * <p>it take a parameter of type 'float'</p>
     * @param BalanceWithdraw of type float
     * there is condition<br>
     * <p>1- not allowed to take money &gt; balance</p>
     * <p>2- not allowed to take money from empty balance</p>
     */
    public void withdraw(float BalanceWithdraw) //take
    {
        if(balance>0 && BalanceWithdraw<balance)
        {
            this.balance-=BalanceWithdraw;
        }
        else{
            System.out.println("you can't withdraw");
        }
    }

    /**
     * A method in class Account
     * @return Account information as String<br>
     * <p>1- balance of property 'account'</p>
     * <p>2- account number of property 'account'</p>
     */
    @Override
    public String toString(){
        return "--------------------"+
                "\nBalance: " + balance +
                "\nAccountNumber: " + accountNumber+"\n---------------------";
    }
}
class AccountMain {
    public static void main(String args[]) {
        //Account
        Account obj = new Account();

        obj.setAccountNumber(132132);
        obj.deposit(1000);
        obj.withdraw(500);

        System.out.println(obj);

        //SpecialAccount
        SpecialAccount obj2 = new SpecialAccount();

        obj2.setAccountNumber(1324324);
        obj2.deposit(500);
        obj2.withdraw(1000);

        System.out.println(obj2);
    }
}