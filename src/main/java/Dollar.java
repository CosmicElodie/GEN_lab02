public class Dollar extends Money
{

    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    String currency() {
        return currency;
    }
}
