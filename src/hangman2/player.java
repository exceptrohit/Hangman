package hangman2;
import java.util.*;
public class player {
	
	private String name,difficultylevel;
	private int round;
	private ArrayList<WORD> levelwl;
	public player(String name, String difficultylevel, int round) {
		super();
		this.name = name;
		this.difficultylevel = difficultylevel;
		this.round = round;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public void incrementround()
	{
		round++;
	}
	public ArrayList<WORD> getLevelwl() {
		return levelwl;
	}
	public void setLevelwl(ArrayList<WORD> levelwl) {
		this.levelwl = levelwl;
	}
}
