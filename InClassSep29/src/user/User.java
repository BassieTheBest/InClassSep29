package user;

public class User {
	private String name;
	private int numTurns;
	
	public void setName(String name)  {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setTurn(int turn) {
		this.numTurns = turn;
	}
	public int getTurn() {
		return numTurns;
	}
	
	public User(String name, int numTurns) {
		this.name = name;
		this.numTurns = numTurns;
	}
	public User() {}
	
}
