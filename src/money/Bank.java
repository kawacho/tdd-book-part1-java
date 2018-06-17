package money;

public class Bank {

	/**
	 * 
	 * @param source 式
	 * @param to 換算先の通貨名
	 * @return
	 */
	Money reduce(Expression source, String to) {
		if (source instanceof Money) {
			return (Money) source;
		}
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}

}
