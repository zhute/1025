import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.swap;

public class CardDemo {
     private static final String[] colors={"♥","♦","♣","♠"};
     public static List<Card> creatCard(){
         List<Card>deck=new ArrayList<>(52);
         for(int i=0;i<4;i++){
             for(int j=0;j<13;j++){
                 Card card=new Card(j+1,colors[1]);
                 deck.add(card);
             }
         }
         return deck;
     }
     public static void shuffle(List<Card> deck){
         Random rand=new Random();
         for(int i=deck.size()-1;i>0;i--){
             int pos=rand.nextInt(i);
             swap(deck,i,pos);
         }
     }

    public static void main(String[] args) {
        List<Card>deck=creatCard();
         System.out.println(deck);
         shuffle(deck);
        System.out.println(deck);
    }


}
