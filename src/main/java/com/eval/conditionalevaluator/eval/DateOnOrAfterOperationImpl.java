
package com.eval.conditionalevaluator.eval;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

class DateOnOrAfterOperationImpl implements Operation<Date, Date> {

    @Override
    public Boolean operate(Date date, Date date2) {
        if (date == null || date2 == null) {
            return false;
        }
        LocalDate localDate = getLocalDate(date);
        LocalDate localDate1 = getLocalDate(date2);
        return localDate.isEqual(localDate1) || localDate.isAfter(localDate1);
    }

    private LocalDate getLocalDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    }
}
