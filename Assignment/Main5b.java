interface Discount
{
    double calculateDiscount(double amount);
}

class FestivalDiscount implements Discount
{
    public double calculateDiscount(double amount)
    {
        return amount * 0.20;
    }
}

class SeasonalDiscount implements Discount
{
    public double calculateDiscount(double amount)
    {
        return amount * 0.10;
    }
}

class MemberDiscount implements Discount
{
    public double calculateDiscount(double amount)
    {
        return amount * 0.15;
    }
}

class Main5b
{
    public static void main(String args[])
    {
        Discount d = new FestivalDiscount();
        System.out.println("Discount = " + d.calculateDiscount(5000));
    }
}