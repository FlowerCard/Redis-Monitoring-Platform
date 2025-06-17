package top.huapai.rmp.infrastructure.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 12:14
 */
@AutoConfiguration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 放开所有接口
        registry.addMapping("/**")
            // 允许所有来源（也可指定）
            .allowedOrigins("*")
            // 允许所有方法（GET, POST, PUT, DELETE 等）
            .allowedMethods("*")
            // 允许所有请求头
            .allowedHeaders("*")
            // 如果需要携带 cookie，设为 true 并不能使用 "*"
            .allowCredentials(false)
            // 预检请求缓存时间（单位：秒）WebMvcConfigurer.super.addCorsMappings(registry);
            .maxAge(3600);
    }
}
