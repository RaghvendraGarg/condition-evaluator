package com.eval.conditionalevaluator.domain;

import com.eval.conditionalevaluator.ConditionEvaluatorConfig;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class ConditionGroup implements Predicate<ConditionContext> {

    private LogicalOperator logicalOperator;

    private List<ConditionGroup> conditionGroups;

    private List<Condition> conditions;

    @Override
    public boolean test(ConditionContext conditionContext) {
        EvaluationContext evaluationContext = new EvaluationContext(conditions, logicalOperator, conditionContext);
        Boolean conditionsEvalResult = ConditionEvaluatorConfig.getPredicateListEvaluator().evaluate(evaluationContext);
        EvaluationContext evaluationContextConditionGrp = new EvaluationContext(conditionGroups, logicalOperator, conditionContext);
        Boolean conditionGroupEvalResult = ConditionEvaluatorConfig.getPredicateListEvaluator().evaluate(evaluationContextConditionGrp);
        return getBooleanResult(conditionsEvalResult, conditionGroupEvalResult);
    }

    private boolean getBooleanResult(Boolean conditionsEvalResult, Boolean conditionGroupEvalResult) {
        if(Objects.nonNull(conditionsEvalResult) && Objects.nonNull(conditionGroupEvalResult)) {
            return logicalOperator.getFunction().apply(conditionGroupEvalResult, conditionsEvalResult);
        }else if(Objects.isNull(conditionsEvalResult) && Objects.isNull(conditionGroupEvalResult)) {
            return false;
        }
        return Objects.isNull(conditionsEvalResult) ? conditionGroupEvalResult : conditionsEvalResult;
    }

    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public List<ConditionGroup> getConditionGroups() {
        return conditionGroups;
    }

    public void setConditionGroups(List<ConditionGroup> conditionGroups) {
        this.conditionGroups = conditionGroups;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public void addConditionGroup(ConditionGroup conditionGroup) {
        conditionGroups.add(conditionGroup);
    }

}


