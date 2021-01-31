package compare;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author:FC
 * @Date:2021/1/31
 * @Time:11:07
 * @Content:
 */
class Card {
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }


}
public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(1, "♣");
        Card card2 = new Card(2, "♣");
        Card card3 = new Card(3, "♣");
        PriorityQueue<Card> queue=new PriorityQueue<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.rank-o2.rank;
            }
        });
        queue.offer(card1);
        queue.offer(card2);
        System.out.println(queue);
    }
}
