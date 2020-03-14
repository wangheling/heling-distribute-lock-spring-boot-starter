package com.heling.lock;

/**
 * @Author: heling
 * @Date: 2020/3/14 15:57
 * @Description:
 */
public class ZookeeperDistributeLock implements DistributeLock {

    @Override
    public boolean lock() {
        System.out.println("get zk lock");
        return true;
    }

    @Override
    public boolean unLock() {
        System.out.println("realease zk lock");
        return true;
    }
}
