package com.huang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Time 2022-12-02 10:21
 * Created by Huang
 * className: EnvConstant
 * Description:
 */
@Component
public final class EnvConstant {
    private EnvConstant(){}

    public final static String applicationName = "name";

    @Value("${application.name}")
    private String tempApplicationName;

    @PostConstruct
    public void init() throws Exception {
        Field applicationName = EnvConstant.class.getDeclaredField("applicationName");
        setFinalStatic(applicationName, this.tempApplicationName);
    }

    private void setFinalStatic(Field field, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, newValue);
    }
}
