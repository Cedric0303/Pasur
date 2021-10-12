package pasur.scoring;

import ch.aplu.jcardgame.*;
import pasur.Rank;

public class OneAceStrategy implements ScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        int scoreSurs = surs.getNumberOfCardsWithRank(Rank.ACE);
        int scorePC = pickedCards.getNumberOfCardsWithRank(Rank.ACE);
        int TotalScore = scoreSurs + scorePC;
        return TotalScore;
    }
}
