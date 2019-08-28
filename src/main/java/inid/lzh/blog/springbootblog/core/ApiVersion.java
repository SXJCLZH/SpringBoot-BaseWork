package inid.lzh.blog.springbootblog.core;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * API版本控制注解
 * @author lzh
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    //标识版本号
    int value();
}