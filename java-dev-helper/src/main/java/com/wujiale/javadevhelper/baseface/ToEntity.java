package com.wujiale.javadevhelper.baseface;

/**
 * <p>ToEntity</p>
 *
 * @author WuJiaLe (15754904311@163.com)
 * @version v1.0.0
 */
public interface ToEntity<M, E> {

    E toEntity(M model);
}
