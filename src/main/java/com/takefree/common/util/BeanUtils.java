package com.takefree.common.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

/**
 * Created by gaoxiang on 2017/7/11.
 */
public abstract class BeanUtils extends org.springframework.beans.BeanUtils {
    public static void copyPropertiesIgnoreNull(Object source, Object target) throws BeansException {
        copyProperties(source, target,  getNullPropertyNames(source));
    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
        return Stream.of(wrappedSource.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
                .toArray(String[]::new);
    }
}
