
package com.eval.conditionalevaluator.eval;

import java.util.Date;

class DateAfterOperationImpl implements Operation<Date, Date> {

    @Override
    public Boolean operate(Date date, Date date2) {
        if (date == null || date2 == null) {
            return false;
        }
        return date.after(date2);
    }
}
