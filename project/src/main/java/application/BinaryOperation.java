package application;

public enum BinaryOperation {
	MULTIPLICATION("×"),
	DIVISION("/"),
	ADDITION("+"),
	SUBTRACTION("-");

	private final String symbol;

	BinaryOperation(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}
}
