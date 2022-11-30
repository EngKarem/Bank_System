package com.company;

/**
 * @author <B>Bassem Yasser Taha (20190129)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class SpecialAccount extends Account{

    /**
     * it's the property in class SpecialAccount
     * <p>1. it's 'protected' variable with type 'float'</p>
     * <p>2. it's created to hold the balance of an SpecialAccount</p>
     */
    private float balance;

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
     * <p>2- The Maximum Limit is 1000 LE take money from empty balance</p>
     */
    public void withdraw(float BalanceWithdraw) //take
    {
        if(balance >=0 && BalanceWithdraw<=1000)
        {
            balance-=BalanceWithdraw;
        }else{
            System.out.println("The Maximum Limit is 1000 LE");
        }
    }

    /**
     * A method in class SpecialAccount
     * @return class property 'balance' as float
     */
    public float getBalance()
    {
        return balance;
    }

    /**
     * A method in class SpecialAccount
     * @return SpecialAccount information as String<br>
     * <p>1- balance of property 'account'</p>
     * <p>2- account number of property 'account'</p>
     */
    public String toString(){
        return "--------------------"+
                "\nBalance: " + getBalance() +
                "\nAccountNumber: " + getAccountNumber()+"\n---------------------";
    }
}
