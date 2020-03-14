package com.heling.config;

import com.heling.lock.DistributeLock;
import com.heling.template.HelingDistributeLockTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @Author: heling
 * @Date: 2020/3/14 16:16
 * @Description:
 */
@Configuration
@Import(DistributeLockAutoConfiguration.class)
@EnableConfigurationProperties(HelingProperties.class)
public class HelingDistributeLockConfiguration {


    @Bean
    public HelingDistributeLockTemplate helingDistributeLockTemplate(HelingProperties helingProperties, DistributeLock distributeLock) {
        return new HelingDistributeLockTemplate(helingProperties, distributeLock);

    }

}
