package money;

public class Bank {

	/**
	 * 
	 * @param source 式
	 * @param to 換算先の通貨名
	 * @return
	 */
	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}

	void addRate(String from, String to, int rate) {
	}

}
