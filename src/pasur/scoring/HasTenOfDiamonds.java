package pasur.scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import java.util.ArrayList;
import pasur.Rank;
import pasur.Suit;

public class HasTenOfDiamonds implements ScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        ArrayList<Card> allPickedCards;

        allPickedCards = pickedCards.getCardsWithSuit(Suit.DIAMONDS);
        allPickedCards.addAll(surs.getCardsWithSuit(Suit.DIAMONDS));
        for (int i = 0; i < allPickedCards.size(); i++) {
            if (allPickedCards.get(i).getRank() == Rank.TEN) {
                return 3;
            }
        }
        return 0;
    }
}
