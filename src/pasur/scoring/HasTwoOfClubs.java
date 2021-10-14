package pasur.scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import pasur.Rank;
import pasur.Suit;

import java.util.ArrayList;

public class HasTwoOfClubs implements IScoringStrategy {
    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        //if has 2 of clubs, got 2 points

//        allPickedCards.addAll(surs.getCardList());
//        allPickedCards.addAll(pickedCards.getCardList());
//
//
//        for (int i = 0; i < allPickedCards.size(); i++) {
//            if (allPickedCards.get(i).getSuit() == Suit.CLUBS &&
//                    pickedCards.getCardList().get(i).getRank() == Rank.TWO) {
//                return 2;
//            }
//        }
//        return 0;
//        if (pickedCards.getCard(Suit.CLUBS, Rank.TWO).toString() == "2-C") {
//            return 2;
//        }
//        else {
//            return 0;
//        }
        ArrayList<Card> allPickedCards;

        allPickedCards = pickedCards.getCardsWithSuit(Suit.CLUBS);
        allPickedCards.addAll(surs.getCardsWithSuit(Suit.CLUBS));


        for (int i=0; i< allPickedCards.size(); i++) {
            if (allPickedCards.get(i).getRank() == Rank.TWO) {
                return 2;
            }
        }
        return 0;
    }
}
