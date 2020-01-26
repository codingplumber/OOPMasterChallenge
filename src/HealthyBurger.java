public class HealthyBurger extends Hamburger {
    private int beanCurd;
    private int tofuMud;

    public HealthyBurger() {
        super("bean", "brown rye", "Healthy", 7.25);
    }

    public int getCount() {
        return super.getCount() + beanCurd + tofuMud;
    }

    public String getExtrasList() {
        return super.getExtrasList() + getBeanCurd() + getTofuMud();
    }

    public String getTotalPrice() {
        return "$" + (getPrice() + (getCount() * .75));
    }

    @Override
    public String getTotal() {
        return super.getTotal();
    }

    public String getBeanCurd() {
        if (beanCurd > 0) {
            return "bean curd " + beanCurd + "\n";
        }

        return "";
    }

    public void setBeanCurd() {
        if (beanCurd < 1) beanCurd++;
        else System.out.println("Not allowed.");
    }

    public String getTofuMud() {
        if (tofuMud > 0) {
            return "tofu mud " + tofuMud + "\n";
        }

        return "";
    }

    public void setTofuMud() {
        if (tofuMud < 1) tofuMud++;
        else System.out.println("Not allowed.");
    }
}
