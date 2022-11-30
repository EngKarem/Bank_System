package com.company;

import java.util.Scanner;

/**
 * @author <B>karem Mostafa Ibrahim (20190387)</B>
 * @version <B>1.6</B>
 * @since <B>29 April 2021</B>
 */
public class Main {
    public static void main(String args[])
    {
        int choice;
        Bank B = new Bank();
        while(true)
        {
            System.out.println("=========Bank System=========");
            System.out.println("1- Add a new Client\n"+"2- Modify Client information\n"+"3- Print Clients\n"+"4- Exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if(choice == 1)
            {
                B.addClient();
            }
            else if(choice == 2)
            {
                B.ModifyClientInformation();
            }
            else if(choice == 3)
            {
                B.display();
            }
            else if(choice == 4)
            {
                break;
            }
            else {
                System.out.println("invalid input");
            }
        }
    }
}
