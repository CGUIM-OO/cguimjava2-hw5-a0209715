

public class Table {
	
 final int MAXPLAYER = 4;    //最多一張牌桌能坐幾個人

 private Deck AllCards;      //存放所有牌
 private Player[] AllPlayer; //存放所有玩家
 private Dealer Banker;      //存放一個莊家
 private int[] pos_betArray; //存放每個玩家在一局下的注
 Player player = new Player();
 
public Table(int i) {
	// TODO Auto-generated constructor stub
}

public void m1(int nDeck) {  //實體化Deck class
	
  Deck deck = new Deck(nDeck);
  AllPlayer = new Player[MAXPLAYER];
 }

 public void set_player(int pos, Player p) {
	 
  int count = 0;            //新增計數器
  
  if (count <= MAXPLAYER) { //計數器<=MAXPLAYER時執行
	  
   AllPlayer[pos] = p;      //將p存入牌桌位置為pos的地方
   count++;                 //計數器加1
  }
 }

 public Player[] get_player() {
	 
  return AllPlayer;         //回傳型別為Player[]的變數
 }

 public void set_dealer(Dealer d) {
	 
  Banker = d;               //令Banker的值=d
 }

 public Card get_face_up_card_of_dealer() {
	 
  return null;              //回傳dealer打開的那張牌
 }

 private void ask_each_player_about_bets() {
	 
  int bet = 0;              //新增下的注
  
  for (int i = 0; i < MAXPLAYER; i++) {
	  
   AllPlayer[i].sayHello(); //玩家打招呼
   AllPlayer[i].makeBet();  //玩家下注
   pos_betArray[i] += bet;  //玩家下的注存在pos_betArray供之後使用
  }
 }

 private void distribute_cards_to_dealer_and_players() {
	 
	 //setOneRoundCard();
     //printCard();
 }

 private void ask_each_player_about_hits() {

  boolean hit = false;
  Player player1 = AllPlayer[1];
  
  do {
   hit = player1.hit_me(null); // this
   if (hit) {
    player1Card.add(deck.getOneCard(true));
    player1.setOneRoundCard(player1Card);
    System.out.print("Hit! ");
    System.out.println(player1.getName() + "'s Cards now:");
    for (Card c : player1Card) {
     c.printCard();
    }
   } 
   else {
	   
    System.out.println(player1.getName() + ", Pass hit!");
    System.out.println(player1.getName() + ", Final Card:");
    
    for (Card c : player1Card) {
    	
     c.printCard();
    }
   }
  } while (hit);

 }

 private void ask_dealer_about_hits() {

 System.out.println("Dealer's hit is over!");
 }

 private void calculate_chips() {
	 
  //printAllCard();
  System.out.println(name + "card value is" + value);
  
  if () {
	  
  System.out.println("Loss " + bet + " Chips, the Chips now is: " + get_current_chips());
  }
  else if () {
	  
 System.out.println(",Get " + bet + " Chips, the Chips now is: " + get_current_chips());
  }
  else {
	  
  System.out.println(",chips have no change! The Chips now is: " + get_current_chips());
  }
  
 }

 public int[] get_players_bet() {
	 
  return null;
 }

 public void play() {
	 
  ask_each_player_about_bets();
  distribute_cards_to_dealer_and_players();
  ask_each_player_about_hits();
  ask_dealer_about_hits();
  calculate_chips();
 }
}