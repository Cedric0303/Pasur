package pasur.scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Rank;

public class OneJackStrategy implements IScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        int scoreSurs = surs.getNumberOfCardsWithRank(Rank.JACK);
        int scorePC = pickedCards.getNumberOfCardsWithRank(Rank.JACK);
        int TotalScore = scoreSurs + scorePC;
        return TotalScore;
    }


}
