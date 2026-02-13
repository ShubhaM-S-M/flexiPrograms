abstract class FoodOrder
{
    int orderId;
    String customerName;

    FoodOrder(int orderId, String customerName)
    {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    void displayOrderDetails()
    {
        System.out.println("Order Id = " + orderId);
        System.out.println("Customer Name = " + customerName);
    }

    abstract double calculateBill();
}

class DineInOrder extends FoodOrder
{
    int tableNumber;

    DineInOrder(int orderId, String customerName, int tableNumber)
    {
        super(orderId, customerName);
        this.tableNumber = tableNumber;
    }

    double calculateBill()
    {
        return 1000 + 100;
    }
}

class TakeAwayOrder extends FoodOrder
{
    double packingCharge;

    TakeAwayOrder(int orderId, String customerName, double packingCharge)
    {
        super(orderId, customerName);
        this.packingCharge = packingCharge;
    }

    double calculateBill()
    {
        return 1000 + packingCharge;
    }
}

class OnlineFoodOrder extends FoodOrder
{
    double deliveryCharge;

    OnlineFoodOrder(int orderId, String customerName, double deliveryCharge)
    {
        super(orderId, customerName);
        this.deliveryCharge = deliveryCharge;
    }

    double calculateBill()
    {
        return 1000 + deliveryCharge;
    }
}

class Main4a
{
    public static void main(String args[])
    {
        DineInOrder d = new DineInOrder(1, "Rahul", 5);
        d.displayOrderDetails();
        System.out.println("Total Bill = " + d.calculateBill());

        System.out.println();

        TakeAwayOrder t = new TakeAwayOrder(2, "Amit", 50);
        t.displayOrderDetails();
        System.out.println("Total Bill = " + t.calculateBill());

        System.out.println();

        OnlineFoodOrder o = new OnlineFoodOrder(3, "Sneha", 80);
        o.displayOrderDetails();
        System.out.println("Total Bill = " + o.calculateBill());
    }
}