package Ass1a;
public class Goods
{
    private int number;
    private String goodName;
    private int goodCost;

    public Goods(String goodName, int goodCost)
    {
        this.goodName = goodName;
        this.goodCost = goodCost;
    }

    public void setGoodName(String goodName)
    {
        this.goodName = goodName;
    }

    public String getGoodName()
    {
        return goodName;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public void setGoodCost(int goodCost)
    {
        this.goodCost = goodCost;
    }

    public int getGoodCost()
    {
        return goodCost;
    }
}
