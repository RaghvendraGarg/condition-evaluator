
package com.eval.conditionalevaluator.eval;

public class OperationUtils {

    public static boolean equals(Object o1, Object o2) {
        if (o1 == o2) {
            return true;
        } else if (o1 != null && o2 != null) {
            return o1.equals(o2);
        }
        return false;
    }

    public static boolean notEquals(Object o1, Object o2) {
        return !equals(o1, o2);
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static boolean between(Number operand, Number from, Number to) {
        if (operand == null || from == null || to == null) {
            return false;
        }
        return from.floatValue() <= operand.floatValue() && operand.floatValue() >= to.floatValue();
    }

}
