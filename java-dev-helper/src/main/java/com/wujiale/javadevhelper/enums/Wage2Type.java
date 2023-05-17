package com.wujiale.javadevhelper.enums;

import com.wujiale.javadevhelper.baseface.Key;

public enum Wage2Type implements Key<Integer, String> {
    USER_WAGE(1, "用户薪资"),
    HEATING_SUBSIDY( 2,"冬季取暖费"),
    MANAGE_MERIT(3,"经营绩效工资"),
    VACATION_PERK(4,"未休年休假补助"),

    ;

    private final Integer key;
    private final String value;

    Wage2Type(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return this.key;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
