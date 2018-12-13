
public class Card {

	private Suit suit; 
	private int rank;

	/**
	 * @param s suit
	 * @param r rank
	 */
	
	public enum Suit{              // ��enum�s�� Clubs,Diamonds,Hearts,Spades
		Clubs,Diamonds,Hearts,Spades
		}
	
	public Card(Suit s, int r) {    //��s�����A�אּSuit
		suit = s;
		rank = r;
	}
	
	public void printCard() {		
		String su = "";
		String rk = "";

		
		switch (suit) {          //��switch�P�_suit�O���@�ӨæC�X��
		case Clubs:
			System.out.println("Clubs Card");
			break;
			
		case Diamonds:
			System.out.println("Diamonds Card");
			break;
			
		case Hearts:
			System.out.println("Hearts Card");
			break;
			
		case Spades:
			System.out.println("Spades Card");
			break;
		}


		switch (rank) {
		case 1:
			rk = "Ace";
			break;
		case 2:
			rk = "Two";
			break;
		case 3:
			rk = "Three";
			break;
		case 4:
			rk = "Four";
			break;
		case 5:
			rk = "Five";
			break;
		case 6:
			rk = "Six";
			break;
		case 7:
			rk = "Seven";
			break;
		case 8:
			rk = "Eight";
			break;
		case 9:
			rk = "Nine";
			break;
		case 10:
			rk = "Ten";
			break;
		case 11:
			rk = "Jack";
			break;
		case 12:
			rk = "Queen";
			break;
		case 13:
			rk = "King";
			break;
		}
		System.out.println(suit + "," + rank + " as " + su + " " + rk);
	}

	public Suit getSuit() {  //�]���A���ܬG�쥻int�令Suit
		return suit;
	}

	public int getRank() {
		return rank;
	}
}
