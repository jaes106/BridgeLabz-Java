package objectorientedprogramming.inheritance;
interface Worker {
    void work();
}

class RPerson {
    String name;
}

class Chef extends RPerson implements Worker {
    public void work() {
        System.out.println("Chef cooks");
    }
}

class Waiter extends RPerson implements Worker {
    public void work() {
        System.out.println("Waiter serves");
    }
}

public class RestaurantWorkers {
    public static void main(String[] args) {
        Worker w1 = new Chef();
        Worker w2 = new Waiter();

        w1.work();
        w2.work();
    }
}
