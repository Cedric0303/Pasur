package pasur.scoring;

import ch.aplu.jcardgame.*;
import java.util.*;

public interface IScoringStrategy {
//    ArrayList<Card> allPickedCards = null;

    int getScore(Hand surs, Hand pickedCards);

}
