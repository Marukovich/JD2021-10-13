package by.it.marukovich.jd02_02.model;

public class Cashier {

    private String name;

    private Double total;

    public Cashier(int number) {
        name = "Cashier №" + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return String.format("%s [sum:%f]", name, total);
    }
}