
package com.eval.conditionalevaluator.eval;

import static com.eval.conditionalevaluator.eval.OperationUtils.isEmpty;

class StringStartsWithOperationImpl implements Operation<String, String> {

    @Override
    public Boolean operate(String container, String pattern) {
        if (isEmpty(container) || isEmpty(pattern)) {
            return false;
        }
        return container.startsWith(pattern);
    }
}
