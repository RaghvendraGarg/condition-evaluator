
package com.eval.conditionalevaluator.eval;

class ObjectNotEqualsOperationImpl implements Operation<Object, Object> {

    @Override
    public Boolean operate(Object s, Object s2) {
        return !OperationUtils.equals(s, s2);
    }
}
