package money;

public class Bank {

	/**
	 * 
	 * @param source 式
	 * @param to 換算先の通貨名
	 * @return
	 */
	Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		int amount = sum.augend.amount + sum.addend.amount;
		return new Money(amount, to);
	}

}
