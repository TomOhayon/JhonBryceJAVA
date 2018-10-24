package ticTacToe;

public class User {
	// ---------properties--------
	private int winNumber;
	private char token;

	public int getWinNumber() {
		return winNumber;
	}

	// -----------get+set----------
	public void setWinNumber(int winNumber) {
		this.winNumber = winNumber;
	}

	public char getToken() {
		return token;
	}

	public void setToken(char token) {
		this.token = token;
	}

	// -------------constructor-------
	public User(int winNumber, char token) {
		super();
		this.winNumber = winNumber;
		this.token = token;
	}

}
