package com.programmers.voucher.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties
@PropertySource(value = "application.yml", factory = YamlPropertySourceFactory.class)
public class ApplicationMessages {

    @Value("${voucher.message.intro:Intro message here}")
    private String introMessage;

    @Value("${voucher.message.command.create.name:Require name message here}")
    private String requireName;

    @Value("${voucher.message.command.create.type:Require type message here}")
    private String requireType;

    @Value("${voucher.message.command.create.fallback:Fallback message here}")
    private String fallback;

    public String getIntroMessage() {
        return introMessage;
    }

    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }

    public String getRequireName() {
        return requireName;
    }

    public void setRequireName(String requireName) {
        this.requireName = requireName;
    }

    public String getRequireType() {
        return requireType;
    }

    public void setRequireType(String requireType) {
        this.requireType = requireType;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }
}