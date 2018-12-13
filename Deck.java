import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards;
	public ArrayList<Card> usedCard = new ArrayList<Card>(); //初始化usedCard
	private ArrayList<Card> openCard = new ArrayList<Card>();//初始化openCard
	
	public int nUsed = 0;

	public Deck(int nDeck) {
		
		cards = new ArrayList<Card>();
		
		for (int i = 1; i <= nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int m = 1; m <= 13; m++) {
					Card card = new Card(s, m);
					cards.add(card);
				}
			}
		}
		shuffle();  //讓程式每跑一次就洗一次牌
	}
	
	public void printDeck() {
		
		for(int l = 0; l < cards.size(); l++) {
			Card takecard = cards.get(l);
			takecard.printCard();
		}		
	}
	
	public ArrayList<Card> getAllCards() {
		
		return cards;
	}
	
	public void shuffle() {		
		
		Random rnd = new Random();
		
		cards.addAll(usedCard);     //把用過的牌放回 cards中
		usedCard.clear();           //重置openCard
		nUsed = 0;
		
		for(int i = 0; i < cards.size(); i++) { //用cards.size決定要跑幾圈
			int a = rnd.nextInt(cards.size());  //用a存放亂數的值，並隨機找一個位子交換
			Card b = cards.get(a);              //取一個變數存放亂數位置中的值
			cards.set(a,cards.get(i));          //用此亂數位置的值放入第i位置的值
			cards.set(i,b);                     //第i位置的值放入存於a的值
		}
	}
	
	public Card getOneCard (boolean isOpened){		
		
		if(nUsed==52)
		{
			shuffle();
			nUsed=0;
			return cards.get(0);
		}
		else
		{
			if(isOpened=true)
			{
				Card firstcard = cards.get(0);
				openCard.add(firstcard);
				cards.remove(0);
				usedCard.add(firstcard);
				nUsed++;				
			}	
			return cards.get(0);
		}
	}
	
	
	public ArrayList<Card> getOpenedCard(){//回傳此副牌中所有打開過的牌
		
		return openCard;	
	}
}
