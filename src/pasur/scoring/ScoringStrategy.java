package pasur.scoring;

import ch.aplu.jcardgame.*;

public interface ScoringStrategy {
    public int getScore(Hand surs, Hand pickedCards);
}
