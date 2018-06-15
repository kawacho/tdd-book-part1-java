package money;

public class Franc extends Money {
	
	private String currency;
	
	public Franc(int amount) {
		this.amount = amount;
		this.currency = "CHF";
	}

	Money times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}
	
	String currency() {
		return this.currency;
	}

}
