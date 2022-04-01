
package com.eval.conditionalevaluator.eval;

import java.util.Date;
import java.util.List;

class DateInBetweenOperationImpl implements Operation<Date, List<Date>> {

    @Override
    public Boolean operate(Date date, List<Date> dates) {
        if (date == null || dates == null || dates.size() != 2) {
            return false;
        }
        return dates.get(0).after(date) && dates.get(1).before(date);
    }
}
