
package com.eval.conditionalevaluator;

import com.eval.conditionalevaluator.domain.ConditionContext;
import com.eval.conditionalevaluator.domain.ConditionGroup;

import java.util.Map;

public class EvaluatorImpl implements Evaluator {

    @Override
    public Boolean evaluate(ConditionGroup conditionGroup, Map<String, Object> data) {
        ConditionContext conditionContext = new ConditionContext(data);
        return conditionGroup.test(conditionContext);
    }

}
