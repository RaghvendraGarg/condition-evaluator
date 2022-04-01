package com.eval.conditionalevaluator.domain;

import com.eval.conditionalevaluator.ConditionEvaluatorConfig;
import com.eval.conditionalevaluator.eval.Operation;

import java.util.function.Predicate;

public class Condition implements Predicate<ConditionContext> {

    private String operand;

    private Operator operator;

    private Object value;

    private Class valueType;

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
        if (value instanceof Number) {
            valueType = Number.class;
        } else {
            valueType = value.getClass();
        }
    }

    @Override
    public boolean test(ConditionContext conditionContext) {
        Object valueOfOperand = conditionContext.getValueOfOperand(operand);
        Operation operation = ConditionEvaluatorConfig.getOperationConfig().getOperation(operator, valueType);
        return operation.operate(valueOfOperand, value);
    }

}


