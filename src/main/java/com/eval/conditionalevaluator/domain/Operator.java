package com.eval.conditionalevaluator.domain;

public enum Operator {

    EQ("equals"),
    NEQ("not equals"),
    GT("greater than"),
    GTE("greater than or equal to"),
    LT("less than"),
    LTE("less than or equal to"),
    BETWEEN("between"),
    STARTS_WITH("starts with"),
    CONTAINS("contains"),
    BEFORE("before"),
    ON_OR_BEFORE("on or before"),
    AFTER("after"),
    ON_OR_AFTER("on or after");

    private String title;

    Operator(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

}
