
package com.eval.conditionalevaluator;

import com.eval.conditionalevaluator.domain.ConditionGroup;

import java.util.Map;

public interface Evaluator {

    Boolean evaluate(ConditionGroup conditionGroups, Map<String, Object> data);

}
