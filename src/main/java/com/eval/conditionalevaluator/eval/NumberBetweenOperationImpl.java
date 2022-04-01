
package com.eval.conditionalevaluator.eval;

import java.util.List;

class NumberBetweenOperationImpl implements Operation<Number, List<Number>> {

    @Override
    public Boolean operate(Number number, List<Number> numbers) {
        if (number == null || numbers == null || numbers.size() != 2) {
            return false;
        }
        return numbers.get(0).floatValue() <= number.floatValue() && number.floatValue() <= numbers.get(1).floatValue();
    }
}
