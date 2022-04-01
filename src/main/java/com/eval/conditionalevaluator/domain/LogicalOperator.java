package com.eval.conditionalevaluator.domain;

import java.util.function.BiFunction;

public enum LogicalOperator {

    AND((BiFunction<Boolean, Boolean, Boolean>) (o, o2) -> o && o2),

    OR((BiFunction<Boolean, Boolean, Boolean>) (o, o2) -> o || o2);

    private BiFunction<Boolean, Boolean, Boolean> function;

    LogicalOperator(BiFunction<Boolean, Boolean, Boolean> function) {
        this.function = function;
    }

	public BiFunction<Boolean, Boolean, Boolean> getFunction() {
		return function;
	}
}
