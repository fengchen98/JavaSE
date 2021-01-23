import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author:FC
 * @Date:2021/1/22
 * @Time:9:07
 * @Content:
 */
class Card{
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return  suit+rank ;
    }
}

class DeckCard{
    public static final String[] suits={"♠", "♥", "♣", "♦"};
    public List<Card> buyCard(){
        List<Card> cardList=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=13; j++) {
                String suit=suits[i];
                int rank=j;
                Card card=new Card(rank,suit);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public void swap(List<Card> list,int i,int j){
        Card tmp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,tmp);
    }

    public void washCard(List<Card> list){
        for (int i = list.size()-1; i >0; i--) {
            Random random=new Random();
            int rand=random.nextInt(i);
            swap(list,i,rand);
        }
    }
}



public class TestDemo {

    public static void main(String[] args) {
        DeckCard deckCard=new DeckCard();
        List<Card> list=deckCard.buyCard();
        System.out.println(list);
        deckCard.washCard(list);
        System.out.println(list);

        List<List<Card>> hands=new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                hands.get(j).add(list.remove(0));
            }
        }
        System.out.println("A手中的牌");
        System.out.println(hands.get(0));
        System.out.println("B手中的牌");
        System.out.println(hands.get(1));
        System.out.println("C手中的牌");
        System.out.println(hands.get(2));


    }







    public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch + "")) {
                list.add(ch);
            }
        }
        return list;
    }

    public static void main1(String[] args) {
        List<Character> list=func("welcome to world","come");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
}
