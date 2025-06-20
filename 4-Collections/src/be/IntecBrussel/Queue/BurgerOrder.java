package be.IntecBrussel.Queue;

// The BurgerOrder class represents a customer's burger order.
// It implements Comparable so it can be sorted or used in a PriorityQueue based on order number.
public class BurgerOrder implements Comparable<BurgerOrder> {
    private String naam;   // Customer's name
    private int nummer;    // Order number

    // Constructor to initialize the order with name and number
    public BurgerOrder(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    // Getter for the name
    public String getNaam() {
        return naam;
    }

    // Setter for the name
    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Getter for the order number
    public int getNummer() {
        return nummer;
    }

    // Setter for the order number
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    // This method compares two BurgerOrder objects based on their order number.
    // It's used by sorting algorithms and data structures like PriorityQueue.
    @Override
    public int compareTo(BurgerOrder o) {
        return Integer.compare(this.nummer, o.nummer);
    }
}
