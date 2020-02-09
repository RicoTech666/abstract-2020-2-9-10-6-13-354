package module;

public class Demo {
    public static void main(String[] args) {
        int budget = 300;
        Driving driving = new Driving();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();

        driving.checkBudget(budget);
        bus.checkBudget(budget);
        train.checkBudget(budget);
        plane.checkBudget(budget);
    }
}
