package money;

public class Money {
	
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return new Money(this.amount * multiplier, this.currency);
	}
	
	String currency() {
		return this.currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
				&& this.currency().equals(money.currency());
	}
	
	public String toString() {
		return this.amount + " " + this.currency;
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	Money plus(Money addend) {
		return new Money(this.amount + addend.amount, this.currency);
	}
	
}
