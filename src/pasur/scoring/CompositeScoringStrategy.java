package pasur.scoring;

import ch.aplu.jcardgame.*;

import  java.util.ArrayList;
public abstract class CompositeScoringStrategy implements IScoringStrategy {
    protected ArrayList<IScoringStrategy> scoringStrategies = new ArrayList<IScoringStrategy>();

    public void add(IScoringStrategy strategy){
        scoringStrategies.add(strategy);
    }

    @Override
    public abstract int getScore(Hand surs, Hand pickedCards);
}
