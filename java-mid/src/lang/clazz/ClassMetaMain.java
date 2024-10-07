package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        //Class clazz1 = new String().getClass(); //2.인스턴스에서 조회
        //Class clazz2 = Class.forName("java.lnag.Sring"); //3. 문자열로 조회

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }

        // 상위 클래스 정보 출력
        System.out.println(clazz.getSuperclass());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        System.out.println(interfaces);




    }
}