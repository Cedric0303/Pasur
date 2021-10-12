package pasur.scoring;

public class ScoringStrategyFactory {
    public IScoringStrategy getCompositeScoringStrategy(){
        IScoringStrategy strategies = null;
        CompositeScoringStrategy compositeScoringStrategy = new CompositeSixRulesStrategy();
        compositeScoringStrategy.add(new OneAceStrategy());
        compositeScoringStrategy.add(new OneJackStrategy());
        compositeScoringStrategy.add(new OneSurStragegy());
        compositeScoringStrategy.add(new HasSevenMoreClubs());
        compositeScoringStrategy.add(new HasTenOfDiamonds());
        compositeScoringStrategy.add(new HasTwoOfClubs());
        strategies = compositeScoringStrategy;
        return  strategies;
    }
}
