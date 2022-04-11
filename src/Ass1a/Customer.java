package Ass1a;
import java.util.Scanner;
/*
public class Customer
{
    private String name;
    private String product;
    private int balance;
    private Goods goods = null;
    private LuckyDipGenerator rom = null;

    public Customer(){}

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    public String getProduct()
    {
        return product;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void buy()
    {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice <= 6)
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
            choice = sc.nextInt();
            if (choice == 1)
            {
                goods = new Goods("PEN",10);
                if (goods.getGoodCost() < balance)
                    balance = balance - goods.getGoodCost();
                else
                {
                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
                    System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                }
            }
            else if (choice == 2)
            {
                goods = new Goods("BOOK",20);
                if (goods.getGoodCost() < balance)
                    balance = balance - goods.getGoodCost();
                else
                {
                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
                    System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                }
            }
            else if (choice == 3)
            {
                goods = new Goods("DVD",30);
                if (goods.getGoodCost() < balance)
                    balance = balance - goods.getGoodCost();
                else
                {
                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
                    System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                }
            }
            else if (choice == 4)
            {
                goods = new Goods("MOUSE",40);
                if (goods.getGoodCost() < balance)
                    balance = balance - goods.getGoodCost();
                else
                {
                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
                    System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                }
            }
            else if (choice == 5)
            {
                goods = new Goods("Keyboard",50);
                if (goods.getGoodCost() < balance)
                    balance = balance - goods.getGoodCost();
                else
                {
                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
                    System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                }
            }
            else if (choice == 6)
            {
                rom = new LuckyDipGenerator();
                if (rom.getRandom() == 1)
                {
                    goods = new Goods("PEN",10);
                    if (goods.getGoodCost() < balance)
                        balance = balance - goods.getGoodCost();
                    else
                    {
                        System.out.println("Sorry, you do not have enough credit to purchase this item!");
                        System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                    }
                }
                else if (rom.getRandom() == 2)
                {
                    goods = new Goods("BOOK",20);
                    if (goods.getGoodCost() < balance)
                        balance = balance - goods.getGoodCost();
                    else
                    {
                        System.out.println("Sorry, you do not have enough credit to purchase this item!");
                        System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                    }
                }
                else if (rom.getRandom() == 3)
                {
                    goods = new Goods("DVD",30);
                    if (goods.getGoodCost() < balance)
                        balance = balance - goods.getGoodCost();
                    else
                    {
                        System.out.println("Sorry, you do not have enough credit to purchase this item!");
                        System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                    }
                }
                else if (rom.getRandom() == 4)
                {
                    goods = new Goods("MOUSE",40);
                    if (goods.getGoodCost() < balance)
                        balance = balance - goods.getGoodCost();
                    else
                    {
                        System.out.println("Sorry, you do not have enough credit to purchase this item!");
                        System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                    }
                }
                else if (rom.getRandom() == 5)
                {
                    goods = new Goods("Keyboard",50);
                    if (goods.getGoodCost() < balance)
                        balance = balance - goods.getGoodCost();
                    else
                    {
                        System.out.println("Sorry, you do not have enough credit to purchase this item!");
                        System.out.println("Credit Balance:" + balance + "$" + ", Item Cost: " + goods.getGoodCost() + "$");
                    }
                }
                else
                    System.out.println("Error: your choice must be between 1-6");
            }
        }
    }

    public void showCustomer()
    {
        System.out.println("Customer" + getName() + "has purchased these items:");
        for (int i = 0; i < )
        goods.getGoodName();
    }
}

 */

