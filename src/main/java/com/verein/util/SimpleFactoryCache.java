package com.verein.util;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wings on 2016/7/29.
 */
public class SimpleFactoryCache {

    public static ConcurrentHashMap<Class,Field[]> map=new ConcurrentHashMap<Class,Field[]>();

    public static Field[] getFiles(Class className){
        Field[] fields=null;
        if(map.get(className)==null){
            map.put(className,className.getDeclaredFields());
        }
        fields= map.get(className);
        return fields;
    }
}
