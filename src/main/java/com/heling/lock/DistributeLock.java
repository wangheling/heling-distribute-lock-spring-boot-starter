package com.heling.lock;

/**
 * @Author: heling
 * @Date: 2020/3/14 15:56
 * @Description:
 */
public interface DistributeLock {

    boolean lock();

    boolean unLock();

}
