package com.verein.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by LinYaoyao on 16/12/2.
 * 开启spring session支持
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfigure {
}
