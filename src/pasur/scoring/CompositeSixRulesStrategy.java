package pasur.scoring;

import ch.aplu.jcardgame.Hand;

public class CompositeSixRulesStrategy extends CompositeScoringStrategy {

    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        int totalScore = 0;
        for(IScoringStrategy strategy: this.scoringStrategies){
            totalScore += strategy.getScore(surs, pickedCards);
        }
        return totalScore;
    }


}
