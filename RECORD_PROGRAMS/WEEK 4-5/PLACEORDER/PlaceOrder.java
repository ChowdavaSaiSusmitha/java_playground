package oops;

class Customer{
    public String name;
    public String location;

    public Customer(String name,String location){
        this.name=name;
        this.location=location;
    }

    void sendorder(){
        System.out.println(name + " from " + location + " is dropped an order, no cap");;
    }
    void receiveorder(){
        System.out.println("order delivered successfuly to " + name + "\n");
    }
}

class Order {
    String date;
    String no;
    public Order(String date,String no){
        this.date=date;
        this.no=no;
    }

    void confirm(){
        System.out.println("order" + no + " is placed on " + date);
    }
    void close(){
        System.out.println("order# " + no + " closed");
    }
}

class SpecialOrder extends Order {
    public SpecialOrder(String date, String no) {
        super(date, no);
    }

    @Override
    void confirm(){
        System.out.println("special order " + no + " is placed on " + date);
    }

    @Override
    void close(){
        System.out.println("special order# " + no + " closed\n");
    }

    void dspatch(){
        System.out.println("special order # " + no + " is dispatched via express delivery");
    }
}

class NormalOrder extends Order{
    public NormalOrder(String date, String no) {
        super(date, no);
    }

    @Override
    void confirm(){
        System.out.println("normalorder " + no + " is placed on " + date);
    }

    @Override
    void close(){
        System.out.println("normal order # " + no + " closed\n");
    }

    void dispatch(){
        System.out.println("normal order #" + no + " is dispatched via standard delivery");
    }

    void receive(){
        System.out.println("normal order # " + no + "  is received");
    }

} 


public class PlaceOrder {
    Customer c = new Customer("susmitha", "Anits");

    public static void main(String[] args) {
        Customer c = new Customer("susmitha", "Anits");
        c.sendorder();
        c.receiveorder();

        NormalOrder n=new NormalOrder("12-09-2044","P1234O12");
        n.confirm();
        n.dispatch();
        n.receive();
        n.close();

        SpecialOrder s=new SpecialOrder("17-3-3098","Q23234");
        s.confirm();
        s.dspatch();
        s.close();
    }
}
