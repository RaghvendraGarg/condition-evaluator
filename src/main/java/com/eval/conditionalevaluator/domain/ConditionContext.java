
package com.eval.conditionalevaluator.domain;

import java.util.Map;
import java.util.Optional;

public class ConditionContext {

    private Map<String, Object> data;

    public ConditionContext(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Object getValueOfOperand(String operandKey) {
        return Optional.ofNullable(data).map(d -> d.get(operandKey)).orElse(null);
    }
}
