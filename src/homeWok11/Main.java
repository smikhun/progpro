package homeWok11;

import java.lang.reflect.Method;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Class c = TestMethod.class;
        Method[] anotMethod = c.getMethods();
        TestMethod one = new TestMethod();
        Method[] var4 = anotMethod;
        int var5 = anotMethod.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Method m = var4[var6];
            if(m.isAnnotationPresent(anMethod.class)) {
                MyAnnotation temp = (MyAnnotation)c.getAnnotation(MyAnnotation.class);

                try {
                    m.invoke(one, new Object[]{Integer.valueOf(temp.a()), Integer.valueOf(temp.b())});
                } catch (Exception var10) {
                    System.out.println(var10);
                }
            }
        }

    }
}
