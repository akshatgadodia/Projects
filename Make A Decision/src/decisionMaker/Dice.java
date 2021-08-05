package decisionMaker;

import java.util.Random;

public class Dice {
	private String choice1 = "Choice 1";
	private String choice2 = "Choice 2";
	private String choice3 = "Choice 3";
	private String choice4 = "Choice 4";
	private String choice5 = "Choice 5";
	private String choice6 = "Choice 6";
	private int numch=2;
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getChoice4() {
		return choice4;
	}
	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}
	public String getChoice5() {
		return choice5;
	}
	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}
	public String getChoice6() {
		return choice6;
	}
	public void setChoice6(String choice6) {
		this.choice6 = choice6;
	}
	public int getNumch() {
		return numch;
	}
	public void setNumch(int numch) {
		this.numch = numch;
	}
	public String rollDie() {
		Random random = new Random(); 
		int x = random.nextInt(numch);  
		switch(x) {
		case 0: return choice1;
		case 1: return choice2;
		case 2: return choice3;
		case 3: return choice4;
		case 4: return choice5;
		case 5: return choice6;
		default: return null;
		}
	}
}
