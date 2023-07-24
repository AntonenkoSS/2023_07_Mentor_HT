package HT_2.burgers;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price) {
        super(name, meat, price);

    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.price = super.price + healthyExtra1Price;
        System.out.println("Added "+healthyExtra1Name);
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.price = super.price + healthyExtra2Price;
        System.out.println("Added "+healthyExtra2Name);
    }

    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger();
    }

}
