package pasur.scoring;

import ch.aplu.jcardgame.Hand;

public class OneSurStragegy implements ScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        int numSurs = surs.getNumberOfCards();
        int totalScore = numSurs * 5;
        return totalScore;
    }
}
