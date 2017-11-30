import java.util.ArrayList;

public class Player {
	private String name;	//���a�m�W
	private int chips;		//�w�X
	private int bet;		//�U�`
	private ArrayList<Card> oneRoundCard;	//���P�����d
	
	public Player(String name, int chips){	
		this.name=name;	//�m�W�Ѽ�			
		this.chips=chips;	//�����w�X�Ѽ�
	}
	public String getName(){
		return name;	//name
	}
	public int makeBet(){
		bet=1;	//�U�`�@��1��
		if(chips==0)	//�ˬd�O�_�٦��w�X
			return 0;	//�S�w�X���U�`
		return bet;
	}
	public void setOneRoundCard(ArrayList cards){
		oneRoundCard=cards;	//�]�w���P���o�쪺�dsetter
	}
	public boolean hitMe(){
		if(getTotalValue()<=16){	//16�I�H�U�n�P
			return true;
		}
		else	//17�I�H�W���n�P
			return false;
	}
	public int getTotalValue(){
		int total=0;
		
		for(int n=0;n<oneRoundCard.size();n++) {	//�̧ǱN��W���P�[�`
			if(oneRoundCard.get(n).getRank()==11||oneRoundCard.get(n).getRank()==12||oneRoundCard.get(n).getRank()==13)
				total+=10;			//�Y��W��jack,queen,king �h�I�Ƭ�10
			else
				total+= oneRoundCard.get(n).getRank();	//�I�ƥ[�`		
		}
		
		return total;	//�^�Ǥ�W���P���I�ƥ[�`
	}
	public int getCurrentChips(){
		return chips;		//�^�Ǫ��a�{���w�X
	}
	public void increaseChips (int diff){
		this.chips+=diff;	//���a�w�X�ܰ�
	}
	public void sayHello(){		//���asayHello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
