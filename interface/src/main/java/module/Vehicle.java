package module;

public interface Vehicle {
    public int getPrice();

    public default void checkBudget(int budget) {
        if (budget >= this.getPrice()) {
            System.out.println("Budget is enough for " + getClass().getSimpleName());
        } else {
            System.out.println("Budget is not enough for " + getClass().getSimpleName());
        }
    }
}
