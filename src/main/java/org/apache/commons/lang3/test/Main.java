package org.apache.commons.lang3.test;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(Main.class.getName());
//        System.out.println(Main.class.getSimpleName());
//        System.out.println(Main.class.getPackage().getName());
//        System.out.println(Main.class.getInterfaces().length);
//        System.out.println(Main.class.isPrimitive());// ?????????Class????????boolean?char?byte?short?int?long?float?double?
//        System.out.println(test.class.getEnclosingClass());
//        System.out.println(Main.class.getMethods());
//        System.out.println(Main.class.getDeclaredMethods());
//        System.out.println(Main.class.getDeclaringClass());
//        System.out.println(Main.class.getModifiers());
//        System.out.println(Main.class.getCanonicalName());

//        for (Method method : Main.class.getMethods()) {
//            System.out.println(method.getName());
//
//        }
        System.out.println(getType(Integer.class));

        Object obj = 1;
        System.out.println(obj.getClass());
    }

    public static Object getType(Class c) throws Exception {
        Field f = c.getDeclaredField("TYPE");
        Object obj = f.get(c);
        return obj;
    }

    static class test {

    }
}
