
package com.eval.conditionalevaluator.eval;

class NumberLessThanOperationImpl implements Operation<Number, Number> {

    @Override
    public Boolean operate(Number o1, Number o2) {
        if (o1 == null || o2 == null) {
            return false;
        }
        return o1.floatValue() < o2.floatValue();
    }
}
