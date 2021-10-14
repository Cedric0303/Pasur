package pasur.scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Suit;

public class HasSevenMoreClubs implements ScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        int countPicked = pickedCards.getNumberOfCardsWithSuit(Suit.CLUBS);
        int countSurs = surs.getNumberOfCardsWithSuit(Suit.CLUBS);
        if (countPicked + countSurs >= 7) {
            return 7;
        } else {
            return 0;
        }
    }
}
