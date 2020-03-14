package com.heling.config;

import com.heling.lock.DistributeLock;
import com.heling.lock.RedisDistributeLock;
import com.heling.lock.ZookeeperDistributeLock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
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
    @ConditionalOnMissingClass("org.apache.curator.CuratorZookeeperClient")
    public DistributeLock redisDistributeLock() {
        return new RedisDistributeLock();
    }

    @Bean
    @ConditionalOnClass(name = "org.apache.curator.CuratorZookeeperClient")
    public DistributeLock zookeeperDistributeLock() {
        return new ZookeeperDistributeLock();
    }


}
