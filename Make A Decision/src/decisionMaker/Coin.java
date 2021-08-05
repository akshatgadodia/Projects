package decisionMaker;

import java.util.Random;   

public class Coin {
	private String choice1 = "Heads";
	private String choice2 = "Tails";
	
	

	public String getChoice1() {
		return choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String tossCoin() {
		Random random = new Random(); 
		int x = random.nextInt(2);   
		if(x==1)
			{
				return choice1;
			}
		else
			{
				return choice2;
			}
				
	}
}
