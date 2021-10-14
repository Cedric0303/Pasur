package pasur.scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import java.util.ArrayList;
import pasur.Rank;
import pasur.Suit;

public class HasTwoOfClubs implements ScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        ArrayList<Card> allPickedCards;

        allPickedCards = pickedCards.getCardsWithSuit(Suit.CLUBS);
        allPickedCards.addAll(surs.getCardsWithSuit(Suit.CLUBS));

        for (int i = 0; i < allPickedCards.size(); i++) {
            if (allPickedCards.get(i).getRank() == Rank.TWO) {
                return 2;
            }
        }
        return 0;
    }
}
