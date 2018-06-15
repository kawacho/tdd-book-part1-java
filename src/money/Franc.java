package money;

public class Franc extends Money {
	
	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	Money times(int multiplier) {
		return Money.franc(this.amount * multiplier);
	}
	
}
