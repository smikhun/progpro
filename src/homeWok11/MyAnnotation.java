package homeWok11;

import java.lang.annotation.*;

/**
 * Created by Administrator on 22.05.2016.
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int a()default 5;
    int b()default 2;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface anMethod {
}
