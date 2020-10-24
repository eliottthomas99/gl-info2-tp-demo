package demo;

public class Money {
    public int n;
    public String currency;
    public Money(int n, String currency) {
        this.n=n;
        this.currency=currency;
    }

    @Override
    public String toString() {
        return "Money{}";
    }
}
