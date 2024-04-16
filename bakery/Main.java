import Cakes.Cake;
import Cakes.ChocolateCake;
import Cakes.StrawberryCake;
import Cakes.VanillaCake;
import Personalization.MultiLayered;
import Personalization.Sayings;
import Personalization.Sprinkles;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create Cakes
        Cake bolo1 = new ChocolateCake();

        Cake bolo2 = new VanillaCake();
        bolo2 = new Sayings(bolo2, "PLAIN!");

        Cake bolo3 = new VanillaCake();
        bolo3 = new Sprinkles(bolo3);
        bolo3 = new Sayings(bolo3, "FANCY");

        Cake bolo4 = new StrawberryCake();
        bolo4 = new MultiLayered(bolo4);
        bolo4 = new Sprinkles(bolo4);
        bolo4 = new Sprinkles(bolo4);
        bolo4 = new Sayings(bolo4, "One of");
        bolo4 = new Sayings(bolo4, "EVERYTHING");

        // Create the order
        Order order = new Order();

        // Add the cakes to the order
        order.addCake(bolo1);
        order.addCake(bolo2);
        order.addCake(bolo3);
        order.addCake(bolo4);

        // Print the order
        order.printOrder();
    }
}
