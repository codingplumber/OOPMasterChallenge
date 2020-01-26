import java.text.BreakIterator;

public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger();
//        hamburger.setCheese();
//        hamburger.setLettuce();
//        hamburger.setOnion();
//        hamburger.setTomato();

        HealthyBurger healthyBurger = new HealthyBurger();

        System.out.println(healthyBurger.getTotal());
         healthyBurger.setLettuce();
         healthyBurger.setOnion();
         healthyBurger.setTomato();
         healthyBurger.setBeanCurd();
        System.out.println("=======");
        System.out.println(healthyBurger.getTotal());

        System.out.println("++++++++++++++");

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.setLettuce();

        System.out.println(deluxeBurger.getTotal());

//        DeluxeBurger deluxeBurger = new DeluxeBurger();

//        System.out.println(hamburger.getTotal());
    }
}
