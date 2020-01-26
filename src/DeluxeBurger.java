public class DeluxeBurger extends Hamburger {
    private int drink = 1;
    private int chips = 1;

    public DeluxeBurger() {
        super("black angus beef", "rye", "Deluxe", 9.50);
    }

    public int getCount() {
        return super.getCount() + 2;
    }

    public String getExtrasList() {
        return getChips() + getDrink();
    }

    public String getTotalPrice() {
        return "$" + (getPrice() + (getCount() * .75));
    }

    @Override
    public String getTotal() {
        return super.getTotal();
    }

    public String getDrink() {
        if (drink > 0) {
            return "drink " + drink + "\n";
        }

        return "";
    }

    public String getChips() {
        if (chips > 0) {
            return "chips " + chips + "\n";
        }

        return "";
    }
}
