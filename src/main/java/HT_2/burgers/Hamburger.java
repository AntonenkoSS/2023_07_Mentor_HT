package HT_2.burgers;

public class Hamburger {
    private String name;
    public String meat;
    public double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name+"");
    }

    public Hamburger() {

    }

    public Hamburger(String name, String meat, double price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        Hamburger.this.price = this.price + addition1Price;
        System.out.println("Added "+addition1Name + " price "+ addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        Hamburger.this.price = this.price + addition2Price;
        System.out.println("Added "+addition2Name + " price "+ addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        Hamburger.this.price = this.price + addition3Price;
        System.out.println("Added "+addition3Name + " price "+ addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        Hamburger.this.price = this.price + addition4Price;
        System.out.println("Added "+addition4Name);
    }
    public double itemizeHamburger(){
        return this.price;
    }


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        System.out.println(hamburger.name + " hamburger on a " + hamburger.breadRollType + " Roll with " + hamburger.meat +" cost "+ hamburger.price );
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }



}
