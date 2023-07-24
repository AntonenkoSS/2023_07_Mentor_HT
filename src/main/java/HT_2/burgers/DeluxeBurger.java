package HT_2.burgers;


//For the second class, DeluxeBurger, there are no additional member variables, and the constructor
// accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and
// chips and a drink for a base price of $19.10. The constructor can be configured in any way, as long
// as chips and drink are added for the total price just mentioned. In this class, the four(4) methods
// defined in the Hamburger class for including additional toppings must each be overridden so that a
// message is printed stating that no additional items can be added to a deluxe burger.99


public class DeluxeBurger extends Hamburger {
    private static final double price = 19.10;

    public DeluxeBurger() {
        super();

    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Can not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Can not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    public double itemizeHamburger(){
        return 19.10;
    }

    public static void main(String[] args) {
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

    }

}
