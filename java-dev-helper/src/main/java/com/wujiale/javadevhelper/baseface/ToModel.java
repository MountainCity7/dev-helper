package com.wujiale.javadevhelper.baseface;

/**
 * <p>ToModel</p>
 *
 * @author WuJiaLe (15754904311@163.com)
 * @version v1.0.0
 */
public interface ToModel<E, M> {

    M toModel(E entity);
}
