package pasur.scoring;

public class ScoringStrategyFactory {

    private static ScoringStrategyFactory instance = null;
    private ScoringStrategy strategies = null;

    private ScoringStrategyFactory() {
        CompositeScoringStrategy compositeScoringStrategy = new CompositeSixRulesStrategy();
        compositeScoringStrategy.add(new OneAceStrategy());
        compositeScoringStrategy.add(new OneJackStrategy());
        compositeScoringStrategy.add(new OneSurStragegy());
        compositeScoringStrategy.add(new HasSevenMoreClubs());
        compositeScoringStrategy.add(new HasTenOfDiamonds());
        compositeScoringStrategy.add(new HasTwoOfClubs());
        this.strategies = compositeScoringStrategy;
    }

    public static ScoringStrategyFactory getInstance() {
        if (instance == null) {
            instance = new ScoringStrategyFactory();
        }
        return instance;
    }

    public ScoringStrategy getStrategies() {
        return this.strategies;
    }
}
