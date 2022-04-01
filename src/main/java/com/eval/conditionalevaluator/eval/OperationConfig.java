
package com.eval.conditionalevaluator.eval;

import com.eval.conditionalevaluator.domain.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OperationConfig {

    private static Map<Key, Operation> operationMap = new HashMap<>();

    void instantiate() {
        operationMap.put(new Key(Operator.EQ, String.class), new ObjectEqualsOperationImpl());
        operationMap.put(new Key(Operator.CONTAINS, String.class), new StringContainsOperationImpl());
        operationMap.put(new Key(Operator.STARTS_WITH, String.class), new StringStartsWithOperationImpl());
        operationMap.put(new Key(Operator.NEQ, String.class), new ObjectNotEqualsOperationImpl());
        operationMap.put(new Key(Operator.LT, Number.class), new NumberLessThanOperationImpl());
        operationMap.put(new Key(Operator.LTE, Number.class), new NumberLessThanEqualsOperationImpl());
        operationMap.put(new Key(Operator.GT, Number.class), new NumberGreaterThanOperationImpl());
        operationMap.put(new Key(Operator.GTE, Number.class), new NumberGreaterThanEqualsOperationImpl());
        operationMap.put(new Key(Operator.NEQ, Number.class), new ObjectNotEqualsOperationImpl());
    }

    public OperationConfig() {
        instantiate();
    }

    public Operation getOperation(Operator operator, Class clazz) {
        return operationMap.get(new Key(operator, clazz));
    }

    class Key {

        Operator operator;

        Class clazz;

        public Key(Operator operator, Class clazz) {
            this.operator = operator;
            this.clazz = clazz;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return operator == key.operator &&
                    Objects.equals(clazz, key.clazz);
        }

        @Override
        public int hashCode() {
            return Objects.hash(operator, clazz);
        }
    }

}
