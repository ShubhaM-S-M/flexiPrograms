class Order
{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayOrder()
    {
        System.out.println("Order Id = " + orderId);
        System.out.println("Order Date = " + orderDate);
    }
}

class OnlineOrder extends Order
{
    String deliveryAddress;

    OnlineOrder(int orderId, String orderDate, String deliveryAddress)
    {
        super(orderId, orderDate);
        this.deliveryAddress = deliveryAddress;
    }

    void displayOnlineOrder()
    {
        displayOrder();
        System.out.println("Delivery Address = " + deliveryAddress);
    }
}

class InternationalOrder extends OnlineOrder
{
    double customDuty;

    InternationalOrder(int orderId, String orderDate, String deliveryAddress, double customDuty)
    {
        super(orderId, orderDate, deliveryAddress);
        this.customDuty = customDuty;
    }

    double calculateTotalWithDuty(double amount)
    {
        return amount + customDuty;
    }
}

class Main2b
{
    public static void main(String args[])
    {
        InternationalOrder i = new InternationalOrder(201, "12-02-2026", "USA", 500);
        i.displayOnlineOrder();
        System.out.println("Total With Duty = " + i.calculateTotalWithDuty(5000));
    }
}