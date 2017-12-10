/* Facade */

class CurstomerService {
    private Order order;
    private Billing bill;
    private Shipping shipment;

    public CurstomerService() {
        this.order = new Order();
        this.bill = new Billing();
        this.shipment = new Shipping();
    }

    public void help() {
        order.setOrder(122);
        bill.generate(order.getOrder(), shipment.ship("Germany", "Italy")); 
    }
}