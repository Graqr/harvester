package com.graqr;


import io.micronaut.data.annotation.Embeddable;

import java.util.Date;
import java.util.Objects;

@Embeddable
public class DateAndID {
    private final String id;
    private final Date date;

    public DateAndID(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DateAndID dateAndId1 = (DateAndID) o;
        return Objects.equals(id, dateAndId1.getId()) &&
                date == dateAndId1.getDate();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }
}