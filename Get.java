import java.lang.reflect.Method;

public class Get{
    public static void main(String[] args) {
        ReflectClass reflectClass=new ReflectClass();
        Class aClass=reflectClass.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();//获得所有的方法
        Method method1=declaredMethods[0];//获得printf方法
        Class[] exceptionTypes=method1.getExceptionTypes();//获得方法可能遇到的异常类型
        boolean isTurn=true;
        while (isTurn){
            try {
                isTurn=false;
                System.out.println("返回值为："+method1.invoke(reflectClass));
            }catch (Exception e) {
                method1.setAccessible(true);//设置为允许访问
                isTurn=true;
            }
        }
    }
}
