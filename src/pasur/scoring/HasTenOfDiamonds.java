package pasur.scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Rank;
import pasur.Suit;

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

        for (int i=0; i< pickedCards.getCardsWithSuit(Suit.DIAMONDS).size(); i++) {
            if (pickedCards.getCardsWithSuit(Suit.DIAMONDS).get(i).getRank() == Rank.TEN) {
                return 3;
            }
        }
        return 0;

    }
}
