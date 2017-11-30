import java.util.ArrayList;

public class Player {
	private String name;	//產﹎
	private int chips;		//膚絏
	private int bet;		//猔
	private ArrayList<Card> oneRoundCard;	//礟Ы
	
	public Player(String name, int chips){	
		this.name=name;	//﹎把计			
		this.chips=chips;	//Τ膚絏把计
	}
	public String getName(){
		return name;	//name
	}
	public int makeBet(){
		bet=1;	//猔Ω1じ
		if(chips==0)	//浪琩琌临Τ膚絏
			return 0;	//⊿膚絏ぃ猔
		return bet;
	}
	public void setOneRoundCard(ArrayList cards){
		oneRoundCard=cards;	//砞﹚礟Ы眔setter
	}
	public boolean hitMe(){
		if(getTotalValue()<=16){	//16翴璶礟
			return true;
		}
		else	//17翴ぃ璶礟
			return false;
	}
	public int getTotalValue(){
		int total=0;
		
		for(int n=0;n<oneRoundCard.size();n++) {	//ㄌ盢も礟羆
			if(oneRoundCard.get(n).getRank()==11||oneRoundCard.get(n).getRank()==12||oneRoundCard.get(n).getRank()==13)
				total+=10;			//璝もΤjack,queen,king 玥翴计10
			else
				total+= oneRoundCard.get(n).getRank();	//翴计羆		
		}
		
		return total;	//肚も礟翴计羆
	}
	public int getCurrentChips(){
		return chips;		//肚產瞷Τ膚絏
	}
	public void increaseChips (int diff){
		this.chips+=diff;	//產膚絏跑笆
	}
	public void sayHello(){		//產sayHello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
