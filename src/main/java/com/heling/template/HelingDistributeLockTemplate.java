package com.heling.template;

import com.heling.config.HelingProperties;
import com.heling.lock.DistributeLock;

/**
 * @Author: heling
 * @Date: 2020/3/14 16:28
 * @Description:
 */
public class HelingDistributeLockTemplate {

    private DistributeLock distributeLock;

    private HelingProperties helingProperties;


    public HelingDistributeLockTemplate(HelingProperties helingProperties, DistributeLock distributeLock) {
        this.helingProperties = helingProperties;
        this.distributeLock = distributeLock;
    }

    public boolean lock() {

        System.out.println("connect to " + helingProperties.getIp() + ":" + helingProperties.getPort());

        return distributeLock.lock();
    }

    public boolean unlock() {
        return distributeLock.unLock();
    }



}
