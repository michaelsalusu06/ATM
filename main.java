package ATM;
import java.util.Scanner;

public class main 
{
    static boolean CheckPin(int pass)
    {
        Scanner sc = new Scanner(System.in);
        int inputPin = 0;

        while(true)
        {
           System.out.print("Input your pin, type -1 to quit: ");
           inputPin = sc.nextInt();
           if(inputPin == -1)
           {
               return false;
           }

           else if(inputPin != pass)
           {
               System.out.println("Incorrect pin");
           }

           else if(inputPin == pass)
           {
               return true;
           }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Pin: ");
        int pin = sc.nextInt();
        
        int input = -1;
        double balance = 0;
        boolean check;
        int i = 0;

        String [] history = new String[5];

        while(input != 5)
        {
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Transaction History");
            System.out.println("5.Exit");
            System.out.print("Select Options: ");
            input = sc.nextInt();
            
            if(input == 1)
            {
                check = CheckPin(pin);
                if(check == true)
                {
                   System.out.println("Your balance is " + balance);
                }
            }

            else if(input == 2)
            {
                check = CheckPin(pin);
                if(check == true)
                {
                    System.out.print("Input the amount you want to deposit: ");
                    double depo = sc.nextDouble();

                    while(depo < 0)
                    {
                        System.out.print("Invalid amount, try again: ");
                        depo = sc.nextDouble();
                    }

                    balance += depo;
                    System.out.println(depo + " has been deposited");
                    System.out.println("Your balance is now: " + balance);
                    
                    history[i] = depo + " deposited";
                    if(i == 4) i = 0;
                    else i++;
                }
            }

            else if(input == 3)
            {
                check = CheckPin(pin);
                if(check == true)
                {
                    System.out.print("Input the amount you want to withdraw: ");
                    double wd = sc.nextDouble();
                    while(wd > balance || wd < 0)
                    {
                        System.out.print("Invalid number, try again: ");
                        wd = sc.nextDouble();
                    }
                    
                    balance -= wd;
                    System.out.println("Withdrawal success");
                    System.out.println("Your balance is now: " + balance);

                    history[i] = wd + " withdrawn";
                    if(i == 4) i = 0;
                    else i++;
                }
            }

            else if(input == 4)
            {
                for(int j=0; j<5; j++)
                {
                    if(history[j] == null) System.out.print("");
                    else System.out.println(history[j]);
                }
            }

            else if(input == 5)
            {
                System.out.println("Thank you for trusting us. Have a great day!");
            }

            else
            {
                System.out.println("Invalid input");
            }
        }
    }
}
