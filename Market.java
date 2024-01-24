import java.util.LinkedList;
import java.util.Queue;

interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
}

interface MarketBehaviour {
    void takeOrder(String order);
    String serveNextOrder();
}

interface MarketUpdate {
    void update();
}

public class Market implements QueueBehaviour, MarketBehaviour, MarketUpdate {
    private Queue<String> queue = new LinkedList<>();
    private Queue<String> orders = new LinkedList<>();

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public void takeOrder(String order) {
        orders.add(order);
    }

    @Override
    public String serveNextOrder() {
        return orders.poll();
    }

    @Override
    public void update() {
        String order = serveNextOrder();
        String person = dequeue();

        if (order != null && person != null) {
            System.out.println("Посетитель " + person + " получен заказ: " + order);
        } else {
            System.out.println("Нет заказов или людей в очереди.");
        }
    }
}

