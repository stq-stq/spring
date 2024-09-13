package com.example.anno;

import com.example.config.CommonImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//当前注解可以在类上使用
@Retention(RetentionPolicy.RUNTIME)//会保留在运行时间断
@Import(CommonImportSelector.class)
public @interface EnableCommonConfig {
}
