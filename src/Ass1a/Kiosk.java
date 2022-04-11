package Ass1a;
import java.util.Scanner;

public class Kiosk
{
    private int balance;
    private Customer1 customer1;
    private LuckyDipGenerator rom = null;

    public Kiosk() {}

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    private void menu()
    {
        System.out.println("\nWelcome to Super Fantastic Kiosk");
        System.out.println("==========================");
        System.out.println("(1) Create A New Order");
        System.out.println("(2) Buy More Credit");
        System.out.println("(3) Purchase An Item");
        System.out.println("(4) What Have I Ordered So Far?");
        System.out.println("(5) Collect My Order");
        System.out.println("(6) Display Help");
        System.out.println("(7) Leave Kiosk");
        System.out.println("Choose an option:");
    }

    private void menu1()
    {
        System.out.println("These are the items available for sale today:");
        System.out.println("------------------------------------------------------------");
        System.out.println("(1) PEN, worth $10.");
        System.out.println("(2) BOOK, worth $20.");
        System.out.println("(3) DVD, worth $30.");
        System.out.println("(4) MOUSE, worth $40.");
        System.out.println("(5) KEYBOARD, worth $50.");
        System.out.println("(6) Let ME pick a random item for you!!!");
        System.out.println();
        System.out.println("Pick a number between 1-6: ");
    }

    public void checkBuy()
    {
        int cost = 0;
        String product = null;
        boolean rightOption = true;
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 6)
        {
            rom = new LuckyDipGenerator();
            choice = rom.getRandom();
        }
        switch (choice)
        {
            case 1:
                cost = 10;
                product = "PEN,";break;
            case 2:
                cost = 20;
                product = "BOOK,";break;
            case 3:
                cost = 30;
                product = "DVD,";break;
            case 4:
                cost = 40;
                product = "MOUSE,";break;
            case 5:
                cost = 50;
                product = "KEYBOARD,";break;
            default:
                System.out.println("Error: your choice must be between 1-6");
                rightOption = false;break;
        }

        if (!rightOption)
            return;
        if (balance >= cost)
        {
            balance = balance - cost;
            customer1.updateItem(cost,product);
            System.out.println("Your new credit balance is now: $ " + balance);
            System.out.println("You have bought a " + product + " worth $ " + cost);
        }
        else
        {
            System.out.println("Sorry, you do not have enough credit to purchase this item!");
            System.out.println("Credit Balance: $" + balance + ", Item Cost: $" + cost);
        }
    }

    public void option3()
    {
        if (getBalance() > 0)
        {
            menu1();
            checkBuy();
        }
        else
            System.out.println("You don't have enough money, please insert money!!");
    }

    public void showList()
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag)
        {
            menu();
            int choice = sc.nextInt();
            if (choice == 1)
            {
                customer1 = new Customer1();
                System.out.print("Please enter your name: ");
                customer1.setName(sc.next());
                System.out.print("Please enter the money: ");
                int userInput = sc.nextInt();
                if (userInput > 0)
                    setBalance(userInput);
                else
                {
                    System.out.println("Please input a correct money!");
                    customer1 = null;
                }
            }
            else if (choice == 2 && customer1 != null)
            {
                System.out.print("Please insert money ");
                if (getBalance() >= 0)
                    balance += sc.nextInt();
                else
                    System.out.println("Please enter a correct money!");
            }
            else if (choice == 3 && customer1 != null)
                option3();
            else if (choice == 4 && customer1 != null)
            {
                System.out.println("Customer " + customer1.getName() + " has purchased these items: ");
                System.out.println(customer1.getTotalProduct());
                System.out.println("worth a total of $" + customer1.getTotalCost());
                System.out.println("Credit balance: $" + getBalance());
            }
            else if (choice == 5 && customer1 != null)
            {
                System.out.println("Customer " + customer1.getName() + " has purchased these items: ");
                System.out.println(customer1.getTotalProduct());
                System.out.println("worth a total of $" + customer1.getTotalCost());
                System.out.println("Credit balance: $" + getBalance());
                System.out.println("Thank you for shopping with us. Please collect your goods (and your balance) \n" +
                        "at the front desk.");
                customer1 = null;
                balance = 0;
            }

            else if (choice == 6)
            {
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
                System.out.print("This is help windows: ");
            }

            else if (choice == 7)
            {
                System.out.print("Thanks for using, goodbye!");
                flag = true;
                customer1 = null;
                balance = 0;
            }
            else if (choice > 7 || choice < 1)
                System.out.print("Please enter a correct number");
            else
                System.out.println("You should create a new order first.");
        }
    }
}