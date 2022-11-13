package com.hendisantika.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-oauth2-department-service
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/14/22
 * Time: 06:26
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@Component
@Configuration
@ConfigurationProperties(prefix = "rest.security")
public class SecurityProperties {

    private boolean enabled;
    private String apiMatcher;
    private Cors cors;
    private String issuerUri;
}
