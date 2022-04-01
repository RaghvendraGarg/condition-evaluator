
package com.eval.conditionalevaluator.eval;

import java.util.List;

class ListContainsOperationImpl<T> implements Operation<T, List<T>> {

    @Override
    public Boolean operate(T t, List<T> ts) {
        if (t == null || ts == null) {
            return false;
        }
        return ts.contains(t);
    }
}
