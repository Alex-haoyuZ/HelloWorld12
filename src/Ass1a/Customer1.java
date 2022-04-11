package Ass1a;

public class Customer1 {
    private String name;
    private int totalCost = 0;
    private String totalProduct = "";

    public Customer1() {}

    public String getTotalProduct()
    {
        return totalProduct;
    }

    public void setTotalProduct(String totalProduct)
    {
        this.totalProduct = totalProduct;
    }

    public void setTotalCost(int totalCost)
    {
        this.totalCost = totalCost;
    }

    public int getTotalCost()
    {
        return totalCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateItem(int cost, String product)
    {
        totalCost += cost;
        totalProduct += product;
    }
}