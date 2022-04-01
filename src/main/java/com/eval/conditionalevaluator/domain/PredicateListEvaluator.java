
package com.eval.conditionalevaluator.domain;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Optional;

public class PredicateListEvaluator {

    public Boolean evaluate(EvaluationContext context) {
        Deque<Boolean> evalResults = new ArrayDeque<>();
        Optional.ofNullable(context.getPredicates()).orElse(Collections.emptyList()).forEach(p -> evalResults.add(p.test(context.getConditionContext())));
        if (!evalResults.isEmpty()) {
            return evaluate(evalResults, context.getLogicalOperator());
        }
        return null;
    }

    private boolean evaluate(Deque<Boolean> results, LogicalOperator operator) {
        if (results.size() == 1) {
            return results.pop();
        }
        while (!results.isEmpty()) {
            boolean o1 = results.pop();
            boolean o2 = results.pop();
            boolean o3 = operator.getFunction().apply(o1, o2);
            if (results.isEmpty()) {
                return o3;
            }
            results.push(o3);
        }
        return false;
    }

}
