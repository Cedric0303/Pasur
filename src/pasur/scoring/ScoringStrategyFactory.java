package pasur.scoring;

public class ScoringStrategyFactory {

    public ScoringStrategy getCompositeScoringStrategy() {
        ScoringStrategy strategies = null;
        CompositeScoringStrategy compositeScoringStrategy = new CompositeSixRulesStrategy();
        compositeScoringStrategy.add(new OneAceStrategy());
        compositeScoringStrategy.add(new OneJackStrategy());
        compositeScoringStrategy.add(new OneSurStragegy());
        strategies = compositeScoringStrategy;
        return strategies;
    }
}
