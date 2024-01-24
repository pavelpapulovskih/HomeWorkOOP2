public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.enqueue("Джон");
        market.enqueue("Алиса");
        market.enqueue("Боб");

        market.takeOrder("Пицца");
        market.takeOrder("Бургер");
        market.takeOrder("Салат");

        market.update();
        market.update();
        market.update();
        market.update();
    }
}
