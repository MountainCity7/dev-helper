package com.wujiale.javadevhelper.test;

import com.wujiale.javadevhelper.baseface.Key;
import com.wujiale.javadevhelper.baseface.Value;
import com.wujiale.javadevhelper.enums.Wage2Type;
import com.wujiale.javadevhelper.enums.WageType;

import java.util.List;
import java.util.Map;

public class TestEnums {
    public static void main(String[] args) {
        List<WageType> wageTypes = Value.elementList(WageType.class);
        System.out.println(wageTypes);
        List<String> values = Value.values(WageType.class);
        System.out.println(values);
        WageType wageType = Value.parseValue(WageType.class, "经营绩效工资");
        System.out.println(wageType);

        Wage2Type wage2Type = Wage2Type.USER_WAGE;
        Map<Integer, String> entry = wage2Type.toMap();
        System.out.println(entry);
    }
}
