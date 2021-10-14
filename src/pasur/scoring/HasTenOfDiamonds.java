package pasur.scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import pasur.Rank;
import pasur.Suit;

import java.util.ArrayList;

public class HasTenOfDiamonds implements IScoringStrategy {
    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        //if has 10 of diamonds, got 3 points

//        allPickedCards.addAll(surs.getCardList());
//        allPickedCards.addAll(pickedCards.getCardList());
//
//        for (int i = 0; i < allPickedCards.size(); i++) {
//            if (allPickedCards.get(i).getSuit() == Suit.DIAMONDS && allPickedCards.get(i).getRank() == Rank.TEN) {
//                return 3;
//            }
//        }


//        if (pickedCards.getCard(Suit.DIAMONDS, Rank.TEN).toString() == "10-D") {
//            return 3;
//        }
//        else {
//            return 0;
//        }
        ArrayList<Card> allPickedCards;

        allPickedCards = pickedCards.getCardsWithSuit(Suit.DIAMONDS);
        allPickedCards.addAll(surs.getCardsWithSuit(Suit.DIAMONDS));
        for (int i=0; i< allPickedCards.size(); i++) {
            if (allPickedCards.get(i).getRank() == Rank.TEN) {
                return 3;
            }
        }
        return 0;

    }
}
