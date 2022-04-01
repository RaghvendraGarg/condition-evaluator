
package com.eval.conditionalevaluator;

import com.eval.conditionalevaluator.domain.PredicateListEvaluator;
import com.eval.conditionalevaluator.eval.OperationConfig;

public class ConditionEvaluatorConfig {

    private static PredicateListEvaluator predicateListEvaluator = new PredicateListEvaluator();

    private static OperationConfig operationConfig = new OperationConfig();

    private static Evaluator evaluator = new EvaluatorImpl();

    private static ConditionEvaluatorConfig instance;

    private ConditionEvaluatorConfig() {
    }

    public static ConditionEvaluatorConfig getInstance() {
        if(instance == null){
            instance = new ConditionEvaluatorConfig();
        }
        return instance;
    }

    public static PredicateListEvaluator getPredicateListEvaluator() {
        return predicateListEvaluator;
    }

    public static OperationConfig getOperationConfig() {
        return operationConfig;
    }

    public static Evaluator getEvaluator() {
        return evaluator;
    }
}
