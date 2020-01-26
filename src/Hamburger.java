public class Hamburger {
    private String meat;
    private String roll;
    private double price;
    private String name;
    
    private int lettuce;
    private int tomato;
    private int onion;
    private int cheese;

    public Hamburger() {
        this("beef", "white", "Basic", 5.50);
    }

    public Hamburger(String meat, String roll, String name, double price) {
        this.meat = meat;
        this.roll = roll;
        this.price = price;
        this.name = name;
    }

    // gets count of added options
    public int getCount() {
        return lettuce + tomato + onion + cheese;
    }

    // list of allowed additional toppings
    public String getExtrasList() {
        return getCheese() + getOnion() + getTomato() + getLettuce();
    }

    public String getTotalPrice() {
        return "$" + (price + (getCount() * .75));
    }

    // gets total price
    public String getTotal() {
        return getName() + " Burger:" + "\n" + getExtrasList() + getTotalPrice();
    }

    // checks to see if burger is allowed to add another option
    public boolean isAllowed(int item) {
        if (item < 1 && name != "Deluxe") {
            if (name == "Basic" && getCount() < 5) return true;
            else if (name == "Healthy" && getCount() < 7) return true;
        }

        return false;
    }

    public void setLettuce() {
        if (isAllowed(lettuce)) lettuce++;
        else System.out.println("Not allowed.");
    }

    public void setTomato() {
        if (isAllowed(tomato)) tomato++;
        else System.out.println("Not allowed.");
    }

    public void setOnion() {
        if (isAllowed(onion)) onion++;
        else System.out.println("Not allowed.");
    }

    public void setCheese() {
        if (isAllowed(cheese)) cheese++;
        else System.out.println("Not allowed.");
    }

    public String getLettuce() {
        if (lettuce > 0) {
            return "lettuce " + lettuce + "\n";
        }

        return "";
    }

    public String getTomato() {
        if (tomato > 0) {
            return "tomato " + tomato + "\n";
        }

        return "";
    }

    public String getOnion() {
        if (onion > 0) {
            return "onion " + onion + "\n";
        }

        return "";
    }

    public String getCheese() {
        if (cheese > 0) {
            return "cheese " + cheese + "\n";
        }

        return "";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
