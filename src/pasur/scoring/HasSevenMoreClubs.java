package pasur.scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Suit;

public class HasSevenMoreClubs implements IScoringStrategy {
    @Override
    public int getScore(Hand surs, Hand pickedCards) {
        //if # of clubs >= 7, got 7 points

//        allPickedCards.addAll(surs.getCardList());
//        allPickedCards.addAll(pickedCards.getCardList());
//        int count = 0;
//        for (int i = 0; i < allPickedCards.size(); i++) {
//            if(allPickedCards.get(i).getSuit() == Suit.CLUBS){
//                count ++;
//            }
//        }
//        if (count >= 7) {
//            return 7;
//        }
//        else return 0;
        int countPicked = pickedCards.getNumberOfCardsWithSuit(Suit.CLUBS);
        int countSurs = surs.getNumberOfCardsWithSuit(Suit.CLUBS);
        if (countPicked+countSurs >= 7) {
            return 7;
        }
        else {
            return 0;
        }

    }
}
