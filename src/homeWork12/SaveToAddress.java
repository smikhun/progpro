package homeWork12;

import java.lang.annotation.*;

/**
 * Created by User on 23.05.2016.
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveToAddress {
String address();
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Save{

}
