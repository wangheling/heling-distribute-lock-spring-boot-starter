package com.heling.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: heling
 * @Date: 2020/3/14 16:17
 * @Description: 配置zk或者redis配置信息
 */
@ConfigurationProperties(prefix = "heling.distribute.lock")
public class HelingProperties {


    private String ip;
    private String port;
    private String userName;
    private String password;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
