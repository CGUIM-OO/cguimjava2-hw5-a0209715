import java.util.ArrayList;

public abstract class Player extends Person{
	
	private String name;
	 private int chips;//���a�����w�X
	 private int bet;//���a�����U�`�w�X
	 private ArrayList<Card> oneRoundCard = new ArrayList<Card>();

	public Player(String name, int chips) {
		
		this.name = name;   //���wname��this.name
		this.chips = chips; //���wchips��this.chips
		
	}
	
	 public String getName() { 
		 
		return name;  //�^��name
	 }
	
	 public int makeBet() {
		 
		 if(chips == 0) {//��if�P�_�٦��S�����A�p�Gchips=0(�S��)�A�h��bet�]��0�A�����a����U�`
				bet = 0; 
			}
			bet = 1;     //�򥻤U�`�@��1��
			return bet;  //�^��bet
	 }
	 
	 public void setOneRoundCard(ArrayList<Card> cards) {
		 
		 oneRoundCard=cards; //���P���ұo�쪺�d
	 }
	 
	 public boolean hitMe() {
		 
		int value = 0;                               //��value�s�{�b�d�P�I��
		for(int i = 0;i < oneRoundCard.size();i++ ) {//��for�j��A�soneRoundCard���Ȩ�value��
			Card oRC = oneRoundCard.get(i);
			value = value + oRC.getRank();
		}
		
	     if(value <17) { //�I�Ƥp��17�~��n�P
	    	 return true;
	     }
	     
		 return false;  //�I�Ƥj�󵥩�17����n�P
	 }
	 
	 
	 public int getTotalValue() {//�PhitMe����
		
		 int TotalValue = 0;
		 for(int i = 0; i < oneRoundCard.size(); i++) {
				Card oPRC = oneRoundCard.get(i);
				TotalValue = TotalValue + oPRC.getRank();
			}
		
		 return TotalValue;
	 }
	 
	 public int getCurrentChips() {//�^�Ǫ��a�{���w�X
		
		 return chips;
	 }
	 
	 public void increaseChips (int diff) {//�w�X�ܰ�
		 
		 chips=diff;
	 }
	 
	 public void sayHello() {
		 System.out.println("Hello, I am " + name + ".");
		 System.out.println("I have " + chips + " chips.");
	 }
}
