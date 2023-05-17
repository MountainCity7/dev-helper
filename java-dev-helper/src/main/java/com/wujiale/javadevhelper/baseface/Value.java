package com.wujiale.javadevhelper.baseface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Value<V> {
    V getValue();

    /**
     * 返回value的列表
     * @param tClass 枚举类类名，例如：WageType.class
     * @return 包含该枚举类所有value的List 例如：实现了Value<String>，就会返回List<String>
     */
    static <T extends Value<V>, V> List<V> values(Class<T> tClass) {
        return elementList(tClass).stream().map(Value::getValue).distinct().collect(Collectors.toList());
    }

    /**
     * 获取枚举元素列表
     * @param tClass 枚举类类名，例如：WageType.class
     * @return 包含该枚举类所有元素的List 例如：List<WageType>
     */
    static <T extends Value<V>, V> List<T> elementList(Class<T> tClass) {
        return Arrays.asList(tClass.getEnumConstants());
    }

    /**
     * 根据value获取枚举元素
     * @param tClass 枚举类类名，例如：WageType.class
     * @param value value值 例如："休假补助"
     * @return 枚举元素
     */
    static <T extends Value<V>, V> T parseValue(Class<T> tClass, V value) {
        if (tClass.isEnum() && value != null) {
            HashMap<V, T> valueEnumMap = Stream.of(tClass.getEnumConstants()).collect(Collectors.toMap(Value::getValue, Function.identity(), (oldValue, newValue) -> newValue, HashMap::new));
            return valueEnumMap.get(value);
        }
        return null;
    }

}
