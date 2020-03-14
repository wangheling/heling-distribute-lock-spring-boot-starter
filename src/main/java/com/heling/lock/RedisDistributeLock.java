package com.heling.lock;

/**
 * @Author: heling
 * @Date: 2020/3/14 15:57
 * @Description:
 */
public class RedisDistributeLock implements DistributeLock {


    @Override
    public boolean lock() {
        System.out.println("get redis lock");
        return true;
    }

    @Override
    public boolean unLock() {
        System.out.println("realease redis lock");
        return true;
    }
}
