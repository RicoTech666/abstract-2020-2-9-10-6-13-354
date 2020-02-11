package module;

public class Plane implements Vehicle {

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public void checkBudget(int budget) {
        if (budget >= this.getPrice()) {
            System.out.println("Budget is enough for " + getClass().getSimpleName());
        } else {
            System.out.println("Budget is not enough for " + getClass().getSimpleName());
        }
    }
}
