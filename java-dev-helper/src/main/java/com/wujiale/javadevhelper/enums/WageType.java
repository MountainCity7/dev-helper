package com.wujiale.javadevhelper.enums;

import com.wujiale.javadevhelper.baseface.Value;

public enum WageType implements Value<String> {
    USER_WAGE("用户薪资"),
    HEATING_SUBSIDY( "冬季取暖费"),
    MANAGE_MERIT("经营绩效工资"),
    VACATION_PERK("未休年休假补助"),

    ;

    private final String value;

    WageType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
