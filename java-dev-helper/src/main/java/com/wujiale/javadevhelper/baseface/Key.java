package com.wujiale.javadevhelper.baseface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Key<K, V> extends Value<V>{
    K getKey();

    default Map<K, V> toMap() {
        return Collections.singletonMap(this.getKey(), this.getValue());
    }

    static <T extends Key<K, V>, K, V> T parseKey(Class<T> tClass, K key) {
        if (tClass.isEnum() && key != null) {
            HashMap<K, T> keyEnumMap = Stream.of(tClass.getEnumConstants()).collect(Collectors.toMap(Key::getKey, Function.identity(), (oldKey, newKey) -> newKey, HashMap::new));
            return keyEnumMap.get(key);
        }
        return null;
    }
}
