

public class Table {
	
 final int MAXPLAYER = 4;    //�̦h�@�i�P��৤�X�ӤH

 private Deck AllCards;      //�s��Ҧ��P
 private Player[] AllPlayer; //�s��Ҧ����a
 private Dealer Banker;      //�s��@�Ӳ��a
 private int[] pos_betArray; //�s��C�Ӫ��a�b�@���U���`
 Player player = new Player();
 
public Table(int i) {
	// TODO Auto-generated constructor stub
}

public void m1(int nDeck) {  //�����Deck class
	
  Deck deck = new Deck(nDeck);
  AllPlayer = new Player[MAXPLAYER];
 }

 public void set_player(int pos, Player p) {
	 
  int count = 0;            //�s�W�p�ƾ�
  
  if (count <= MAXPLAYER) { //�p�ƾ�<=MAXPLAYER�ɰ���
	  
   AllPlayer[pos] = p;      //�Np�s�J�P���m��pos���a��
   count++;                 //�p�ƾ��[1
  }
 }

 public Player[] get_player() {
	 
  return AllPlayer;         //�^�ǫ��O��Player[]���ܼ�
 }

 public void set_dealer(Dealer d) {
	 
  Banker = d;               //�OBanker����=d
 }

 public Card get_face_up_card_of_dealer() {
	 
  return null;              //�^��dealer���}�����i�P
 }

 private void ask_each_player_about_bets() {
	 
  int bet = 0;              //�s�W�U���`
  
  for (int i = 0; i < MAXPLAYER; i++) {
	  
   AllPlayer[i].sayHello(); //���a���۩I
   AllPlayer[i].makeBet();  //���a�U�`
   pos_betArray[i] += bet;  //���a�U���`�s�bpos_betArray�Ѥ���ϥ�
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