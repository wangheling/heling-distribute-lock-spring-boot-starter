package com.heling.config;

import com.heling.lock.DistributeLock;
import com.heling.lock.RedisDistributeLock;
import com.heling.lock.ZookeeperDistributeLock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author: heling
 * @Date: 2020/3/14 16:01
 * @Description:
 */
@Configuration
public class DistributeLockAutoConfiguration {

    @Bean
    @Primary
    public DistributeLock redisDistributeLock() {
        return new RedisDistributeLock();
    }

    @Bean
    public DistributeLock zookeeperDistributeLock() {
        return new ZookeeperDistributeLock();
    }



}
