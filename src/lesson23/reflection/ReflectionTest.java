package lesson23.reflection;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> aClass = Class.forName("lesson23.reflection.Doctor");
        Field field = aClass.getField("name");
        System.out.println(field);
        System.out.println("________________");
        Field[] fields = aClass.getFields();
        for (Field field1 : fields) {
            System.out.println(field1);
        }

        System.out.println("_______________");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("__________________");
        Method getNameMethod = aClass.getMethod("getName");
        Parameter[] parameters = getNameMethod.getParameters();
        System.out.println(Arrays.toString(parameters));


    }
}

