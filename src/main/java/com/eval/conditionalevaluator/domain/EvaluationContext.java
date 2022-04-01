
package com.eval.conditionalevaluator.domain;

import java.util.List;
import java.util.function.Predicate;

public class EvaluationContext {

    private List<? extends Predicate> predicates;

    private LogicalOperator logicalOperator;

    private ConditionContext conditionContext;

    public EvaluationContext(List<? extends Predicate> predicates, LogicalOperator logicalOperator, ConditionContext conditionContext) {
        this.predicates = predicates;
        this.logicalOperator = logicalOperator;
        this.conditionContext = conditionContext;
    }

    public List<? extends Predicate> getPredicates() {
        return predicates;
    }

    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    public ConditionContext getConditionContext() {
        return conditionContext;
    }
}
