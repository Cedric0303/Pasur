package pasur.scoring;

import ch.aplu.jcardgame.*;
import java.util.ArrayList;

public abstract class CompositeScoringStrategy implements ScoringStrategy {

    protected ArrayList<ScoringStrategy> scoringStrategies = new ArrayList<ScoringStrategy>();

    public void add(ScoringStrategy strategy) {
        scoringStrategies.add(strategy);
    }

    @Override
    public abstract int getScore(Hand surs, Hand pickedCards);
}
