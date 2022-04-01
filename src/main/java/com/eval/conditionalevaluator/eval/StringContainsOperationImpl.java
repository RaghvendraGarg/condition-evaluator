
package com.eval.conditionalevaluator.eval;

class StringContainsOperationImpl implements Operation<String, String> {

    @Override
    public Boolean operate(String container, String pattern) {
        if (OperationUtils.isEmpty(container) || OperationUtils.isEmpty(pattern)) {
            return false;
        }
        return container.contains(pattern);
    }
}
