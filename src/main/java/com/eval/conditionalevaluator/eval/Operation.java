
package com.eval.conditionalevaluator.eval;

public interface Operation<T, U> {

    Boolean operate(T t, U u);

}
